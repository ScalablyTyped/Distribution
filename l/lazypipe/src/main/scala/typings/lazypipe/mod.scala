package typings.lazypipe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Initializes a lazypipe.
    */
  inline def apply(): IPipelineBuilder = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[IPipelineBuilder]
  
  @JSImport("lazypipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait IPipelineBuilder extends StObject {
    
    /**
      * Returns a stream where all the internal steps are processed sequentially
      * and the final result is passed on.
      */
    def apply(): Any = js.native
    
    /**
      * Creates a new lazy pipeline with all the previous steps, and the new step added to the end.
      * @param fn A stream creation function to call when the pipeline is created later.
      * @param args Any remaining arguments are saved and passed into fn when the pipeline is created.
      */
    def pipe(fn: js.Function, args: Any*): IPipelineBuilder = js.native
  }
}
