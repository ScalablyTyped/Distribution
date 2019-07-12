package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraVerificationStatusKind extends js.Object

@JSImport("libra-core", "LibraVerificationStatusKind")
@js.native
object LibraVerificationStatusKind extends js.Object {
  @js.native
  sealed trait MODULE
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationStatusKind
  
  @js.native
  sealed trait SCRIPT
    extends libraDashCoreLib.libraDashCoreMod.LibraVerificationStatusKind
  
  /* 1 */ val MODULE: MODULE with scala.Double = js.native
  /* 0 */ val SCRIPT: SCRIPT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[libraDashCoreLib.libraDashCoreMod.LibraVerificationStatusKind with scala.Double] = js.native
}

