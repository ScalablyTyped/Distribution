package typings.lovefield.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransactionType extends js.Object

@JSImport("lovefield", "TransactionType")
@js.native
object TransactionType extends js.Object {
  @js.native
  sealed trait READ_ONLY extends TransactionType
  
  @js.native
  sealed trait READ_WRITE extends TransactionType
  
  /* 0 */ val READ_ONLY: typings.lovefield.lovefieldMod.TransactionType.READ_ONLY with Double = js.native
  /* 1 */ val READ_WRITE: typings.lovefield.lovefieldMod.TransactionType.READ_WRITE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransactionType with Double] = js.native
}

