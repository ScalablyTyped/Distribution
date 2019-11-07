package typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionArgument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArgType extends js.Object

@JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument.ArgType")
@js.native
object ArgType extends js.Object {
  @js.native
  sealed trait ADDRESS extends ArgType
  
  @js.native
  sealed trait BYTEARRAY extends ArgType
  
  @js.native
  sealed trait STRING extends ArgType
  
  @js.native
  sealed trait U64 extends ArgType
  
  /* 1 */ val ADDRESS: typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionArgument.ArgType.ADDRESS with Double = js.native
  /* 3 */ val BYTEARRAY: typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionArgument.ArgType.BYTEARRAY with Double = js.native
  /* 2 */ val STRING: typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionArgument.ArgType.STRING with Double = js.native
  /* 0 */ val U64: typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionArgument.ArgType.U64 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArgType with Double] = js.native
}

