package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaAccountSummary extends js.Object {
  
  /** Resource name of account referred to by this account summary Format: accounts/{account_id} Example: "accounts/1000" */
  var account: js.UndefOr[String] = js.native
  
  /** Display name for the account referred to in this account summary. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Resource name for this account summary. Format: accountSummaries/{account_id} Example: "accountSummaries/1000" */
  var name: js.UndefOr[String] = js.native
  
  /** List of summaries for child accounts of this account. */
  var propertySummaries: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaPropertySummary]] = js.native
}
object GoogleAnalyticsAdminV1alphaAccountSummary {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaAccountSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccountSummary]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaAccountSummaryOps[Self <: GoogleAnalyticsAdminV1alphaAccountSummary] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPropertySummariesVarargs(value: GoogleAnalyticsAdminV1alphaPropertySummary*): Self = this.set("propertySummaries", js.Array(value :_*))
    
    @scala.inline
    def setPropertySummaries(value: js.Array[GoogleAnalyticsAdminV1alphaPropertySummary]): Self = this.set("propertySummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertySummaries: Self = this.set("propertySummaries", js.undefined)
  }
}
