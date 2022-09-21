package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceSheetDimensionRange extends StObject {
  
  /**
    * The columns on the data source sheet.
    */
  var columnReferences: js.UndefOr[js.Array[SchemaDataSourceColumnReference]] = js.undefined
  
  /**
    * The ID of the data source sheet the range is on.
    */
  var sheetId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDataSourceSheetDimensionRange {
  
  inline def apply(): SchemaDataSourceSheetDimensionRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceSheetDimensionRange]
  }
  
  extension [Self <: SchemaDataSourceSheetDimensionRange](x: Self) {
    
    inline def setColumnReferences(value: js.Array[SchemaDataSourceColumnReference]): Self = StObject.set(x, "columnReferences", value.asInstanceOf[js.Any])
    
    inline def setColumnReferencesUndefined: Self = StObject.set(x, "columnReferences", js.undefined)
    
    inline def setColumnReferencesVarargs(value: SchemaDataSourceColumnReference*): Self = StObject.set(x, "columnReferences", js.Array(value*))
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdNull: Self = StObject.set(x, "sheetId", null)
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
