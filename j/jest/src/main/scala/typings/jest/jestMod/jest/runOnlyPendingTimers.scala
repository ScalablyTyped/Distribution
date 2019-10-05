package typings.jest.jestMod.jest

import typings.jest.Typeofjest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.runOnlyPendingTimers")
@js.native
object runOnlyPendingTimers extends js.Object {
  /**
    * Executes only the macro-tasks that are currently pending (i.e., only the
    * tasks that have been queued by setTimeout() or setInterval() up to this point).
    * If any of the currently pending macro-tasks schedule new macro-tasks,
    * those new tasks will not be executed by this call.
    */
  def apply(): Typeofjest = js.native
}

