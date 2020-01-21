package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductAmount extends js.Object {
  /**
    * The pre-tax or post-tax price depending on the location of the order.
    */
  var priceAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * Remitted tax value.
    */
  var remittedTaxAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * Tax value.
    */
  var taxAmount: js.UndefOr[SchemaPrice] = js.native
}

object SchemaProductAmount {
  @scala.inline
  def apply(
    priceAmount: SchemaPrice = null,
    remittedTaxAmount: SchemaPrice = null,
    taxAmount: SchemaPrice = null
  ): SchemaProductAmount = {
    val __obj = js.Dynamic.literal()
    if (priceAmount != null) __obj.updateDynamic("priceAmount")(priceAmount.asInstanceOf[js.Any])
    if (remittedTaxAmount != null) __obj.updateDynamic("remittedTaxAmount")(remittedTaxAmount.asInstanceOf[js.Any])
    if (taxAmount != null) __obj.updateDynamic("taxAmount")(taxAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductAmount]
  }
}

