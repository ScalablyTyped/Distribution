package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeveloperMetadataLocation extends StObject {
  
  /**
    * Represents the row or column when metadata is associated with a dimension. The specified DimensionRange must represent a single row or column; it cannot be unbounded or span multiple rows or columns.
    */
  var dimensionRange: js.UndefOr[SchemaDimensionRange] = js.undefined
  
  /**
    * The type of location this object represents. This field is read-only.
    */
  var locationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the sheet when metadata is associated with an entire sheet.
    */
  var sheetId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * True when metadata is associated with an entire spreadsheet.
    */
  var spreadsheet: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDeveloperMetadataLocation {
  
  inline def apply(): SchemaDeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeveloperMetadataLocation]
  }
  
  extension [Self <: SchemaDeveloperMetadataLocation](x: Self) {
    
    inline def setDimensionRange(value: SchemaDimensionRange): Self = StObject.set(x, "dimensionRange", value.asInstanceOf[js.Any])
    
    inline def setDimensionRangeUndefined: Self = StObject.set(x, "dimensionRange", js.undefined)
    
    inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeNull: Self = StObject.set(x, "locationType", null)
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdNull: Self = StObject.set(x, "sheetId", null)
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    inline def setSpreadsheet(value: Boolean): Self = StObject.set(x, "spreadsheet", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetNull: Self = StObject.set(x, "spreadsheet", null)
    
    inline def setSpreadsheetUndefined: Self = StObject.set(x, "spreadsheet", js.undefined)
  }
}
