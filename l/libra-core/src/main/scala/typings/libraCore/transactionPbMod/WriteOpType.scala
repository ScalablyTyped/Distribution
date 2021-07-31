package typings.libraCore.transactionPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WriteOpType extends StObject
@JSImport("libra-core/lib/@/generated/transaction_pb", "WriteOpType")
@js.native
object WriteOpType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WriteOpType & Double] = js.native
  
  @js.native
  sealed trait DELETE
    extends StObject
       with WriteOpType
  /* 1 */ val DELETE: typings.libraCore.transactionPbMod.WriteOpType.DELETE & Double = js.native
  
  @js.native
  sealed trait WRITE
    extends StObject
       with WriteOpType
  /* 0 */ val WRITE: typings.libraCore.transactionPbMod.WriteOpType.WRITE & Double = js.native
}
