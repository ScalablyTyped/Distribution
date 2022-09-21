package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateDimensionPropertiesRequest extends StObject {
  
  /**
    * The columns on a data source sheet to update.
    */
  var dataSourceSheetRange: js.UndefOr[SchemaDataSourceSheetDimensionRange] = js.undefined
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `properties` is implied and should not be specified. A single `"*"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Properties to update.
    */
  var properties: js.UndefOr[SchemaDimensionProperties] = js.undefined
  
  /**
    * The rows or columns to update.
    */
  var range: js.UndefOr[SchemaDimensionRange] = js.undefined
}
object SchemaUpdateDimensionPropertiesRequest {
  
  inline def apply(): SchemaUpdateDimensionPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDimensionPropertiesRequest]
  }
  
  extension [Self <: SchemaUpdateDimensionPropertiesRequest](x: Self) {
    
    inline def setDataSourceSheetRange(value: SchemaDataSourceSheetDimensionRange): Self = StObject.set(x, "dataSourceSheetRange", value.asInstanceOf[js.Any])
    
    inline def setDataSourceSheetRangeUndefined: Self = StObject.set(x, "dataSourceSheetRange", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setProperties(value: SchemaDimensionProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRange(value: SchemaDimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
