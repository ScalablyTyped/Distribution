package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPeripheralsConfig extends StObject {
  
  /**
    * Optional. Resource name of an existing Dataproc Metastore service.Example: projects/[project_id]/locations/[region]/services/[service_id]
    */
  var metastoreService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The Spark History Server configuration for the workload.
    */
  var sparkHistoryServerConfig: js.UndefOr[SchemaSparkHistoryServerConfig] = js.undefined
}
object SchemaPeripheralsConfig {
  
  inline def apply(): SchemaPeripheralsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeripheralsConfig]
  }
  
  extension [Self <: SchemaPeripheralsConfig](x: Self) {
    
    inline def setMetastoreService(value: String): Self = StObject.set(x, "metastoreService", value.asInstanceOf[js.Any])
    
    inline def setMetastoreServiceNull: Self = StObject.set(x, "metastoreService", null)
    
    inline def setMetastoreServiceUndefined: Self = StObject.set(x, "metastoreService", js.undefined)
    
    inline def setSparkHistoryServerConfig(value: SchemaSparkHistoryServerConfig): Self = StObject.set(x, "sparkHistoryServerConfig", value.asInstanceOf[js.Any])
    
    inline def setSparkHistoryServerConfigUndefined: Self = StObject.set(x, "sparkHistoryServerConfig", js.undefined)
  }
}
