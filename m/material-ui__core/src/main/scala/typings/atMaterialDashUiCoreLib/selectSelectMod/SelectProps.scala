package typings
package atMaterialDashUiCoreLib.selectSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Input.InputProps, 'classes' | 'value' | 'onChange'> ]: @material-ui/core.@material-ui/core/Input.InputProps[P]}
- Dropped {[ P in 'onChange' ]: @material-ui/core.@material-ui/core/Select/SelectInput.SelectInputProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/Input.InputProps, @material-ui/core.@material-ui/core/Select/Select.SelectClassKey, 'value' | 'onChange'>) */ trait SelectProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SelectClassKey] {
  var IconComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var MenuProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.menuMenuMod.MenuProps]] = js.undefined
  var SelectDisplayProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement]] = js.undefined
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var displayEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var input: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var native: js.UndefOr[scala.Boolean] = js.undefined
  var onClose: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit]
  ] = js.undefined
  var onOpen: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit]
  ] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var renderValue: js.UndefOr[
    js.Function1[
      /* value */ js.UndefOr[
        (js.Array[java.lang.String | scala.Double | scala.Boolean | js.Object]) | java.lang.String | scala.Double | scala.Boolean | js.Object
      ], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[
    (js.Array[java.lang.String | scala.Double | scala.Boolean | js.Object]) | java.lang.String | scala.Double | scala.Boolean | js.Object
  ] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled
  ] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply(
    IconComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    MenuProps: stdLib.Partial[atMaterialDashUiCoreLib.menuMenuMod.MenuProps] = null,
    SelectDisplayProps: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] = null,
    autoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[SelectClassKey]] = null,
    displayEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    input: reactLib.reactMod.ReactNs.ReactNode = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    native: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit] = null,
    onOpen: js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    renderValue: js.Function1[
      /* value */ js.UndefOr[
        (js.Array[java.lang.String | scala.Double | scala.Boolean | js.Object]) | java.lang.String | scala.Double | scala.Boolean | js.Object
      ], 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    value: (js.Array[java.lang.String | scala.Double | scala.Boolean | js.Object]) | java.lang.String | scala.Double | scala.Boolean | js.Object = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled = null
  ): SelectProps = {
    val __obj = js.Dynamic.literal()
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (MenuProps != null) __obj.updateDynamic("MenuProps")(MenuProps)
    if (SelectDisplayProps != null) __obj.updateDynamic("SelectDisplayProps")(SelectDisplayProps)
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(displayEmpty)) __obj.updateDynamic("displayEmpty")(displayEmpty)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (renderValue != null) __obj.updateDynamic("renderValue")(renderValue)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
}

