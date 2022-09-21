package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOracleSourceConfig extends StObject {
  
  /**
    * Drop large object values.
    */
  var dropLargeObjects: js.UndefOr[SchemaDropLargeObjects] = js.undefined
  
  /**
    * Oracle objects to exclude from the stream.
    */
  var excludeObjects: js.UndefOr[SchemaOracleRdbms] = js.undefined
  
  /**
    * Oracle objects to include in the stream.
    */
  var includeObjects: js.UndefOr[SchemaOracleRdbms] = js.undefined
  
  /**
    * Maximum number of concurrent CDC tasks. The number should be non negative. If not set (or set to 0), the system's default value will be used.
    */
  var maxConcurrentCdcTasks: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Stream large object values.
    */
  var streamLargeObjects: js.UndefOr[SchemaStreamLargeObjects] = js.undefined
}
object SchemaOracleSourceConfig {
  
  inline def apply(): SchemaOracleSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOracleSourceConfig]
  }
  
  extension [Self <: SchemaOracleSourceConfig](x: Self) {
    
    inline def setDropLargeObjects(value: SchemaDropLargeObjects): Self = StObject.set(x, "dropLargeObjects", value.asInstanceOf[js.Any])
    
    inline def setDropLargeObjectsUndefined: Self = StObject.set(x, "dropLargeObjects", js.undefined)
    
    inline def setExcludeObjects(value: SchemaOracleRdbms): Self = StObject.set(x, "excludeObjects", value.asInstanceOf[js.Any])
    
    inline def setExcludeObjectsUndefined: Self = StObject.set(x, "excludeObjects", js.undefined)
    
    inline def setIncludeObjects(value: SchemaOracleRdbms): Self = StObject.set(x, "includeObjects", value.asInstanceOf[js.Any])
    
    inline def setIncludeObjectsUndefined: Self = StObject.set(x, "includeObjects", js.undefined)
    
    inline def setMaxConcurrentCdcTasks(value: Double): Self = StObject.set(x, "maxConcurrentCdcTasks", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentCdcTasksNull: Self = StObject.set(x, "maxConcurrentCdcTasks", null)
    
    inline def setMaxConcurrentCdcTasksUndefined: Self = StObject.set(x, "maxConcurrentCdcTasks", js.undefined)
    
    inline def setStreamLargeObjects(value: SchemaStreamLargeObjects): Self = StObject.set(x, "streamLargeObjects", value.asInstanceOf[js.Any])
    
    inline def setStreamLargeObjectsUndefined: Self = StObject.set(x, "streamLargeObjects", js.undefined)
  }
}
