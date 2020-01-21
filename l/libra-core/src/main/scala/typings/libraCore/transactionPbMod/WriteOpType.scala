package typings.libraCore.transactionPbMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WriteOpType with Double] = js.native
  /* 1 */ @js.native
  object DELETE extends TopLevel[DELETE with Double]
  
  /* 0 */ @js.native
  object WRITE extends TopLevel[WRITE with Double]
  
}

