package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.cardMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.CardNs.CardProps
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Card
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.cardMod.default].asInstanceOf[String | js.Object]
  def apply(
    actAsExpander: js.UndefOr[Boolean] = js.undefined,
    containerStyle: CSSProperties = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    initiallyExpanded: js.UndefOr[Boolean] = js.undefined,
    onExpandChange: /* isExpanded */ Boolean => Unit = null,
    showExpandableButton: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle)
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (!js.isUndefined(initiallyExpanded)) __obj.updateDynamic("initiallyExpanded")(initiallyExpanded)
    if (onExpandChange != null) __obj.updateDynamic("onExpandChange")(js.Any.fromFunction1(onExpandChange))
    if (!js.isUndefined(showExpandableButton)) __obj.updateDynamic("showExpandableButton")(showExpandableButton)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CardProps
}

