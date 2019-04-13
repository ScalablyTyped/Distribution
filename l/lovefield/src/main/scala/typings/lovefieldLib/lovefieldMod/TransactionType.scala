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
  
  val READ_ONLY: READ_ONLY with java.lang.String = js.native
  val READ_WRITE: READ_WRITE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[lovefieldLib.lovefieldMod.TransactionType with java.lang.String] = js.native
}

