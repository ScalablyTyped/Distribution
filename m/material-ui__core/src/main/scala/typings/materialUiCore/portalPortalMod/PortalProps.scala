package typings.materialUiCore.portalPortalMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalProps extends js.Object {
  var children: ReactElement = js.native
  var container: js.UndefOr[ReactInstance | js.Function0[ReactInstance] | Null] = js.native
  var disablePortal: js.UndefOr[Boolean] = js.native
  var onRendered: js.UndefOr[js.Function0[Unit]] = js.native
}

object PortalProps {
  @scala.inline
  def apply(
    children: ReactElement,
    container: js.UndefOr[Null | ReactInstance | js.Function0[ReactInstance]] = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    onRendered: () => Unit = null
  ): PortalProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePortal)) __obj.updateDynamic("disablePortal")(disablePortal.get.asInstanceOf[js.Any])
    if (onRendered != null) __obj.updateDynamic("onRendered")(js.Any.fromFunction0(onRendered))
    __obj.asInstanceOf[PortalProps]
  }
}

