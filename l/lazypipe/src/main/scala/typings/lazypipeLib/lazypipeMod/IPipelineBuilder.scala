package typings
package lazypipeLib.lazypipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPipelineBuilder extends js.Object {
  /**
    * Returns a stream where all the internal steps are processed sequentially
    * and the final result is passed on.
    */
  def apply(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
    * Creates a new lazy pipeline with all the previous steps, and the new step added to the end.
    * @param fn A stream creation function to call when the pipeline is created later.
    * @param args Any remaining arguments are saved and passed into fn when the pipeline is created.
    */
  def pipe(fn: js.Function, args: js.Any*): IPipelineBuilder = js.native
}

