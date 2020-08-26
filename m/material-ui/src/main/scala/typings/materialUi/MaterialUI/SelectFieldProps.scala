package typings.materialUi.MaterialUI

import typings.materialUi.MaterialUI.Menus.DropDownMenuProps
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectFieldProps extends js.Object {
  // <DropDownMenu/> is the element that get the 'other' properties
  var autoWidth: js.UndefOr[Boolean] = js.native
  // useful attributes passed to <DropDownMenu/>
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dropDownMenuProps: js.UndefOr[DropDownMenuProps] = js.native
  var errorStyle: js.UndefOr[CSSProperties] = js.native
  var errorText: js.UndefOr[ReactNode] = js.native
  var floatingLabelFixed: js.UndefOr[Boolean] = js.native
  var floatingLabelStyle: js.UndefOr[CSSProperties] = js.native
  var floatingLabelText: js.UndefOr[ReactNode] = js.native
  var fullWidth: js.UndefOr[Boolean] = js.native
  var hintStyle: js.UndefOr[CSSProperties] = js.native
  var hintText: js.UndefOr[ReactNode] = js.native
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  var id: js.UndefOr[String] = js.native
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  var listStyle: js.UndefOr[CSSProperties] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var menuItemStyle: js.UndefOr[CSSProperties] = js.native
  var menuStyle: js.UndefOr[js.Any] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  var onChange: js.UndefOr[
    js.Function3[
      /* e */ SyntheticEvent[js.Object, Event], 
      /* index */ Double, 
      /* menuItemValue */ js.Any, 
      Unit
    ]
  ] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  var openImmediately: js.UndefOr[Boolean] = js.native
  var selectFieldRoot: js.UndefOr[CSSProperties] = js.native
  var selectedMenuItemStyle: js.UndefOr[CSSProperties] = js.native
  var selectionRenderer: js.UndefOr[js.Function1[/* value */ js.Any, ReactNode]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var underlineDisabledStyle: js.UndefOr[CSSProperties] = js.native
  var underlineFocusStyle: js.UndefOr[CSSProperties] = js.native
  var underlineStyle: js.UndefOr[CSSProperties] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object SelectFieldProps {
  @scala.inline
  def apply(): SelectFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectFieldProps]
  }
  @scala.inline
  implicit class SelectFieldPropsOps[Self <: SelectFieldProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoWidth(value: Boolean): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoWidth: Self = this.set("autoWidth", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDropDownMenuProps(value: DropDownMenuProps): Self = this.set("dropDownMenuProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownMenuProps: Self = this.set("dropDownMenuProps", js.undefined)
    @scala.inline
    def setErrorStyle(value: CSSProperties): Self = this.set("errorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorStyle: Self = this.set("errorStyle", js.undefined)
    @scala.inline
    def setErrorText(value: ReactNode): Self = this.set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorText: Self = this.set("errorText", js.undefined)
    @scala.inline
    def setFloatingLabelFixed(value: Boolean): Self = this.set("floatingLabelFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingLabelFixed: Self = this.set("floatingLabelFixed", js.undefined)
    @scala.inline
    def setFloatingLabelStyle(value: CSSProperties): Self = this.set("floatingLabelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingLabelStyle: Self = this.set("floatingLabelStyle", js.undefined)
    @scala.inline
    def setFloatingLabelText(value: ReactNode): Self = this.set("floatingLabelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingLabelText: Self = this.set("floatingLabelText", js.undefined)
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setHintStyle(value: CSSProperties): Self = this.set("hintStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHintStyle: Self = this.set("hintStyle", js.undefined)
    @scala.inline
    def setHintText(value: ReactNode): Self = this.set("hintText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHintText: Self = this.set("hintText", js.undefined)
    @scala.inline
    def setIconStyle(value: CSSProperties): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setListStyle(value: CSSProperties): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStyle: Self = this.set("listStyle", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMenuItemStyle(value: CSSProperties): Self = this.set("menuItemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItemStyle: Self = this.set("menuItemStyle", js.undefined)
    @scala.inline
    def setMenuStyle(value: js.Any): Self = this.set("menuStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuStyle: Self = this.set("menuStyle", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnBlur(value: FocusEvent[js.Object] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* e */ SyntheticEvent[js.Object, Event], /* index */ Double, /* menuItemValue */ js.Any) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnFocus(value: FocusEvent[js.Object] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOpenImmediately(value: Boolean): Self = this.set("openImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenImmediately: Self = this.set("openImmediately", js.undefined)
    @scala.inline
    def setSelectFieldRoot(value: CSSProperties): Self = this.set("selectFieldRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectFieldRoot: Self = this.set("selectFieldRoot", js.undefined)
    @scala.inline
    def setSelectedMenuItemStyle(value: CSSProperties): Self = this.set("selectedMenuItemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedMenuItemStyle: Self = this.set("selectedMenuItemStyle", js.undefined)
    @scala.inline
    def setSelectionRenderer(value: /* value */ js.Any => ReactNode): Self = this.set("selectionRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectionRenderer: Self = this.set("selectionRenderer", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUnderlineDisabledStyle(value: CSSProperties): Self = this.set("underlineDisabledStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineDisabledStyle: Self = this.set("underlineDisabledStyle", js.undefined)
    @scala.inline
    def setUnderlineFocusStyle(value: CSSProperties): Self = this.set("underlineFocusStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineFocusStyle: Self = this.set("underlineFocusStyle", js.undefined)
    @scala.inline
    def setUnderlineStyle(value: CSSProperties): Self = this.set("underlineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineStyle: Self = this.set("underlineStyle", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

