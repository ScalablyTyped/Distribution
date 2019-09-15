package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.PartialClassNameMapListItemSecondaryActionClassKey
import typings.atMaterialDashUiCore.listItemSecondaryActionListItemSecondaryActionMod.ListItemSecondaryActionProps
import typings.atMaterialDashUiCore.listItemSecondaryActionMod.default
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, style */
object ListItemSecondaryAction
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.listItemSecondaryActionMod.default].asInstanceOf[String | js.Object]
  def apply(
    classes: PartialClassNameMapListItemSecondaryActionClassKey = null,
    innerRef: Ref[_] | RefObject[_] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ListItemSecondaryActionProps
}

