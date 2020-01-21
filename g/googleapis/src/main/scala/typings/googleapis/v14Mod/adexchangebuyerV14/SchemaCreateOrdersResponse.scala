package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCreateOrdersResponse extends js.Object {
  /**
    * The list of proposals successfully created.
    */
  var proposals: js.UndefOr[js.Array[SchemaProposal]] = js.native
}

object SchemaCreateOrdersResponse {
  @scala.inline
  def apply(proposals: js.Array[SchemaProposal] = null): SchemaCreateOrdersResponse = {
    val __obj = js.Dynamic.literal()
    if (proposals != null) __obj.updateDynamic("proposals")(proposals.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateOrdersResponse]
  }
}

