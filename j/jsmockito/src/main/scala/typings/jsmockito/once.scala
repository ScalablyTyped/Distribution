package typings.jsmockito

import typings.jsmockito.JsMockito.Verifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("once")
@js.native
object once extends js.Object {
  /**
    * Test that an invocation occurred exactly once. For example:
    * <pre>
    * verify(mock, once()).method();
    * </pre>
    * This is the default verifier.
    * @see JsMockito.Verifiers.times(1)
    */
  def apply(): Verifier = js.native
}

