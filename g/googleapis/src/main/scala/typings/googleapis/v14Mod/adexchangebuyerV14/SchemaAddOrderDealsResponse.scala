package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAddOrderDealsResponse extends js.Object {
  /**
    * List of deals added (in the same proposal as passed in the request)
    */
  var deals: js.UndefOr[js.Array[SchemaMarketplaceDeal]] = js.native
  /**
    * The updated revision number for the proposal.
    */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
}

object SchemaAddOrderDealsResponse {
  @scala.inline
  def apply(deals: js.Array[SchemaMarketplaceDeal] = null, proposalRevisionNumber: String = null): SchemaAddOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    if (deals != null) __obj.updateDynamic("deals")(deals.asInstanceOf[js.Any])
    if (proposalRevisionNumber != null) __obj.updateDynamic("proposalRevisionNumber")(proposalRevisionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddOrderDealsResponse]
  }
}

