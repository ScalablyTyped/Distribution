package typings.lazypipe

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lazypipe", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Initializes a lazypipe.
    */
  def apply(): IPipelineBuilder = js.native
  
  @js.native
  trait IPipelineBuilder extends js.Object {
    
    /**
      * Returns a stream where all the internal steps are processed sequentially
      * and the final result is passed on.
      */
    def apply(): ReadWriteStream = js.native
    
    /**
      * Creates a new lazy pipeline with all the previous steps, and the new step added to the end.
      * @param fn A stream creation function to call when the pipeline is created later.
      * @param args Any remaining arguments are saved and passed into fn when the pipeline is created.
      */
    def pipe(fn: js.Function, args: js.Any*): IPipelineBuilder = js.native
  }
}
