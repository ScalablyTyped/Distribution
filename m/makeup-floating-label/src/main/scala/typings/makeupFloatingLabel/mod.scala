package typings.makeupFloatingLabel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("makeup-floating-label", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with FloatingLabel {
    def this(el: js.Any) = this()
    def this(el: js.Any, userOptions: js.Any) = this()
    
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  
  trait FloatingLabel extends StObject {
    
    def refresh(): Unit
  }
  object FloatingLabel {
    
    @scala.inline
    def apply(refresh: () => Unit): FloatingLabel = {
      val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction0(refresh))
      __obj.asInstanceOf[FloatingLabel]
    }
    
    @scala.inline
    implicit class FloatingLabelMutableBuilder[Self <: FloatingLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    }
  }
}
