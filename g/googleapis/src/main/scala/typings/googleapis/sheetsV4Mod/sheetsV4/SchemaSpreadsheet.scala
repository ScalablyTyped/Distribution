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
  def apply(
    developerMetadata: js.Array[SchemaDeveloperMetadata] = null,
    namedRanges: js.Array[SchemaNamedRange] = null,
    properties: SchemaSpreadsheetProperties = null,
    sheets: js.Array[SchemaSheet] = null,
    spreadsheetId: String = null,
    spreadsheetUrl: String = null
  ): SchemaSpreadsheet = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    if (namedRanges != null) __obj.updateDynamic("namedRanges")(namedRanges.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (sheets != null) __obj.updateDynamic("sheets")(sheets.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (spreadsheetUrl != null) __obj.updateDynamic("spreadsheetUrl")(spreadsheetUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpreadsheet]
  }
}

