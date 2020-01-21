package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGetOrderDealsResponse extends js.Object {
  /**
    * List of deals for the proposal
    */
  var deals: js.UndefOr[js.Array[SchemaMarketplaceDeal]] = js.native
}

object SchemaGetOrderDealsResponse {
  @scala.inline
  def apply(deals: js.Array[SchemaMarketplaceDeal] = null): SchemaGetOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    if (deals != null) __obj.updateDynamic("deals")(deals.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetOrderDealsResponse]
  }
}

