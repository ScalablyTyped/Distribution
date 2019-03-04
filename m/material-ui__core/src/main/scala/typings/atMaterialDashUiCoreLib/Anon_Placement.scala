package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Placement extends js.Object {
  var TransitionProps: js.UndefOr[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps] = js.undefined
  var placement: atMaterialDashUiCoreLib.popperPopperMod.PopperPlacementType
}

object Anon_Placement {
  @scala.inline
  def apply(
    placement: atMaterialDashUiCoreLib.popperPopperMod.PopperPlacementType,
    TransitionProps: atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps = null
  ): Anon_Placement = {
    val __obj = js.Dynamic.literal(placement = placement)
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps)
    __obj.asInstanceOf[Anon_Placement]
  }
}

