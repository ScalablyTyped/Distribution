package typings.materialUi.MaterialUI

import typings.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typings.materialUi.MaterialUI.Popover.PopoverProps
import typings.materialUi.MaterialUI.propTypes.origin
import typings.materialUi.anon.Text
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCompleteProps[DataItem]
  extends StObject
     with TextFieldProps {
  
  var anchorOrigin: js.UndefOr[origin] = js.undefined
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.undefined
  
  var dataSource: js.Array[DataItem]
  
  var dataSourceConfig: js.UndefOr[Text] = js.undefined
  
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[
    js.Function3[/* searchText */ String, /* key */ String, /* item */ DataItem, Boolean]
  ] = js.undefined
  
  var listStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var maxSearchResults: js.UndefOr[Double] = js.undefined
  
  var menuCloseDelay: js.UndefOr[Double] = js.undefined
  
  var menuProps: js.UndefOr[js.Any] = js.undefined
  
  var menuStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var onNewRequest: js.UndefOr[js.Function2[/* chosenRequest */ DataItem, /* index */ Double, Unit]] = js.undefined
  
  var onUpdateInput: js.UndefOr[js.Function2[/* searchText */ String, /* dataSource */ js.Array[DataItem], Unit]] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var openOnFocus: js.UndefOr[Boolean] = js.undefined
  
  var popoverProps: js.UndefOr[PopoverProps] = js.undefined
  
  var searchText: js.UndefOr[String] = js.undefined
  
  var targetOrigin: js.UndefOr[origin] = js.undefined
  
  var textFieldStyle: js.UndefOr[CSSProperties] = js.undefined
}
object AutoCompleteProps {
  
  @scala.inline
  def apply[DataItem](dataSource: js.Array[DataItem]): AutoCompleteProps[DataItem] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteProps[DataItem]]
  }
  
  @scala.inline
  implicit class AutoCompletePropsMutableBuilder[Self <: AutoCompleteProps[?], DataItem] (val x: Self & AutoCompleteProps[DataItem]) extends AnyVal {
    
    @scala.inline
    def setAnchorOrigin(value: origin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setAnimation(value: ComponentClass[PopoverAnimationProps, ComponentState]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Array[DataItem]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceConfig(value: Text): Self = StObject.set(x, "dataSourceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceConfigUndefined: Self = StObject.set(x, "dataSourceConfig", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: DataItem*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    @scala.inline
    def setFilter(value: (/* searchText */ String, /* key */ String, /* item */ DataItem) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setListStyle(value: CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
    
    @scala.inline
    def setMaxSearchResults(value: Double): Self = StObject.set(x, "maxSearchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSearchResultsUndefined: Self = StObject.set(x, "maxSearchResults", js.undefined)
    
    @scala.inline
    def setMenuCloseDelay(value: Double): Self = StObject.set(x, "menuCloseDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuCloseDelayUndefined: Self = StObject.set(x, "menuCloseDelay", js.undefined)
    
    @scala.inline
    def setMenuProps(value: js.Any): Self = StObject.set(x, "menuProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuPropsUndefined: Self = StObject.set(x, "menuProps", js.undefined)
    
    @scala.inline
    def setMenuStyle(value: CSSProperties): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
    
    @scala.inline
    def setOnNewRequest(value: (/* chosenRequest */ DataItem, /* index */ Double) => Unit): Self = StObject.set(x, "onNewRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnNewRequestUndefined: Self = StObject.set(x, "onNewRequest", js.undefined)
    
    @scala.inline
    def setOnUpdateInput(value: (/* searchText */ String, /* dataSource */ js.Array[DataItem]) => Unit): Self = StObject.set(x, "onUpdateInput", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUpdateInputUndefined: Self = StObject.set(x, "onUpdateInput", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenOnFocus(value: Boolean): Self = StObject.set(x, "openOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenOnFocusUndefined: Self = StObject.set(x, "openOnFocus", js.undefined)
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setPopoverProps(value: PopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
    
    @scala.inline
    def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    @scala.inline
    def setTargetOrigin(value: origin): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
    
    @scala.inline
    def setTextFieldStyle(value: CSSProperties): Self = StObject.set(x, "textFieldStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFieldStyleUndefined: Self = StObject.set(x, "textFieldStyle", js.undefined)
  }
}
