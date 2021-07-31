package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewOptions extends StObject {
  
  var altTemplate: js.UndefOr[js.Function] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var cancel: js.UndefOr[js.Function1[/* e */ ListViewCancelEvent, Unit]] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  
  var edit: js.UndefOr[js.Function1[/* e */ ListViewEditEvent, Unit]] = js.undefined
  
  var editTemplate: js.UndefOr[js.Function] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var navigatable: js.UndefOr[Boolean] = js.undefined
  
  var remove: js.UndefOr[js.Function1[/* e */ ListViewRemoveEvent, Unit]] = js.undefined
  
  var save: js.UndefOr[js.Function1[/* e */ ListViewSaveEvent, Unit]] = js.undefined
  
  var scrollable: js.UndefOr[Boolean | String] = js.undefined
  
  var selectable: js.UndefOr[Boolean | String] = js.undefined
  
  var template: js.UndefOr[js.Function] = js.undefined
}
object ListViewOptions {
  
  @scala.inline
  def apply(): ListViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewOptions]
  }
  
  @scala.inline
  implicit class ListViewOptionsMutableBuilder[Self <: ListViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltTemplate(value: js.Function): Self = StObject.set(x, "altTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTemplateUndefined: Self = StObject.set(x, "altTemplate", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setCancel(value: /* e */ ListViewCancelEvent => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ListViewEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setDataBinding(value: /* e */ ListViewEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ ListViewEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setEdit(value: /* e */ ListViewEditEvent => Unit): Self = StObject.set(x, "edit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEditTemplate(value: js.Function): Self = StObject.set(x, "editTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditTemplateUndefined: Self = StObject.set(x, "editTemplate", js.undefined)
    
    @scala.inline
    def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNavigatable(value: Boolean): Self = StObject.set(x, "navigatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatableUndefined: Self = StObject.set(x, "navigatable", js.undefined)
    
    @scala.inline
    def setRemove(value: /* e */ ListViewRemoveEvent => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setSave(value: /* e */ ListViewSaveEvent => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean | String): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean | String): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setTemplate(value: js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
