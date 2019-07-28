package typings.lovefield.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConstraintTiming extends js.Object

@JSImport("lovefield", "ConstraintTiming")
@js.native
object ConstraintTiming extends js.Object {
  @js.native
  sealed trait DEFERRABLE extends ConstraintTiming
  
  @js.native
  sealed trait IMMEDIATE extends ConstraintTiming
  
  /* 1 */ val DEFERRABLE: typings.lovefield.lovefieldMod.ConstraintTiming.DEFERRABLE with Double = js.native
  /* 0 */ val IMMEDIATE: typings.lovefield.lovefieldMod.ConstraintTiming.IMMEDIATE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConstraintTiming with Double] = js.native
}

