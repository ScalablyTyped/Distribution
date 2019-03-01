package typings
package atMaterialDashUiCoreLib.selectSelectInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectInputProps extends js.Object {
  var IconComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var MenuProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.menuMenuMod.MenuProps]] = js.undefined
  var SelectDisplayProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement]] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var autoWidth: scala.Boolean
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var inputRef: js.UndefOr[
    js.Function1[
      /* ref */ reactLib.HTMLSelectElement | atMaterialDashUiCoreLib.Anon_NodeValue, 
      scala.Unit
    ]
  ] = js.undefined
  var multiple: scala.Boolean
  var name: js.UndefOr[java.lang.String] = js.undefined
  var native: scala.Boolean
  var onBlur: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[_]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLSelectElement], 
      /* child */ reactLib.reactMod.ReactNs.ReactNode, 
      scala.Unit
    ]
  ] = js.undefined
  var onClose: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit]
  ] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[_]] = js.undefined
  var onOpen: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit]
  ] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var renderValue: js.UndefOr[
    js.Function1[
      /* value */ java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double | scala.Boolean]), 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var value: java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double | scala.Boolean])
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled
  ] = js.undefined
}

object SelectInputProps {
  @scala.inline
  def apply(
    autoWidth: scala.Boolean,
    multiple: scala.Boolean,
    native: scala.Boolean,
    value: java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double | scala.Boolean]),
    IconComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    MenuProps: stdLib.Partial[atMaterialDashUiCoreLib.menuMenuMod.MenuProps] = null,
    SelectDisplayProps: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    inputRef: js.Function1[
      /* ref */ reactLib.HTMLSelectElement | atMaterialDashUiCoreLib.Anon_NodeValue, 
      scala.Unit
    ] = null,
    name: java.lang.String = null,
    onBlur: reactLib.reactMod.ReactNs.FocusEventHandler[_] = null,
    onChange: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLSelectElement], 
      /* child */ reactLib.reactMod.ReactNs.ReactNode, 
      scala.Unit
    ] = null,
    onClose: js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit] = null,
    onFocus: reactLib.reactMod.ReactNs.FocusEventHandler[_] = null,
    onOpen: js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    renderValue: js.Function1[
      /* value */ java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double | scala.Boolean]), 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    tabIndex: scala.Int | scala.Double = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled = null
  ): SelectInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoWidth")(autoWidth)
    __obj.updateDynamic("multiple")(multiple)
    __obj.updateDynamic("native")(native)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (MenuProps != null) __obj.updateDynamic("MenuProps")(MenuProps)
    if (SelectDisplayProps != null) __obj.updateDynamic("SelectDisplayProps")(SelectDisplayProps)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (renderValue != null) __obj.updateDynamic("renderValue")(renderValue)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectInputProps]
  }
}

