package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuxiliaryServicesConfig extends StObject {
  
  /** Optional. The Hive Metastore configuration for this workload. */
  var metastoreConfig: js.UndefOr[MetastoreConfig] = js.undefined
  
  /** Optional. The Spark History Server configuration for the workload. */
  var sparkHistoryServerConfig: js.UndefOr[SparkHistoryServerConfig] = js.undefined
}
object AuxiliaryServicesConfig {
  
  inline def apply(): AuxiliaryServicesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuxiliaryServicesConfig]
  }
  
  extension [Self <: AuxiliaryServicesConfig](x: Self) {
    
    inline def setMetastoreConfig(value: MetastoreConfig): Self = StObject.set(x, "metastoreConfig", value.asInstanceOf[js.Any])
    
    inline def setMetastoreConfigUndefined: Self = StObject.set(x, "metastoreConfig", js.undefined)
    
    inline def setSparkHistoryServerConfig(value: SparkHistoryServerConfig): Self = StObject.set(x, "sparkHistoryServerConfig", value.asInstanceOf[js.Any])
    
    inline def setSparkHistoryServerConfigUndefined: Self = StObject.set(x, "sparkHistoryServerConfig", js.undefined)
  }
}
