package typings.libraDashCore.libAtGeneratedMempoolUnderscoreStatusUnderscorePbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MempoolAddTransactionStatusCode extends js.Object

@JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatusCode")
@js.native
object MempoolAddTransactionStatusCode extends js.Object {
  @js.native
  sealed trait INSUFFICIENTBALANCE extends MempoolAddTransactionStatusCode
  
  @js.native
  sealed trait INVALIDSEQNUMBER extends MempoolAddTransactionStatusCode
  
  @js.native
  sealed trait INVALIDUPDATE extends MempoolAddTransactionStatusCode
  
  @js.native
  sealed trait MEMPOOLISFULL extends MempoolAddTransactionStatusCode
  
  @js.native
  sealed trait TOOMANYTRANSACTIONS extends MempoolAddTransactionStatusCode
  
  @js.native
  sealed trait VALID extends MempoolAddTransactionStatusCode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MempoolAddTransactionStatusCode with Double] = js.native
  /* 1 */ @js.native
  object INSUFFICIENTBALANCE extends TopLevel[INSUFFICIENTBALANCE with Double]
  
  /* 2 */ @js.native
  object INVALIDSEQNUMBER extends TopLevel[INVALIDSEQNUMBER with Double]
  
  /* 5 */ @js.native
  object INVALIDUPDATE extends TopLevel[INVALIDUPDATE with Double]
  
  /* 3 */ @js.native
  object MEMPOOLISFULL extends TopLevel[MEMPOOLISFULL with Double]
  
  /* 4 */ @js.native
  object TOOMANYTRANSACTIONS extends TopLevel[TOOMANYTRANSACTIONS with Double]
  
  /* 0 */ @js.native
  object VALID extends TopLevel[VALID with Double]
  
}

