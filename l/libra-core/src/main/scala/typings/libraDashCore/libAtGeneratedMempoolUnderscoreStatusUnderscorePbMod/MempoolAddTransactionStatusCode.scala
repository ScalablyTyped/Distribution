package typings.libraDashCore.libAtGeneratedMempoolUnderscoreStatusUnderscorePbMod

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
  
  /* 1 */ val INSUFFICIENTBALANCE: typings.libraDashCore.libAtGeneratedMempoolUnderscoreStatusUnderscorePbMod.MempoolAddTransactionStatusCode.INSUFFICIENTBALANCE with Double = js.native
  /* 2 */ val INVALIDSEQNUMBER: typings.libraDashCore.libAtGeneratedMempoolUnderscoreStatusUnderscorePbMod.MempoolAddTransactionStatusCode.INVALIDSEQNUMBER with Double = js.native
  /* 5 */ val INVALIDUPDATE: typings.libraDashCore.libAtGeneratedMempoolUnderscoreStatusUnderscorePbMod.MempoolAddTransactionStatusCode.INVALIDUPDATE with Double = js.native
  /* 3 */ val MEMPOOLISFULL: typings.libraDashCore.libAtGeneratedMempoolUnderscoreStatusUnderscorePbMod.MempoolAddTransactionStatusCode.MEMPOOLISFULL with Double = js.native
  /* 4 */ val TOOMANYTRANSACTIONS: typings.libraDashCore.libAtGeneratedMempoolUnderscoreStatusUnderscorePbMod.MempoolAddTransactionStatusCode.TOOMANYTRANSACTIONS with Double = js.native
  /* 0 */ val VALID: typings.libraDashCore.libAtGeneratedMempoolUnderscoreStatusUnderscorePbMod.MempoolAddTransactionStatusCode.VALID with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MempoolAddTransactionStatusCode with Double] = js.native
}

