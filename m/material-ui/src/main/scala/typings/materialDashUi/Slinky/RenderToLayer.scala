package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.internalRenderToLayerMod.RenderToLayerProps
import typings.materialDashUi.internalRenderToLayerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, open */
object RenderToLayer
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.internalRenderToLayerMod.default].asInstanceOf[String | js.Object]
  def apply(
    render: js.Function,
    componentClickAway: js.Function = null,
    useLayerForClickAway: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(render = render)
    if (componentClickAway != null) __obj.updateDynamic("componentClickAway")(componentClickAway)
    if (!js.isUndefined(useLayerForClickAway)) __obj.updateDynamic("useLayerForClickAway")(useLayerForClickAway)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RenderToLayerProps
}

