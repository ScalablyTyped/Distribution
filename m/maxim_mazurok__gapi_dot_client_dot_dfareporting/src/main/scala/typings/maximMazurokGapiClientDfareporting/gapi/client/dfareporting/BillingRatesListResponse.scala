package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingRatesListResponse extends StObject {
  
  /** Billing rates collection. */
  var billingRates: js.UndefOr[js.Array[BillingRate]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#billingRatesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object BillingRatesListResponse {
  
  inline def apply(): BillingRatesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingRatesListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingRatesListResponse] (val x: Self) extends AnyVal {
    
    inline def setBillingRates(value: js.Array[BillingRate]): Self = StObject.set(x, "billingRates", value.asInstanceOf[js.Any])
    
    inline def setBillingRatesUndefined: Self = StObject.set(x, "billingRates", js.undefined)
    
    inline def setBillingRatesVarargs(value: BillingRate*): Self = StObject.set(x, "billingRates", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
