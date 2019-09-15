package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.materialDashUiStrings.hide
import typings.materialDashUi.materialDashUiStrings.loading
import typings.materialDashUi.materialDashUiStrings.ready
import typings.materialDashUi.refreshIndicatorMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.RefreshIndicatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: size, style, color */
object RefreshIndicator
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.refreshIndicatorMod.default].asInstanceOf[String | js.Object]
  def apply(
    left: Double,
    top: Double,
    loadingColor: String = null,
    percentage: Int | Double = null,
    status: ready | loading | hide = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(left = left, top = top)
    if (loadingColor != null) __obj.updateDynamic("loadingColor")(loadingColor)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RefreshIndicatorProps
}

