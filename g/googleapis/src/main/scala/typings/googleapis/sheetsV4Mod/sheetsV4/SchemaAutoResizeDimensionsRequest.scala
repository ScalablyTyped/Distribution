package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoResizeDimensionsRequest extends StObject {
  
  /**
    * The dimensions on a data source sheet to automatically resize.
    */
  var dataSourceSheetDimensions: js.UndefOr[SchemaDataSourceSheetDimensionRange] = js.undefined
  
  /**
    * The dimensions to automatically resize.
    */
  var dimensions: js.UndefOr[SchemaDimensionRange] = js.undefined
}
object SchemaAutoResizeDimensionsRequest {
  
  inline def apply(): SchemaAutoResizeDimensionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoResizeDimensionsRequest]
  }
  
  extension [Self <: SchemaAutoResizeDimensionsRequest](x: Self) {
    
    inline def setDataSourceSheetDimensions(value: SchemaDataSourceSheetDimensionRange): Self = StObject.set(x, "dataSourceSheetDimensions", value.asInstanceOf[js.Any])
    
    inline def setDataSourceSheetDimensionsUndefined: Self = StObject.set(x, "dataSourceSheetDimensions", js.undefined)
    
    inline def setDimensions(value: SchemaDimensionRange): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
  }
}
