package typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.SubmitTransactionResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StatusCase extends js.Object

@JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse.StatusCase")
@js.native
object StatusCase extends js.Object {
  @js.native
  sealed trait AC_STATUS extends StatusCase
  
  @js.native
  sealed trait MEMPOOL_STATUS extends StatusCase
  
  @js.native
  sealed trait STATUS_NOT_SET extends StatusCase
  
  @js.native
  sealed trait VM_STATUS extends StatusCase
  
  /* 2 */ val AC_STATUS: typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.SubmitTransactionResponse.StatusCase.AC_STATUS with Double = js.native
  /* 3 */ val MEMPOOL_STATUS: typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.SubmitTransactionResponse.StatusCase.MEMPOOL_STATUS with Double = js.native
  /* 0 */ val STATUS_NOT_SET: typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.SubmitTransactionResponse.StatusCase.STATUS_NOT_SET with Double = js.native
  /* 1 */ val VM_STATUS: typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.SubmitTransactionResponse.StatusCase.VM_STATUS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusCase with Double] = js.native
}

