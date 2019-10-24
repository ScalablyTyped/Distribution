package typings.atIonicAngular.distDirectivesNavigationStackDashUtilsMod

import typings.atIonicCore.distTypesComponentsNavNavDashInterfaceMod.NavDirection
import typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackEvent extends js.Object {
  var animation: js.UndefOr[NavDirection] = js.undefined
  var direction: RouterDirection
  var enteringView: RouteView
  var tabSwitch: Boolean
}

object StackEvent {
  @scala.inline
  def apply(
    direction: RouterDirection,
    enteringView: RouteView,
    tabSwitch: Boolean,
    animation: NavDirection = null
  ): StackEvent = {
    val __obj = js.Dynamic.literal(direction = direction, enteringView = enteringView, tabSwitch = tabSwitch)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    __obj.asInstanceOf[StackEvent]
  }
}

