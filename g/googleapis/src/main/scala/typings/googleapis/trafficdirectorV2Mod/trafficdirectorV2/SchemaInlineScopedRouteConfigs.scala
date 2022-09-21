package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInlineScopedRouteConfigs extends StObject {
  
  /**
    * The timestamp when the scoped route config set was last updated.
    */
  var lastUpdated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name assigned to the scoped route configurations.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The scoped route configurations.
    */
  var scopedRouteConfigs: js.UndefOr[js.Array[StringDictionary[Any]] | Null] = js.undefined
}
object SchemaInlineScopedRouteConfigs {
  
  inline def apply(): SchemaInlineScopedRouteConfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInlineScopedRouteConfigs]
  }
  
  extension [Self <: SchemaInlineScopedRouteConfigs](x: Self) {
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedNull: Self = StObject.set(x, "lastUpdated", null)
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScopedRouteConfigs(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "scopedRouteConfigs", value.asInstanceOf[js.Any])
    
    inline def setScopedRouteConfigsNull: Self = StObject.set(x, "scopedRouteConfigs", null)
    
    inline def setScopedRouteConfigsUndefined: Self = StObject.set(x, "scopedRouteConfigs", js.undefined)
    
    inline def setScopedRouteConfigsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "scopedRouteConfigs", js.Array(value*))
  }
}
