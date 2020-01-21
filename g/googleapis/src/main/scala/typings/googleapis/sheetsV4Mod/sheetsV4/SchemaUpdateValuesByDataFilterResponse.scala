package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response when updating a range of values by a data filter in a
  * spreadsheet.
  */
@js.native
trait SchemaUpdateValuesByDataFilterResponse extends js.Object {
  /**
    * The data filter that selected the range that was updated.
    */
  var dataFilter: js.UndefOr[SchemaDataFilter] = js.native
  /**
    * The number of cells updated.
    */
  var updatedCells: js.UndefOr[Double] = js.native
  /**
    * The number of columns where at least one cell in the column was updated.
    */
  var updatedColumns: js.UndefOr[Double] = js.native
  /**
    * The values of the cells in the range matched by the dataFilter after all
    * updates were applied. This is only included if the request&#39;s
    * `includeValuesInResponse` field was `true`.
    */
  var updatedData: js.UndefOr[SchemaValueRange] = js.native
  /**
    * The range (in A1 notation) that updates were applied to.
    */
  var updatedRange: js.UndefOr[String] = js.native
  /**
    * The number of rows where at least one cell in the row was updated.
    */
  var updatedRows: js.UndefOr[Double] = js.native
}

object SchemaUpdateValuesByDataFilterResponse {
  @scala.inline
  def apply(
    dataFilter: SchemaDataFilter = null,
    updatedCells: Int | Double = null,
    updatedColumns: Int | Double = null,
    updatedData: SchemaValueRange = null,
    updatedRange: String = null,
    updatedRows: Int | Double = null
  ): SchemaUpdateValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(dataFilter.asInstanceOf[js.Any])
    if (updatedCells != null) __obj.updateDynamic("updatedCells")(updatedCells.asInstanceOf[js.Any])
    if (updatedColumns != null) __obj.updateDynamic("updatedColumns")(updatedColumns.asInstanceOf[js.Any])
    if (updatedData != null) __obj.updateDynamic("updatedData")(updatedData.asInstanceOf[js.Any])
    if (updatedRange != null) __obj.updateDynamic("updatedRange")(updatedRange.asInstanceOf[js.Any])
    if (updatedRows != null) __obj.updateDynamic("updatedRows")(updatedRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateValuesByDataFilterResponse]
  }
}

