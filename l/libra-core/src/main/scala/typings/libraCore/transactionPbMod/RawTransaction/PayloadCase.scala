package typings.libraCore.transactionPbMod.RawTransaction

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PayloadCase extends js.Object
@JSImport("libra-core/lib/@/generated/transaction_pb", "RawTransaction.PayloadCase")
@js.native
object PayloadCase extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PayloadCase with Double] = js.native
  
  @js.native
  sealed trait PAYLOAD_NOT_SET extends PayloadCase
  /* 0 */ @js.native
  object PAYLOAD_NOT_SET extends TopLevel[PAYLOAD_NOT_SET with Double]
  
  @js.native
  sealed trait PROGRAM extends PayloadCase
  /* 3 */ @js.native
  object PROGRAM extends TopLevel[PROGRAM with Double]
  
  @js.native
  sealed trait WRITE_SET extends PayloadCase
  /* 4 */ @js.native
  object WRITE_SET extends TopLevel[WRITE_SET with Double]
}
