package typings.libraCore.vmErrorsPbMod.VMVerificationStatus

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusKind extends js.Object
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus.StatusKind")
@js.native
object StatusKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusKind with Double] = js.native
  
  @js.native
  sealed trait DEPENDENCY extends StatusKind
  /* 2 */ @js.native
  object DEPENDENCY extends TopLevel[DEPENDENCY with Double]
  
  @js.native
  sealed trait MODULE extends StatusKind
  /* 1 */ @js.native
  object MODULE extends TopLevel[MODULE with Double]
  
  @js.native
  sealed trait SCRIPT extends StatusKind
  /* 0 */ @js.native
  object SCRIPT extends TopLevel[SCRIPT with Double]
}
