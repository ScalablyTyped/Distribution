package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response when updating a range of values in a spreadsheet.
  */
trait SchemaUpdateValuesResponse extends StObject {
  
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of cells updated.
    */
  var updatedCells: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of columns where at least one cell in the column was updated.
    */
  var updatedColumns: js.UndefOr[Double] = js.undefined
  
  /**
    * The values of the cells after updates were applied. This is only included
    * if the request&#39;s `includeValuesInResponse` field was `true`.
    */
  var updatedData: js.UndefOr[SchemaValueRange] = js.undefined
  
  /**
    * The range (in A1 notation) that updates were applied to.
    */
  var updatedRange: js.UndefOr[String] = js.undefined
  
  /**
    * The number of rows where at least one cell in the row was updated.
    */
  var updatedRows: js.UndefOr[Double] = js.undefined
}
object SchemaUpdateValuesResponse {
  
  inline def apply(): SchemaUpdateValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateValuesResponse]
  }
  
  extension [Self <: SchemaUpdateValuesResponse](x: Self) {
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    inline def setUpdatedCells(value: Double): Self = StObject.set(x, "updatedCells", value.asInstanceOf[js.Any])
    
    inline def setUpdatedCellsUndefined: Self = StObject.set(x, "updatedCells", js.undefined)
    
    inline def setUpdatedColumns(value: Double): Self = StObject.set(x, "updatedColumns", value.asInstanceOf[js.Any])
    
    inline def setUpdatedColumnsUndefined: Self = StObject.set(x, "updatedColumns", js.undefined)
    
    inline def setUpdatedData(value: SchemaValueRange): Self = StObject.set(x, "updatedData", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDataUndefined: Self = StObject.set(x, "updatedData", js.undefined)
    
    inline def setUpdatedRange(value: String): Self = StObject.set(x, "updatedRange", value.asInstanceOf[js.Any])
    
    inline def setUpdatedRangeUndefined: Self = StObject.set(x, "updatedRange", js.undefined)
    
    inline def setUpdatedRows(value: Double): Self = StObject.set(x, "updatedRows", value.asInstanceOf[js.Any])
    
    inline def setUpdatedRowsUndefined: Self = StObject.set(x, "updatedRows", js.undefined)
  }
}
