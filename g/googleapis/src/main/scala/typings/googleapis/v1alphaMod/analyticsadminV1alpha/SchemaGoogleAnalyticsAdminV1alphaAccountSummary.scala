package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAccountSummary extends StObject {
  
  /**
    * Resource name of account referred to by this account summary Format: accounts/{account_id\} Example: "accounts/1000"
    */
  var account: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display name for the account referred to in this account summary.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name for this account summary. Format: accountSummaries/{account_id\} Example: "accountSummaries/1000"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of summaries for child accounts of this account.
    */
  var propertySummaries: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaPropertySummary]] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAccountSummary {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAccountSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAccountSummary]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAccountSummary](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountNull: Self = StObject.set(x, "account", null)
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPropertySummaries(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaPropertySummary]): Self = StObject.set(x, "propertySummaries", value.asInstanceOf[js.Any])
    
    inline def setPropertySummariesUndefined: Self = StObject.set(x, "propertySummaries", js.undefined)
    
    inline def setPropertySummariesVarargs(value: SchemaGoogleAnalyticsAdminV1alphaPropertySummary*): Self = StObject.set(x, "propertySummaries", js.Array(value*))
  }
}
