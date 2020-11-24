package typings.libraCore.mempoolStatusPbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MempoolAddTransactionStatusCode extends js.Object
@JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatusCode")
@js.native
object MempoolAddTransactionStatusCode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MempoolAddTransactionStatusCode with Double] = js.native
  
  @js.native
  sealed trait INSUFFICIENTBALANCE extends MempoolAddTransactionStatusCode
  /* 1 */ @js.native
  object INSUFFICIENTBALANCE extends TopLevel[INSUFFICIENTBALANCE with Double]
  
  @js.native
  sealed trait INVALIDSEQNUMBER extends MempoolAddTransactionStatusCode
  /* 2 */ @js.native
  object INVALIDSEQNUMBER extends TopLevel[INVALIDSEQNUMBER with Double]
  
  @js.native
  sealed trait INVALIDUPDATE extends MempoolAddTransactionStatusCode
  /* 5 */ @js.native
  object INVALIDUPDATE extends TopLevel[INVALIDUPDATE with Double]
  
  @js.native
  sealed trait MEMPOOLISFULL extends MempoolAddTransactionStatusCode
  /* 3 */ @js.native
  object MEMPOOLISFULL extends TopLevel[MEMPOOLISFULL with Double]
  
  @js.native
  sealed trait TOOMANYTRANSACTIONS extends MempoolAddTransactionStatusCode
  /* 4 */ @js.native
  object TOOMANYTRANSACTIONS extends TopLevel[TOOMANYTRANSACTIONS with Double]
  
  @js.native
  sealed trait VALID extends MempoolAddTransactionStatusCode
  /* 0 */ @js.native
  object VALID extends TopLevel[VALID with Double]
}
