package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The description of a column of the result table.
  */
trait SchemaResultTableColumnHeader extends StObject {
  
  /**
    * The type of the column (`DIMENSION` or `METRIC`).
    */
  var columnType: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the data in the column (`STRING`, `INTEGER`, `FLOAT`, etc.).
    */
  var dataType: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the dimension or metric.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaResultTableColumnHeader {
  
  inline def apply(): SchemaResultTableColumnHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultTableColumnHeader]
  }
  
  extension [Self <: SchemaResultTableColumnHeader](x: Self) {
    
    inline def setColumnType(value: String): Self = StObject.set(x, "columnType", value.asInstanceOf[js.Any])
    
    inline def setColumnTypeUndefined: Self = StObject.set(x, "columnType", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
