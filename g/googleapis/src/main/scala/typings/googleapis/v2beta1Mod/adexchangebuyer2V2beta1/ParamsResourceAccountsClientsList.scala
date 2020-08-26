package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAccountsClientsList extends StandardParameters {
  /**
    * Unique numerical account ID of the sponsor buyer to list the clients for.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Requested page size. The server may return fewer clients than requested.
    * If unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of ListClientsResponse.nextPageToken
    * returned from the previous call to the accounts.clients.list method.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Optional unique identifier (from the standpoint of an Ad Exchange sponsor
    * buyer partner) of the client to return. If specified, at most one client
    * will be returned in the response.
    */
  var partnerClientId: js.UndefOr[String] = js.native
}

object ParamsResourceAccountsClientsList {
  @scala.inline
  def apply(): ParamsResourceAccountsClientsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsClientsList]
  }
  @scala.inline
  implicit class ParamsResourceAccountsClientsListOps[Self <: ParamsResourceAccountsClientsList] (val x: Self) extends AnyVal {
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
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPartnerClientId(value: String): Self = this.set("partnerClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnerClientId: Self = this.set("partnerClientId", js.undefined)
  }
  
}

