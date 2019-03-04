package typings
package atMaterialDashUiCoreLib.portalPortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactElement[_]
  var container: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactInstance | js.Function0[reactLib.reactMod.ReactNs.ReactInstance] | scala.Null
  ] = js.undefined
  var disablePortal: js.UndefOr[scala.Boolean] = js.undefined
  var onRendered: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object PortalProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactElement[_],
    container: reactLib.reactMod.ReactNs.ReactInstance | js.Function0[reactLib.reactMod.ReactNs.ReactInstance] = null,
    disablePortal: js.UndefOr[scala.Boolean] = js.undefined,
    onRendered: js.Function0[scala.Unit] = null
  ): PortalProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePortal)) __obj.updateDynamic("disablePortal")(disablePortal)
    if (onRendered != null) __obj.updateDynamic("onRendered")(onRendered)
    __obj.asInstanceOf[PortalProps]
  }
}

