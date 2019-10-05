package typings.jsmockito

import typings.jsmockito.JsMockito.Verifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("zeroInteractions")
@js.native
object zeroInteractions extends js.Object {
  /** Test that no interaction were made on the mock.  For example:
    * <pre>
    * verify(mock, zeroInteractions());
    * </pre>
    * @see JsMockito.verifyZeroInteractions()
    */
  def apply(): Verifier = js.native
}

