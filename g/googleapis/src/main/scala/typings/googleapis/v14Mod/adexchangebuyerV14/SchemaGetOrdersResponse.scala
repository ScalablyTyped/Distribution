package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGetOrdersResponse extends js.Object {
  /**
    * The list of matching proposals.
    */
  var proposals: js.UndefOr[js.Array[SchemaProposal]] = js.native
}

object SchemaGetOrdersResponse {
  @scala.inline
  def apply(proposals: js.Array[SchemaProposal] = null): SchemaGetOrdersResponse = {
    val __obj = js.Dynamic.literal()
    if (proposals != null) __obj.updateDynamic("proposals")(proposals.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetOrdersResponse]
  }
}

