package typings.libraCore.transactionPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WriteOpType extends StObject
@JSImport("libra-core/lib/@/generated/transaction_pb", "WriteOpType")
@js.native
object WriteOpType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WriteOpType with Double] = js.native
  
  @js.native
  sealed trait DELETE extends WriteOpType
  /* 1 */ val DELETE: typings.libraCore.transactionPbMod.WriteOpType.DELETE with Double = js.native
  
  @js.native
  sealed trait WRITE extends WriteOpType
  /* 0 */ val WRITE: typings.libraCore.transactionPbMod.WriteOpType.WRITE with Double = js.native
}
