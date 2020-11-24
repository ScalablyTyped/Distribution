package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAccountsCreativesList extends StandardParameters {
  
  /**
    * The account to list the creatives from. Specify "-" to list all creatives
    * the current user has access to.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Requested page size. The server may return fewer creatives than requested
    * (due to timeout constraint) even if more are available via another call.
    * If unspecified, server will pick an appropriate default. Acceptable
    * values are 1 to 1000, inclusive.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of ListCreativesResponse.next_page_token
    * returned from the previous call to 'ListCreatives' method.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * An optional query string to filter creatives. If no filter is specified,
    * all active creatives will be returned. <p>Supported queries are: <ul>
    * <li>accountId=<i>account_id_string</i>
    * <li>creativeId=<i>creative_id_string</i> <li>dealsStatus: {approved,
    * conditionally_approved, disapproved,                    not_checked}
    * <li>openAuctionStatus: {approved, conditionally_approved, disapproved,
    * not_checked} <li>attribute: {a numeric attribute from the list of
    * attributes} <li>disapprovalReason: {a reason from DisapprovalReason}
    * </ul> Example: 'accountId=12345 AND (dealsStatus:disapproved AND
    * disapprovalReason:unacceptable_content) OR attribute:47'
    */
  var query: js.UndefOr[String] = js.native
}
object ParamsResourceAccountsCreativesList {
  
  @scala.inline
  def apply(): ParamsResourceAccountsCreativesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCreativesList]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsCreativesListOps[Self <: ParamsResourceAccountsCreativesList] (val x: Self) extends AnyVal {
    
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
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
}
