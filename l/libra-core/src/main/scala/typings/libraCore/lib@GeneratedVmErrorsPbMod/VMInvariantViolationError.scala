package typings.libraCore.`lib@GeneratedVmErrorsPbMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VMInvariantViolationError extends StObject
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMInvariantViolationError")
@js.native
object VMInvariantViolationError extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VMInvariantViolationError & Double] = js.native
  
  @js.native
  sealed trait EMPTYCALLSTACK
    extends StObject
       with VMInvariantViolationError
  /* 4 */ val EMPTYCALLSTACK: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.VMInvariantViolationError.EMPTYCALLSTACK & Double = js.native
  
  @js.native
  sealed trait EMPTYVALUESTACK
    extends StObject
       with VMInvariantViolationError
  /* 3 */ val EMPTYVALUESTACK: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.VMInvariantViolationError.EMPTYVALUESTACK & Double = js.native
  
  @js.native
  sealed trait LINKERERROR
    extends StObject
       with VMInvariantViolationError
  /* 6 */ val LINKERERROR: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.VMInvariantViolationError.LINKERERROR & Double = js.native
  
  @js.native
  sealed trait LOCALREFERENCEERROR
    extends StObject
       with VMInvariantViolationError
  /* 7 */ val LOCALREFERENCEERROR: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.VMInvariantViolationError.LOCALREFERENCEERROR & Double = js.native
  
  @js.native
  sealed trait OUTOFBOUNDSINDEX
    extends StObject
       with VMInvariantViolationError
  /* 1 */ val OUTOFBOUNDSINDEX: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.VMInvariantViolationError.OUTOFBOUNDSINDEX & Double = js.native
  
  @js.native
  sealed trait OUTOFBOUNDSRANGE
    extends StObject
       with VMInvariantViolationError
  /* 2 */ val OUTOFBOUNDSRANGE: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.VMInvariantViolationError.OUTOFBOUNDSRANGE & Double = js.native
  
  @js.native
  sealed trait PCOVERFLOW
    extends StObject
       with VMInvariantViolationError
  /* 5 */ val PCOVERFLOW: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.VMInvariantViolationError.PCOVERFLOW & Double = js.native
  
  @js.native
  sealed trait STORAGEERROR
    extends StObject
       with VMInvariantViolationError
  /* 8 */ val STORAGEERROR: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.VMInvariantViolationError.STORAGEERROR & Double = js.native
  
  @js.native
  sealed trait UNKNOWNINVARIANTVIOLATIONERROR
    extends StObject
       with VMInvariantViolationError
  /* 0 */ val UNKNOWNINVARIANTVIOLATIONERROR: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.VMInvariantViolationError.UNKNOWNINVARIANTVIOLATIONERROR & Double = js.native
}
