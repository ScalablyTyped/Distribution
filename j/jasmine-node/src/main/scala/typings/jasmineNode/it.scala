package typings.jasmineNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("it")
@js.native
object it extends js.Object {
  def apply(
    expectation: String,
    assertion: js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]
  ): Unit = js.native
  def apply(
    expectation: String,
    assertion: js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit],
    timeout: Double
  ): Unit = js.native
}

