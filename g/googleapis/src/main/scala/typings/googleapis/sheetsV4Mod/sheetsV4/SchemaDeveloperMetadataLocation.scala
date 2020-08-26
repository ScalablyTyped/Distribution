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
  def apply(): SchemaDeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeveloperMetadataLocation]
  }
  @scala.inline
  implicit class SchemaDeveloperMetadataLocationOps[Self <: SchemaDeveloperMetadataLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDimensionRange(value: SchemaDimensionRange): Self = this.set("dimensionRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionRange: Self = this.set("dimensionRange", js.undefined)
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
    @scala.inline
    def setSpreadsheet(value: Boolean): Self = this.set("spreadsheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheet: Self = this.set("spreadsheet", js.undefined)
  }
  
}

