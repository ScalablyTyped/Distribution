package typings.inboxsdk.mod.Router

import typings.inboxsdk.inboxsdkStrings.destroy
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRouteView
  extends StObject
     with RouteView {
  
  def getElement(): HTMLElement
  
  def setFullWidth(fullWidth: Boolean): Unit
}
object CustomRouteView {
  
  inline def apply(
    destroyed: Boolean,
    getElement: () => HTMLElement,
    getParams: () => RouteParams,
    getRouteID: () => String,
    getRouteType: () => RouteTypes,
    on: (destroy, js.Function0[Unit]) => Unit,
    setFullWidth: Boolean => Unit
  ): CustomRouteView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], getElement = js.Any.fromFunction0(getElement), getParams = js.Any.fromFunction0(getParams), getRouteID = js.Any.fromFunction0(getRouteID), getRouteType = js.Any.fromFunction0(getRouteType), on = js.Any.fromFunction2(on), setFullWidth = js.Any.fromFunction1(setFullWidth))
    __obj.asInstanceOf[CustomRouteView]
  }
  
  extension [Self <: CustomRouteView](x: Self) {
    
    inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    
    inline def setSetFullWidth(value: Boolean => Unit): Self = StObject.set(x, "setFullWidth", js.Any.fromFunction1(value))
  }
}
