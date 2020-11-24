package typings.jquerySortable.JQuerySortable

import typings.jquerySortable.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends js.Object {
  
  var el: JQuery = js.native
  
  var group: ContainerGroup = js.native
  
  var handle: String = js.native
  
  var itemDimensions: js.Array[Dimensions] = js.native
  
  var items: js.Array[HTMLElement] = js.native
  
  var options: Options = js.native
  
  var rootGroup: ContainerGroup = js.native
  
  var target: JQuery = js.native
}
object Container {
  
  @scala.inline
  def apply(
    el: JQuery,
    group: ContainerGroup,
    handle: String,
    itemDimensions: js.Array[Dimensions],
    items: js.Array[HTMLElement],
    options: Options,
    rootGroup: ContainerGroup,
    target: JQuery
  ): Container = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], itemDimensions = itemDimensions.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rootGroup = rootGroup.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    
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
    def setEl(value: JQuery): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: ContainerGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDimensionsVarargs(value: Dimensions*): Self = this.set("itemDimensions", js.Array(value :_*))
    
    @scala.inline
    def setItemDimensions(value: js.Array[Dimensions]): Self = this.set("itemDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: HTMLElement*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[HTMLElement]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootGroup(value: ContainerGroup): Self = this.set("rootGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: JQuery): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
