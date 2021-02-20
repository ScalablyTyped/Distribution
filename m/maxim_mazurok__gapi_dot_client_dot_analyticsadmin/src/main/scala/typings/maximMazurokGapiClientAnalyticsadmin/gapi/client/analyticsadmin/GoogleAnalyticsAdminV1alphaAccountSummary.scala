package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaAccountSummary extends StObject {
  
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
  implicit class GoogleAnalyticsAdminV1alphaAccountSummaryMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaAccountSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPropertySummaries(value: js.Array[GoogleAnalyticsAdminV1alphaPropertySummary]): Self = StObject.set(x, "propertySummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertySummariesUndefined: Self = StObject.set(x, "propertySummaries", js.undefined)
    
    @scala.inline
    def setPropertySummariesVarargs(value: GoogleAnalyticsAdminV1alphaPropertySummary*): Self = StObject.set(x, "propertySummaries", js.Array(value :_*))
  }
}
