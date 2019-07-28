package typings.atMaterialDashUiCore.selectSelectInputMod

import typings.atMaterialDashUiCore.Anon_NodeValue
import typings.atMaterialDashUiCore.PartialMenuProps
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.filled
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.outlined
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.standard
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.std.HTMLDivElement
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectInputProps extends js.Object {
  var IconComponent: js.UndefOr[ReactType[_]] = js.undefined
  var MenuProps: js.UndefOr[PartialMenuProps] = js.undefined
  var SelectDisplayProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoWidth: Boolean
  var disabled: js.UndefOr[Boolean] = js.undefined
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLSelectElement | Anon_NodeValue, Unit]] = js.undefined
  var multiple: Boolean
  var name: js.UndefOr[String] = js.undefined
  var native: Boolean
  var onBlur: js.UndefOr[FocusEventHandler[_]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactNode, Unit]
  ] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[_]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var renderValue: js.UndefOr[
    js.Function1[
      /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]), 
      ReactNode
    ]
  ] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var value: String | Double | Boolean | (js.Array[String | Double | Boolean])
  var variant: js.UndefOr[standard | outlined | filled] = js.undefined
}

object SelectInputProps {
  @scala.inline
  def apply(
    autoWidth: Boolean,
    multiple: Boolean,
    native: Boolean,
    value: String | Double | Boolean | (js.Array[String | Double | Boolean]),
    IconComponent: ReactType[_] = null,
    MenuProps: PartialMenuProps = null,
    SelectDisplayProps: HTMLAttributes[HTMLDivElement] = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* ref */ HTMLSelectElement | Anon_NodeValue => Unit = null,
    name: String = null,
    onBlur: FocusEventHandler[_] = null,
    onChange: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactNode) => Unit = null,
    onClose: /* event */ ChangeEvent[js.Object] => Unit = null,
    onFocus: FocusEventHandler[_] = null,
    onOpen: /* event */ ChangeEvent[js.Object] => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderValue: /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]) => ReactNode = null,
    tabIndex: Int | Double = null,
    variant: standard | outlined | filled = null
  ): SelectInputProps = {
    val __obj = js.Dynamic.literal(autoWidth = autoWidth, multiple = multiple, native = native, value = value.asInstanceOf[js.Any])
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (MenuProps != null) __obj.updateDynamic("MenuProps")(MenuProps)
    if (SelectDisplayProps != null) __obj.updateDynamic("SelectDisplayProps")(SelectDisplayProps)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (renderValue != null) __obj.updateDynamic("renderValue")(js.Any.fromFunction1(renderValue))
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectInputProps]
  }
}

