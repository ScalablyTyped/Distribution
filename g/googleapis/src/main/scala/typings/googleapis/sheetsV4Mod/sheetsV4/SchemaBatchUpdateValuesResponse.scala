package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchUpdateValuesResponse extends StObject {
  
  /**
    * One UpdateValuesResponse per requested range, in the same order as the requests appeared.
    */
  var responses: js.UndefOr[js.Array[SchemaUpdateValuesResponse]] = js.undefined
  
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of cells updated.
    */
  var totalUpdatedCells: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The total number of columns where at least one cell in the column was updated.
    */
  var totalUpdatedColumns: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The total number of rows where at least one cell in the row was updated.
    */
  var totalUpdatedRows: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The total number of sheets where at least one cell in the sheet was updated.
    */
  var totalUpdatedSheets: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBatchUpdateValuesResponse {
  
  inline def apply(): SchemaBatchUpdateValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateValuesResponse]
  }
  
  extension [Self <: SchemaBatchUpdateValuesResponse](x: Self) {
    
    inline def setResponses(value: js.Array[SchemaUpdateValuesResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaUpdateValuesResponse*): Self = StObject.set(x, "responses", js.Array(value*))
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdNull: Self = StObject.set(x, "spreadsheetId", null)
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    inline def setTotalUpdatedCells(value: Double): Self = StObject.set(x, "totalUpdatedCells", value.asInstanceOf[js.Any])
    
    inline def setTotalUpdatedCellsNull: Self = StObject.set(x, "totalUpdatedCells", null)
    
    inline def setTotalUpdatedCellsUndefined: Self = StObject.set(x, "totalUpdatedCells", js.undefined)
    
    inline def setTotalUpdatedColumns(value: Double): Self = StObject.set(x, "totalUpdatedColumns", value.asInstanceOf[js.Any])
    
    inline def setTotalUpdatedColumnsNull: Self = StObject.set(x, "totalUpdatedColumns", null)
    
    inline def setTotalUpdatedColumnsUndefined: Self = StObject.set(x, "totalUpdatedColumns", js.undefined)
    
    inline def setTotalUpdatedRows(value: Double): Self = StObject.set(x, "totalUpdatedRows", value.asInstanceOf[js.Any])
    
    inline def setTotalUpdatedRowsNull: Self = StObject.set(x, "totalUpdatedRows", null)
    
    inline def setTotalUpdatedRowsUndefined: Self = StObject.set(x, "totalUpdatedRows", js.undefined)
    
    inline def setTotalUpdatedSheets(value: Double): Self = StObject.set(x, "totalUpdatedSheets", value.asInstanceOf[js.Any])
    
    inline def setTotalUpdatedSheetsNull: Self = StObject.set(x, "totalUpdatedSheets", null)
    
    inline def setTotalUpdatedSheetsUndefined: Self = StObject.set(x, "totalUpdatedSheets", js.undefined)
  }
}
