package typings.atMaterialDashUiCore.portalPortalMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps extends js.Object {
  var children: ReactElement
  var container: js.UndefOr[ReactInstance | js.Function0[ReactInstance] | Null] = js.undefined
  var disablePortal: js.UndefOr[Boolean] = js.undefined
  var onRendered: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PortalProps {
  @scala.inline
  def apply(
    children: ReactElement,
    container: ReactInstance | js.Function0[ReactInstance] = null,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    onRendered: () => Unit = null
  ): PortalProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePortal)) __obj.updateDynamic("disablePortal")(disablePortal.asInstanceOf[js.Any])
    if (onRendered != null) __obj.updateDynamic("onRendered")(js.Any.fromFunction0(onRendered))
    __obj.asInstanceOf[PortalProps]
  }
}

