package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraVerificationStatusKind extends js.Object

@JSImport("libra-core", "LibraVerificationStatusKind")
@js.native
object LibraVerificationStatusKind extends js.Object {
  @js.native
  sealed trait MODULE extends LibraVerificationStatusKind
  
  @js.native
  sealed trait SCRIPT extends LibraVerificationStatusKind
  
  /* 1 */ val MODULE: typings.libraDashCore.libraDashCoreMod.LibraVerificationStatusKind.MODULE with Double = js.native
  /* 0 */ val SCRIPT: typings.libraDashCore.libraDashCoreMod.LibraVerificationStatusKind.SCRIPT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LibraVerificationStatusKind with Double] = js.native
}

