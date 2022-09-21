package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuxiliaryServicesConfig extends StObject {
  
  /**
    * Optional. The Hive Metastore configuration for this workload.
    */
  var metastoreConfig: js.UndefOr[SchemaMetastoreConfig] = js.undefined
  
  /**
    * Optional. The Spark History Server configuration for the workload.
    */
  var sparkHistoryServerConfig: js.UndefOr[SchemaSparkHistoryServerConfig] = js.undefined
}
object SchemaAuxiliaryServicesConfig {
  
  inline def apply(): SchemaAuxiliaryServicesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuxiliaryServicesConfig]
  }
  
  extension [Self <: SchemaAuxiliaryServicesConfig](x: Self) {
    
    inline def setMetastoreConfig(value: SchemaMetastoreConfig): Self = StObject.set(x, "metastoreConfig", value.asInstanceOf[js.Any])
    
    inline def setMetastoreConfigUndefined: Self = StObject.set(x, "metastoreConfig", js.undefined)
    
    inline def setSparkHistoryServerConfig(value: SchemaSparkHistoryServerConfig): Self = StObject.set(x, "sparkHistoryServerConfig", value.asInstanceOf[js.Any])
    
    inline def setSparkHistoryServerConfigUndefined: Self = StObject.set(x, "sparkHistoryServerConfig", js.undefined)
  }
}
