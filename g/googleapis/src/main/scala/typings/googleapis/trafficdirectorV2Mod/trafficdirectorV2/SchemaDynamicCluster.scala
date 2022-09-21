package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDynamicCluster extends StObject {
  
  /**
    * The cluster config.
    */
  var cluster: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The timestamp when the Cluster was last updated.
    */
  var lastUpdated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is the per-resource version information. This version is currently taken from the :ref:`version_info ` field at the time that the cluster was loaded. In the future, discrete per-cluster versions may be supported by the API.
    */
  var versionInfo: js.UndefOr[String | Null] = js.undefined
}
object SchemaDynamicCluster {
  
  inline def apply(): SchemaDynamicCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicCluster]
  }
  
  extension [Self <: SchemaDynamicCluster](x: Self) {
    
    inline def setCluster(value: StringDictionary[Any]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterNull: Self = StObject.set(x, "cluster", null)
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedNull: Self = StObject.set(x, "lastUpdated", null)
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    inline def setVersionInfoNull: Self = StObject.set(x, "versionInfo", null)
    
    inline def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
