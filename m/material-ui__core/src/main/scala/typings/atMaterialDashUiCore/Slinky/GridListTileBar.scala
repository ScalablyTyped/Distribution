package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.PartialClassNameMapGridListTileBarClassKey
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.bottom
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.left
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.right
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.top
import typings.atMaterialDashUiCore.gridListTileBarGridListTileBarMod.GridListTileBarProps
import typings.atMaterialDashUiCore.gridListTileBarMod.default
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object GridListTileBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.gridListTileBarMod.default].asInstanceOf[String | js.Object]
  def apply(
    actionIcon: TagMod[Any] = null,
    actionPosition: left | right = null,
    classes: PartialClassNameMapGridListTileBarClassKey = null,
    innerRef: Ref[_] | RefObject[_] = null,
    subtitle: TagMod[Any] = null,
    title: TagMod[Any] = null,
    titlePosition: top | bottom = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (actionIcon != null) __obj.updateDynamic("actionIcon")(actionIcon)
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GridListTileBarProps
}

