package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch regional inventory request.
  */
@js.native
trait SchemaRegionalinventoryCustomBatchRequestEntry extends js.Object {
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  /**
    * The ID of the product for which to update price and availability.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * Price and availability of the product.
    */
  var regionalInventory: js.UndefOr[SchemaRegionalInventory] = js.native
}

object SchemaRegionalinventoryCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: js.UndefOr[Double] = js.undefined,
    merchantId: String = null,
    method: String = null,
    productId: String = null,
    regionalInventory: SchemaRegionalInventory = null
  ): SchemaRegionalinventoryCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (regionalInventory != null) __obj.updateDynamic("regionalInventory")(regionalInventory.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegionalinventoryCustomBatchRequestEntry]
  }
}

