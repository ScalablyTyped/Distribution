package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption extends js.Object {
  /**
    * Optional description of the refund reason.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [required] Reason for the refund.
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption {
  @scala.inline
  def apply(description: String = null, reason: String = null): SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption]
  }
}

