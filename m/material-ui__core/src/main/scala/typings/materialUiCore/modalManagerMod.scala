package typings.materialUiCore

import typings.materialUiCore.anon.HandleContainerOverflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalManagerMod {
  
  @JSImport("@material-ui/core/Modal/ModalManager", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ModalManager {
    def this(opts: HandleContainerOverflow) = this()
    
    /* CompleteClass */
    override def add(modal: js.Any, container: js.Any): Double = js.native
    
    /* CompleteClass */
    override def isTopModal(modal: js.Any): Boolean = js.native
    
    /* CompleteClass */
    override def remove(modal: js.Any): Unit = js.native
  }
  
  trait ModalManager extends StObject {
    
    def add(modal: js.Any, container: js.Any): Double
    
    def isTopModal(modal: js.Any): Boolean
    
    def remove(modal: js.Any): Unit
  }
  object ModalManager {
    
    inline def apply(add: (js.Any, js.Any) => Double, isTopModal: js.Any => Boolean, remove: js.Any => Unit): ModalManager = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), isTopModal = js.Any.fromFunction1(isTopModal), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[ModalManager]
    }
    
    extension [Self <: ModalManager](x: Self) {
      
      inline def setAdd(value: (js.Any, js.Any) => Double): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setIsTopModal(value: js.Any => Boolean): Self = StObject.set(x, "isTopModal", js.Any.fromFunction1(value))
      
      inline def setRemove(value: js.Any => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
}
