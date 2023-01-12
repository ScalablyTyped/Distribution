package typings.materialUiCore

import typings.materialUiCore.anon.HandleContainerOverflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalModalManagerMod {
  
  @JSImport("@material-ui/core/Modal/ModalManager", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ModalManager {
    def this(opts: HandleContainerOverflow) = this()
    
    /* CompleteClass */
    override def add(modal: Any, container: Any): Double = js.native
    
    /* CompleteClass */
    override def isTopModal(modal: Any): Boolean = js.native
    
    /* CompleteClass */
    override def remove(modal: Any): Unit = js.native
  }
  
  trait ModalManager extends StObject {
    
    def add(modal: Any, container: Any): Double
    
    def isTopModal(modal: Any): Boolean
    
    def remove(modal: Any): Unit
  }
  object ModalManager {
    
    inline def apply(add: (Any, Any) => Double, isTopModal: Any => Boolean, remove: Any => Unit): ModalManager = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), isTopModal = js.Any.fromFunction1(isTopModal), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[ModalManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalManager] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: (Any, Any) => Double): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setIsTopModal(value: Any => Boolean): Self = StObject.set(x, "isTopModal", js.Any.fromFunction1(value))
      
      inline def setRemove(value: Any => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
}
