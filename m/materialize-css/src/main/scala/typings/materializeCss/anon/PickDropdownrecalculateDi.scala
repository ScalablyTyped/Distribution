package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Dropdown, 'recalculateDimensions' | 'open' | 'close' | 'destroy'> */
trait PickDropdownrecalculateDi extends StObject {
  
  def close(): Unit
  @JSName("close")
  var close_Original: js.Function0[Unit]
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
  
  def open(): Unit
  @JSName("open")
  var open_Original: js.Function0[Unit]
  
  def recalculateDimensions(): Unit
  @JSName("recalculateDimensions")
  var recalculateDimensions_Original: js.Function0[Unit]
}
object PickDropdownrecalculateDi {
  
  inline def apply(close: () => Unit, destroy: () => Unit, open: () => Unit, recalculateDimensions: () => Unit): PickDropdownrecalculateDi = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), open = js.Any.fromFunction0(open), recalculateDimensions = js.Any.fromFunction0(recalculateDimensions))
    __obj.asInstanceOf[PickDropdownrecalculateDi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickDropdownrecalculateDi] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setRecalculateDimensions(value: () => Unit): Self = StObject.set(x, "recalculateDimensions", js.Any.fromFunction0(value))
  }
}
