package typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionArgument

import org.scalablytyped.runtime.TopLevel
import typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionArgument.ArgType.ADDRESS
import typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionArgument.ArgType.BYTEARRAY
import typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionArgument.ArgType.STRING
import typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionArgument.ArgType.U64
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArgType with Double] = js.native
  /* 1 */ @js.native
  object ADDRESS extends TopLevel[ADDRESS with Double]
  
  /* 3 */ @js.native
  object BYTEARRAY extends TopLevel[BYTEARRAY with Double]
  
  /* 2 */ @js.native
  object STRING extends TopLevel[STRING with Double]
  
  /* 0 */ @js.native
  object U64 extends TopLevel[U64 with Double]
  
}

