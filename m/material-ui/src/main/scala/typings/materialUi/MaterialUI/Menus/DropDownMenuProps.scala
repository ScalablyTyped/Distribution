package typings.materialUi.MaterialUI.Menus

import typings.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typings.materialUi.MaterialUI.propTypes.origin
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownMenuProps extends js.Object {
  // <div/> is the element that gets the 'other' properties
  var anchorOrigin: js.UndefOr[origin] = js.native
  var animated: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.native
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var iconButton: js.UndefOr[ReactNode] = js.native
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  var listStyle: js.UndefOr[CSSProperties] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var menuItemStyle: js.UndefOr[CSSProperties] = js.native
  var menuStyle: js.UndefOr[CSSProperties] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[
    js.Function3[
      /* e */ SyntheticEvent[js.Object, Event], 
      /* index */ Double, 
      /* menuItemValue */ js.Any, 
      Unit
    ]
  ] = js.native
  var onClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[js.Object, Event], Unit]] = js.native
  var openImmediately: js.UndefOr[Boolean] = js.native
  var selectedMenuItemStyle: js.UndefOr[CSSProperties] = js.native
  var selectionRenderer: js.UndefOr[js.Function2[/* value */ js.Any, /* menuItem */ js.Any, Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var targetOrigin: js.UndefOr[origin] = js.native
  var underlineStyle: js.UndefOr[CSSProperties] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object DropDownMenuProps {
  @scala.inline
  def apply(): DropDownMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownMenuProps]
  }
  @scala.inline
  implicit class DropDownMenuPropsOps[Self <: DropDownMenuProps] (val x: Self) extends AnyVal {
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
    def setAnchorOrigin(value: origin): Self = this.set("anchorOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorOrigin: Self = this.set("anchorOrigin", js.undefined)
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setAnimation(value: ComponentClass[PopoverAnimationProps, ComponentState]): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIconButton(value: ReactNode): Self = this.set("iconButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconButton: Self = this.set("iconButton", js.undefined)
    @scala.inline
    def setIconStyle(value: CSSProperties): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
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
    def setMenuStyle(value: CSSProperties): Self = this.set("menuStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuStyle: Self = this.set("menuStyle", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* e */ SyntheticEvent[js.Object, Event], /* index */ Double, /* menuItemValue */ js.Any) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClose(value: /* e */ SyntheticEvent[js.Object, Event] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOpenImmediately(value: Boolean): Self = this.set("openImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenImmediately: Self = this.set("openImmediately", js.undefined)
    @scala.inline
    def setSelectedMenuItemStyle(value: CSSProperties): Self = this.set("selectedMenuItemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedMenuItemStyle: Self = this.set("selectedMenuItemStyle", js.undefined)
    @scala.inline
    def setSelectionRenderer(value: (/* value */ js.Any, /* menuItem */ js.Any) => Unit): Self = this.set("selectionRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSelectionRenderer: Self = this.set("selectionRenderer", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTargetOrigin(value: origin): Self = this.set("targetOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetOrigin: Self = this.set("targetOrigin", js.undefined)
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

