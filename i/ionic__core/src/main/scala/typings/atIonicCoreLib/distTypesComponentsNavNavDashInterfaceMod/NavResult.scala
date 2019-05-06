package typings
package atIonicCoreLib.distTypesComponentsNavNavDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavResult extends js.Object {
  var direction: js.UndefOr[NavDirection] = js.undefined
  var enteringView: js.UndefOr[atIonicCoreLib.distTypesComponentsNavViewDashControllerMod.ViewController] = js.undefined
  var hasCompleted: scala.Boolean
  var leavingView: js.UndefOr[atIonicCoreLib.distTypesComponentsNavViewDashControllerMod.ViewController] = js.undefined
  var requiresTransition: scala.Boolean
}

object NavResult {
  @scala.inline
  def apply(
    hasCompleted: scala.Boolean,
    requiresTransition: scala.Boolean,
    direction: NavDirection = null,
    enteringView: atIonicCoreLib.distTypesComponentsNavViewDashControllerMod.ViewController = null,
    leavingView: atIonicCoreLib.distTypesComponentsNavViewDashControllerMod.ViewController = null
  ): NavResult = {
    val __obj = js.Dynamic.literal(hasCompleted = hasCompleted, requiresTransition = requiresTransition)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (enteringView != null) __obj.updateDynamic("enteringView")(enteringView)
    if (leavingView != null) __obj.updateDynamic("leavingView")(leavingView)
    __obj.asInstanceOf[NavResult]
  }
}

