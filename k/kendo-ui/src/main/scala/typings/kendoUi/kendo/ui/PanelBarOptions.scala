package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.HierarchicalDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanelBarOptions extends StObject {
  
  var activate: js.UndefOr[js.Function1[/* e */ PanelBarActivateEvent, Unit]] = js.undefined
  
  var animation: js.UndefOr[Boolean | PanelBarAnimation] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var collapse: js.UndefOr[js.Function1[/* e */ PanelBarCollapseEvent, Unit]] = js.undefined
  
  var contentLoad: js.UndefOr[js.Function1[/* e */ PanelBarContentLoadEvent, Unit]] = js.undefined
  
  var contentUrls: js.UndefOr[js.Any] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ PanelBarDataBoundEvent, Unit]] = js.undefined
  
  var dataImageUrlField: js.UndefOr[String] = js.undefined
  
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.undefined
  
  var dataSpriteCssClassField: js.UndefOr[String] = js.undefined
  
  var dataTextField: js.UndefOr[String | js.Any] = js.undefined
  
  var dataUrlField: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* e */ PanelBarErrorEvent, Unit]] = js.undefined
  
  var expand: js.UndefOr[js.Function1[/* e */ PanelBarExpandEvent, Unit]] = js.undefined
  
  var expandMode: js.UndefOr[String] = js.undefined
  
  var loadOnDemand: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[PanelBarMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ PanelBarSelectEvent, Unit]] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
}
object PanelBarOptions {
  
  @scala.inline
  def apply(): PanelBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelBarOptions]
  }
  
  @scala.inline
  implicit class PanelBarOptionsMutableBuilder[Self <: PanelBarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: /* e */ PanelBarActivateEvent => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | PanelBarAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setCollapse(value: /* e */ PanelBarCollapseEvent => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setContentLoad(value: /* e */ PanelBarContentLoadEvent => Unit): Self = StObject.set(x, "contentLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContentLoadUndefined: Self = StObject.set(x, "contentLoad", js.undefined)
    
    @scala.inline
    def setContentUrls(value: js.Any): Self = StObject.set(x, "contentUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlsUndefined: Self = StObject.set(x, "contentUrls", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ PanelBarDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataImageUrlField(value: String): Self = StObject.set(x, "dataImageUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataImageUrlFieldUndefined: Self = StObject.set(x, "dataImageUrlField", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | HierarchicalDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSpriteCssClassField(value: String): Self = StObject.set(x, "dataSpriteCssClassField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSpriteCssClassFieldUndefined: Self = StObject.set(x, "dataSpriteCssClassField", js.undefined)
    
    @scala.inline
    def setDataTextField(value: String | js.Any): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    @scala.inline
    def setDataUrlField(value: String): Self = StObject.set(x, "dataUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUrlFieldUndefined: Self = StObject.set(x, "dataUrlField", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ PanelBarErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExpand(value: /* e */ PanelBarExpandEvent => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandMode(value: String): Self = StObject.set(x, "expandMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandModeUndefined: Self = StObject.set(x, "expandMode", js.undefined)
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setLoadOnDemand(value: Boolean): Self = StObject.set(x, "loadOnDemand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadOnDemandUndefined: Self = StObject.set(x, "loadOnDemand", js.undefined)
    
    @scala.inline
    def setMessages(value: PanelBarMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ PanelBarSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
