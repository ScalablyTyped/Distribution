package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response when clearing a range of values in a spreadsheet.
  */
@js.native
trait SchemaBatchClearValuesResponse extends js.Object {
  /**
    * The ranges that were cleared, in A1 notation. (If the requests were for
    * an unbounded range or a ranger larger  than the bounds of the sheet, this
    * will be the actual ranges  that were cleared, bounded to the sheet&#39;s
    * limits.)
    */
  var clearedRanges: js.UndefOr[js.Array[String]] = js.native
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
}

object SchemaBatchClearValuesResponse {
  @scala.inline
  def apply(clearedRanges: js.Array[String] = null, spreadsheetId: String = null): SchemaBatchClearValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (clearedRanges != null) __obj.updateDynamic("clearedRanges")(clearedRanges.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchClearValuesResponse]
  }
}

