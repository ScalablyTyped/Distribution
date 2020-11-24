package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorPasteCleanup extends js.Object {
  
  var all: js.UndefOr[Boolean] = js.native
  
  var css: js.UndefOr[Boolean] = js.native
  
  var custom: js.UndefOr[js.Function] = js.native
  
  var keepNewLines: js.UndefOr[Boolean] = js.native
  
  var msAllFormatting: js.UndefOr[Boolean] = js.native
  
  var msConvertLists: js.UndefOr[Boolean] = js.native
  
  var msTags: js.UndefOr[Boolean] = js.native
  
  var none: js.UndefOr[Boolean] = js.native
  
  var span: js.UndefOr[Boolean] = js.native
}
object EditorPasteCleanup {
  
  @scala.inline
  def apply(): EditorPasteCleanup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorPasteCleanup]
  }
  
  @scala.inline
  implicit class EditorPasteCleanupOps[Self <: EditorPasteCleanup] (val x: Self) extends AnyVal {
    
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
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    
    @scala.inline
    def setCss(value: Boolean): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setCustom(value: js.Function): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setKeepNewLines(value: Boolean): Self = this.set("keepNewLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepNewLines: Self = this.set("keepNewLines", js.undefined)
    
    @scala.inline
    def setMsAllFormatting(value: Boolean): Self = this.set("msAllFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsAllFormatting: Self = this.set("msAllFormatting", js.undefined)
    
    @scala.inline
    def setMsConvertLists(value: Boolean): Self = this.set("msConvertLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsConvertLists: Self = this.set("msConvertLists", js.undefined)
    
    @scala.inline
    def setMsTags(value: Boolean): Self = this.set("msTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsTags: Self = this.set("msTags", js.undefined)
    
    @scala.inline
    def setNone(value: Boolean): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNone: Self = this.set("none", js.undefined)
    
    @scala.inline
    def setSpan(value: Boolean): Self = this.set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
  }
}
