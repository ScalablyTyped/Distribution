package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgProgressBarMethods extends StObject {
  
  def destroy(): Unit = js.native
  
  def value(newValue: js.Object): Unit = js.native
  
  def widget(): Unit = js.native
}
object IgProgressBarMethods {
  
  @scala.inline
  def apply(destroy: () => Unit, value: js.Object => Unit, widget: () => Unit): IgProgressBarMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), value = js.Any.fromFunction1(value), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgProgressBarMethods]
  }
  
  @scala.inline
  implicit class IgProgressBarMethodsMutableBuilder[Self <: IgProgressBarMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: js.Object => Unit): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidget(value: () => Unit): Self = StObject.set(x, "widget", js.Any.fromFunction0(value))
  }
}
