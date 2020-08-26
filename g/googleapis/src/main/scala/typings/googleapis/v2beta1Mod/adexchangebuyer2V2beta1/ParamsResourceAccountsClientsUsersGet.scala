package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAccountsClientsUsersGet extends StandardParameters {
  /**
    * Numerical account ID of the client's sponsor buyer. (required)
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Numerical account ID of the client buyer that the user to be retrieved is
    * associated with. (required)
    */
  var clientAccountId: js.UndefOr[String] = js.native
  /**
    * Numerical identifier of the user to retrieve. (required)
    */
  var userId: js.UndefOr[String] = js.native
}

object ParamsResourceAccountsClientsUsersGet {
  @scala.inline
  def apply(): ParamsResourceAccountsClientsUsersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsClientsUsersGet]
  }
  @scala.inline
  implicit class ParamsResourceAccountsClientsUsersGetOps[Self <: ParamsResourceAccountsClientsUsersGet] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setClientAccountId(value: String): Self = this.set("clientAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientAccountId: Self = this.set("clientAccountId", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

