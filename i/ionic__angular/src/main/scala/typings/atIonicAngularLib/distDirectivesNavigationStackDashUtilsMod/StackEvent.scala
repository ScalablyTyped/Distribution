package typings
package atIonicAngularLib.distDirectivesNavigationStackDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackEvent extends js.Object {
  var animation: js.UndefOr[atIonicCoreLib.distTypesComponentsNavNavDashInterfaceMod.NavDirection]
  var direction: atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
  var enteringView: RouteView
  var tabSwitch: scala.Boolean
}

object StackEvent {
  @scala.inline
  def apply(
    direction: atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection,
    enteringView: RouteView,
    tabSwitch: scala.Boolean,
    animation: atIonicCoreLib.distTypesComponentsNavNavDashInterfaceMod.NavDirection = null
  ): StackEvent = {
    val __obj = js.Dynamic.literal(direction = direction, enteringView = enteringView, tabSwitch = tabSwitch)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    __obj.asInstanceOf[StackEvent]
  }
}

