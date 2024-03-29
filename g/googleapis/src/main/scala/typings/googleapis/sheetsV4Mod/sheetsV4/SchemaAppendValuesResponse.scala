package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppendValuesResponse extends StObject {
  
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The range (in A1 notation) of the table that values are being appended to (before the values were appended). Empty if no table was found.
    */
  var tableRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about the updates that were applied.
    */
  var updates: js.UndefOr[SchemaUpdateValuesResponse] = js.undefined
}
object SchemaAppendValuesResponse {
  
  inline def apply(): SchemaAppendValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppendValuesResponse]
  }
  
  extension [Self <: SchemaAppendValuesResponse](x: Self) {
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdNull: Self = StObject.set(x, "spreadsheetId", null)
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    inline def setTableRange(value: String): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
    
    inline def setTableRangeNull: Self = StObject.set(x, "tableRange", null)
    
    inline def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
    
    inline def setUpdates(value: SchemaUpdateValuesResponse): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
  }
}
