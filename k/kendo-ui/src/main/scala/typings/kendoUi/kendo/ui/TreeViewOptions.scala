package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.HierarchicalDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewOptions extends StObject {
  
  var animation: js.UndefOr[Boolean | TreeViewAnimation] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ TreeViewEvent, Unit]] = js.undefined
  
  var check: js.UndefOr[js.Function1[/* e */ TreeViewCheckEvent, Unit]] = js.undefined
  
  var checkboxes: js.UndefOr[Boolean | TreeViewCheckboxes] = js.undefined
  
  var collapse: js.UndefOr[js.Function1[/* e */ TreeViewCollapseEvent, Unit]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ TreeViewDataBoundEvent, Unit]] = js.undefined
  
  var dataImageUrlField: js.UndefOr[String] = js.undefined
  
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.undefined
  
  var dataSpriteCssClassField: js.UndefOr[String] = js.undefined
  
  var dataTextField: js.UndefOr[String | js.Any] = js.undefined
  
  var dataUrlField: js.UndefOr[String] = js.undefined
  
  var drag: js.UndefOr[js.Function1[/* e */ TreeViewDragEvent, Unit]] = js.undefined
  
  var dragAndDrop: js.UndefOr[Boolean] = js.undefined
  
  var dragend: js.UndefOr[js.Function1[/* e */ TreeViewDragendEvent, Unit]] = js.undefined
  
  var dragstart: js.UndefOr[js.Function1[/* e */ TreeViewDragstartEvent, Unit]] = js.undefined
  
  var drop: js.UndefOr[js.Function1[/* e */ TreeViewDropEvent, Unit]] = js.undefined
  
  var expand: js.UndefOr[js.Function1[/* e */ TreeViewExpandEvent, Unit]] = js.undefined
  
  var loadOnDemand: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[TreeViewMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var navigate: js.UndefOr[js.Function1[/* e */ TreeViewNavigateEvent, Unit]] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ TreeViewSelectEvent, Unit]] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
}
object TreeViewOptions {
  
  @scala.inline
  def apply(): TreeViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeViewOptions]
  }
  
  @scala.inline
  implicit class TreeViewOptionsMutableBuilder[Self <: TreeViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean | TreeViewAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ TreeViewEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setCheck(value: /* e */ TreeViewCheckEvent => Unit): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    @scala.inline
    def setCheckboxes(value: Boolean | TreeViewCheckboxes): Self = StObject.set(x, "checkboxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxesUndefined: Self = StObject.set(x, "checkboxes", js.undefined)
    
    @scala.inline
    def setCollapse(value: /* e */ TreeViewCollapseEvent => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ TreeViewDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
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
    def setDrag(value: /* e */ TreeViewDragEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragAndDrop(value: Boolean): Self = StObject.set(x, "dragAndDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragAndDropUndefined: Self = StObject.set(x, "dragAndDrop", js.undefined)
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setDragend(value: /* e */ TreeViewDragendEvent => Unit): Self = StObject.set(x, "dragend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
    
    @scala.inline
    def setDragstart(value: /* e */ TreeViewDragstartEvent => Unit): Self = StObject.set(x, "dragstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
    
    @scala.inline
    def setDrop(value: /* e */ TreeViewDropEvent => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    @scala.inline
    def setExpand(value: /* e */ TreeViewExpandEvent => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setLoadOnDemand(value: Boolean): Self = StObject.set(x, "loadOnDemand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadOnDemandUndefined: Self = StObject.set(x, "loadOnDemand", js.undefined)
    
    @scala.inline
    def setMessages(value: TreeViewMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNavigate(value: /* e */ TreeViewNavigateEvent => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ TreeViewSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
