package typings.jsmockito

import typings.jsmockito.JsMockito.Verifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("times")
@js.native
object times extends js.Object {
  /**
    * Test that an invocation occurred a specific number of times. For example:
    * <pre>
    * verify(mock, times(2)).method();
    * </pre>
    *
    * @param wanted The number of desired invocations
    */
  def apply(wanted: Double): Verifier = js.native
}

