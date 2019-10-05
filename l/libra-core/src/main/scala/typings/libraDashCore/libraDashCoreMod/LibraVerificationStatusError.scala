package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraVerificationStatusError extends js.Object {
  var error: LibraVerificationError
  var message: String
  var moduleIndex: Double
  var status: LibraVerificationStatusKind
}

@JSImport("libra-core", "LibraVerificationStatusError")
@js.native
object LibraVerificationStatusError extends js.Object {
  def apply(
    status: LibraVerificationStatusKind,
    moduleIndex: Double,
    error: LibraVerificationError,
    message: String
  ): Unit = js.native
}

