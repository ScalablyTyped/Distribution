package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTooltipEventUIParam extends js.Object {
  
  /**
    * Used to obtain reference to jquery object which represents tooltip. Value of that member can be replaced by custom element.
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain reference to item. Value of that member can be modified or replaced by custom item.
    */
  var item: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain reference to chart widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain html of tooltip. Value of that member can be modified. If modified value is null or empty string, then current content of tooltip keeps old value.
    */
  var text: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain left position of tooltip in pixels relative to widget. Value of that member can be modified.
    */
  var x: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain top position of tooltip in pixels relative to widget. Value of that member can be modified.
    */
  var y: js.UndefOr[js.Any] = js.native
}
object UpdateTooltipEventUIParam {
  
  @scala.inline
  def apply(): UpdateTooltipEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTooltipEventUIParam]
  }
  
  @scala.inline
  implicit class UpdateTooltipEventUIParamOps[Self <: UpdateTooltipEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setText(value: js.Any): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setX(value: js.Any): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: js.Any): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
