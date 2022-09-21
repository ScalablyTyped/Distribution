package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPaymentsResponse extends StObject {
  
  /**
    * The payments returned in this list response.
    */
  var payments: js.UndefOr[js.Array[SchemaPayment]] = js.undefined
}
object SchemaListPaymentsResponse {
  
  inline def apply(): SchemaListPaymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPaymentsResponse]
  }
  
  extension [Self <: SchemaListPaymentsResponse](x: Self) {
    
    inline def setPayments(value: js.Array[SchemaPayment]): Self = StObject.set(x, "payments", value.asInstanceOf[js.Any])
    
    inline def setPaymentsUndefined: Self = StObject.set(x, "payments", js.undefined)
    
    inline def setPaymentsVarargs(value: SchemaPayment*): Self = StObject.set(x, "payments", js.Array(value*))
  }
}
