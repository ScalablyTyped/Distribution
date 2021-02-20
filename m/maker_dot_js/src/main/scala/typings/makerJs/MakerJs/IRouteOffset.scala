package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A route to either a path or a model, and the absolute offset of it.
  */
@js.native
trait IRouteOffset extends StObject {
  
  var layer: String = js.native
  
  var offset: IPoint = js.native
  
  var route: js.Array[String] = js.native
  
  var routeKey: String = js.native
}
object IRouteOffset {
  
  @scala.inline
  def apply(layer: String, offset: IPoint, route: js.Array[String], routeKey: String): IRouteOffset = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteOffset]
  }
  
  @scala.inline
  implicit class IRouteOffsetMutableBuilder[Self <: IRouteOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: IPoint): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: js.Array[String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteKey(value: String): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteVarargs(value: String*): Self = StObject.set(x, "route", js.Array(value :_*))
  }
}
