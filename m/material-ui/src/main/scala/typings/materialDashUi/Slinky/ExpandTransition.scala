package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.internalExpandTransitionMod.ExpandTransitionProps
import typings.materialDashUi.internalExpandTransitionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, style, open */
object ExpandTransition
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.internalExpandTransitionMod.default].asInstanceOf[String | js.Object]
  def apply(
    enterDelay: Int | Double = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    transitionDelay: Int | Double = null,
    transitionDuration: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (transitionDelay != null) __obj.updateDynamic("transitionDelay")(transitionDelay.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ExpandTransitionProps
}

