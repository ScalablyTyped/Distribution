package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for clearing more than one range of values in a spreadsheet.
  */
@js.native
trait SchemaBatchClearValuesRequest extends js.Object {
  /**
    * The ranges to clear, in A1 notation.
    */
  var ranges: js.UndefOr[js.Array[String]] = js.native
}

object SchemaBatchClearValuesRequest {
  @scala.inline
  def apply(ranges: js.Array[String] = null): SchemaBatchClearValuesRequest = {
    val __obj = js.Dynamic.literal()
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchClearValuesRequest]
  }
}

