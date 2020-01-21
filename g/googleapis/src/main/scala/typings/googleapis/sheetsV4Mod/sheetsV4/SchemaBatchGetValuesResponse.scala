package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response when retrieving more than one range of values in a
  * spreadsheet.
  */
@js.native
trait SchemaBatchGetValuesResponse extends js.Object {
  /**
    * The ID of the spreadsheet the data was retrieved from.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The requested values. The order of the ValueRanges is the same as the
    * order of the requested ranges.
    */
  var valueRanges: js.UndefOr[js.Array[SchemaValueRange]] = js.native
}

object SchemaBatchGetValuesResponse {
  @scala.inline
  def apply(spreadsheetId: String = null, valueRanges: js.Array[SchemaValueRange] = null): SchemaBatchGetValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (valueRanges != null) __obj.updateDynamic("valueRanges")(valueRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchGetValuesResponse]
  }
}

