package typings.materialUi.MaterialUI

import typings.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typings.materialUi.MaterialUI.Popover.PopoverProps
import typings.materialUi.MaterialUI.propTypes.origin
import typings.materialUi.anon.Text
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoCompleteProps[DataItem] extends TextFieldProps {
  var anchorOrigin: js.UndefOr[origin] = js.native
  var animated: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.native
  var dataSource: js.Array[DataItem] = js.native
  var dataSourceConfig: js.UndefOr[Text] = js.native
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[
    js.Function3[/* searchText */ String, /* key */ String, /* item */ DataItem, Boolean]
  ] = js.native
  var listStyle: js.UndefOr[CSSProperties] = js.native
  var maxSearchResults: js.UndefOr[Double] = js.native
  var menuCloseDelay: js.UndefOr[Double] = js.native
  var menuProps: js.UndefOr[js.Any] = js.native
  var menuStyle: js.UndefOr[CSSProperties] = js.native
  var onNewRequest: js.UndefOr[js.Function2[/* chosenRequest */ DataItem, /* index */ Double, Unit]] = js.native
  var onUpdateInput: js.UndefOr[js.Function2[/* searchText */ String, /* dataSource */ js.Array[DataItem], Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var openOnFocus: js.UndefOr[Boolean] = js.native
  var popoverProps: js.UndefOr[PopoverProps] = js.native
  var searchText: js.UndefOr[String] = js.native
  var targetOrigin: js.UndefOr[origin] = js.native
  var textFieldStyle: js.UndefOr[CSSProperties] = js.native
}

object AutoCompleteProps {
  @scala.inline
  def apply[DataItem](dataSource: js.Array[DataItem]): AutoCompleteProps[DataItem] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteProps[DataItem]]
  }
  @scala.inline
  implicit class AutoCompletePropsOps[Self <: AutoCompleteProps[_], DataItem] (val x: Self with AutoCompleteProps[DataItem]) extends AnyVal {
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
    def setDataSourceVarargs(value: DataItem*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[DataItem]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
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
    def setDataSourceConfig(value: Text): Self = this.set("dataSourceConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceConfig: Self = this.set("dataSourceConfig", js.undefined)
    @scala.inline
    def setDisableFocusRipple(value: Boolean): Self = this.set("disableFocusRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFocusRipple: Self = this.set("disableFocusRipple", js.undefined)
    @scala.inline
    def setFilter(value: (/* searchText */ String, /* key */ String, /* item */ DataItem) => Boolean): Self = this.set("filter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setListStyle(value: CSSProperties): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStyle: Self = this.set("listStyle", js.undefined)
    @scala.inline
    def setMaxSearchResults(value: Double): Self = this.set("maxSearchResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSearchResults: Self = this.set("maxSearchResults", js.undefined)
    @scala.inline
    def setMenuCloseDelay(value: Double): Self = this.set("menuCloseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuCloseDelay: Self = this.set("menuCloseDelay", js.undefined)
    @scala.inline
    def setMenuProps(value: js.Any): Self = this.set("menuProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuProps: Self = this.set("menuProps", js.undefined)
    @scala.inline
    def setMenuStyle(value: CSSProperties): Self = this.set("menuStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuStyle: Self = this.set("menuStyle", js.undefined)
    @scala.inline
    def setOnNewRequest(value: (/* chosenRequest */ DataItem, /* index */ Double) => Unit): Self = this.set("onNewRequest", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnNewRequest: Self = this.set("onNewRequest", js.undefined)
    @scala.inline
    def setOnUpdateInput(value: (/* searchText */ String, /* dataSource */ js.Array[DataItem]) => Unit): Self = this.set("onUpdateInput", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUpdateInput: Self = this.set("onUpdateInput", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOpenOnFocus(value: Boolean): Self = this.set("openOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenOnFocus: Self = this.set("openOnFocus", js.undefined)
    @scala.inline
    def setPopoverProps(value: PopoverProps): Self = this.set("popoverProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopoverProps: Self = this.set("popoverProps", js.undefined)
    @scala.inline
    def setSearchText(value: String): Self = this.set("searchText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchText: Self = this.set("searchText", js.undefined)
    @scala.inline
    def setTargetOrigin(value: origin): Self = this.set("targetOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetOrigin: Self = this.set("targetOrigin", js.undefined)
    @scala.inline
    def setTextFieldStyle(value: CSSProperties): Self = this.set("textFieldStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextFieldStyle: Self = this.set("textFieldStyle", js.undefined)
  }
  
}

