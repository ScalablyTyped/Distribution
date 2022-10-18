package typings.materializeCss.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloatingActionButton
  extends StObject
     with Component[FloatingActionButtonOptions]
     with Openable
object FloatingActionButton {
  
  inline def apply(
    close: () => Unit,
    destroy: () => Unit,
    el: Element,
    isOpen: Boolean,
    open: () => Unit,
    options: FloatingActionButtonOptions
  ): FloatingActionButton = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingActionButton]
  }
}
