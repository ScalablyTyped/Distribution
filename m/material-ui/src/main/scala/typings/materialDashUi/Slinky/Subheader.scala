package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.subheaderMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.SubheaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style */
object Subheader
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.subheaderMod.default].asInstanceOf[String | js.Object]
  def apply(inset: js.UndefOr[Boolean] = js.undefined): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SubheaderProps
}

