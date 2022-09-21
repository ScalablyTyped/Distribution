package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMysqlSourceConfig extends StObject {
  
  /**
    * MySQL objects to exclude from the stream.
    */
  var excludeObjects: js.UndefOr[SchemaMysqlRdbms] = js.undefined
  
  /**
    * MySQL objects to retrieve from the source.
    */
  var includeObjects: js.UndefOr[SchemaMysqlRdbms] = js.undefined
  
  /**
    * Maximum number of concurrent CDC tasks. The number should be non negative. If not set (or set to 0), the system's default value will be used.
    */
  var maxConcurrentCdcTasks: js.UndefOr[Double | Null] = js.undefined
}
object SchemaMysqlSourceConfig {
  
  inline def apply(): SchemaMysqlSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMysqlSourceConfig]
  }
  
  extension [Self <: SchemaMysqlSourceConfig](x: Self) {
    
    inline def setExcludeObjects(value: SchemaMysqlRdbms): Self = StObject.set(x, "excludeObjects", value.asInstanceOf[js.Any])
    
    inline def setExcludeObjectsUndefined: Self = StObject.set(x, "excludeObjects", js.undefined)
    
    inline def setIncludeObjects(value: SchemaMysqlRdbms): Self = StObject.set(x, "includeObjects", value.asInstanceOf[js.Any])
    
    inline def setIncludeObjectsUndefined: Self = StObject.set(x, "includeObjects", js.undefined)
    
    inline def setMaxConcurrentCdcTasks(value: Double): Self = StObject.set(x, "maxConcurrentCdcTasks", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentCdcTasksNull: Self = StObject.set(x, "maxConcurrentCdcTasks", null)
    
    inline def setMaxConcurrentCdcTasksUndefined: Self = StObject.set(x, "maxConcurrentCdcTasks", js.undefined)
  }
}
