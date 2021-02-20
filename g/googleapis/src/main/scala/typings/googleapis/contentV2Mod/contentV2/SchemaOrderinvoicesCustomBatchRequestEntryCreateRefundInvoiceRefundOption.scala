package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption extends StObject {
  
  /**
    * Optional description of the refund reason.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [required] Reason for the refund.
    */
  var reason: js.UndefOr[String] = js.native
}
object SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption {
  
  @scala.inline
  def apply(): SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption]
  }
  
  @scala.inline
  implicit class SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOptionMutableBuilder[Self <: SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
