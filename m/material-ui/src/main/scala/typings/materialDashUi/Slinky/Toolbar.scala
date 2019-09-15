package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.toolbarMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.ToolbarNs.ToolbarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, style */
object Toolbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.toolbarMod.default].asInstanceOf[String | js.Object]
  def apply(noGutter: js.UndefOr[Boolean] = js.undefined): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noGutter)) __obj.updateDynamic("noGutter")(noGutter)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ToolbarProps
}

