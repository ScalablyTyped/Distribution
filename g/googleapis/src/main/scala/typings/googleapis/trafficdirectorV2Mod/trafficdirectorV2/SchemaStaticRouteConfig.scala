package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStaticRouteConfig extends StObject {
  
  /**
    * The timestamp when the Route was last updated.
    */
  var lastUpdated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The route config.
    */
  var routeConfig: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaStaticRouteConfig {
  
  inline def apply(): SchemaStaticRouteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStaticRouteConfig]
  }
  
  extension [Self <: SchemaStaticRouteConfig](x: Self) {
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedNull: Self = StObject.set(x, "lastUpdated", null)
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setRouteConfig(value: StringDictionary[Any]): Self = StObject.set(x, "routeConfig", value.asInstanceOf[js.Any])
    
    inline def setRouteConfigNull: Self = StObject.set(x, "routeConfig", null)
    
    inline def setRouteConfigUndefined: Self = StObject.set(x, "routeConfig", js.undefined)
  }
}
