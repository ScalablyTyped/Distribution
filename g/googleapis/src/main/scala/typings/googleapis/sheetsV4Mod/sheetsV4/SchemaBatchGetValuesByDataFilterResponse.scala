package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response when retrieving more than one range of values in a spreadsheet
  * selected by DataFilters.
  */
@js.native
trait SchemaBatchGetValuesByDataFilterResponse extends js.Object {
  /**
    * The ID of the spreadsheet the data was retrieved from.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The requested values with the list of data filters that matched them.
    */
  var valueRanges: js.UndefOr[js.Array[SchemaMatchedValueRange]] = js.native
}

object SchemaBatchGetValuesByDataFilterResponse {
  @scala.inline
  def apply(spreadsheetId: String = null, valueRanges: js.Array[SchemaMatchedValueRange] = null): SchemaBatchGetValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (valueRanges != null) __obj.updateDynamic("valueRanges")(valueRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchGetValuesByDataFilterResponse]
  }
}

