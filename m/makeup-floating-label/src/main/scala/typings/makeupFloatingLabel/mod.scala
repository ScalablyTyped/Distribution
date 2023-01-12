package typings.makeupFloatingLabel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("makeup-floating-label", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FloatingLabel {
    def this(el: Any) = this()
    def this(el: Any, userOptions: Any) = this()
    
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  
  trait FloatingLabel extends StObject {
    
    def refresh(): Unit
  }
  object FloatingLabel {
    
    inline def apply(refresh: () => Unit): FloatingLabel = {
      val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction0(refresh))
      __obj.asInstanceOf[FloatingLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FloatingLabel] (val x: Self) extends AnyVal {
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    }
  }
}
