package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.dividerMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.DividerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, style */
object Divider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.dividerMod.default].asInstanceOf[String | js.Object]
  def apply(inset: js.UndefOr[Boolean] = js.undefined): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DividerProps
}

