package typings.matrixJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginPayload extends js.Object {
  /* An access token for the account.
    * This access token can then be used to authorize other requests. */
  var access_token: String = js.native
  /* ID of the logged-in device. Will be the same as the
    * corresponding parameter in the request, if one was specified. */
  var device_id: String = js.native
  /* The server_name of the homeserver on which the account has been registered.
    * @deprecated Clients should extract the server_name from
    * ``user_id`` (by splitting at the first colon) if they require
    * it. Note also that ``homeserver`` is not spelt this way.
    */
  var home_server: String = js.native
  /* The fully-qualified Matrix ID for the account. */
  var user_id: String = js.native
  /**
    * Optional client configuration provided by the server. If present,
    * clients SHOULD use the provided object to reconfigure themselves,
    * optionally validating the URLs within. This object takes the same
    * form as the one returned from .well-known autodiscovery.
    */
  var well_known: js.UndefOr[js.Any] = js.native
}

object LoginPayload {
  @scala.inline
  def apply(access_token: String, device_id: String, home_server: String, user_id: String): LoginPayload = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], device_id = device_id.asInstanceOf[js.Any], home_server = home_server.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginPayload]
  }
  @scala.inline
  implicit class LoginPayloadOps[Self <: LoginPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevice_id(value: String): Self = this.set("device_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setHome_server(value: String): Self = this.set("home_server", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setWell_known(value: js.Any): Self = this.set("well_known", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWell_known: Self = this.set("well_known", js.undefined)
  }
  
}

