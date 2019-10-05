package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("fit")
@js.native
object fit extends js.Object {
  /**
    * A focused `it`. If suites or specs are focused, only those that are focused will be executed.
    * @param expectation Textual description of what this spec is checking
    * @param assertion Function that contains the code of your test. If not provided the test will be pending.
    * @param timeout Custom timeout for an async spec.
    */
  def apply(expectation: String): Unit = js.native
  def apply(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback): Unit = js.native
  def apply(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
}

