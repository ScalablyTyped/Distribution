package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for retrieving a Spreadsheet.
  */
@js.native
trait SchemaGetSpreadsheetByDataFilterRequest extends js.Object {
  /**
    * The DataFilters used to select which ranges to retrieve from the
    * spreadsheet.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
  /**
    * True if grid data should be returned. This parameter is ignored if a
    * field mask was set in the request.
    */
  var includeGridData: js.UndefOr[Boolean] = js.native
}

object SchemaGetSpreadsheetByDataFilterRequest {
  @scala.inline
  def apply(
    dataFilters: js.Array[SchemaDataFilter] = null,
    includeGridData: js.UndefOr[Boolean] = js.undefined
  ): SchemaGetSpreadsheetByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(includeGridData)) __obj.updateDynamic("includeGridData")(includeGridData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetSpreadsheetByDataFilterRequest]
  }
}

