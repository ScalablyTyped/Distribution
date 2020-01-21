package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInvoiceSummaryAdditionalChargeSummary extends js.Object {
  /**
    * [required] Total additional charge for this type.
    */
  var totalAmount: js.UndefOr[SchemaAmount] = js.native
  /**
    * [required] Type of the additional charge.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaInvoiceSummaryAdditionalChargeSummary {
  @scala.inline
  def apply(totalAmount: SchemaAmount = null, `type`: String = null): SchemaInvoiceSummaryAdditionalChargeSummary = {
    val __obj = js.Dynamic.literal()
    if (totalAmount != null) __obj.updateDynamic("totalAmount")(totalAmount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInvoiceSummaryAdditionalChargeSummary]
  }
}

