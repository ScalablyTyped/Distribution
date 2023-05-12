package typings.khroma

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChannelsTypeMod {
  
  @JSImport("khroma/dist/channels/type", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Type {
    
    /* CompleteClass */
    override def get(): Double = js.native
    
    /* CompleteClass */
    override def is(`type`: Double): Boolean = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def set(`type`: Double): Unit = js.native
    
    /* CompleteClass */
    var `type`: Double = js.native
  }
  
  trait Type extends StObject {
    
    def get(): Double
    
    def is(`type`: Double): Boolean
    
    def reset(): Unit
    
    def set(`type`: Double): Unit
    
    var `type`: Double
  }
  object Type {
    
    inline def apply(get: () => Double, is: Double => Boolean, reset: () => Unit, set: Double => Unit, `type`: Double): Type = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), is = js.Any.fromFunction1(is), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setGet(value: () => Double): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setIs(value: Double => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSet(value: Double => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
