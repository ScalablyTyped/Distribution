package typings.jqueryWatermark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatermarkOptions extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
   // If true, plugin will detect and use native browser support for watermarks, if available. (e.g., WebKit's placeholder attribute.)
  var hideBeforeUnload: js.UndefOr[Boolean] = js.native
  
   // Default class name for all watermarks
  var useNative: js.UndefOr[Boolean] = js.native
}
object WatermarkOptions {
  
  @scala.inline
  def apply(): WatermarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatermarkOptions]
  }
  
  @scala.inline
  implicit class WatermarkOptionsOps[Self <: WatermarkOptions] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setHideBeforeUnload(value: Boolean): Self = this.set("hideBeforeUnload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideBeforeUnload: Self = this.set("hideBeforeUnload", js.undefined)
    
    @scala.inline
    def setUseNative(value: Boolean): Self = this.set("useNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNative: Self = this.set("useNative", js.undefined)
  }
}
