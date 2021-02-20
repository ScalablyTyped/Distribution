package typings.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<TapTargetOptions> * / any */ @js.native
trait TapTarget extends StObject {
  
  /**
    * Close Tap Target
    */
  def close(): Unit = js.native
  
  /**
    * If the tap target is open
    */
  var isOpen: Boolean = js.native
  
  /**
    * Open Tap Target
    */
  def open(): Unit = js.native
}
object TapTarget {
  
  @scala.inline
  def apply(close: () => Unit, isOpen: Boolean, open: () => Unit): TapTarget = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[TapTarget]
  }
  
  @scala.inline
  implicit class TapTargetMutableBuilder[Self <: TapTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
