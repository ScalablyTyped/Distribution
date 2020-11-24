package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("massive", "Executable")
@js.native
class Executable protected () extends js.Object {
  def this(spec: ExecutableSpecification) = this()
  
  /** Invoke the function or script. */
  def invoke(): js.Promise[AnyObject[_] | js.Array[_]] = js.native
  def invoke(options: ResultProcessingOptions): js.Promise[AnyObject[_] | js.Array[_]] = js.native
}
