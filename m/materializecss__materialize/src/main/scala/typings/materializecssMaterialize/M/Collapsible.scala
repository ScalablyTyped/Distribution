package typings.materializecssMaterialize.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collapsible
  extends StObject
     with Component[CollapsibleOptions] {
  
  /**
    * Close collapsible section.
    * @param n Nth section to close.
    */
  def close(n: Double): Unit
  
  /**
    * Open collapsible section.
    * @param n Nth section to open.
    */
  def open(n: Double): Unit
}
object Collapsible {
  
  inline def apply(
    close: Double => Unit,
    destroy: () => Unit,
    el: Element,
    open: Double => Unit,
    options: CollapsibleOptions
  ): Collapsible = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], open = js.Any.fromFunction1(open), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collapsible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collapsible] (val x: Self) extends AnyVal {
    
    inline def setClose(value: Double => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setOpen(value: Double => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
  }
}
