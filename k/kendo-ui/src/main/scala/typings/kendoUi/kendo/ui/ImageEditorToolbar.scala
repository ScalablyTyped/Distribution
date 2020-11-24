package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEditorToolbar extends js.Object {
  
  var click: js.UndefOr[js.Function] = js.native
  
  var close: js.UndefOr[js.Function] = js.native
  
  var items: js.UndefOr[js.Array[ImageEditorToolbarItem]] = js.native
  
  var open: js.UndefOr[js.Function] = js.native
  
  var overflowClose: js.UndefOr[js.Function] = js.native
  
  var overflowOpen: js.UndefOr[js.Function] = js.native
  
  var toggle: js.UndefOr[js.Function] = js.native
}
object ImageEditorToolbar {
  
  @scala.inline
  def apply(): ImageEditorToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorToolbar]
  }
  
  @scala.inline
  implicit class ImageEditorToolbarOps[Self <: ImageEditorToolbar] (val x: Self) extends AnyVal {
    
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
    def setClick(value: js.Function): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setClose(value: js.Function): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ImageEditorToolbarItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ImageEditorToolbarItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setOpen(value: js.Function): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOverflowClose(value: js.Function): Self = this.set("overflowClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowClose: Self = this.set("overflowClose", js.undefined)
    
    @scala.inline
    def setOverflowOpen(value: js.Function): Self = this.set("overflowOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowOpen: Self = this.set("overflowOpen", js.undefined)
    
    @scala.inline
    def setToggle(value: js.Function): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
}
