package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeripheralsConfig extends StObject {
  
  /** Optional. Resource name of an existing Dataproc Metastore service.Example: projects/[project_id]/locations/[region]/services/[service_id] */
  var metastoreService: js.UndefOr[String] = js.undefined
  
  /** Optional. The Spark History Server configuration for the workload. */
  var sparkHistoryServerConfig: js.UndefOr[SparkHistoryServerConfig] = js.undefined
}
object PeripheralsConfig {
  
  inline def apply(): PeripheralsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeripheralsConfig]
  }
  
  extension [Self <: PeripheralsConfig](x: Self) {
    
    inline def setMetastoreService(value: String): Self = StObject.set(x, "metastoreService", value.asInstanceOf[js.Any])
    
    inline def setMetastoreServiceUndefined: Self = StObject.set(x, "metastoreService", js.undefined)
    
    inline def setSparkHistoryServerConfig(value: SparkHistoryServerConfig): Self = StObject.set(x, "sparkHistoryServerConfig", value.asInstanceOf[js.Any])
    
    inline def setSparkHistoryServerConfigUndefined: Self = StObject.set(x, "sparkHistoryServerConfig", js.undefined)
  }
}
