package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderpaymentsNotifyChargeRequest extends StObject {
  
  /**
    * Whether charge was successful.
    */
  var chargeState: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. Please use invoiceIds instead.
    */
  var invoiceId: js.UndefOr[String] = js.undefined
  
  /**
    * Invoice IDs from the orderinvoices service that correspond to the charge.
    */
  var invoiceIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaOrderpaymentsNotifyChargeRequest {
  
  inline def apply(): SchemaOrderpaymentsNotifyChargeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyChargeRequest]
  }
  
  extension [Self <: SchemaOrderpaymentsNotifyChargeRequest](x: Self) {
    
    inline def setChargeState(value: String): Self = StObject.set(x, "chargeState", value.asInstanceOf[js.Any])
    
    inline def setChargeStateUndefined: Self = StObject.set(x, "chargeState", js.undefined)
    
    inline def setInvoiceId(value: String): Self = StObject.set(x, "invoiceId", value.asInstanceOf[js.Any])
    
    inline def setInvoiceIdUndefined: Self = StObject.set(x, "invoiceId", js.undefined)
    
    inline def setInvoiceIds(value: js.Array[String]): Self = StObject.set(x, "invoiceIds", value.asInstanceOf[js.Any])
    
    inline def setInvoiceIdsUndefined: Self = StObject.set(x, "invoiceIds", js.undefined)
    
    inline def setInvoiceIdsVarargs(value: String*): Self = StObject.set(x, "invoiceIds", js.Array(value :_*))
  }
}
