package typings.jest.mod.jasmine

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clock_ extends js.Object {
  def install(): Unit = js.native
  def mockDate(): Unit = js.native
  def mockDate(date: Date): Unit = js.native
  /**
    * Calls to any registered callback are triggered when the clock isticked forward
    * via the jasmine.clock().tick function, which takes a number of milliseconds.
    */
  def tick(ms: Double): Unit = js.native
  def uninstall(): Unit = js.native
}

