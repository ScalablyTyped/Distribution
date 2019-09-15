package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.cardCardTextMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.CardNs.CardTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, color, className */
object CardText
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.cardCardTextMod.default].asInstanceOf[String | js.Object]
  def apply(actAsExpander: js.UndefOr[Boolean] = js.undefined, expandable: js.UndefOr[Boolean] = js.undefined): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander)
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CardTextProps
}

