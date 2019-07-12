package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraMempoolTransactionStatus extends js.Object

@JSImport("libra-core", "LibraMempoolTransactionStatus")
@js.native
object LibraMempoolTransactionStatus extends js.Object {
  @js.native
  sealed trait INSUFFICIENTBALANCE
    extends libraDashCoreLib.libraDashCoreMod.LibraMempoolTransactionStatus
  
  @js.native
  sealed trait INVALIDSEQNUMBER
    extends libraDashCoreLib.libraDashCoreMod.LibraMempoolTransactionStatus
  
  @js.native
  sealed trait INVALIDUPDATE
    extends libraDashCoreLib.libraDashCoreMod.LibraMempoolTransactionStatus
  
  @js.native
  sealed trait MEMPOOLISFULL
    extends libraDashCoreLib.libraDashCoreMod.LibraMempoolTransactionStatus
  
  @js.native
  sealed trait TOOMANYTRANSACTIONS
    extends libraDashCoreLib.libraDashCoreMod.LibraMempoolTransactionStatus
  
  @js.native
  sealed trait VALID
    extends libraDashCoreLib.libraDashCoreMod.LibraMempoolTransactionStatus
  
  /* 1 */ val INSUFFICIENTBALANCE: INSUFFICIENTBALANCE with scala.Double = js.native
  /* 2 */ val INVALIDSEQNUMBER: INVALIDSEQNUMBER with scala.Double = js.native
  /* 5 */ val INVALIDUPDATE: INVALIDUPDATE with scala.Double = js.native
  /* 3 */ val MEMPOOLISFULL: MEMPOOLISFULL with scala.Double = js.native
  /* 4 */ val TOOMANYTRANSACTIONS: TOOMANYTRANSACTIONS with scala.Double = js.native
  /* 0 */ val VALID: VALID with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    libraDashCoreLib.libraDashCoreMod.LibraMempoolTransactionStatus with scala.Double
  ] = js.native
}

