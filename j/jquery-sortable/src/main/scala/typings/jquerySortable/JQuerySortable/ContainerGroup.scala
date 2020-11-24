package typings.jquerySortable.JQuerySortable

import typings.jquerySortable.JQuery
import typings.jquerySortable.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerGroup extends js.Object {
  
  @JSName("$document")
  var $document: JQuery = js.native
  
  var containerDimensions: js.Array[Dimensions] = js.native
  
  var containers: js.Array[Container] = js.native
  
  var delayMet: Boolean = js.native
  
  var dragInitDone: Boolean = js.native
  
  var dragProxy: js.Any = js.native
  
  var dragging: Boolean = js.native
  
  var dropProxy: js.Any = js.native
  
  var item: JQuery = js.native
  
  var itemContainer: Container = js.native
  
  var lastAppendedItem: JQuery = js.native
  
  var lastPointer: Position = js.native
  
  var lastRelativePointer: Position = js.native
  
  var offsetParent: JQuery = js.native
  
  var options: Options = js.native
  
  var placeholder: JQuery = js.native
  
  var pointer: Position = js.native
  
  var relativePointer: Position = js.native
  
  var sameResultBox: Bottom = js.native
  
  var scrollProxy: js.Any = js.native
}
object ContainerGroup {
  
  @scala.inline
  def apply(
    $document: JQuery,
    containerDimensions: js.Array[Dimensions],
    containers: js.Array[Container],
    delayMet: Boolean,
    dragInitDone: Boolean,
    dragProxy: js.Any,
    dragging: Boolean,
    dropProxy: js.Any,
    item: JQuery,
    itemContainer: Container,
    lastAppendedItem: JQuery,
    lastPointer: Position,
    lastRelativePointer: Position,
    offsetParent: JQuery,
    options: Options,
    placeholder: JQuery,
    pointer: Position,
    relativePointer: Position,
    sameResultBox: Bottom,
    scrollProxy: js.Any
  ): ContainerGroup = {
    val __obj = js.Dynamic.literal($document = $document.asInstanceOf[js.Any], containerDimensions = containerDimensions.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], delayMet = delayMet.asInstanceOf[js.Any], dragInitDone = dragInitDone.asInstanceOf[js.Any], dragProxy = dragProxy.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dropProxy = dropProxy.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemContainer = itemContainer.asInstanceOf[js.Any], lastAppendedItem = lastAppendedItem.asInstanceOf[js.Any], lastPointer = lastPointer.asInstanceOf[js.Any], lastRelativePointer = lastRelativePointer.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], relativePointer = relativePointer.asInstanceOf[js.Any], sameResultBox = sameResultBox.asInstanceOf[js.Any], scrollProxy = scrollProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerGroup]
  }
  
  @scala.inline
  implicit class ContainerGroupOps[Self <: ContainerGroup] (val x: Self) extends AnyVal {
    
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
    def set$document(value: JQuery): Self = this.set("$document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerDimensionsVarargs(value: Dimensions*): Self = this.set("containerDimensions", js.Array(value :_*))
    
    @scala.inline
    def setContainerDimensions(value: js.Array[Dimensions]): Self = this.set("containerDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersVarargs(value: Container*): Self = this.set("containers", js.Array(value :_*))
    
    @scala.inline
    def setContainers(value: js.Array[Container]): Self = this.set("containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayMet(value: Boolean): Self = this.set("delayMet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragInitDone(value: Boolean): Self = this.set("dragInitDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragProxy(value: js.Any): Self = this.set("dragProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropProxy(value: js.Any): Self = this.set("dropProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: JQuery): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemContainer(value: Container): Self = this.set("itemContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAppendedItem(value: JQuery): Self = this.set("lastAppendedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPointer(value: Position): Self = this.set("lastPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRelativePointer(value: Position): Self = this.set("lastRelativePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetParent(value: JQuery): Self = this.set("offsetParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: JQuery): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointer(value: Position): Self = this.set("pointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativePointer(value: Position): Self = this.set("relativePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameResultBox(value: Bottom): Self = this.set("sameResultBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollProxy(value: js.Any): Self = this.set("scrollProxy", value.asInstanceOf[js.Any])
  }
}
