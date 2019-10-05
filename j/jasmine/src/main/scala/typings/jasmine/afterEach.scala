package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("afterEach")
@js.native
object afterEach extends js.Object {
  /**
    * Run some shared teardown after each of the specs in the describe in which it is called.
    * @param action Function that contains the code to teardown your specs.
    * @param timeout Custom timeout for an async afterEach.
    */
  def apply(action: typings.jasmine.jasmine.ImplementationCallback): Unit = js.native
  def apply(action: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
}

