package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod

import org.scalablytyped.runtime.TopLevel
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.EMPTYCALLSTACK
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.EMPTYVALUESTACK
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.LINKERERROR
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.LOCALREFERENCEERROR
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.OUTOFBOUNDSINDEX
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.OUTOFBOUNDSRANGE
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.PCOVERFLOW
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.STORAGEERROR
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError.UNKNOWNINVARIANTVIOLATIONERROR
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMInvariantViolationError with Double] = js.native
  /* 4 */ @js.native
  object EMPTYCALLSTACK extends TopLevel[EMPTYCALLSTACK with Double]
  
  /* 3 */ @js.native
  object EMPTYVALUESTACK extends TopLevel[EMPTYVALUESTACK with Double]
  
  /* 6 */ @js.native
  object LINKERERROR extends TopLevel[LINKERERROR with Double]
  
  /* 7 */ @js.native
  object LOCALREFERENCEERROR extends TopLevel[LOCALREFERENCEERROR with Double]
  
  /* 1 */ @js.native
  object OUTOFBOUNDSINDEX extends TopLevel[OUTOFBOUNDSINDEX with Double]
  
  /* 2 */ @js.native
  object OUTOFBOUNDSRANGE extends TopLevel[OUTOFBOUNDSRANGE with Double]
  
  /* 5 */ @js.native
  object PCOVERFLOW extends TopLevel[PCOVERFLOW with Double]
  
  /* 8 */ @js.native
  object STORAGEERROR extends TopLevel[STORAGEERROR with Double]
  
  /* 0 */ @js.native
  object UNKNOWNINVARIANTVIOLATIONERROR extends TopLevel[UNKNOWNINVARIANTVIOLATIONERROR with Double]
  
}

