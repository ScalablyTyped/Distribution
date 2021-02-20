package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response when updating a range of values in a spreadsheet.
  */
@js.native
trait SchemaBatchUpdateValuesResponse extends StObject {
  
  /**
    * One UpdateValuesResponse per requested range, in the same order as the
    * requests appeared.
    */
  var responses: js.UndefOr[js.Array[SchemaUpdateValuesResponse]] = js.native
  
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  
  /**
    * The total number of cells updated.
    */
  var totalUpdatedCells: js.UndefOr[Double] = js.native
  
  /**
    * The total number of columns where at least one cell in the column was
    * updated.
    */
  var totalUpdatedColumns: js.UndefOr[Double] = js.native
  
  /**
    * The total number of rows where at least one cell in the row was updated.
    */
  var totalUpdatedRows: js.UndefOr[Double] = js.native
  
  /**
    * The total number of sheets where at least one cell in the sheet was
    * updated.
    */
  var totalUpdatedSheets: js.UndefOr[Double] = js.native
}
object SchemaBatchUpdateValuesResponse {
  
  @scala.inline
  def apply(): SchemaBatchUpdateValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateValuesResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchUpdateValuesResponseMutableBuilder[Self <: SchemaBatchUpdateValuesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[SchemaUpdateValuesResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: SchemaUpdateValuesResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    @scala.inline
    def setTotalUpdatedCells(value: Double): Self = StObject.set(x, "totalUpdatedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUpdatedCellsUndefined: Self = StObject.set(x, "totalUpdatedCells", js.undefined)
    
    @scala.inline
    def setTotalUpdatedColumns(value: Double): Self = StObject.set(x, "totalUpdatedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUpdatedColumnsUndefined: Self = StObject.set(x, "totalUpdatedColumns", js.undefined)
    
    @scala.inline
    def setTotalUpdatedRows(value: Double): Self = StObject.set(x, "totalUpdatedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUpdatedRowsUndefined: Self = StObject.set(x, "totalUpdatedRows", js.undefined)
    
    @scala.inline
    def setTotalUpdatedSheets(value: Double): Self = StObject.set(x, "totalUpdatedSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUpdatedSheetsUndefined: Self = StObject.set(x, "totalUpdatedSheets", js.undefined)
  }
}
