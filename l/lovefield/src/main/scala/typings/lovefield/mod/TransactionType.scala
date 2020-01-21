package typings.lovefield.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransactionType with Double] = js.native
  /* 0 */ @js.native
  object READ_ONLY extends TopLevel[READ_ONLY with Double]
  
  /* 1 */ @js.native
  object READ_WRITE extends TopLevel[READ_WRITE with Double]
  
}

