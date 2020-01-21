package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMerchantOrderReturnItem extends js.Object {
  var customerReturnReason: js.UndefOr[SchemaCustomerReturnReason] = js.native
  var itemId: js.UndefOr[String] = js.native
  var merchantReturnReason: js.UndefOr[SchemaRefundReason] = js.native
  var product: js.UndefOr[SchemaOrderLineItemProduct] = js.native
  var returnShipmentIds: js.UndefOr[js.Array[String]] = js.native
  var state: js.UndefOr[String] = js.native
}

object SchemaMerchantOrderReturnItem {
  @scala.inline
  def apply(
    customerReturnReason: SchemaCustomerReturnReason = null,
    itemId: String = null,
    merchantReturnReason: SchemaRefundReason = null,
    product: SchemaOrderLineItemProduct = null,
    returnShipmentIds: js.Array[String] = null,
    state: String = null
  ): SchemaMerchantOrderReturnItem = {
    val __obj = js.Dynamic.literal()
    if (customerReturnReason != null) __obj.updateDynamic("customerReturnReason")(customerReturnReason.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (merchantReturnReason != null) __obj.updateDynamic("merchantReturnReason")(merchantReturnReason.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (returnShipmentIds != null) __obj.updateDynamic("returnShipmentIds")(returnShipmentIds.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMerchantOrderReturnItem]
  }
}

