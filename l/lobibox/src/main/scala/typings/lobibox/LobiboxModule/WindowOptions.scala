package typings.lobibox.LobiboxModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowOptions extends MessageBoxesOptions {
  
    // Override default option
  var autoload: js.UndefOr[Boolean] = js.native
  
  var content: js.UndefOr[js.Any] = js.native
  
  @JSName("height")
  var height_WindowOptions: js.UndefOr[js.Any] = js.native
  
    // Auto load from given url when window is created
  var loadMethod: js.UndefOr[String] = js.native
  
    // Show window after content is loaded or show and then load content
  var params: js.UndefOr[js.Object] = js.native
  
    // Ajax method to load content
  var showAfterLoad: js.UndefOr[Boolean] = js.native
  
    // HTML Content of window
  var url: js.UndefOr[String] = js.native
}
object WindowOptions {
  
  @scala.inline
  def apply(): WindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowOptions]
  }
  
  @scala.inline
  implicit class WindowOptionsOps[Self <: WindowOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoload(value: Boolean): Self = this.set("autoload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoload: Self = this.set("autoload", js.undefined)
    
    @scala.inline
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLoadMethod(value: String): Self = this.set("loadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadMethod: Self = this.set("loadMethod", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setShowAfterLoad(value: Boolean): Self = this.set("showAfterLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAfterLoad: Self = this.set("showAfterLoad", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
