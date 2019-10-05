package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("afterAll")
@js.native
object afterAll extends js.Object {
  /**
    * Run some shared teardown once before all of the specs in the describe are run.
    * Note: Be careful, sharing the teardown from a afterAll makes it easy to accidentally leak state between your specs so that they erroneously pass or fail.
    * @param action Function that contains the code to teardown your specs.
    * @param timeout Custom timeout for an async afterAll
    */
  def apply(action: typings.jasmine.jasmine.ImplementationCallback): Unit = js.native
  def apply(action: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
}

