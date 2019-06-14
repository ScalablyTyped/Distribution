package typings
package lovefieldLib.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransactionType extends js.Object

@JSImport("lovefield", "TransactionType")
@js.native
object TransactionType extends js.Object {
  @js.native
  sealed trait READ_ONLY
    extends lovefieldLib.lovefieldMod.TransactionType
  
  @js.native
  sealed trait READ_WRITE
    extends lovefieldLib.lovefieldMod.TransactionType
  
  /* 0 */ val READ_ONLY: READ_ONLY with scala.Double = js.native
  /* 1 */ val READ_WRITE: READ_WRITE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[lovefieldLib.lovefieldMod.TransactionType with scala.Double] = js.native
}

