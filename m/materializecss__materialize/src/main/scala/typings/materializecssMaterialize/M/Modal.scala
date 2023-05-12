package typings.materializecssMaterialize.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modal
  extends StObject
     with Component[ModalOptions]
     with Openable {
  
  /**
    * ID of the modal element.
    */
  var id: String
}
object Modal {
  
  inline def apply(
    close: () => Unit,
    destroy: () => Unit,
    el: Element,
    id: String,
    isOpen: Boolean,
    open: () => Unit,
    options: ModalOptions
  ): Modal = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Modal] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
