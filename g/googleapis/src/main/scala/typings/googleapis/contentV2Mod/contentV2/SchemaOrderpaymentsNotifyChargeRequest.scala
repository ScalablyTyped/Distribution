package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderpaymentsNotifyChargeRequest extends js.Object {
  /**
    * Whether charge was successful.
    */
  var chargeState: js.UndefOr[String] = js.native
  /**
    * Deprecated. Please use invoiceIds instead.
    */
  var invoiceId: js.UndefOr[String] = js.native
  /**
    * Invoice IDs from the orderinvoices service that correspond to the charge.
    */
  var invoiceIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaOrderpaymentsNotifyChargeRequest {
  @scala.inline
  def apply(chargeState: String = null, invoiceId: String = null, invoiceIds: js.Array[String] = null): SchemaOrderpaymentsNotifyChargeRequest = {
    val __obj = js.Dynamic.literal()
    if (chargeState != null) __obj.updateDynamic("chargeState")(chargeState.asInstanceOf[js.Any])
    if (invoiceId != null) __obj.updateDynamic("invoiceId")(invoiceId.asInstanceOf[js.Any])
    if (invoiceIds != null) __obj.updateDynamic("invoiceIds")(invoiceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyChargeRequest]
  }
}

