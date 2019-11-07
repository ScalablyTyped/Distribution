package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StatusKind extends js.Object

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus.StatusKind")
@js.native
object StatusKind extends js.Object {
  @js.native
  sealed trait DEPENDENCY extends StatusKind
  
  @js.native
  sealed trait MODULE extends StatusKind
  
  @js.native
  sealed trait SCRIPT extends StatusKind
  
  /* 2 */ val DEPENDENCY: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationStatus.StatusKind.DEPENDENCY with Double = js.native
  /* 1 */ val MODULE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationStatus.StatusKind.MODULE with Double = js.native
  /* 0 */ val SCRIPT: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationStatus.StatusKind.SCRIPT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusKind with Double] = js.native
}

