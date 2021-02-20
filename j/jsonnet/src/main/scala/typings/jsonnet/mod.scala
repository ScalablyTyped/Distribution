package typings.jsonnet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonnet", JSImport.Namespace)
  @js.native
  class ^ () extends Jsonnet
  
  @js.native
  trait Jsonnet extends StObject {
    
    def destroy(): Unit = js.native
    
    def eval(code: String): js.Any = js.native
    
    def evalFile(): js.Any = js.native
  }
  object Jsonnet {
    
    @scala.inline
    def apply(destroy: () => Unit, eval: String => js.Any, evalFile: () => js.Any): Jsonnet = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), eval = js.Any.fromFunction1(eval), evalFile = js.Any.fromFunction0(evalFile))
      __obj.asInstanceOf[Jsonnet]
    }
    
    @scala.inline
    implicit class JsonnetMutableBuilder[Self <: Jsonnet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEval(value: String => js.Any): Self = StObject.set(x, "eval", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEvalFile(value: () => js.Any): Self = StObject.set(x, "evalFile", js.Any.fromFunction0(value))
    }
  }
}
