package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUserusagereportGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Represents the customer for which the data is to be fetched.
    */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * Represents the date in yyyy-mm-dd format for which the data is to be
    * fetched.
    */
  var date: js.UndefOr[String] = js.native
  
  /**
    * Represents the set of filters including parameter operator value.
    */
  var filters: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of results to return. Maximum allowed is 1000
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * the organizational unit's ID to filter usage parameters from users
    * belonging to a specific OU or one of its sub-OU(s).
    */
  var orgUnitID: js.UndefOr[String] = js.native
  
  /**
    * Token to specify next page.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Represents the application name, parameter name pairs to fetch in csv as
    * app_name1:param_name1, app_name2:param_name2.
    */
  var parameters: js.UndefOr[String] = js.native
  
  /**
    * Represents the profile id or the user email for which the data should be
    * filtered.
    */
  var userKey: js.UndefOr[String] = js.native
}
object ParamsResourceUserusagereportGet {
  
  @scala.inline
  def apply(): ParamsResourceUserusagereportGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUserusagereportGet]
  }
  
  @scala.inline
  implicit class ParamsResourceUserusagereportGetOps[Self <: ParamsResourceUserusagereportGet] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setOrgUnitID(value: String): Self = this.set("orgUnitID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnitID: Self = this.set("orgUnitID", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setParameters(value: String): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setUserKey(value: String): Self = this.set("userKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserKey: Self = this.set("userKey", js.undefined)
  }
}
