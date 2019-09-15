package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.materialDashUiStrings.left
import typings.materialDashUi.materialDashUiStrings.right
import typings.materialDashUi.toolbarToolbarGroupMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.ToolbarNs.ToolbarGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object ToolbarGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.toolbarToolbarGroupMod.default].asInstanceOf[String | js.Object]
  def apply(
    firstChild: js.UndefOr[Boolean] = js.undefined,
    float: left | right = null,
    lastChild: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(firstChild)) __obj.updateDynamic("firstChild")(firstChild)
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (!js.isUndefined(lastChild)) __obj.updateDynamic("lastChild")(lastChild)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ToolbarGroupProps
}

