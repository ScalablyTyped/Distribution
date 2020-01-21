package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersUpdateMerchantOrderIdRequest extends js.Object {
  /**
    * The merchant order id to be assigned to the order. Must be unique per
    * merchant.
    */
  var merchantOrderId: js.UndefOr[String] = js.native
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.native
}

object SchemaOrdersUpdateMerchantOrderIdRequest {
  @scala.inline
  def apply(merchantOrderId: String = null, operationId: String = null): SchemaOrdersUpdateMerchantOrderIdRequest = {
    val __obj = js.Dynamic.literal()
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersUpdateMerchantOrderIdRequest]
  }
}

