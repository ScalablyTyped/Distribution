package typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WriteOpType extends js.Object

@JSImport("libra-core/lib/@/generated/transaction_pb", "WriteOpType")
@js.native
object WriteOpType extends js.Object {
  @js.native
  sealed trait DELETE extends WriteOpType
  
  @js.native
  sealed trait WRITE extends WriteOpType
  
  /* 1 */ val DELETE: typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.WriteOpType.DELETE with Double = js.native
  /* 0 */ val WRITE: typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.WriteOpType.WRITE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WriteOpType with Double] = js.native
}

