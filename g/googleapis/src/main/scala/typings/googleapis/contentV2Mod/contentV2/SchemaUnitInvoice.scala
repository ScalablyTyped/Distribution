package typings.googleapis.contentV2Mod.contentV2

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
    * Deprecated.
    */
  var promotions: js.UndefOr[js.Array[SchemaPromotion]] = js.native
  /**
    * [required] Price of the unit, before applying taxes.
    */
  var unitPricePretax: js.UndefOr[SchemaPrice] = js.native
  /**
    * Tax amounts to apply to the unit price.
    */
  var unitPriceTaxes: js.UndefOr[js.Array[SchemaUnitInvoiceTaxLine]] = js.native
}

object SchemaUnitInvoice {
  @scala.inline
  def apply(
    additionalCharges: js.Array[SchemaUnitInvoiceAdditionalCharge] = null,
    promotions: js.Array[SchemaPromotion] = null,
    unitPricePretax: SchemaPrice = null,
    unitPriceTaxes: js.Array[SchemaUnitInvoiceTaxLine] = null
  ): SchemaUnitInvoice = {
    val __obj = js.Dynamic.literal()
    if (additionalCharges != null) __obj.updateDynamic("additionalCharges")(additionalCharges.asInstanceOf[js.Any])
    if (promotions != null) __obj.updateDynamic("promotions")(promotions.asInstanceOf[js.Any])
    if (unitPricePretax != null) __obj.updateDynamic("unitPricePretax")(unitPricePretax.asInstanceOf[js.Any])
    if (unitPriceTaxes != null) __obj.updateDynamic("unitPriceTaxes")(unitPriceTaxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUnitInvoice]
  }
}

