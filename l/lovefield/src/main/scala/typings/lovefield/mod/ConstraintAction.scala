package typings.lovefield.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConstraintAction extends StObject
@JSImport("lovefield", "ConstraintAction")
@js.native
object ConstraintAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConstraintAction & Double] = js.native
  
  @js.native
  sealed trait CASCADE
    extends StObject
       with ConstraintAction
  /* 1 */ val CASCADE: typings.lovefield.mod.ConstraintAction.CASCADE & Double = js.native
  
  @js.native
  sealed trait RESTRICT
    extends StObject
       with ConstraintAction
  /* 0 */ val RESTRICT: typings.lovefield.mod.ConstraintAction.RESTRICT & Double = js.native
}
