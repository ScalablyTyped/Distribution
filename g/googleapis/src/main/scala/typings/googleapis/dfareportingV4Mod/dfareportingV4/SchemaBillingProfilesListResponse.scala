package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBillingProfilesListResponse extends StObject {
  
  /**
    * Billing profiles collection.
    */
  var billingProfiles: js.UndefOr[js.Array[SchemaBillingProfile]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#billingProfilesListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaBillingProfilesListResponse {
  
  inline def apply(): SchemaBillingProfilesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingProfilesListResponse]
  }
  
  extension [Self <: SchemaBillingProfilesListResponse](x: Self) {
    
    inline def setBillingProfiles(value: js.Array[SchemaBillingProfile]): Self = StObject.set(x, "billingProfiles", value.asInstanceOf[js.Any])
    
    inline def setBillingProfilesUndefined: Self = StObject.set(x, "billingProfiles", js.undefined)
    
    inline def setBillingProfilesVarargs(value: SchemaBillingProfile*): Self = StObject.set(x, "billingProfiles", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
