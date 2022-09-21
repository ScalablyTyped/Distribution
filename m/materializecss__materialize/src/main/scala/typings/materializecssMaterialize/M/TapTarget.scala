package typings.materializecssMaterialize.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<TapTargetOptions> * / any */ trait TapTarget extends StObject {
  
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
  
  inline def apply(close: () => Unit, isOpen: Boolean, open: () => Unit): TapTarget = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[TapTarget]
  }
  
  extension [Self <: TapTarget](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
