package typings.atIonicCore.distTypesComponentsNavNavDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavResult extends js.Object {
  var direction: js.UndefOr[NavDirection] = js.undefined
  var enteringView: js.UndefOr[typings.atIonicCore.distTypesComponentsNavViewDashControllerMod.ViewController] = js.undefined
  var hasCompleted: Boolean
  var leavingView: js.UndefOr[typings.atIonicCore.distTypesComponentsNavViewDashControllerMod.ViewController] = js.undefined
  var requiresTransition: Boolean
}

object NavResult {
  @scala.inline
  def apply(
    hasCompleted: Boolean,
    requiresTransition: Boolean,
    direction: NavDirection = null,
    enteringView: typings.atIonicCore.distTypesComponentsNavViewDashControllerMod.ViewController = null,
    leavingView: typings.atIonicCore.distTypesComponentsNavViewDashControllerMod.ViewController = null
  ): NavResult = {
    val __obj = js.Dynamic.literal(hasCompleted = hasCompleted.asInstanceOf[js.Any], requiresTransition = requiresTransition.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (enteringView != null) __obj.updateDynamic("enteringView")(enteringView.asInstanceOf[js.Any])
    if (leavingView != null) __obj.updateDynamic("leavingView")(leavingView.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavResult]
  }
}

