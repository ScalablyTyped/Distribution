package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraMempoolTransactionStatus extends js.Object

@JSImport("libra-core", "LibraMempoolTransactionStatus")
@js.native
object LibraMempoolTransactionStatus extends js.Object {
  @js.native
  sealed trait INSUFFICIENTBALANCE extends LibraMempoolTransactionStatus
  
  @js.native
  sealed trait INVALIDSEQNUMBER extends LibraMempoolTransactionStatus
  
  @js.native
  sealed trait INVALIDUPDATE extends LibraMempoolTransactionStatus
  
  @js.native
  sealed trait MEMPOOLISFULL extends LibraMempoolTransactionStatus
  
  @js.native
  sealed trait TOOMANYTRANSACTIONS extends LibraMempoolTransactionStatus
  
  @js.native
  sealed trait UNKNOWN extends LibraMempoolTransactionStatus
  
  @js.native
  sealed trait VALID extends LibraMempoolTransactionStatus
  
  /* 1 */ val INSUFFICIENTBALANCE: typings.libraDashCore.libraDashCoreMod.LibraMempoolTransactionStatus.INSUFFICIENTBALANCE with Double = js.native
  /* 2 */ val INVALIDSEQNUMBER: typings.libraDashCore.libraDashCoreMod.LibraMempoolTransactionStatus.INVALIDSEQNUMBER with Double = js.native
  /* 5 */ val INVALIDUPDATE: typings.libraDashCore.libraDashCoreMod.LibraMempoolTransactionStatus.INVALIDUPDATE with Double = js.native
  /* 3 */ val MEMPOOLISFULL: typings.libraDashCore.libraDashCoreMod.LibraMempoolTransactionStatus.MEMPOOLISFULL with Double = js.native
  /* 4 */ val TOOMANYTRANSACTIONS: typings.libraDashCore.libraDashCoreMod.LibraMempoolTransactionStatus.TOOMANYTRANSACTIONS with Double = js.native
  /* -1 */ val UNKNOWN: typings.libraDashCore.libraDashCoreMod.LibraMempoolTransactionStatus.UNKNOWN with Double = js.native
  /* 0 */ val VALID: typings.libraDashCore.libraDashCoreMod.LibraMempoolTransactionStatus.VALID with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LibraMempoolTransactionStatus with Double] = js.native
}

