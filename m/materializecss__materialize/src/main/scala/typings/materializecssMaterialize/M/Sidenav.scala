package typings.materializecssMaterialize.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<SidenavOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ trait Sidenav extends StObject {
  
  /**
    * Closes Sidenav
    */
  def close(): Unit
  
  /**
    * Describes if Sidenav is being dragged
    */
  var isDragged: Boolean
  
  /**
    * Describes if sidenav is fixed
    */
  var isFixed: Boolean
  
  /**
    * Describes open/close state of Sidenav
    */
  var isOpen: Boolean
  
  /**
    * Opens Sidenav
    */
  def open(): Unit
}
object Sidenav {
  
  inline def apply(close: () => Unit, isDragged: Boolean, isFixed: Boolean, isOpen: Boolean, open: () => Unit): Sidenav = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isDragged = isDragged.asInstanceOf[js.Any], isFixed = isFixed.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Sidenav]
  }
  
  extension [Self <: Sidenav](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setIsDragged(value: Boolean): Self = StObject.set(x, "isDragged", value.asInstanceOf[js.Any])
    
    inline def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
