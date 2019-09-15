package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.selectFieldMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.MenusNs.DropDownMenuProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.SelectFieldProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onBlur, name, style, id, className, onFocus, disabled, multiple */
object SelectField
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.selectFieldMod.default].asInstanceOf[String | js.Object]
  def apply(
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    dropDownMenuProps: DropDownMenuProps = null,
    errorStyle: CSSProperties = null,
    errorText: TagMod[Any] = null,
    floatingLabelFixed: js.UndefOr[Boolean] = js.undefined,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: TagMod[Any] = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: TagMod[Any] = null,
    iconStyle: CSSProperties = null,
    labelStyle: CSSProperties = null,
    listStyle: CSSProperties = null,
    maxHeight: Int | Double = null,
    menuItemStyle: CSSProperties = null,
    menuStyle: js.Any = null,
    onChange: (/* e */ SyntheticEvent[js.Object, typings.react.Event], /* index */ Double, /* menuItemValue */ js.Any) => Unit = null,
    openImmediately: js.UndefOr[Boolean] = js.undefined,
    selectFieldRoot: CSSProperties = null,
    selectedMenuItemStyle: CSSProperties = null,
    selectionRenderer: /* value */ js.Any => TagMod[Any] = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineStyle: CSSProperties = null,
    value: js.Any = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (dropDownMenuProps != null) __obj.updateDynamic("dropDownMenuProps")(dropDownMenuProps)
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle)
    if (errorText != null) __obj.updateDynamic("errorText")(errorText)
    if (!js.isUndefined(floatingLabelFixed)) __obj.updateDynamic("floatingLabelFixed")(floatingLabelFixed)
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle)
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle)
    if (hintText != null) __obj.updateDynamic("hintText")(hintText)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (menuItemStyle != null) __obj.updateDynamic("menuItemStyle")(menuItemStyle)
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (!js.isUndefined(openImmediately)) __obj.updateDynamic("openImmediately")(openImmediately)
    if (selectFieldRoot != null) __obj.updateDynamic("selectFieldRoot")(selectFieldRoot)
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle)
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction1(selectionRenderer))
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle)
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SelectFieldProps
}

