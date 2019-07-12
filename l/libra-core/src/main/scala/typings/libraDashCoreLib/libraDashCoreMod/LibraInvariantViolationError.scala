package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraInvariantViolationError extends js.Object

@JSImport("libra-core", "LibraInvariantViolationError")
@js.native
object LibraInvariantViolationError extends js.Object {
  @js.native
  sealed trait EMPTYCALLSTACK
    extends libraDashCoreLib.libraDashCoreMod.LibraInvariantViolationError
  
  @js.native
  sealed trait EMPTYVALUESTACK
    extends libraDashCoreLib.libraDashCoreMod.LibraInvariantViolationError
  
  @js.native
  sealed trait LINKERERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraInvariantViolationError
  
  @js.native
  sealed trait LOCALREFERENCEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraInvariantViolationError
  
  @js.native
  sealed trait OUTOFBOUNDSINDEX
    extends libraDashCoreLib.libraDashCoreMod.LibraInvariantViolationError
  
  @js.native
  sealed trait OUTOFBOUNDSRANGE
    extends libraDashCoreLib.libraDashCoreMod.LibraInvariantViolationError
  
  @js.native
  sealed trait PCOVERFLOW
    extends libraDashCoreLib.libraDashCoreMod.LibraInvariantViolationError
  
  @js.native
  sealed trait STORAGEERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraInvariantViolationError
  
  @js.native
  sealed trait UNKNOWNINVARIANTVIOLATIONERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraInvariantViolationError
  
  /* 4 */ val EMPTYCALLSTACK: EMPTYCALLSTACK with scala.Double = js.native
  /* 3 */ val EMPTYVALUESTACK: EMPTYVALUESTACK with scala.Double = js.native
  /* 6 */ val LINKERERROR: LINKERERROR with scala.Double = js.native
  /* 7 */ val LOCALREFERENCEERROR: LOCALREFERENCEERROR with scala.Double = js.native
  /* 1 */ val OUTOFBOUNDSINDEX: OUTOFBOUNDSINDEX with scala.Double = js.native
  /* 2 */ val OUTOFBOUNDSRANGE: OUTOFBOUNDSRANGE with scala.Double = js.native
  /* 5 */ val PCOVERFLOW: PCOVERFLOW with scala.Double = js.native
  /* 8 */ val STORAGEERROR: STORAGEERROR with scala.Double = js.native
  /* 0 */ val UNKNOWNINVARIANTVIOLATIONERROR: UNKNOWNINVARIANTVIOLATIONERROR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[libraDashCoreLib.libraDashCoreMod.LibraInvariantViolationError with scala.Double] = js.native
}

