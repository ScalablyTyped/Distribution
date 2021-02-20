package typings.lovefield.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConstraintTiming extends StObject
@JSImport("lovefield", "ConstraintTiming")
@js.native
object ConstraintTiming extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConstraintTiming with Double] = js.native
  
  @js.native
  sealed trait DEFERRABLE extends ConstraintTiming
  /* 1 */ val DEFERRABLE: typings.lovefield.mod.ConstraintTiming.DEFERRABLE with Double = js.native
  
  @js.native
  sealed trait IMMEDIATE extends ConstraintTiming
  /* 0 */ val IMMEDIATE: typings.lovefield.mod.ConstraintTiming.IMMEDIATE with Double = js.native
}
