package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typings.materialDashUi.Anon_Text
import typings.materialDashUi.autoCompleteMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.AutoCompleteProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.origin
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FormEvent
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onBlur, name, onKeyDown, style, placeholder, autoFocus, onKeyUp, id, autoComplete, className, onFocus, disabled, onKeyPress, title, type, required, defaultValue, rows, value, open */
object AutoComplete
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.autoCompleteMod.default].asInstanceOf[String | js.Object]
  def apply[DataItem](
    dataSource: js.Array[DataItem],
    anchorOrigin: origin = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: ReactComponentClass[PopoverAnimationProps] = null,
    dataSourceConfig: Anon_Text = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    errorStyle: CSSProperties = null,
    errorText: ReactNode = null,
    filter: (/* searchText */ String, /* key */ String, /* item */ DataItem) => Boolean = null,
    floatingLabelFixed: js.UndefOr[Boolean] = js.undefined,
    floatingLabelFocusStyle: CSSProperties = null,
    floatingLabelShrinkStyle: CSSProperties = null,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: ReactNode = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: ReactNode = null,
    inputStyle: CSSProperties = null,
    listStyle: CSSProperties = null,
    max: Int | Double = null,
    maxSearchResults: Int | Double = null,
    maxlength: String = null,
    menuCloseDelay: Int | Double = null,
    menuProps: js.Any = null,
    menuStyle: CSSProperties = null,
    min: Int | Double = null,
    minlength: String = null,
    multiLine: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* e */ FormEvent[js.Object], /* newValue */ String) => Unit = null,
    onNewRequest: (/* chosenRequest */ DataItem, /* index */ Double) => Unit = null,
    onUpdateInput: (/* searchText */ String, /* dataSource */ js.Array[DataItem]) => Unit = null,
    openOnFocus: js.UndefOr[Boolean] = js.undefined,
    popoverProps: PopoverProps = null,
    rowsMax: Int | Double = null,
    searchText: String = null,
    step: Int | Double = null,
    targetOrigin: origin = null,
    textFieldStyle: CSSProperties = null,
    textareaStyle: CSSProperties = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    underlineStyle: CSSProperties = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource)
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (dataSourceConfig != null) __obj.updateDynamic("dataSourceConfig")(dataSourceConfig)
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle)
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3(filter))
    if (!js.isUndefined(floatingLabelFixed)) __obj.updateDynamic("floatingLabelFixed")(floatingLabelFixed)
    if (floatingLabelFocusStyle != null) __obj.updateDynamic("floatingLabelFocusStyle")(floatingLabelFocusStyle)
    if (floatingLabelShrinkStyle != null) __obj.updateDynamic("floatingLabelShrinkStyle")(floatingLabelShrinkStyle)
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle)
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle)
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxSearchResults != null) __obj.updateDynamic("maxSearchResults")(maxSearchResults.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength)
    if (menuCloseDelay != null) __obj.updateDynamic("menuCloseDelay")(menuCloseDelay.asInstanceOf[js.Any])
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps)
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength)
    if (!js.isUndefined(multiLine)) __obj.updateDynamic("multiLine")(multiLine)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onNewRequest != null) __obj.updateDynamic("onNewRequest")(js.Any.fromFunction2(onNewRequest))
    if (onUpdateInput != null) __obj.updateDynamic("onUpdateInput")(js.Any.fromFunction2(onUpdateInput))
    if (!js.isUndefined(openOnFocus)) __obj.updateDynamic("openOnFocus")(openOnFocus)
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps)
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (searchText != null) __obj.updateDynamic("searchText")(searchText)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin)
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle)
    if (textareaStyle != null) __obj.updateDynamic("textareaStyle")(textareaStyle)
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle)
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle)
    if (!js.isUndefined(underlineShow)) __obj.updateDynamic("underlineShow")(underlineShow)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AutoCompleteProps[js.Any]
}

