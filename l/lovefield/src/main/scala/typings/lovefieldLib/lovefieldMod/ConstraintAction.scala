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
  
  val CASCADE: CASCADE with java.lang.String = js.native
  val RESTRICT: RESTRICT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[lovefieldLib.lovefieldMod.ConstraintAction with java.lang.String] = js.native
}

