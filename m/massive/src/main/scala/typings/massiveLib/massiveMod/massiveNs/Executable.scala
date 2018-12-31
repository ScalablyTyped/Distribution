package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Executable extends js.Object {
  /** Invoke the function or script. */
  def invoke(): js.Promise[AnyObject[_] | js.Array[_]] = js.native
  def invoke(options: ResultProcessingOptions): js.Promise[AnyObject[_] | js.Array[_]] = js.native
}

