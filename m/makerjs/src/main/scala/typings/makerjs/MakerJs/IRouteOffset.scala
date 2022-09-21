package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A route to either a path or a model, and the absolute offset of it.
  */
trait IRouteOffset extends StObject {
  
  var layer: String
  
  var offset: IPoint
  
  var route: js.Array[String]
  
  var routeKey: String
}
object IRouteOffset {
  
  inline def apply(layer: String, offset: IPoint, route: js.Array[String], routeKey: String): IRouteOffset = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteOffset]
  }
  
  extension [Self <: IRouteOffset](x: Self) {
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: IPoint): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: js.Array[String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteKey(value: String): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
    
    inline def setRouteVarargs(value: String*): Self = StObject.set(x, "route", js.Array(value*))
  }
}
