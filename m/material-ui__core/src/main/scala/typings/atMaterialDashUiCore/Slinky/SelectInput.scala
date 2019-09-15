package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.Anon_NodeValue
import typings.atMaterialDashUiCore.PartialMenuProps
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.filled
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.outlined
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.standard
import typings.atMaterialDashUiCore.selectSelectInputMod.SelectInputProps
import typings.atMaterialDashUiCore.selectSelectInputMod.default
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onBlur, name, tabIndex, readOnly, open, autoFocus, onFocus, disabled, multiple, value */
object SelectInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.selectSelectInputMod.default].asInstanceOf[String | js.Object]
  def apply(
    autoWidth: Boolean,
    native: Boolean,
    IconComponent: ReactComponentClass[_] = null,
    MenuProps: PartialMenuProps = null,
    SelectDisplayProps: HTMLAttributes[HTMLDivElement] = null,
    inputRef: /* ref */ HTMLSelectElement | Anon_NodeValue => Unit = null,
    onChange: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ TagMod[Any]) => Unit = null,
    onClose: /* event */ ChangeEvent[js.Object] => Unit = null,
    onOpen: /* event */ ChangeEvent[js.Object] => Unit = null,
    renderValue: /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]) => TagMod[Any] = null,
    variant: standard | outlined | filled = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(autoWidth = autoWidth, native = native)
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent)
    if (MenuProps != null) __obj.updateDynamic("MenuProps")(MenuProps)
    if (SelectDisplayProps != null) __obj.updateDynamic("SelectDisplayProps")(SelectDisplayProps)
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (renderValue != null) __obj.updateDynamic("renderValue")(js.Any.fromFunction1(renderValue))
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SelectInputProps
}

