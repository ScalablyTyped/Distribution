package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.cardCardExpandableMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.CardNs.CardExpandableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style */
object CardExpandable
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.cardCardExpandableMod.default].asInstanceOf[String | js.Object]
  def apply(expanded: js.UndefOr[Boolean] = js.undefined, onExpanding: /* isExpanded */ Boolean => Unit = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (onExpanding != null) __obj.updateDynamic("onExpanding")(js.Any.fromFunction1(onExpanding))
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CardExpandableProps
}

