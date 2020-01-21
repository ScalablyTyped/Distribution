package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a particular filter view.
  */
@js.native
trait SchemaDeleteFilterViewRequest extends js.Object {
  /**
    * The ID of the filter to delete.
    */
  var filterId: js.UndefOr[Double] = js.native
}

object SchemaDeleteFilterViewRequest {
  @scala.inline
  def apply(filterId: Int | Double = null): SchemaDeleteFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (filterId != null) __obj.updateDynamic("filterId")(filterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteFilterViewRequest]
  }
}

