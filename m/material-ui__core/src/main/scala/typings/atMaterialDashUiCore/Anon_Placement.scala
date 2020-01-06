package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.popperPopperMod.PopperPlacementType
import typings.atMaterialDashUiCore.transitionsTransitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Placement extends js.Object {
  var TransitionProps: js.UndefOr[typings.atMaterialDashUiCore.transitionsTransitionMod.TransitionProps] = js.native
  var placement: PopperPlacementType = js.native
}

object Anon_Placement {
  @scala.inline
  def apply(placement: PopperPlacementType, TransitionProps: TransitionProps = null): Anon_Placement = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Placement]
  }
}

