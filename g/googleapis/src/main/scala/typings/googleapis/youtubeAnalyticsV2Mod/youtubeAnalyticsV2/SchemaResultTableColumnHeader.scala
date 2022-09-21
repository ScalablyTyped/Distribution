package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResultTableColumnHeader extends StObject {
  
  /**
    * The type of the column (`DIMENSION` or `METRIC`).
    */
  var columnType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the data in the column (`STRING`, `INTEGER`, `FLOAT`, etc.).
    */
  var dataType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the dimension or metric.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaResultTableColumnHeader {
  
  inline def apply(): SchemaResultTableColumnHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultTableColumnHeader]
  }
  
  extension [Self <: SchemaResultTableColumnHeader](x: Self) {
    
    inline def setColumnType(value: String): Self = StObject.set(x, "columnType", value.asInstanceOf[js.Any])
    
    inline def setColumnTypeNull: Self = StObject.set(x, "columnType", null)
    
    inline def setColumnTypeUndefined: Self = StObject.set(x, "columnType", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNull: Self = StObject.set(x, "dataType", null)
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
