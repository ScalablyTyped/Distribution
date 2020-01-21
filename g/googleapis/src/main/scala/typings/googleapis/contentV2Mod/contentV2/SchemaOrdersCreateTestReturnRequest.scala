package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCreateTestReturnRequest extends js.Object {
  /**
    * Returned items.
    */
  var items: js.UndefOr[js.Array[SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem]] = js.native
}

object SchemaOrdersCreateTestReturnRequest {
  @scala.inline
  def apply(items: js.Array[SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem] = null): SchemaOrdersCreateTestReturnRequest = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersCreateTestReturnRequest]
  }
}

