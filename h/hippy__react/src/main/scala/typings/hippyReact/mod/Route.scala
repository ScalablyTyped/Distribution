package typings.hippyReact.mod

import typings.react.mod.ComponentClass
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var component: js.UndefOr[String | FunctionComponent[Any] | (ComponentClass[Any, Any])] = js.undefined
  
  var initProps: js.UndefOr[Any] = js.undefined
  
  var routeName: String
}
object Route {
  
  inline def apply(routeName: String): Route = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setComponent(value: String | FunctionComponent[Any] | (ComponentClass[Any, Any])): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setInitProps(value: Any): Self = StObject.set(x, "initProps", value.asInstanceOf[js.Any])
    
    inline def setInitPropsUndefined: Self = StObject.set(x, "initProps", js.undefined)
    
    inline def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
  }
}
