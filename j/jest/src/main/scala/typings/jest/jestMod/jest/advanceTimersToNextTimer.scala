package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.advanceTimersToNextTimer")
@js.native
object advanceTimersToNextTimer extends js.Object {
  /**
    * Advances all timers by the needed milliseconds so that only the next
    * timeouts/intervals will run. Optionally, you can provide steps, so it
    * will run steps amount of next timeouts/intervals.
    */
  def apply(): Unit = js.native
  def apply(step: Double): Unit = js.native
}

