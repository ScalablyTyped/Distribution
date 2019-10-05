package typings.jest.jestMod.jest

import typings.jest.Typeofjest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.advanceTimersByTime")
@js.native
object advanceTimersByTime extends js.Object {
  /**
    * Advances all timers by msToRun milliseconds. All pending "macro-tasks" that have been
    * queued via setTimeout() or setInterval(), and would be executed within this timeframe
    * will be executed.
    */
  def apply(msToRun: Double): Typeofjest = js.native
}

