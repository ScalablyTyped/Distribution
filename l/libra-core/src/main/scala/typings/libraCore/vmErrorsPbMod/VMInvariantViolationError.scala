package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VMInvariantViolationError extends js.Object
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMInvariantViolationError")
@js.native
object VMInvariantViolationError extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMInvariantViolationError with Double] = js.native
  
  @js.native
  sealed trait EMPTYCALLSTACK extends VMInvariantViolationError
  /* 4 */ @js.native
  object EMPTYCALLSTACK extends TopLevel[EMPTYCALLSTACK with Double]
  
  @js.native
  sealed trait EMPTYVALUESTACK extends VMInvariantViolationError
  /* 3 */ @js.native
  object EMPTYVALUESTACK extends TopLevel[EMPTYVALUESTACK with Double]
  
  @js.native
  sealed trait LINKERERROR extends VMInvariantViolationError
  /* 6 */ @js.native
  object LINKERERROR extends TopLevel[LINKERERROR with Double]
  
  @js.native
  sealed trait LOCALREFERENCEERROR extends VMInvariantViolationError
  /* 7 */ @js.native
  object LOCALREFERENCEERROR extends TopLevel[LOCALREFERENCEERROR with Double]
  
  @js.native
  sealed trait OUTOFBOUNDSINDEX extends VMInvariantViolationError
  /* 1 */ @js.native
  object OUTOFBOUNDSINDEX extends TopLevel[OUTOFBOUNDSINDEX with Double]
  
  @js.native
  sealed trait OUTOFBOUNDSRANGE extends VMInvariantViolationError
  /* 2 */ @js.native
  object OUTOFBOUNDSRANGE extends TopLevel[OUTOFBOUNDSRANGE with Double]
  
  @js.native
  sealed trait PCOVERFLOW extends VMInvariantViolationError
  /* 5 */ @js.native
  object PCOVERFLOW extends TopLevel[PCOVERFLOW with Double]
  
  @js.native
  sealed trait STORAGEERROR extends VMInvariantViolationError
  /* 8 */ @js.native
  object STORAGEERROR extends TopLevel[STORAGEERROR with Double]
  
  @js.native
  sealed trait UNKNOWNINVARIANTVIOLATIONERROR extends VMInvariantViolationError
  /* 0 */ @js.native
  object UNKNOWNINVARIANTVIOLATIONERROR extends TopLevel[UNKNOWNINVARIANTVIOLATIONERROR with Double]
}
