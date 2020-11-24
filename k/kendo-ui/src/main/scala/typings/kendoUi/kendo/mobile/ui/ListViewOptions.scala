package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListViewOptions extends js.Object {
  
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
  implicit class ListViewOptionsOps[Self <: ListViewOptions] (val x: Self) extends AnyVal {
    
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
    def setAppendOnRefresh(value: Boolean): Self = this.set("appendOnRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendOnRefresh: Self = this.set("appendOnRefresh", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    
    @scala.inline
    def setClick(value: /* e */ ListViewClickEvent => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setDataBinding(value: /* e */ ListViewEvent => Unit): Self = this.set("dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ ListViewEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource | js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setEndlessScroll(value: Boolean): Self = this.set("endlessScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndlessScroll: Self = this.set("endlessScroll", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean | ListViewFilterable): Self = this.set("filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    
    @scala.inline
    def setFixedHeaders(value: Boolean): Self = this.set("fixedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeaders: Self = this.set("fixedHeaders", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: String | js.Function): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    
    @scala.inline
    def setItemChange(value: /* e */ ListViewEvent => Unit): Self = this.set("itemChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemChange: Self = this.set("itemChange", js.undefined)
    
    @scala.inline
    def setLoadMore(value: Boolean): Self = this.set("loadMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadMore: Self = this.set("loadMore", js.undefined)
    
    @scala.inline
    def setMessages(value: ListViewMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPullParameters(value: js.Function): Self = this.set("pullParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullParameters: Self = this.set("pullParameters", js.undefined)
    
    @scala.inline
    def setPullToRefresh(value: Boolean): Self = this.set("pullToRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullToRefresh: Self = this.set("pullToRefresh", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVirtualViewSize(value: Double): Self = this.set("virtualViewSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualViewSize: Self = this.set("virtualViewSize", js.undefined)
  }
}
