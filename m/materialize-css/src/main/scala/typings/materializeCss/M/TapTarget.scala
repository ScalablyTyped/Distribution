package typings.materializeCss.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapTarget
  extends StObject
     with Component[TapTargetOptions] {
  
  /**
    * Close Tap Target
    */
  def close(): Unit
  
  /**
    * If the tap target is open
    */
  var isOpen: Boolean
  
  /**
    * Open Tap Target
    */
  def open(): Unit
}
object TapTarget {
  
  inline def apply(
    close: () => Unit,
    destroy: () => Unit,
    el: Element,
    isOpen: Boolean,
    open: () => Unit,
    options: TapTargetOptions
  ): TapTarget = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapTarget]
  }
  
  extension [Self <: TapTarget](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
