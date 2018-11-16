package typings
package lovefieldLib.lovefieldMod.lfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConstraintAction extends js.Object

@JSImport("lovefield/lf", "ConstraintAction")
@js.native
object ConstraintAction extends js.Object {
  @js.native
  sealed trait CASCADE
    extends lovefieldLib.lovefieldMod.lfNs.ConstraintAction
  
  @js.native
  sealed trait RESTRICT
    extends lovefieldLib.lovefieldMod.lfNs.ConstraintAction
  
}

