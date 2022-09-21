package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClustersConfigDump extends StObject {
  
  /**
    * The dynamically loaded active clusters. These are clusters that are available to service data plane traffic.
    */
  var dynamicActiveClusters: js.UndefOr[js.Array[SchemaDynamicCluster]] = js.undefined
  
  /**
    * The dynamically loaded warming clusters. These are clusters that are currently undergoing warming in preparation to service data plane traffic. Note that if attempting to recreate an Envoy configuration from a configuration dump, the warming clusters should generally be discarded.
    */
  var dynamicWarmingClusters: js.UndefOr[js.Array[SchemaDynamicCluster]] = js.undefined
  
  /**
    * The statically loaded cluster configs.
    */
  var staticClusters: js.UndefOr[js.Array[SchemaStaticCluster]] = js.undefined
  
  /**
    * This is the :ref:`version_info ` in the last processed CDS discovery response. If there are only static bootstrap clusters, this field will be "".
    */
  var versionInfo: js.UndefOr[String | Null] = js.undefined
}
object SchemaClustersConfigDump {
  
  inline def apply(): SchemaClustersConfigDump = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClustersConfigDump]
  }
  
  extension [Self <: SchemaClustersConfigDump](x: Self) {
    
    inline def setDynamicActiveClusters(value: js.Array[SchemaDynamicCluster]): Self = StObject.set(x, "dynamicActiveClusters", value.asInstanceOf[js.Any])
    
    inline def setDynamicActiveClustersUndefined: Self = StObject.set(x, "dynamicActiveClusters", js.undefined)
    
    inline def setDynamicActiveClustersVarargs(value: SchemaDynamicCluster*): Self = StObject.set(x, "dynamicActiveClusters", js.Array(value*))
    
    inline def setDynamicWarmingClusters(value: js.Array[SchemaDynamicCluster]): Self = StObject.set(x, "dynamicWarmingClusters", value.asInstanceOf[js.Any])
    
    inline def setDynamicWarmingClustersUndefined: Self = StObject.set(x, "dynamicWarmingClusters", js.undefined)
    
    inline def setDynamicWarmingClustersVarargs(value: SchemaDynamicCluster*): Self = StObject.set(x, "dynamicWarmingClusters", js.Array(value*))
    
    inline def setStaticClusters(value: js.Array[SchemaStaticCluster]): Self = StObject.set(x, "staticClusters", value.asInstanceOf[js.Any])
    
    inline def setStaticClustersUndefined: Self = StObject.set(x, "staticClusters", js.undefined)
    
    inline def setStaticClustersVarargs(value: SchemaStaticCluster*): Self = StObject.set(x, "staticClusters", js.Array(value*))
    
    inline def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    inline def setVersionInfoNull: Self = StObject.set(x, "versionInfo", null)
    
    inline def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
