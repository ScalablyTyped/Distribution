package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewOptions extends StObject {
  
  var appendOnRefresh: js.UndefOr[Boolean] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var click: js.UndefOr[js.Function1[/* e */ ListViewClickEvent, Unit]] = js.undefined
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[DataSource | Any] = js.undefined
  
  var endlessScroll: js.UndefOr[Boolean] = js.undefined
  
  var filterable: js.UndefOr[Boolean | ListViewFilterable] = js.undefined
  
  var fixedHeaders: js.UndefOr[Boolean] = js.undefined
  
  var headerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var itemChange: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  
  var loadMore: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[ListViewMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pullParameters: js.UndefOr[js.Function] = js.undefined
  
  var pullToRefresh: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var virtualViewSize: js.UndefOr[Double] = js.undefined
}
object ListViewOptions {
  
  inline def apply(): ListViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListViewOptions] (val x: Self) extends AnyVal {
    
    inline def setAppendOnRefresh(value: Boolean): Self = StObject.set(x, "appendOnRefresh", value.asInstanceOf[js.Any])
    
    inline def setAppendOnRefreshUndefined: Self = StObject.set(x, "appendOnRefresh", js.undefined)
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setClick(value: /* e */ ListViewClickEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setDataBinding(value: /* e */ ListViewEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: /* e */ ListViewEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: DataSource | Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setEndlessScroll(value: Boolean): Self = StObject.set(x, "endlessScroll", value.asInstanceOf[js.Any])
    
    inline def setEndlessScrollUndefined: Self = StObject.set(x, "endlessScroll", js.undefined)
    
    inline def setFilterable(value: Boolean | ListViewFilterable): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    inline def setFixedHeaders(value: Boolean): Self = StObject.set(x, "fixedHeaders", value.asInstanceOf[js.Any])
    
    inline def setFixedHeadersUndefined: Self = StObject.set(x, "fixedHeaders", js.undefined)
    
    inline def setHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    inline def setItemChange(value: /* e */ ListViewEvent => Unit): Self = StObject.set(x, "itemChange", js.Any.fromFunction1(value))
    
    inline def setItemChangeUndefined: Self = StObject.set(x, "itemChange", js.undefined)
    
    inline def setLoadMore(value: Boolean): Self = StObject.set(x, "loadMore", value.asInstanceOf[js.Any])
    
    inline def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
    
    inline def setMessages(value: ListViewMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPullParameters(value: js.Function): Self = StObject.set(x, "pullParameters", value.asInstanceOf[js.Any])
    
    inline def setPullParametersUndefined: Self = StObject.set(x, "pullParameters", js.undefined)
    
    inline def setPullToRefresh(value: Boolean): Self = StObject.set(x, "pullToRefresh", value.asInstanceOf[js.Any])
    
    inline def setPullToRefreshUndefined: Self = StObject.set(x, "pullToRefresh", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVirtualViewSize(value: Double): Self = StObject.set(x, "virtualViewSize", value.asInstanceOf[js.Any])
    
    inline def setVirtualViewSizeUndefined: Self = StObject.set(x, "virtualViewSize", js.undefined)
  }
}
