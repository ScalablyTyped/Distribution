package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEditorSaveAs extends js.Object {
  
  var fileName: js.UndefOr[String] = js.native
  
  var forceProxy: js.UndefOr[Boolean] = js.native
  
  var proxyTarget: js.UndefOr[String] = js.native
  
  var proxyURL: js.UndefOr[Boolean] = js.native
}
object ImageEditorSaveAs {
  
  @scala.inline
  def apply(): ImageEditorSaveAs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorSaveAs]
  }
  
  @scala.inline
  implicit class ImageEditorSaveAsOps[Self <: ImageEditorSaveAs] (val x: Self) extends AnyVal {
    
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setForceProxy(value: Boolean): Self = this.set("forceProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceProxy: Self = this.set("forceProxy", js.undefined)
    
    @scala.inline
    def setProxyTarget(value: String): Self = this.set("proxyTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyTarget: Self = this.set("proxyTarget", js.undefined)
    
    @scala.inline
    def setProxyURL(value: Boolean): Self = this.set("proxyURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyURL: Self = this.set("proxyURL", js.undefined)
  }
}
