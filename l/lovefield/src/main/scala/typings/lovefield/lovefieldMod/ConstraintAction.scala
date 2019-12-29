package typings.lovefield.lovefieldMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConstraintAction with Double] = js.native
  /* 1 */ @js.native
  object CASCADE extends TopLevel[CASCADE with Double]
  
  /* 0 */ @js.native
  object RESTRICT extends TopLevel[RESTRICT with Double]
  
}

