package typings.atIonicAngular.distDirectivesNavigationStackDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackEvent extends js.Object {
  var animation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavDirection */ js.Any
  ] = js.undefined
  var direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
  var enteringView: RouteView
  var tabSwitch: Boolean
}

object StackEvent {
  @scala.inline
  def apply(
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any,
    enteringView: RouteView,
    tabSwitch: Boolean,
    animation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavDirection */ js.Any = null
  ): StackEvent = {
    val __obj = js.Dynamic.literal(direction = direction, enteringView = enteringView, tabSwitch = tabSwitch)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    __obj.asInstanceOf[StackEvent]
  }
}

