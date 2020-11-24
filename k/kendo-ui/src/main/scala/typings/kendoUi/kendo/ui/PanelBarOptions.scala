package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.HierarchicalDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelBarOptions extends js.Object {
  
  var activate: js.UndefOr[js.Function1[/* e */ PanelBarActivateEvent, Unit]] = js.native
  
  var animation: js.UndefOr[Boolean | PanelBarAnimation] = js.native
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var collapse: js.UndefOr[js.Function1[/* e */ PanelBarCollapseEvent, Unit]] = js.native
  
  var contentLoad: js.UndefOr[js.Function1[/* e */ PanelBarContentLoadEvent, Unit]] = js.native
  
  var contentUrls: js.UndefOr[js.Any] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ PanelBarDataBoundEvent, Unit]] = js.native
  
  var dataImageUrlField: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.native
  
  var dataSpriteCssClassField: js.UndefOr[String] = js.native
  
  var dataTextField: js.UndefOr[String | js.Any] = js.native
  
  var dataUrlField: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[js.Function1[/* e */ PanelBarErrorEvent, Unit]] = js.native
  
  var expand: js.UndefOr[js.Function1[/* e */ PanelBarExpandEvent, Unit]] = js.native
  
  var expandMode: js.UndefOr[String] = js.native
  
  var loadOnDemand: js.UndefOr[Boolean] = js.native
  
  var messages: js.UndefOr[PanelBarMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ PanelBarSelectEvent, Unit]] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
}
object PanelBarOptions {
  
  @scala.inline
  def apply(): PanelBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelBarOptions]
  }
  
  @scala.inline
  implicit class PanelBarOptionsOps[Self <: PanelBarOptions] (val x: Self) extends AnyVal {
    
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
    def setActivate(value: /* e */ PanelBarActivateEvent => Unit): Self = this.set("activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | PanelBarAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    
    @scala.inline
    def setCollapse(value: /* e */ PanelBarCollapseEvent => Unit): Self = this.set("collapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setContentLoad(value: /* e */ PanelBarContentLoadEvent => Unit): Self = this.set("contentLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContentLoad: Self = this.set("contentLoad", js.undefined)
    
    @scala.inline
    def setContentUrls(value: js.Any): Self = this.set("contentUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrls: Self = this.set("contentUrls", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ PanelBarDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDataImageUrlField(value: String): Self = this.set("dataImageUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataImageUrlField: Self = this.set("dataImageUrlField", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | HierarchicalDataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDataSpriteCssClassField(value: String): Self = this.set("dataSpriteCssClassField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSpriteCssClassField: Self = this.set("dataSpriteCssClassField", js.undefined)
    
    @scala.inline
    def setDataTextField(value: String | js.Any): Self = this.set("dataTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTextField: Self = this.set("dataTextField", js.undefined)
    
    @scala.inline
    def setDataUrlField(value: String): Self = this.set("dataUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataUrlField: Self = this.set("dataUrlField", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ PanelBarErrorEvent => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExpand(value: /* e */ PanelBarExpandEvent => Unit): Self = this.set("expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setExpandMode(value: String): Self = this.set("expandMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandMode: Self = this.set("expandMode", js.undefined)
    
    @scala.inline
    def setLoadOnDemand(value: Boolean): Self = this.set("loadOnDemand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadOnDemand: Self = this.set("loadOnDemand", js.undefined)
    
    @scala.inline
    def setMessages(value: PanelBarMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ PanelBarSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
