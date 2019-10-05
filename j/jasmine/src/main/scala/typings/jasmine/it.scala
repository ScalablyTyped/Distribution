package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("it")
@js.native
object it extends js.Object {
  /**
    * Define a single spec. A spec should contain one or more expectations that test the state of the code.
    * A spec whose expectations all succeed will be passing and a spec with any failures will fail.
    * @param expectation Textual description of what this spec is checking
    * @param assertion Function that contains the code of your test. If not provided the test will be pending.
    * @param timeout Custom timeout for an async spec.
    */
  def apply(expectation: String): Unit = js.native
  def apply(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback): Unit = js.native
  def apply(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
}

