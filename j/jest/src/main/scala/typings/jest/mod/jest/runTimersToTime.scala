package typings.jest.mod.jest

import typings.jest.anon.Typeofjest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.runTimersToTime")
@js.native
object runTimersToTime extends js.Object {
  /**
    * (renamed to `advanceTimersByTime` in Jest 21.3.0+) Executes only the macro
    * task queue (i.e. all tasks queued by setTimeout() or setInterval() and setImmediate()).
    */
  def apply(msToRun: Double): Typeofjest = js.native
}

