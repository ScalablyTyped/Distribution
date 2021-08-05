package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption extends StObject {
  
  /**
    * Optional description of the refund reason.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [required] Reason for the refund.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption {
  
  inline def apply(): SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption]
  }
  
  extension [Self <: SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
