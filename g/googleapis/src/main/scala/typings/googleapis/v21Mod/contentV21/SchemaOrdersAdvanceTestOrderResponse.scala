package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersAdvanceTestOrderResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersAdvanceTestOrderResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaOrdersAdvanceTestOrderResponse {
  @scala.inline
  def apply(kind: String = null): SchemaOrdersAdvanceTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersAdvanceTestOrderResponse]
  }
}

