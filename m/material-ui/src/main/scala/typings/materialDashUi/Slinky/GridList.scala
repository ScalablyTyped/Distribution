package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.gridListMod.default
import typings.materialDashUi.materialDashUiStrings.auto
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.GridListNs.GridListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: cols, style */
object GridList
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.gridListMod.default].asInstanceOf[String | js.Object]
  def apply(cellHeight: Double | auto = null, padding: Int | Double = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GridListProps
}

