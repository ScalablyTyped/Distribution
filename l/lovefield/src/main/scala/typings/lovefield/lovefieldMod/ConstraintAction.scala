package typings.lovefield.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConstraintAction extends js.Object

@JSImport("lovefield", "ConstraintAction")
@js.native
object ConstraintAction extends js.Object {
  @js.native
  sealed trait CASCADE extends ConstraintAction
  
  @js.native
  sealed trait RESTRICT extends ConstraintAction
  
  /* 1 */ val CASCADE: typings.lovefield.lovefieldMod.ConstraintAction.CASCADE with Double = js.native
  /* 0 */ val RESTRICT: typings.lovefield.lovefieldMod.ConstraintAction.RESTRICT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConstraintAction with Double] = js.native
}

