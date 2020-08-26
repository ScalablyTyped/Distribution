package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderinvoicesCreateRefundInvoiceRequest extends js.Object {
  /**
    * [required] The ID of the invoice.
    */
  var invoiceId: js.UndefOr[String] = js.native
  /**
    * [required] The ID of the operation, unique across all operations for a
    * given order.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Option to create a refund-only invoice. Exactly one of refundOnlyOption
    * or returnOption must be provided.
    */
  var refundOnlyOption: js.UndefOr[SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption] = js.native
  /**
    * Option to create an invoice for a refund and mark all items within the
    * invoice as returned. Exactly one of refundOnlyOption or returnOption must
    * be provided.
    */
  var returnOption: js.UndefOr[SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption] = js.native
  /**
    * Invoice details for different shipment groups.
    */
  var shipmentInvoices: js.UndefOr[js.Array[SchemaShipmentInvoice]] = js.native
}

object SchemaOrderinvoicesCreateRefundInvoiceRequest {
  @scala.inline
  def apply(): SchemaOrderinvoicesCreateRefundInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderinvoicesCreateRefundInvoiceRequest]
  }
  @scala.inline
  implicit class SchemaOrderinvoicesCreateRefundInvoiceRequestOps[Self <: SchemaOrderinvoicesCreateRefundInvoiceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInvoiceId(value: String): Self = this.set("invoiceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoiceId: Self = this.set("invoiceId", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setRefundOnlyOption(value: SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption): Self = this.set("refundOnlyOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefundOnlyOption: Self = this.set("refundOnlyOption", js.undefined)
    @scala.inline
    def setReturnOption(value: SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption): Self = this.set("returnOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnOption: Self = this.set("returnOption", js.undefined)
    @scala.inline
    def setShipmentInvoicesVarargs(value: SchemaShipmentInvoice*): Self = this.set("shipmentInvoices", js.Array(value :_*))
    @scala.inline
    def setShipmentInvoices(value: js.Array[SchemaShipmentInvoice]): Self = this.set("shipmentInvoices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipmentInvoices: Self = this.set("shipmentInvoices", js.undefined)
  }
  
}

