package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBillingRatesListResponse extends StObject {
  
  /**
    * Billing rates collection.
    */
  var billingRates: js.UndefOr[js.Array[SchemaBillingRate]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#billingRatesListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaBillingRatesListResponse {
  
  inline def apply(): SchemaBillingRatesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingRatesListResponse]
  }
  
  extension [Self <: SchemaBillingRatesListResponse](x: Self) {
    
    inline def setBillingRates(value: js.Array[SchemaBillingRate]): Self = StObject.set(x, "billingRates", value.asInstanceOf[js.Any])
    
    inline def setBillingRatesUndefined: Self = StObject.set(x, "billingRates", js.undefined)
    
    inline def setBillingRatesVarargs(value: SchemaBillingRate*): Self = StObject.set(x, "billingRates", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
