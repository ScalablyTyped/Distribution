package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUnitInvoice extends js.Object {
  /**
    * Additional charges for a unit, e.g. shipping costs.
    */
  var additionalCharges: js.UndefOr[js.Array[SchemaUnitInvoiceAdditionalCharge]] = js.native
  /**
    * [required] Pre-tax or post-tax price of the unit depending on the
    * locality of the order.
    */
  var unitPrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * Tax amounts to apply to the unit price.
    */
  var unitPriceTaxes: js.UndefOr[js.Array[SchemaUnitInvoiceTaxLine]] = js.native
}

object SchemaUnitInvoice {
  @scala.inline
  def apply(
    additionalCharges: js.Array[SchemaUnitInvoiceAdditionalCharge] = null,
    unitPrice: SchemaPrice = null,
    unitPriceTaxes: js.Array[SchemaUnitInvoiceTaxLine] = null
  ): SchemaUnitInvoice = {
    val __obj = js.Dynamic.literal()
    if (additionalCharges != null) __obj.updateDynamic("additionalCharges")(additionalCharges.asInstanceOf[js.Any])
    if (unitPrice != null) __obj.updateDynamic("unitPrice")(unitPrice.asInstanceOf[js.Any])
    if (unitPriceTaxes != null) __obj.updateDynamic("unitPriceTaxes")(unitPriceTaxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUnitInvoice]
  }
}

