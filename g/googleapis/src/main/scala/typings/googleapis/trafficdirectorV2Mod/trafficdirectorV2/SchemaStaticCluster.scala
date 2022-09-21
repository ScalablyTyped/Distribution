package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStaticCluster extends StObject {
  
  /**
    * The cluster config.
    */
  var cluster: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The timestamp when the Cluster was last updated.
    */
  var lastUpdated: js.UndefOr[String | Null] = js.undefined
}
object SchemaStaticCluster {
  
  inline def apply(): SchemaStaticCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStaticCluster]
  }
  
  extension [Self <: SchemaStaticCluster](x: Self) {
    
    inline def setCluster(value: StringDictionary[Any]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterNull: Self = StObject.set(x, "cluster", null)
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedNull: Self = StObject.set(x, "lastUpdated", null)
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
  }
}
