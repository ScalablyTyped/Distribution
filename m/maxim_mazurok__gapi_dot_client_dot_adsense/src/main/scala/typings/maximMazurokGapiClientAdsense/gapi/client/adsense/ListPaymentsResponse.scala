package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPaymentsResponse extends StObject {
  
  /** The payments returned in this list response. */
  var payments: js.UndefOr[js.Array[Payment]] = js.undefined
}
object ListPaymentsResponse {
  
  inline def apply(): ListPaymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPaymentsResponse]
  }
  
  extension [Self <: ListPaymentsResponse](x: Self) {
    
    inline def setPayments(value: js.Array[Payment]): Self = StObject.set(x, "payments", value.asInstanceOf[js.Any])
    
    inline def setPaymentsUndefined: Self = StObject.set(x, "payments", js.undefined)
    
    inline def setPaymentsVarargs(value: Payment*): Self = StObject.set(x, "payments", js.Array(value*))
  }
}
