package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch inventory request.
  */
@js.native
trait SchemaInventoryCustomBatchRequestEntry extends js.Object {
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * Price and availability of the product.
    */
  var inventory: js.UndefOr[SchemaInventory] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  /**
    * The ID of the product for which to update price and availability.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The code of the store for which to update price and availability. Use
    * online to update price and availability of an online product.
    */
  var storeCode: js.UndefOr[String] = js.native
}

object SchemaInventoryCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: js.UndefOr[Double] = js.undefined,
    inventory: SchemaInventory = null,
    merchantId: String = null,
    productId: String = null,
    storeCode: String = null
  ): SchemaInventoryCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (inventory != null) __obj.updateDynamic("inventory")(inventory.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInventoryCustomBatchRequestEntry]
  }
}

