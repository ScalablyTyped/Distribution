package typings.libraCore.transactionPbMod.TransactionArgument

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArgType extends js.Object
@JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument.ArgType")
@js.native
object ArgType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArgType with Double] = js.native
  
  @js.native
  sealed trait ADDRESS extends ArgType
  /* 1 */ @js.native
  object ADDRESS extends TopLevel[ADDRESS with Double]
  
  @js.native
  sealed trait BYTEARRAY extends ArgType
  /* 3 */ @js.native
  object BYTEARRAY extends TopLevel[BYTEARRAY with Double]
  
  @js.native
  sealed trait STRING extends ArgType
  /* 2 */ @js.native
  object STRING extends TopLevel[STRING with Double]
  
  @js.native
  sealed trait U64 extends ArgType
  /* 0 */ @js.native
  object U64 extends TopLevel[U64 with Double]
}
