package typings.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<ModalOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ trait Modal extends StObject {
  
  /**
    * Close modal
    */
  def close(): Unit
  
  /**
    * ID of the modal element
    */
  var id: String
  
  /**
    * If the modal is open.
    */
  var isOpen: Boolean
  
  /**
    * Open modal
    */
  def open(): Unit
}
object Modal {
  
  inline def apply(close: () => Unit, id: String, isOpen: Boolean, open: () => Unit): Modal = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Modal]
  }
  
  extension [Self <: Modal](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
