package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.getRealSystemTime")
@js.native
object getRealSystemTime extends js.Object {
  /**
    * When mocking time, Date.now() will also be mocked. If you for some
    * reason need access to the real current time, you can invoke this
    * function.
    *
    * > Note: This function is only available when using modern fake timers
    * > implementation
    */
  def apply(): Double = js.native
}

