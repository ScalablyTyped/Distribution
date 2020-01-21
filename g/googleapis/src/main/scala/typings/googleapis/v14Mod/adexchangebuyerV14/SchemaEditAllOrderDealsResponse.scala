package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaEditAllOrderDealsResponse extends js.Object {
  /**
    * List of all deals in the proposal after edit.
    */
  var deals: js.UndefOr[js.Array[SchemaMarketplaceDeal]] = js.native
  /**
    * The latest revision number after the update has been applied.
    */
  var orderRevisionNumber: js.UndefOr[String] = js.native
}

object SchemaEditAllOrderDealsResponse {
  @scala.inline
  def apply(deals: js.Array[SchemaMarketplaceDeal] = null, orderRevisionNumber: String = null): SchemaEditAllOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    if (deals != null) __obj.updateDynamic("deals")(deals.asInstanceOf[js.Any])
    if (orderRevisionNumber != null) __obj.updateDynamic("orderRevisionNumber")(orderRevisionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEditAllOrderDealsResponse]
  }
}

