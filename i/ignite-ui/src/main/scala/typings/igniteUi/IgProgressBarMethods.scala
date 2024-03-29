package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgProgressBarMethods extends StObject {
  
  def destroy(): Unit
  
  def value(newValue: js.Object): Unit
  
  def widget(): Unit
}
object IgProgressBarMethods {
  
  inline def apply(destroy: () => Unit, value: js.Object => Unit, widget: () => Unit): IgProgressBarMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), value = js.Any.fromFunction1(value), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgProgressBarMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgProgressBarMethods] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setValue(value: js.Object => Unit): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    
    inline def setWidget(value: () => Unit): Self = StObject.set(x, "widget", js.Any.fromFunction0(value))
  }
}
