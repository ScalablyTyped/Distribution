package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAccountsClientsUpdate extends StandardParameters {
  /**
    * Unique numerical account ID for the buyer of which the client buyer is a
    * customer; the sponsor buyer to update a client for. (required)
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Unique numerical account ID of the client to update. (required)
    */
  var clientAccountId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaClient] = js.native
}

object ParamsResourceAccountsClientsUpdate {
  @scala.inline
  def apply(): ParamsResourceAccountsClientsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsClientsUpdate]
  }
  @scala.inline
  implicit class ParamsResourceAccountsClientsUpdateOps[Self <: ParamsResourceAccountsClientsUpdate] (val x: Self) extends AnyVal {
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
    def setRequestBody(value: SchemaClient): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

