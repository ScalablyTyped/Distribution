package typings
package materialDashUiLib.internalRenderToLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderToLayerProps
  extends reactLib.reactMod.Props[RenderToLayer] {
  var componentClickAway: js.UndefOr[js.Function] = js.undefined
  var open: scala.Boolean
  var render: js.Function
  var useLayerForClickAway: js.UndefOr[scala.Boolean] = js.undefined
}

object RenderToLayerProps {
  @scala.inline
  def apply(
    open: scala.Boolean,
    render: js.Function,
    children: reactLib.reactMod.ReactNode = null,
    componentClickAway: js.Function = null,
    key: reactLib.reactMod.Key = null,
    ref: reactLib.reactMod.LegacyRef[RenderToLayer] = null,
    useLayerForClickAway: js.UndefOr[scala.Boolean] = js.undefined
  ): RenderToLayerProps = {
    val __obj = js.Dynamic.literal(open = open, render = render)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (componentClickAway != null) __obj.updateDynamic("componentClickAway")(componentClickAway)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(useLayerForClickAway)) __obj.updateDynamic("useLayerForClickAway")(useLayerForClickAway)
    __obj.asInstanceOf[RenderToLayerProps]
  }
}

