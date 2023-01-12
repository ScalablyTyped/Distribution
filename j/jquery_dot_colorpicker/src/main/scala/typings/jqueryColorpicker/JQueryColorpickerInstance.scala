package typings.jqueryColorpicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryColorpickerInstance extends StObject {
  
  def close(): Unit
  
  def destroy(): Unit
  
  def open(): Unit
  
  def setColor(color: Any): Unit
}
object JQueryColorpickerInstance {
  
  inline def apply(close: () => Unit, destroy: () => Unit, open: () => Unit, setColor: Any => Unit): JQueryColorpickerInstance = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), open = js.Any.fromFunction0(open), setColor = js.Any.fromFunction1(setColor))
    __obj.asInstanceOf[JQueryColorpickerInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryColorpickerInstance] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setSetColor(value: Any => Unit): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
  }
}
