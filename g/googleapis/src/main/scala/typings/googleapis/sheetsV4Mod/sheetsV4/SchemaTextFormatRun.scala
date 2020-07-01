package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A run of a text format. The format of this run continues until the start
  * index of the next run. When updating, all fields must be set.
  */
@js.native
trait SchemaTextFormatRun extends js.Object {
  /**
    * The format of this run.  Absent values inherit the cell&#39;s format.
    */
  var format: js.UndefOr[SchemaTextFormat] = js.native
  /**
    * The character index where this run starts.
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object SchemaTextFormatRun {
  @scala.inline
  def apply(format: SchemaTextFormat = null, startIndex: js.UndefOr[Double] = js.undefined): SchemaTextFormatRun = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextFormatRun]
  }
}

