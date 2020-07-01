package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A location where metadata may be associated in a spreadsheet.
  */
@js.native
trait SchemaDeveloperMetadataLocation extends js.Object {
  /**
    * Represents the row or column when metadata is associated with a
    * dimension. The specified DimensionRange must represent a single row or
    * column; it cannot be unbounded or span multiple rows or columns.
    */
  var dimensionRange: js.UndefOr[SchemaDimensionRange] = js.native
  /**
    * The type of location this object represents.  This field is read-only.
    */
  var locationType: js.UndefOr[String] = js.native
  /**
    * The ID of the sheet when metadata is associated with an entire sheet.
    */
  var sheetId: js.UndefOr[Double] = js.native
  /**
    * True when metadata is associated with an entire spreadsheet.
    */
  var spreadsheet: js.UndefOr[Boolean] = js.native
}

object SchemaDeveloperMetadataLocation {
  @scala.inline
  def apply(
    dimensionRange: SchemaDimensionRange = null,
    locationType: String = null,
    sheetId: js.UndefOr[Double] = js.undefined,
    spreadsheet: js.UndefOr[Boolean] = js.undefined
  ): SchemaDeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal()
    if (dimensionRange != null) __obj.updateDynamic("dimensionRange")(dimensionRange.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spreadsheet)) __obj.updateDynamic("spreadsheet")(spreadsheet.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeveloperMetadataLocation]
  }
}

