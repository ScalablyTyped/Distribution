package typings.materialUi.renderToLayerMod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderToLayerProps extends Props[RenderToLayer] {
  var componentClickAway: js.UndefOr[js.Function] = js.undefined
  var open: Boolean
  var render: js.Function
  var useLayerForClickAway: js.UndefOr[Boolean] = js.undefined
}

object RenderToLayerProps {
  @scala.inline
  def apply(
    open: Boolean,
    render: js.Function,
    children: ReactNode = null,
    componentClickAway: js.Function = null,
    key: Key = null,
    ref: js.UndefOr[Null | LegacyRef[RenderToLayer]] = js.undefined,
    useLayerForClickAway: js.UndefOr[Boolean] = js.undefined
  ): RenderToLayerProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (componentClickAway != null) __obj.updateDynamic("componentClickAway")(componentClickAway.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(useLayerForClickAway)) __obj.updateDynamic("useLayerForClickAway")(useLayerForClickAway.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderToLayerProps]
  }
}

