package typings.lovefield.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransactionType extends StObject
@JSImport("lovefield", "TransactionType")
@js.native
object TransactionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransactionType with Double] = js.native
  
  @js.native
  sealed trait READ_ONLY extends TransactionType
  /* 0 */ val READ_ONLY: typings.lovefield.mod.TransactionType.READ_ONLY with Double = js.native
  
  @js.native
  sealed trait READ_WRITE extends TransactionType
  /* 1 */ val READ_WRITE: typings.lovefield.mod.TransactionType.READ_WRITE with Double = js.native
}
