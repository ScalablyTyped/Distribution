package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1ColumnSchema extends StObject {
  
  /** Required. Name of the column. Must be a UTF-8 string without dots (.). The maximum size is 64 bytes. */
  var column: js.UndefOr[String] = js.undefined
  
  /** Optional. Description of the column. Default value is an empty string. The description must be a UTF-8 string with the maximum size of 2000 bytes. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Looker specific column info of this column. */
  var lookerColumnSpec: js.UndefOr[GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpec] = js.undefined
  
  /**
    * Optional. A column's mode indicates whether values in this column are required, nullable, or repeated. Only `NULLABLE`, `REQUIRED`, and `REPEATED` values are supported. Default mode
    * is `NULLABLE`.
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /** Optional. Schema of sub-columns. A column can have zero or more sub-columns. */
  var subcolumns: js.UndefOr[js.Array[GoogleCloudDatacatalogV1ColumnSchema]] = js.undefined
  
  /** Required. Type of the column. Must be a UTF-8 string with the maximum size of 128 bytes. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1ColumnSchema {
  
  inline def apply(): GoogleCloudDatacatalogV1ColumnSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1ColumnSchema]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1ColumnSchema](x: Self) {
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLookerColumnSpec(value: GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpec): Self = StObject.set(x, "lookerColumnSpec", value.asInstanceOf[js.Any])
    
    inline def setLookerColumnSpecUndefined: Self = StObject.set(x, "lookerColumnSpec", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSubcolumns(value: js.Array[GoogleCloudDatacatalogV1ColumnSchema]): Self = StObject.set(x, "subcolumns", value.asInstanceOf[js.Any])
    
    inline def setSubcolumnsUndefined: Self = StObject.set(x, "subcolumns", js.undefined)
    
    inline def setSubcolumnsVarargs(value: GoogleCloudDatacatalogV1ColumnSchema*): Self = StObject.set(x, "subcolumns", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
