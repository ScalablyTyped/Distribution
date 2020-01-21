package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderinvoicesCreateChargeInvoiceRequest extends js.Object {
  /**
    * [required] The ID of the invoice.
    */
  var invoiceId: js.UndefOr[String] = js.native
  /**
    * [required] Invoice summary.
    */
  var invoiceSummary: js.UndefOr[SchemaInvoiceSummary] = js.native
  /**
    * [required] Invoice details per line item.
    */
  var lineItemInvoices: js.UndefOr[js.Array[SchemaShipmentInvoiceLineItemInvoice]] = js.native
  /**
    * [required] The ID of the operation, unique across all operations for a
    * given order.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * [required] ID of the shipment group. It is assigned by the merchant in
    * the shipLineItems method and is used to group multiple line items that
    * have the same kind of shipping charges.
    */
  var shipmentGroupId: js.UndefOr[String] = js.native
}

object SchemaOrderinvoicesCreateChargeInvoiceRequest {
  @scala.inline
  def apply(
    invoiceId: String = null,
    invoiceSummary: SchemaInvoiceSummary = null,
    lineItemInvoices: js.Array[SchemaShipmentInvoiceLineItemInvoice] = null,
    operationId: String = null,
    shipmentGroupId: String = null
  ): SchemaOrderinvoicesCreateChargeInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    if (invoiceId != null) __obj.updateDynamic("invoiceId")(invoiceId.asInstanceOf[js.Any])
    if (invoiceSummary != null) __obj.updateDynamic("invoiceSummary")(invoiceSummary.asInstanceOf[js.Any])
    if (lineItemInvoices != null) __obj.updateDynamic("lineItemInvoices")(lineItemInvoices.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (shipmentGroupId != null) __obj.updateDynamic("shipmentGroupId")(shipmentGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderinvoicesCreateChargeInvoiceRequest]
  }
}

