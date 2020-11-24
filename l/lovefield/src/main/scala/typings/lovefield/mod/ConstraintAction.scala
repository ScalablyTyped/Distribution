package typings.lovefield.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConstraintAction extends js.Object
@JSImport("lovefield", "ConstraintAction")
@js.native
object ConstraintAction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConstraintAction with Double] = js.native
  
  @js.native
  sealed trait CASCADE extends ConstraintAction
  /* 1 */ @js.native
  object CASCADE extends TopLevel[CASCADE with Double]
  
  @js.native
  sealed trait RESTRICT extends ConstraintAction
  /* 0 */ @js.native
  object RESTRICT extends TopLevel[RESTRICT with Double]
}
