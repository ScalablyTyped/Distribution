package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCreateTestOrderResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersCreateTestOrderResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the newly created test order.
    */
  var orderId: js.UndefOr[String] = js.native
}

object SchemaOrdersCreateTestOrderResponse {
  @scala.inline
  def apply(kind: String = null, orderId: String = null): SchemaOrdersCreateTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersCreateTestOrderResponse]
  }
}

