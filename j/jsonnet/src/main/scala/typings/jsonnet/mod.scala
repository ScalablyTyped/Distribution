package typings.jsonnet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonnet", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Jsonnet {
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def eval(code: String): Any = js.native
    
    /* CompleteClass */
    override def evalFile(): Any = js.native
  }
  
  trait Jsonnet extends StObject {
    
    def destroy(): Unit
    
    def eval(code: String): Any
    
    def evalFile(): Any
  }
  object Jsonnet {
    
    inline def apply(destroy: () => Unit, eval: String => Any, evalFile: () => Any): Jsonnet = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), eval = js.Any.fromFunction1(eval), evalFile = js.Any.fromFunction0(evalFile))
      __obj.asInstanceOf[Jsonnet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Jsonnet] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setEval(value: String => Any): Self = StObject.set(x, "eval", js.Any.fromFunction1(value))
      
      inline def setEvalFile(value: () => Any): Self = StObject.set(x, "evalFile", js.Any.fromFunction0(value))
    }
  }
}
