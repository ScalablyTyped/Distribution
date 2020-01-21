package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersGetByMerchantOrderIdResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersGetByMerchantOrderIdResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The requested order.
    */
  var order: js.UndefOr[SchemaOrder] = js.native
}

object SchemaOrdersGetByMerchantOrderIdResponse {
  @scala.inline
  def apply(kind: String = null, order: SchemaOrder = null): SchemaOrdersGetByMerchantOrderIdResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersGetByMerchantOrderIdResponse]
  }
}

