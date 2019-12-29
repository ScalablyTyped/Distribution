package typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.RawTransaction

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PayloadCase with Double] = js.native
  /* 0 */ @js.native
  object PAYLOAD_NOT_SET extends TopLevel[PAYLOAD_NOT_SET with Double]
  
  /* 3 */ @js.native
  object PROGRAM extends TopLevel[PROGRAM with Double]
  
  /* 4 */ @js.native
  object WRITE_SET extends TopLevel[WRITE_SET with Double]
  
}

