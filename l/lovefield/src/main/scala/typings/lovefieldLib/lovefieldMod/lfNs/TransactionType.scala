package typings
package lovefieldLib.lovefieldMod.lfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransactionType extends js.Object

@JSImport("lovefield/lf", "TransactionType")
@js.native
object TransactionType extends js.Object {
  @js.native
  sealed trait READ_ONLY
    extends lovefieldLib.lovefieldMod.lfNs.TransactionType
  
  @js.native
  sealed trait READ_WRITE
    extends lovefieldLib.lovefieldMod.lfNs.TransactionType
  
}

