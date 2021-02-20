package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListViewOptions extends StObject {
  
  var appendOnRefresh: js.UndefOr[Boolean] = js.native
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var click: js.UndefOr[js.Function1[/* e */ ListViewClickEvent, Unit]] = js.native
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[DataSource | js.Any] = js.native
  
  var endlessScroll: js.UndefOr[Boolean] = js.native
  
  var filterable: js.UndefOr[Boolean | ListViewFilterable] = js.native
  
  var fixedHeaders: js.UndefOr[Boolean] = js.native
  
  var headerTemplate: js.UndefOr[String | js.Function] = js.native
  
  var itemChange: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.native
  
  var loadMore: js.UndefOr[Boolean] = js.native
  
  var messages: js.UndefOr[ListViewMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pullParameters: js.UndefOr[js.Function] = js.native
  
  var pullToRefresh: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var virtualViewSize: js.UndefOr[Double] = js.native
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
    def setAppendOnRefresh(value: Boolean): Self = StObject.set(x, "appendOnRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendOnRefreshUndefined: Self = StObject.set(x, "appendOnRefresh", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setClick(value: /* e */ ListViewClickEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setDataBinding(value: /* e */ ListViewEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ ListViewEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource | js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setEndlessScroll(value: Boolean): Self = StObject.set(x, "endlessScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndlessScrollUndefined: Self = StObject.set(x, "endlessScroll", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean | ListViewFilterable): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    @scala.inline
    def setFixedHeaders(value: Boolean): Self = StObject.set(x, "fixedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedHeadersUndefined: Self = StObject.set(x, "fixedHeaders", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    @scala.inline
    def setItemChange(value: /* e */ ListViewEvent => Unit): Self = StObject.set(x, "itemChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemChangeUndefined: Self = StObject.set(x, "itemChange", js.undefined)
    
    @scala.inline
    def setLoadMore(value: Boolean): Self = StObject.set(x, "loadMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
    
    @scala.inline
    def setMessages(value: ListViewMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPullParameters(value: js.Function): Self = StObject.set(x, "pullParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullParametersUndefined: Self = StObject.set(x, "pullParameters", js.undefined)
    
    @scala.inline
    def setPullToRefresh(value: Boolean): Self = StObject.set(x, "pullToRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullToRefreshUndefined: Self = StObject.set(x, "pullToRefresh", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVirtualViewSize(value: Double): Self = StObject.set(x, "virtualViewSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualViewSizeUndefined: Self = StObject.set(x, "virtualViewSize", js.undefined)
  }
}
