package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCreateOrdersRequest extends js.Object {
  /**
    * The list of proposals to create.
    */
  var proposals: js.UndefOr[js.Array[SchemaProposal]] = js.native
  /**
    * Web property id of the seller creating these orders
    */
  var webPropertyCode: js.UndefOr[String] = js.native
}

object SchemaCreateOrdersRequest {
  @scala.inline
  def apply(proposals: js.Array[SchemaProposal] = null, webPropertyCode: String = null): SchemaCreateOrdersRequest = {
    val __obj = js.Dynamic.literal()
    if (proposals != null) __obj.updateDynamic("proposals")(proposals.asInstanceOf[js.Any])
    if (webPropertyCode != null) __obj.updateDynamic("webPropertyCode")(webPropertyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateOrdersRequest]
  }
}

