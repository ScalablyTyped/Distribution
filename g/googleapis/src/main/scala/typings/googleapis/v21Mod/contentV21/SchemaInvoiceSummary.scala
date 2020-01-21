package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInvoiceSummary extends js.Object {
  /**
    * Summary of the total amounts of the additional charges.
    */
  var additionalChargeSummaries: js.UndefOr[js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]] = js.native
  /**
    * [required] Total price for the product.
    */
  var productTotal: js.UndefOr[SchemaAmount] = js.native
}

object SchemaInvoiceSummary {
  @scala.inline
  def apply(
    additionalChargeSummaries: js.Array[SchemaInvoiceSummaryAdditionalChargeSummary] = null,
    productTotal: SchemaAmount = null
  ): SchemaInvoiceSummary = {
    val __obj = js.Dynamic.literal()
    if (additionalChargeSummaries != null) __obj.updateDynamic("additionalChargeSummaries")(additionalChargeSummaries.asInstanceOf[js.Any])
    if (productTotal != null) __obj.updateDynamic("productTotal")(productTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInvoiceSummary]
  }
}

