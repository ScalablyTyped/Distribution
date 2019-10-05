package typings.jsmockito

import typings.jsmockito.JsMockito.Verifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("never")
@js.native
object never extends js.Object {
  /**
    * Test that a invocation never occurred. For example:
    * <pre>
    * verify(mock, never()).method();
    * </pre>
    * @see JsMockito.Verifiers.times(0)
    */
  def apply(): Verifier = js.native
}

