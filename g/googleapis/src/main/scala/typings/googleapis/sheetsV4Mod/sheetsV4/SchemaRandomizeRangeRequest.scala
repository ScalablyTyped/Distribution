package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Randomizes the order of the rows in a range.
  */
@js.native
trait SchemaRandomizeRangeRequest extends js.Object {
  /**
    * The range to randomize.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
}

object SchemaRandomizeRangeRequest {
  @scala.inline
  def apply(range: SchemaGridRange = null): SchemaRandomizeRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRandomizeRangeRequest]
  }
}

