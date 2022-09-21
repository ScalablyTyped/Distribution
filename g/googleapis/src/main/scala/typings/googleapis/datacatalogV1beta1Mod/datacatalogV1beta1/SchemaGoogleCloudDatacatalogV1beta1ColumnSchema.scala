package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1ColumnSchema extends StObject {
  
  /**
    * Required. Name of the column.
    */
  var column: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Description of the column. Default value is an empty string.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A column's mode indicates whether the values in this column are required, nullable, etc. Only `NULLABLE`, `REQUIRED` and `REPEATED` are supported. Default mode is `NULLABLE`.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Schema of sub-columns. A column can have zero or more sub-columns.
    */
  var subcolumns: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1beta1ColumnSchema]] = js.undefined
  
  /**
    * Required. Type of the column.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1ColumnSchema {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1ColumnSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1ColumnSchema]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1ColumnSchema](x: Self) {
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnNull: Self = StObject.set(x, "column", null)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSubcolumns(value: js.Array[SchemaGoogleCloudDatacatalogV1beta1ColumnSchema]): Self = StObject.set(x, "subcolumns", value.asInstanceOf[js.Any])
    
    inline def setSubcolumnsUndefined: Self = StObject.set(x, "subcolumns", js.undefined)
    
    inline def setSubcolumnsVarargs(value: SchemaGoogleCloudDatacatalogV1beta1ColumnSchema*): Self = StObject.set(x, "subcolumns", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
