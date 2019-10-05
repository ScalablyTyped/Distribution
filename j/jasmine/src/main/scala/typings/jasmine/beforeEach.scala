package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("beforeEach")
@js.native
object beforeEach extends js.Object {
  /**
    * Run some shared setup before each of the specs in the describe in which it is called.
    * @param action Function that contains the code to setup your specs.
    * @param timeout Custom timeout for an async beforeEach.
    */
  def apply(action: typings.jasmine.jasmine.ImplementationCallback): Unit = js.native
  def apply(action: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
}

