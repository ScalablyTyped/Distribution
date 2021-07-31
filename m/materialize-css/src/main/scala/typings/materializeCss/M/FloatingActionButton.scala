package typings.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<FloatingActionButtonOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ trait FloatingActionButton extends StObject {
  
  /**
    * Close FAB
    */
  def close(): Unit
  
  /**
    * Describes open/close state of FAB.
    */
  var isOpen: Boolean
  
  /**
    * Open FAB
    */
  def open(): Unit
}
object FloatingActionButton {
  
  @scala.inline
  def apply(close: () => Unit, isOpen: Boolean, open: () => Unit): FloatingActionButton = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[FloatingActionButton]
  }
  
  @scala.inline
  implicit class FloatingActionButtonMutableBuilder[Self <: FloatingActionButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
