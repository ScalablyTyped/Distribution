package typings
package locksLib.locksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locks", "Semaphore")
@js.native
class Semaphore protected () extends js.Object {
  /** Construct a new semaphore. */
  def this(initialCount: scala.Double) = this()
  /** Signal a callback. */
  def signal(): scala.Unit = js.native
  /** Queue a callback. Callbacks are called in sequence on signals. */
  def wait(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

