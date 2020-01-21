package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaShipmentInvoiceLineItemInvoice extends js.Object {
  /**
    * ID of the line item. Either lineItemId or productId must be set.
    */
  var lineItemId: js.UndefOr[String] = js.native
  /**
    * ID of the product. This is the REST ID used in the products service.
    * Either lineItemId or productId must be set.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * [required] The shipment unit ID is assigned by the merchant and defines
    * individual quantities within a line item. The same ID can be assigned to
    * units that are the same while units that differ must be assigned a
    * different ID (for example: free or promotional units).
    */
  var shipmentUnitIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * [required] Invoice details for a single unit.
    */
  var unitInvoice: js.UndefOr[SchemaUnitInvoice] = js.native
}

object SchemaShipmentInvoiceLineItemInvoice {
  @scala.inline
  def apply(
    lineItemId: String = null,
    productId: String = null,
    shipmentUnitIds: js.Array[String] = null,
    unitInvoice: SchemaUnitInvoice = null
  ): SchemaShipmentInvoiceLineItemInvoice = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (shipmentUnitIds != null) __obj.updateDynamic("shipmentUnitIds")(shipmentUnitIds.asInstanceOf[js.Any])
    if (unitInvoice != null) __obj.updateDynamic("unitInvoice")(unitInvoice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShipmentInvoiceLineItemInvoice]
  }
}

