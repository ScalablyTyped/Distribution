package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.internalOverlayMod.OverlayProps
import typings.materialDashUi.internalOverlayMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, onClick, style */
object Overlay
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.internalOverlayMod.default].asInstanceOf[String | js.Object]
  def apply(
    show: Boolean,
    autoLockScrolling: js.UndefOr[Boolean] = js.undefined,
    transitionEnabled: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(show = show)
    if (!js.isUndefined(autoLockScrolling)) __obj.updateDynamic("autoLockScrolling")(autoLockScrolling)
    if (!js.isUndefined(transitionEnabled)) __obj.updateDynamic("transitionEnabled")(transitionEnabled)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = OverlayProps
}

