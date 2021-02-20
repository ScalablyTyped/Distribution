package typings.jqueryColorpicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryColorpickerInstance extends StObject {
  
  def close(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def open(): Unit = js.native
  
  def setColor(color: js.Any): Unit = js.native
}
object JQueryColorpickerInstance {
  
  @scala.inline
  def apply(close: () => Unit, destroy: () => Unit, open: () => Unit, setColor: js.Any => Unit): JQueryColorpickerInstance = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), open = js.Any.fromFunction0(open), setColor = js.Any.fromFunction1(setColor))
    __obj.asInstanceOf[JQueryColorpickerInstance]
  }
  
  @scala.inline
  implicit class JQueryColorpickerInstanceMutableBuilder[Self <: JQueryColorpickerInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetColor(value: js.Any => Unit): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
  }
}
