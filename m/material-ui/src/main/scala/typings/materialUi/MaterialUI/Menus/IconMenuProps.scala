package typings.materialUi.MaterialUI.Menus

import typings.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typings.materialUi.MaterialUI.propTypes.origin
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FocusEvent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconMenuProps extends js.Object {
  // <Menu/> is the element that get the 'other' properties
  var anchorOrigin: js.UndefOr[origin] = js.native
  var animated: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.native
  // Other properties from <Menu/>
  var autoWidth: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var clickCloseDelay: js.UndefOr[Double] = js.native
  var desktop: js.UndefOr[Boolean] = js.native
  var disableAutoFocus: js.UndefOr[Boolean] = js.native
  var iconButtonElement: ReactElement = js.native
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  var initiallyKeyboardFocused: js.UndefOr[Boolean] = js.native
  var listStyle: js.UndefOr[CSSProperties] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var menuStyle: js.UndefOr[CSSProperties] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[js.Object, Event], /* itemValue */ js.Any | js.Array[_], Unit]
  ] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[js.Object, Event], Unit]] = js.native
  var onItemClick: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[js.Object, Event], /* item */ MenuItem, Unit]
  ] = js.native
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onRequestChange: js.UndefOr[js.Function2[/* opening */ Boolean, /* reason */ String, Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var targetOrigin: js.UndefOr[origin] = js.native
  var useLayerForClickAway: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[js.Any | js.Array[_]] = js.native
}

object IconMenuProps {
  @scala.inline
  def apply(iconButtonElement: ReactElement): IconMenuProps = {
    val __obj = js.Dynamic.literal(iconButtonElement = iconButtonElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconMenuProps]
  }
  @scala.inline
  implicit class IconMenuPropsOps[Self <: IconMenuProps] (val x: Self) extends AnyVal {
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
    def setIconButtonElement(value: ReactElement): Self = this.set("iconButtonElement", value.asInstanceOf[js.Any])
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
    def setAutoWidth(value: Boolean): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoWidth: Self = this.set("autoWidth", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClickCloseDelay(value: Double): Self = this.set("clickCloseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickCloseDelay: Self = this.set("clickCloseDelay", js.undefined)
    @scala.inline
    def setDesktop(value: Boolean): Self = this.set("desktop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    @scala.inline
    def setDisableAutoFocus(value: Boolean): Self = this.set("disableAutoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAutoFocus: Self = this.set("disableAutoFocus", js.undefined)
    @scala.inline
    def setIconStyle(value: CSSProperties): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setInitiallyKeyboardFocused(value: Boolean): Self = this.set("initiallyKeyboardFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitiallyKeyboardFocused: Self = this.set("initiallyKeyboardFocused", js.undefined)
    @scala.inline
    def setListStyle(value: CSSProperties): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStyle: Self = this.set("listStyle", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMenuStyle(value: CSSProperties): Self = this.set("menuStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuStyle: Self = this.set("menuStyle", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setOnChange(value: (/* e */ SyntheticEvent[js.Object, Event], /* itemValue */ js.Any | js.Array[_]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClick(value: /* e */ SyntheticEvent[js.Object, Event] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnItemClick(value: (/* e */ SyntheticEvent[js.Object, Event], /* item */ MenuItem) => Unit): Self = this.set("onItemClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    @scala.inline
    def setOnKeyboardFocus(value: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): Self = this.set("onKeyboardFocus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnKeyboardFocus: Self = this.set("onKeyboardFocus", js.undefined)
    @scala.inline
    def setOnMouseDown(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseUp(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnRequestChange(value: (/* opening */ Boolean, /* reason */ String) => Unit): Self = this.set("onRequestChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRequestChange: Self = this.set("onRequestChange", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTargetOrigin(value: origin): Self = this.set("targetOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetOrigin: Self = this.set("targetOrigin", js.undefined)
    @scala.inline
    def setUseLayerForClickAway(value: Boolean): Self = this.set("useLayerForClickAway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLayerForClickAway: Self = this.set("useLayerForClickAway", js.undefined)
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Any | js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

