package typings.jest.mod.jest

import typings.jest.Typeofjest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.setTimeout")
@js.native
object setTimeout extends js.Object {
  /**
    * Set the default timeout interval for tests and before/after hooks in milliseconds.
    * Note: The default timeout interval is 5 seconds if this method is not called.
    */
  def apply(timeout: Double): Typeofjest = js.native
}

