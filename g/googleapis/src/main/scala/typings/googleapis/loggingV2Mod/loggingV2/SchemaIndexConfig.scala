package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIndexConfig extends StObject {
  
  /**
    * Output only. The timestamp when the index was last modified.This is used to return the timestamp, and will be ignored if supplied during update.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The LogEntry field path to index.Note that some paths are automatically indexed, and other paths are not eligible for indexing. See indexing documentation( https://cloud.google.com/logging/docs/view/advanced-queries#indexed-fields) for details.For example: jsonPayload.request.status
    */
  var fieldPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of data in this index.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaIndexConfig {
  
  inline def apply(): SchemaIndexConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndexConfig]
  }
  
  extension [Self <: SchemaIndexConfig](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldPathNull: Self = StObject.set(x, "fieldPath", null)
    
    inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
