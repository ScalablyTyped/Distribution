package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraInvariantViolationError extends js.Object

@JSImport("libra-core", "LibraInvariantViolationError")
@js.native
object LibraInvariantViolationError extends js.Object {
  @js.native
  sealed trait EMPTYCALLSTACK extends LibraInvariantViolationError
  
  @js.native
  sealed trait EMPTYVALUESTACK extends LibraInvariantViolationError
  
  @js.native
  sealed trait LINKERERROR extends LibraInvariantViolationError
  
  @js.native
  sealed trait LOCALREFERENCEERROR extends LibraInvariantViolationError
  
  @js.native
  sealed trait OUTOFBOUNDSINDEX extends LibraInvariantViolationError
  
  @js.native
  sealed trait OUTOFBOUNDSRANGE extends LibraInvariantViolationError
  
  @js.native
  sealed trait PCOVERFLOW extends LibraInvariantViolationError
  
  @js.native
  sealed trait STORAGEERROR extends LibraInvariantViolationError
  
  @js.native
  sealed trait UNKNOWNINVARIANTVIOLATIONERROR extends LibraInvariantViolationError
  
  /* 4 */ val EMPTYCALLSTACK: typings.libraDashCore.libraDashCoreMod.LibraInvariantViolationError.EMPTYCALLSTACK with Double = js.native
  /* 3 */ val EMPTYVALUESTACK: typings.libraDashCore.libraDashCoreMod.LibraInvariantViolationError.EMPTYVALUESTACK with Double = js.native
  /* 6 */ val LINKERERROR: typings.libraDashCore.libraDashCoreMod.LibraInvariantViolationError.LINKERERROR with Double = js.native
  /* 7 */ val LOCALREFERENCEERROR: typings.libraDashCore.libraDashCoreMod.LibraInvariantViolationError.LOCALREFERENCEERROR with Double = js.native
  /* 1 */ val OUTOFBOUNDSINDEX: typings.libraDashCore.libraDashCoreMod.LibraInvariantViolationError.OUTOFBOUNDSINDEX with Double = js.native
  /* 2 */ val OUTOFBOUNDSRANGE: typings.libraDashCore.libraDashCoreMod.LibraInvariantViolationError.OUTOFBOUNDSRANGE with Double = js.native
  /* 5 */ val PCOVERFLOW: typings.libraDashCore.libraDashCoreMod.LibraInvariantViolationError.PCOVERFLOW with Double = js.native
  /* 8 */ val STORAGEERROR: typings.libraDashCore.libraDashCoreMod.LibraInvariantViolationError.STORAGEERROR with Double = js.native
  /* 0 */ val UNKNOWNINVARIANTVIOLATIONERROR: typings.libraDashCore.libraDashCoreMod.LibraInvariantViolationError.UNKNOWNINVARIANTVIOLATIONERROR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LibraInvariantViolationError with Double] = js.native
}

