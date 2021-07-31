package typings.lovefield.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransactionType extends StObject
@JSImport("lovefield", "TransactionType")
@js.native
object TransactionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransactionType & Double] = js.native
  
  @js.native
  sealed trait READ_ONLY
    extends StObject
       with TransactionType
  /* 0 */ val READ_ONLY: typings.lovefield.mod.TransactionType.READ_ONLY & Double = js.native
  
  @js.native
  sealed trait READ_WRITE
    extends StObject
       with TransactionType
  /* 1 */ val READ_WRITE: typings.lovefield.mod.TransactionType.READ_WRITE & Double = js.native
}
