package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUnitInvoiceTaxLine extends js.Object {
  /**
    * [required] Tax amount for the tax type.
    */
  var taxAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * Optional name of the tax type. This should only be provided if taxType is
    * otherFeeTax.
    */
  var taxName: js.UndefOr[String] = js.native
  /**
    * [required] Type of the tax.
    */
  var taxType: js.UndefOr[String] = js.native
}

object SchemaUnitInvoiceTaxLine {
  @scala.inline
  def apply(taxAmount: SchemaPrice = null, taxName: String = null, taxType: String = null): SchemaUnitInvoiceTaxLine = {
    val __obj = js.Dynamic.literal()
    if (taxAmount != null) __obj.updateDynamic("taxAmount")(taxAmount.asInstanceOf[js.Any])
    if (taxName != null) __obj.updateDynamic("taxName")(taxName.asInstanceOf[js.Any])
    if (taxType != null) __obj.updateDynamic("taxType")(taxType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUnitInvoiceTaxLine]
  }
}

