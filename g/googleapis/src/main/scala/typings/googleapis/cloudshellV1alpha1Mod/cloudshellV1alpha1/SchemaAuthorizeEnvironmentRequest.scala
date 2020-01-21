package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for AuthorizeEnvironment.
  */
@js.native
trait SchemaAuthorizeEnvironmentRequest extends js.Object {
  /**
    * The OAuth access token that should be sent to the environment.
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * The time when the credentials expire. If not set, defaults to one hour
    * from when the server received the request.
    */
  var expireTime: js.UndefOr[String] = js.native
  /**
    * The OAuth ID token that should be sent to the environment.
    */
  var idToken: js.UndefOr[String] = js.native
}

object SchemaAuthorizeEnvironmentRequest {
  @scala.inline
  def apply(accessToken: String = null, expireTime: String = null, idToken: String = null): SchemaAuthorizeEnvironmentRequest = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuthorizeEnvironmentRequest]
  }
}

