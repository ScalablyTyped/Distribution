package typings
package lovefieldLib.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConstraintTiming extends js.Object

@JSImport("lovefield", "ConstraintTiming")
@js.native
object ConstraintTiming extends js.Object {
  @js.native
  sealed trait DEFERRABLE
    extends lovefieldLib.lovefieldMod.ConstraintTiming
  
  @js.native
  sealed trait IMMEDIATE
    extends lovefieldLib.lovefieldMod.ConstraintTiming
  
  /* 1 */ val DEFERRABLE: DEFERRABLE with scala.Double = js.native
  /* 0 */ val IMMEDIATE: IMMEDIATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[lovefieldLib.lovefieldMod.ConstraintTiming with scala.Double] = js.native
}

