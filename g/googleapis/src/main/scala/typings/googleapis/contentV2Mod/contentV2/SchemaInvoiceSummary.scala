package typings.googleapis.contentV2Mod.contentV2

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
    * Deprecated.
    */
  var customerBalance: js.UndefOr[SchemaAmount] = js.native
  /**
    * Deprecated.
    */
  var googleBalance: js.UndefOr[SchemaAmount] = js.native
  /**
    * Deprecated.
    */
  var merchantBalance: js.UndefOr[SchemaAmount] = js.native
  /**
    * [required] Total price for the product.
    */
  var productTotal: js.UndefOr[SchemaAmount] = js.native
  /**
    * Deprecated.
    */
  var promotionSummaries: js.UndefOr[js.Array[SchemaPromotion]] = js.native
}

object SchemaInvoiceSummary {
  @scala.inline
  def apply(
    additionalChargeSummaries: js.Array[SchemaInvoiceSummaryAdditionalChargeSummary] = null,
    customerBalance: SchemaAmount = null,
    googleBalance: SchemaAmount = null,
    merchantBalance: SchemaAmount = null,
    productTotal: SchemaAmount = null,
    promotionSummaries: js.Array[SchemaPromotion] = null
  ): SchemaInvoiceSummary = {
    val __obj = js.Dynamic.literal()
    if (additionalChargeSummaries != null) __obj.updateDynamic("additionalChargeSummaries")(additionalChargeSummaries.asInstanceOf[js.Any])
    if (customerBalance != null) __obj.updateDynamic("customerBalance")(customerBalance.asInstanceOf[js.Any])
    if (googleBalance != null) __obj.updateDynamic("googleBalance")(googleBalance.asInstanceOf[js.Any])
    if (merchantBalance != null) __obj.updateDynamic("merchantBalance")(merchantBalance.asInstanceOf[js.Any])
    if (productTotal != null) __obj.updateDynamic("productTotal")(productTotal.asInstanceOf[js.Any])
    if (promotionSummaries != null) __obj.updateDynamic("promotionSummaries")(promotionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInvoiceSummary]
  }
}

