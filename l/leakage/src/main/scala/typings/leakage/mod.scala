package typings.leakage

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("leakage", "MemoryLeakError")
  @js.native
  class MemoryLeakError () extends Error
  
  object iterate {
    
    @JSImport("leakage", "iterate")
    @js.native
    def apply(iteratorFn: js.Function0[Unit]): Result = js.native
    @JSImport("leakage", "iterate")
    @js.native
    def apply(iteratorFn: js.Function0[Unit], options: IterateOptions): Result = js.native
    
    @JSImport("leakage", "iterate.async")
    @js.native
    def async(iteratorFn: js.Function0[js.Promise[Unit]]): js.Promise[Result] = js.native
    @JSImport("leakage", "iterate.async")
    @js.native
    def async(iteratorFn: js.Function0[js.Promise[Unit]], options: IterateOptions): js.Promise[Result] = js.native
  }
  
  @js.native
  trait IterateOptions extends StObject {
    
    var gcollections: js.UndefOr[Double] = js.native
    
    var iterations: js.UndefOr[Double] = js.native
  }
  object IterateOptions {
    
    @scala.inline
    def apply(): IterateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IterateOptions]
    }
    
    @scala.inline
    implicit class IterateOptionsMutableBuilder[Self <: IterateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGcollections(value: Double): Self = StObject.set(x, "gcollections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGcollectionsUndefined: Self = StObject.set(x, "gcollections", js.undefined)
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    var gcollections: Double = js.native
    
    var heapDiffs: js.Array[_] = js.native
    
    var iterations: Double = js.native
    
    def printSummary(title: String): Unit = js.native
    def printSummary(title: String, log: js.Function1[/* msg */ String, Unit]): Unit = js.native
  }
}
