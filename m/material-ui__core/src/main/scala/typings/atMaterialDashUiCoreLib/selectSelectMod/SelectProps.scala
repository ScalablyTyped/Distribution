package typings
package atMaterialDashUiCoreLib.selectSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Input/Input.InputProps, 'classes' | 'value' | 'onChange'> ]: @material-ui/core.@material-ui/core/Input/Input.InputProps[P]}
- Dropped {[ P in 'onChange' ]: @material-ui/core.@material-ui/core/Select/SelectInput.SelectInputProps[P]} */ trait SelectProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SelectClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var IconComponent: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var MenuProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.menuMenuMod.MenuProps]] = js.undefined
  var SelectDisplayProps: js.UndefOr[reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement]] = js.undefined
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  var displayEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var input: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var native: js.UndefOr[scala.Boolean] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* event */ reactLib.reactMod.ChangeEvent[js.Object], scala.Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* event */ reactLib.reactMod.ChangeEvent[js.Object], scala.Unit]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var renderValue: js.UndefOr[
    js.Function1[
      /* value */ js.UndefOr[
        (js.Array[java.lang.String | scala.Double | scala.Boolean | js.Object]) | java.lang.String | scala.Double | scala.Boolean | js.Object
      ], 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
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
    IconComponent: reactLib.reactMod.ReactType[_] = null,
    MenuProps: stdLib.Partial[atMaterialDashUiCoreLib.menuMenuMod.MenuProps] = null,
    SelectDisplayProps: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    autoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[SelectClassKey]] = null,
    displayEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    input: reactLib.reactMod.ReactNode = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    native: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: /* event */ reactLib.reactMod.ChangeEvent[js.Object] => scala.Unit = null,
    onOpen: /* event */ reactLib.reactMod.ChangeEvent[js.Object] => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    renderValue: /* value */ js.UndefOr[
      (js.Array[java.lang.String | scala.Double | scala.Boolean | js.Object]) | java.lang.String | scala.Double | scala.Boolean | js.Object
    ] => reactLib.reactMod.ReactNode = null,
    style: reactLib.reactMod.CSSProperties = null,
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
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (renderValue != null) __obj.updateDynamic("renderValue")(js.Any.fromFunction1(renderValue))
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
}

