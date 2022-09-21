package typings.leakage

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("leakage", "MemoryLeakError")
  @js.native
  open class MemoryLeakError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  object iterate {
    
    inline def apply(iteratorFn: js.Function0[Unit]): Result = ^.asInstanceOf[js.Dynamic].apply(iteratorFn.asInstanceOf[js.Any]).asInstanceOf[Result]
    inline def apply(iteratorFn: js.Function0[Unit], options: IterateOptions): Result = (^.asInstanceOf[js.Dynamic].apply(iteratorFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
    
    @JSImport("leakage", "iterate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def async(iteratorFn: js.Function0[js.Promise[Unit]]): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(iteratorFn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
    inline def async(iteratorFn: js.Function0[js.Promise[Unit]], options: IterateOptions): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(iteratorFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  }
  
  trait IterateOptions extends StObject {
    
    var gcollections: js.UndefOr[Double] = js.undefined
    
    var iterations: js.UndefOr[Double] = js.undefined
  }
  object IterateOptions {
    
    inline def apply(): IterateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IterateOptions]
    }
    
    extension [Self <: IterateOptions](x: Self) {
      
      inline def setGcollections(value: Double): Self = StObject.set(x, "gcollections", value.asInstanceOf[js.Any])
      
      inline def setGcollectionsUndefined: Self = StObject.set(x, "gcollections", js.undefined)
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    var gcollections: Double = js.native
    
    var heapDiffs: js.Array[Any] = js.native
    
    var iterations: Double = js.native
    
    def printSummary(title: String): Unit = js.native
    def printSummary(title: String, log: js.Function1[/* msg */ String, Unit]): Unit = js.native
  }
}
