package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.tableTableHeaderMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.TableNs.TableHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object TableHeader
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.tableTableHeaderMod.default].asInstanceOf[String | js.Object]
  def apply(
    adjustForCheckbox: js.UndefOr[Boolean] = js.undefined,
    displaySelectAll: js.UndefOr[Boolean] = js.undefined,
    enableSelectAll: js.UndefOr[Boolean] = js.undefined,
    onSelectAll: /* checked */ Boolean => Unit = null,
    selectAllSelected: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustForCheckbox)) __obj.updateDynamic("adjustForCheckbox")(adjustForCheckbox)
    if (!js.isUndefined(displaySelectAll)) __obj.updateDynamic("displaySelectAll")(displaySelectAll)
    if (!js.isUndefined(enableSelectAll)) __obj.updateDynamic("enableSelectAll")(enableSelectAll)
    if (onSelectAll != null) __obj.updateDynamic("onSelectAll")(js.Any.fromFunction1(onSelectAll))
    if (!js.isUndefined(selectAllSelected)) __obj.updateDynamic("selectAllSelected")(selectAllSelected)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableHeaderProps
}

