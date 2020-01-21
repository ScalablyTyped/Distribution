package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderpaymentsNotifyRefundRequest extends js.Object {
  /**
    * Deprecated. Please use invoiceIds instead.
    */
  var invoiceId: js.UndefOr[String] = js.native
  /**
    * Invoice IDs from the orderinvoices service that correspond to the refund.
    */
  var invoiceIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether refund was successful.
    */
  var refundState: js.UndefOr[String] = js.native
}

object SchemaOrderpaymentsNotifyRefundRequest {
  @scala.inline
  def apply(invoiceId: String = null, invoiceIds: js.Array[String] = null, refundState: String = null): SchemaOrderpaymentsNotifyRefundRequest = {
    val __obj = js.Dynamic.literal()
    if (invoiceId != null) __obj.updateDynamic("invoiceId")(invoiceId.asInstanceOf[js.Any])
    if (invoiceIds != null) __obj.updateDynamic("invoiceIds")(invoiceIds.asInstanceOf[js.Any])
    if (refundState != null) __obj.updateDynamic("refundState")(refundState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyRefundRequest]
  }
}

