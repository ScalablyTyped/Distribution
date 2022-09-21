package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoutesConfigDump extends StObject {
  
  /**
    * The dynamically loaded route configs.
    */
  var dynamicRouteConfigs: js.UndefOr[js.Array[SchemaDynamicRouteConfig]] = js.undefined
  
  /**
    * The statically loaded route configs.
    */
  var staticRouteConfigs: js.UndefOr[js.Array[SchemaStaticRouteConfig]] = js.undefined
}
object SchemaRoutesConfigDump {
  
  inline def apply(): SchemaRoutesConfigDump = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoutesConfigDump]
  }
  
  extension [Self <: SchemaRoutesConfigDump](x: Self) {
    
    inline def setDynamicRouteConfigs(value: js.Array[SchemaDynamicRouteConfig]): Self = StObject.set(x, "dynamicRouteConfigs", value.asInstanceOf[js.Any])
    
    inline def setDynamicRouteConfigsUndefined: Self = StObject.set(x, "dynamicRouteConfigs", js.undefined)
    
    inline def setDynamicRouteConfigsVarargs(value: SchemaDynamicRouteConfig*): Self = StObject.set(x, "dynamicRouteConfigs", js.Array(value*))
    
    inline def setStaticRouteConfigs(value: js.Array[SchemaStaticRouteConfig]): Self = StObject.set(x, "staticRouteConfigs", value.asInstanceOf[js.Any])
    
    inline def setStaticRouteConfigsUndefined: Self = StObject.set(x, "staticRouteConfigs", js.undefined)
    
    inline def setStaticRouteConfigsVarargs(value: SchemaStaticRouteConfig*): Self = StObject.set(x, "staticRouteConfigs", js.Array(value*))
  }
}
