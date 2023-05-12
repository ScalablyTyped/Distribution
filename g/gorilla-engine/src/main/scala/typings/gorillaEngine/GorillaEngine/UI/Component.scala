package typings.gorillaEngine.GorillaEngine.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  def appendChild(child: Component): Unit
  
  var children: js.Array[Component]
  
  var id: String
  
  def insertBefore(child: Component, beforeChild: Component): Unit
  
  def on(event: String, handler: Any): Unit
  
  var parent: Component
  
  def removeChild(child: Component): Unit
}
object Component {
  
  inline def apply(
    appendChild: Component => Unit,
    children: js.Array[Component],
    id: String,
    insertBefore: (Component, Component) => Unit,
    on: (String, Any) => Unit,
    parent: Component,
    removeChild: Component => Unit
  ): Component = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), on = js.Any.fromFunction2(on), parent = parent.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild))
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
    
    inline def setAppendChild(value: Component => Unit): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    inline def setChildren(value: js.Array[Component]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Component*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInsertBefore(value: (Component, Component) => Unit): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
    
    inline def setOn(value: (String, Any) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setParent(value: Component): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRemoveChild(value: Component => Unit): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
  }
}
