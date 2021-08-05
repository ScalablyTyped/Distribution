package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption extends StObject {
  
  /**
    * Optional description of the return reason.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [required] Reason for the return.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption {
  
  inline def apply(): SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption]
  }
  
  extension [Self <: SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
