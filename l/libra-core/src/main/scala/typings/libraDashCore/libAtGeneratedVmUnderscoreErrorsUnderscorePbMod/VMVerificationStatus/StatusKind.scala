package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationStatus

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusKind with Double] = js.native
  /* 2 */ @js.native
  object DEPENDENCY extends TopLevel[DEPENDENCY with Double]
  
  /* 1 */ @js.native
  object MODULE extends TopLevel[MODULE with Double]
  
  /* 0 */ @js.native
  object SCRIPT extends TopLevel[SCRIPT with Double]
  
}

