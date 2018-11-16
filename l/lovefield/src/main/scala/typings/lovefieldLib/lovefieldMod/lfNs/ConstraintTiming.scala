package typings
package lovefieldLib.lovefieldMod.lfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConstraintTiming extends js.Object

@JSImport("lovefield/lf", "ConstraintTiming")
@js.native
object ConstraintTiming extends js.Object {
  @js.native
  sealed trait DEFERRABLE
    extends lovefieldLib.lovefieldMod.lfNs.ConstraintTiming
  
  @js.native
  sealed trait IMMEDIATE
    extends lovefieldLib.lovefieldMod.lfNs.ConstraintTiming
  
}

