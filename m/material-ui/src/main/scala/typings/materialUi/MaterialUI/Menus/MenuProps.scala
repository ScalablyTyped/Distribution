package typings.materialUi.MaterialUI.Menus

import typings.materialUi.MaterialUI.ReactLink
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuProps extends js.Object {
  // <List/> is the element that get the 'other' properties
  var autoWidth: js.UndefOr[Boolean] = js.native
  var desktop: js.UndefOr[Boolean] = js.native
  var disableAutoFocus: js.UndefOr[Boolean] = js.native
  var initiallyKeyboardFocused: js.UndefOr[Boolean] = js.native
  var listStyle: js.UndefOr[CSSProperties] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[js.Object, Event], /* itemValue */ js.Any | js.Array[_], Unit]
  ] = js.native
  var onEscKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
  var onItemClick: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[js.Object, Event], /* item */ MenuItem, Unit]
  ] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
  var selectedMenuItemStyle: js.UndefOr[CSSProperties] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var value: js.UndefOr[js.Any | js.Array[_]] = js.native
  var valueLink: js.UndefOr[ReactLink[_ | js.Array[_]]] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object MenuProps {
  @scala.inline
  def apply(): MenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuProps]
  }
  @scala.inline
  implicit class MenuPropsOps[Self <: MenuProps] (val x: Self) extends AnyVal {
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
    def setDesktop(value: Boolean): Self = this.set("desktop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    @scala.inline
    def setDisableAutoFocus(value: Boolean): Self = this.set("disableAutoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAutoFocus: Self = this.set("disableAutoFocus", js.undefined)
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
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setOnChange(value: (/* e */ SyntheticEvent[js.Object, Event], /* itemValue */ js.Any | js.Array[_]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnEscKeyDown(value: KeyboardEvent[js.Object] => Unit): Self = this.set("onEscKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEscKeyDown: Self = this.set("onEscKeyDown", js.undefined)
    @scala.inline
    def setOnItemClick(value: (/* e */ SyntheticEvent[js.Object, Event], /* item */ MenuItem) => Unit): Self = this.set("onItemClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[js.Object] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setSelectedMenuItemStyle(value: CSSProperties): Self = this.set("selectedMenuItemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedMenuItemStyle: Self = this.set("selectedMenuItemStyle", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Any | js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueLink(value: ReactLink[_ | js.Array[_]]): Self = this.set("valueLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueLink: Self = this.set("valueLink", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

