package typings.googleapis.contentV2Mod.contentV2

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
  def apply(
    invoiceId: String = null,
    operationId: String = null,
    refundOnlyOption: SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption = null,
    returnOption: SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption = null,
    shipmentInvoices: js.Array[SchemaShipmentInvoice] = null
  ): SchemaOrderinvoicesCreateRefundInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    if (invoiceId != null) __obj.updateDynamic("invoiceId")(invoiceId.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (refundOnlyOption != null) __obj.updateDynamic("refundOnlyOption")(refundOnlyOption.asInstanceOf[js.Any])
    if (returnOption != null) __obj.updateDynamic("returnOption")(returnOption.asInstanceOf[js.Any])
    if (shipmentInvoices != null) __obj.updateDynamic("shipmentInvoices")(shipmentInvoices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderinvoicesCreateRefundInvoiceRequest]
  }
}

