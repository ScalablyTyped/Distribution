package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgButtonMethods extends StObject {
  
  def destroy(): Unit
  
  def setTitle(title: js.Object): Unit
  
  def widget(): Unit
}
object IgButtonMethods {
  
  inline def apply(destroy: () => Unit, setTitle: js.Object => Unit, widget: () => Unit): IgButtonMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setTitle = js.Any.fromFunction1(setTitle), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgButtonMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgButtonMethods] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setSetTitle(value: js.Object => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setWidget(value: () => Unit): Self = StObject.set(x, "widget", js.Any.fromFunction0(value))
  }
}
