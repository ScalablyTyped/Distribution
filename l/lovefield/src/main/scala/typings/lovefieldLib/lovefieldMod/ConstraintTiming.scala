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
  
  val DEFERRABLE: DEFERRABLE with java.lang.String = js.native
  val IMMEDIATE: IMMEDIATE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[lovefieldLib.lovefieldMod.ConstraintTiming with java.lang.String] = js.native
}

