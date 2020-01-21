package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeleteOrderDealsRequest extends js.Object {
  /**
    * List of deals to delete for a given proposal
    */
  var dealIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The last known proposal revision number.
    */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  /**
    * Indicates an optional action to take on the proposal
    */
  var updateAction: js.UndefOr[String] = js.native
}

object SchemaDeleteOrderDealsRequest {
  @scala.inline
  def apply(
    dealIds: js.Array[String] = null,
    proposalRevisionNumber: String = null,
    updateAction: String = null
  ): SchemaDeleteOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    if (dealIds != null) __obj.updateDynamic("dealIds")(dealIds.asInstanceOf[js.Any])
    if (proposalRevisionNumber != null) __obj.updateDynamic("proposalRevisionNumber")(proposalRevisionNumber.asInstanceOf[js.Any])
    if (updateAction != null) __obj.updateDynamic("updateAction")(updateAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteOrderDealsRequest]
  }
}

