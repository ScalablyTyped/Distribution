package typings.lovefield.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransactionType extends js.Object
@JSImport("lovefield", "TransactionType")
@js.native
object TransactionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransactionType with Double] = js.native
  
  @js.native
  sealed trait READ_ONLY extends TransactionType
  /* 0 */ @js.native
  object READ_ONLY extends TopLevel[READ_ONLY with Double]
  
  @js.native
  sealed trait READ_WRITE extends TransactionType
  /* 1 */ @js.native
  object READ_WRITE extends TopLevel[READ_WRITE with Double]
}
