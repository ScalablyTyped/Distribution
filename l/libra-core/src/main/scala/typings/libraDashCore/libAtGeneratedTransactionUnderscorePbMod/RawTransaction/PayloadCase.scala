package typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.RawTransaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PayloadCase extends js.Object

@JSImport("libra-core/lib/@/generated/transaction_pb", "RawTransaction.PayloadCase")
@js.native
object PayloadCase extends js.Object {
  @js.native
  sealed trait PAYLOAD_NOT_SET extends PayloadCase
  
  @js.native
  sealed trait PROGRAM extends PayloadCase
  
  @js.native
  sealed trait WRITE_SET extends PayloadCase
  
  /* 0 */ val PAYLOAD_NOT_SET: typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.RawTransaction.PayloadCase.PAYLOAD_NOT_SET with Double = js.native
  /* 3 */ val PROGRAM: typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.RawTransaction.PayloadCase.PROGRAM with Double = js.native
  /* 4 */ val WRITE_SET: typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.RawTransaction.PayloadCase.WRITE_SET with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PayloadCase with Double] = js.native
}

