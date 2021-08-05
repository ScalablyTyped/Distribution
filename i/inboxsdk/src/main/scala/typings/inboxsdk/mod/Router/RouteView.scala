package typings.inboxsdk.mod.Router

import typings.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteView extends StObject {
  
  var destroyed: Boolean
  
  def getParams(): RouteParams
  
  def getRouteID(): String
  
  def getRouteType(): RouteTypes
  
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
}
object RouteView {
  
  inline def apply(
    destroyed: Boolean,
    getParams: () => RouteParams,
    getRouteID: () => String,
    getRouteType: () => RouteTypes,
    on: (destroy, js.Function0[Unit]) => Unit
  ): RouteView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], getParams = js.Any.fromFunction0(getParams), getRouteID = js.Any.fromFunction0(getRouteID), getRouteType = js.Any.fromFunction0(getRouteType), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[RouteView]
  }
  
  extension [Self <: RouteView](x: Self) {
    
    inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    inline def setGetParams(value: () => RouteParams): Self = StObject.set(x, "getParams", js.Any.fromFunction0(value))
    
    inline def setGetRouteID(value: () => String): Self = StObject.set(x, "getRouteID", js.Any.fromFunction0(value))
    
    inline def setGetRouteType(value: () => RouteTypes): Self = StObject.set(x, "getRouteType", js.Any.fromFunction0(value))
    
    inline def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
