package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPerXdsConfig extends StObject {
  
  var clusterConfig: js.UndefOr[SchemaClustersConfigDump] = js.undefined
  
  var listenerConfig: js.UndefOr[SchemaListenersConfigDump] = js.undefined
  
  var routeConfig: js.UndefOr[SchemaRoutesConfigDump] = js.undefined
  
  var scopedRouteConfig: js.UndefOr[SchemaScopedRoutesConfigDump] = js.undefined
  
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaPerXdsConfig {
  
  inline def apply(): SchemaPerXdsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerXdsConfig]
  }
  
  extension [Self <: SchemaPerXdsConfig](x: Self) {
    
    inline def setClusterConfig(value: SchemaClustersConfigDump): Self = StObject.set(x, "clusterConfig", value.asInstanceOf[js.Any])
    
    inline def setClusterConfigUndefined: Self = StObject.set(x, "clusterConfig", js.undefined)
    
    inline def setListenerConfig(value: SchemaListenersConfigDump): Self = StObject.set(x, "listenerConfig", value.asInstanceOf[js.Any])
    
    inline def setListenerConfigUndefined: Self = StObject.set(x, "listenerConfig", js.undefined)
    
    inline def setRouteConfig(value: SchemaRoutesConfigDump): Self = StObject.set(x, "routeConfig", value.asInstanceOf[js.Any])
    
    inline def setRouteConfigUndefined: Self = StObject.set(x, "routeConfig", js.undefined)
    
    inline def setScopedRouteConfig(value: SchemaScopedRoutesConfigDump): Self = StObject.set(x, "scopedRouteConfig", value.asInstanceOf[js.Any])
    
    inline def setScopedRouteConfigUndefined: Self = StObject.set(x, "scopedRouteConfig", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
