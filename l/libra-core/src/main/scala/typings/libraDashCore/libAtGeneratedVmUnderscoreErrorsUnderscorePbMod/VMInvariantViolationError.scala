package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VMInvariantViolationError extends js.Object

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMInvariantViolationError")
@js.native
object VMInvariantViolationError extends js.Object {
  @js.native
  sealed trait EMPTYCALLSTACK extends VMInvariantViolationError
  
  @js.native
  sealed trait EMPTYVALUESTACK extends VMInvariantViolationError
  
  @js.native
  sealed trait LINKERERROR extends VMInvariantViolationError
  
  @js.native
  sealed trait LOCALREFERENCEERROR extends VMInvariantViolationError
  
  @js.native
  sealed trait OUTOFBOUNDSINDEX extends VMInvariantViolationError
  
  @js.native
  sealed trait OUTOFBOUNDSRANGE extends VMInvariantViolationError
  
  @js.native
  sealed trait PCOVERFLOW extends VMInvariantViolationError
  
  @js.native
  sealed trait STORAGEERROR extends VMInvariantViolationError
  
  @js.native
  sealed trait UNKNOWNINVARIANTVIOLATIONERROR extends VMInvariantViolationError
  
  /* 4 */ val EMPTYCALLSTACK: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.EMPTYCALLSTACK with Double = js.native
  /* 3 */ val EMPTYVALUESTACK: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.EMPTYVALUESTACK with Double = js.native
  /* 6 */ val LINKERERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.LINKERERROR with Double = js.native
  /* 7 */ val LOCALREFERENCEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.LOCALREFERENCEERROR with Double = js.native
  /* 1 */ val OUTOFBOUNDSINDEX: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.OUTOFBOUNDSINDEX with Double = js.native
  /* 2 */ val OUTOFBOUNDSRANGE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.OUTOFBOUNDSRANGE with Double = js.native
  /* 5 */ val PCOVERFLOW: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.PCOVERFLOW with Double = js.native
  /* 8 */ val STORAGEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.STORAGEERROR with Double = js.native
  /* 0 */ val UNKNOWNINVARIANTVIOLATIONERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.UNKNOWNINVARIANTVIOLATIONERROR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMInvariantViolationError with Double] = js.native
}

