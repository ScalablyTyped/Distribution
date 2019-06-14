package typings
package lovefieldLib.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConstraintAction extends js.Object

@JSImport("lovefield", "ConstraintAction")
@js.native
object ConstraintAction extends js.Object {
  @js.native
  sealed trait CASCADE
    extends lovefieldLib.lovefieldMod.ConstraintAction
  
  @js.native
  sealed trait RESTRICT
    extends lovefieldLib.lovefieldMod.ConstraintAction
  
  /* 1 */ val CASCADE: CASCADE with scala.Double = js.native
  /* 0 */ val RESTRICT: RESTRICT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[lovefieldLib.lovefieldMod.ConstraintAction with scala.Double] = js.native
}

