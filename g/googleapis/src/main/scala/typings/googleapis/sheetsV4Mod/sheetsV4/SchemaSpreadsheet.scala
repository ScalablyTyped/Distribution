package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource that represents a spreadsheet.
  */
@js.native
trait SchemaSpreadsheet extends js.Object {
  /**
    * The developer metadata associated with a spreadsheet.
    */
  var developerMetadata: js.UndefOr[js.Array[SchemaDeveloperMetadata]] = js.native
  /**
    * The named ranges defined in a spreadsheet.
    */
  var namedRanges: js.UndefOr[js.Array[SchemaNamedRange]] = js.native
  /**
    * Overall properties of a spreadsheet.
    */
  var properties: js.UndefOr[SchemaSpreadsheetProperties] = js.native
  /**
    * The sheets that are part of a spreadsheet.
    */
  var sheets: js.UndefOr[js.Array[SchemaSheet]] = js.native
  /**
    * The ID of the spreadsheet. This field is read-only.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The url of the spreadsheet. This field is read-only.
    */
  var spreadsheetUrl: js.UndefOr[String] = js.native
}

object SchemaSpreadsheet {
  @scala.inline
  def apply(): SchemaSpreadsheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpreadsheet]
  }
  @scala.inline
  implicit class SchemaSpreadsheetOps[Self <: SchemaSpreadsheet] (val x: Self) extends AnyVal {
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
    def setDeveloperMetadataVarargs(value: SchemaDeveloperMetadata*): Self = this.set("developerMetadata", js.Array(value :_*))
    @scala.inline
    def setDeveloperMetadata(value: js.Array[SchemaDeveloperMetadata]): Self = this.set("developerMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperMetadata: Self = this.set("developerMetadata", js.undefined)
    @scala.inline
    def setNamedRangesVarargs(value: SchemaNamedRange*): Self = this.set("namedRanges", js.Array(value :_*))
    @scala.inline
    def setNamedRanges(value: js.Array[SchemaNamedRange]): Self = this.set("namedRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedRanges: Self = this.set("namedRanges", js.undefined)
    @scala.inline
    def setProperties(value: SchemaSpreadsheetProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setSheetsVarargs(value: SchemaSheet*): Self = this.set("sheets", js.Array(value :_*))
    @scala.inline
    def setSheets(value: js.Array[SchemaSheet]): Self = this.set("sheets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheets: Self = this.set("sheets", js.undefined)
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
    @scala.inline
    def setSpreadsheetUrl(value: String): Self = this.set("spreadsheetUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheetUrl: Self = this.set("spreadsheetUrl", js.undefined)
  }
  
}

