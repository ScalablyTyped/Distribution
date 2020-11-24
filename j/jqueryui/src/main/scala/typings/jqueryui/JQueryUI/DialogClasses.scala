package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogClasses extends js.Object {
  
  var `ui-dialog`: js.UndefOr[String] = js.native
  
  var `ui-dialog-buttonpane`: js.UndefOr[String] = js.native
  
  var `ui-dialog-buttons`: js.UndefOr[String] = js.native
  
  var `ui-dialog-buttonset`: js.UndefOr[String] = js.native
  
  var `ui-dialog-content`: js.UndefOr[String] = js.native
  
  var `ui-dialog-dragging`: js.UndefOr[String] = js.native
  
  var `ui-dialog-resizing`: js.UndefOr[String] = js.native
  
  var `ui-dialog-title`: js.UndefOr[String] = js.native
  
  var `ui-dialog-titlebar`: js.UndefOr[String] = js.native
  
  var `ui-dialog-titlebar-close`: js.UndefOr[String] = js.native
  
  var `ui-widget-overlay`: js.UndefOr[String] = js.native
}
object DialogClasses {
  
  @scala.inline
  def apply(): DialogClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogClasses]
  }
  
  @scala.inline
  implicit class DialogClassesOps[Self <: DialogClasses] (val x: Self) extends AnyVal {
    
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
    def `setUi-dialog`(value: String): Self = this.set("ui-dialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-dialog`: Self = this.set("ui-dialog", js.undefined)
    
    @scala.inline
    def `setUi-dialog-buttonpane`(value: String): Self = this.set("ui-dialog-buttonpane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-dialog-buttonpane`: Self = this.set("ui-dialog-buttonpane", js.undefined)
    
    @scala.inline
    def `setUi-dialog-buttons`(value: String): Self = this.set("ui-dialog-buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-dialog-buttons`: Self = this.set("ui-dialog-buttons", js.undefined)
    
    @scala.inline
    def `setUi-dialog-buttonset`(value: String): Self = this.set("ui-dialog-buttonset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-dialog-buttonset`: Self = this.set("ui-dialog-buttonset", js.undefined)
    
    @scala.inline
    def `setUi-dialog-content`(value: String): Self = this.set("ui-dialog-content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-dialog-content`: Self = this.set("ui-dialog-content", js.undefined)
    
    @scala.inline
    def `setUi-dialog-dragging`(value: String): Self = this.set("ui-dialog-dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-dialog-dragging`: Self = this.set("ui-dialog-dragging", js.undefined)
    
    @scala.inline
    def `setUi-dialog-resizing`(value: String): Self = this.set("ui-dialog-resizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-dialog-resizing`: Self = this.set("ui-dialog-resizing", js.undefined)
    
    @scala.inline
    def `setUi-dialog-title`(value: String): Self = this.set("ui-dialog-title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-dialog-title`: Self = this.set("ui-dialog-title", js.undefined)
    
    @scala.inline
    def `setUi-dialog-titlebar`(value: String): Self = this.set("ui-dialog-titlebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-dialog-titlebar`: Self = this.set("ui-dialog-titlebar", js.undefined)
    
    @scala.inline
    def `setUi-dialog-titlebar-close`(value: String): Self = this.set("ui-dialog-titlebar-close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-dialog-titlebar-close`: Self = this.set("ui-dialog-titlebar-close", js.undefined)
    
    @scala.inline
    def `setUi-widget-overlay`(value: String): Self = this.set("ui-widget-overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-widget-overlay`: Self = this.set("ui-widget-overlay", js.undefined)
  }
}
