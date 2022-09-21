package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScopedRoutesConfigDump extends StObject {
  
  /**
    * The dynamically loaded scoped route configs.
    */
  var dynamicScopedRouteConfigs: js.UndefOr[js.Array[SchemaDynamicScopedRouteConfigs]] = js.undefined
  
  /**
    * The statically loaded scoped route configs.
    */
  var inlineScopedRouteConfigs: js.UndefOr[js.Array[SchemaInlineScopedRouteConfigs]] = js.undefined
}
object SchemaScopedRoutesConfigDump {
  
  inline def apply(): SchemaScopedRoutesConfigDump = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScopedRoutesConfigDump]
  }
  
  extension [Self <: SchemaScopedRoutesConfigDump](x: Self) {
    
    inline def setDynamicScopedRouteConfigs(value: js.Array[SchemaDynamicScopedRouteConfigs]): Self = StObject.set(x, "dynamicScopedRouteConfigs", value.asInstanceOf[js.Any])
    
    inline def setDynamicScopedRouteConfigsUndefined: Self = StObject.set(x, "dynamicScopedRouteConfigs", js.undefined)
    
    inline def setDynamicScopedRouteConfigsVarargs(value: SchemaDynamicScopedRouteConfigs*): Self = StObject.set(x, "dynamicScopedRouteConfigs", js.Array(value*))
    
    inline def setInlineScopedRouteConfigs(value: js.Array[SchemaInlineScopedRouteConfigs]): Self = StObject.set(x, "inlineScopedRouteConfigs", value.asInstanceOf[js.Any])
    
    inline def setInlineScopedRouteConfigsUndefined: Self = StObject.set(x, "inlineScopedRouteConfigs", js.undefined)
    
    inline def setInlineScopedRouteConfigsVarargs(value: SchemaInlineScopedRouteConfigs*): Self = StObject.set(x, "inlineScopedRouteConfigs", js.Array(value*))
  }
}
