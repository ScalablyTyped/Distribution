package typings.libraCore.admissionControlPbMod.SubmitTransactionResponse

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusCase with Double] = js.native
  /* 2 */ @js.native
  object AC_STATUS extends TopLevel[AC_STATUS with Double]
  
  /* 3 */ @js.native
  object MEMPOOL_STATUS extends TopLevel[MEMPOOL_STATUS with Double]
  
  /* 0 */ @js.native
  object STATUS_NOT_SET extends TopLevel[STATUS_NOT_SET with Double]
  
  /* 1 */ @js.native
  object VM_STATUS extends TopLevel[VM_STATUS with Double]
  
}

