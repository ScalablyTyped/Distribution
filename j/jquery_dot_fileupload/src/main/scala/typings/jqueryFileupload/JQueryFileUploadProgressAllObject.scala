package typings.jqueryFileupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryFileUploadProgressAllObject extends js.Object {
  
  var bitrate: js.UndefOr[Double] = js.native
  
  var loaded: js.UndefOr[Double] = js.native
  
  var total: js.UndefOr[Double] = js.native
}
object JQueryFileUploadProgressAllObject {
  
  @scala.inline
  def apply(): JQueryFileUploadProgressAllObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryFileUploadProgressAllObject]
  }
  
  @scala.inline
  implicit class JQueryFileUploadProgressAllObjectOps[Self <: JQueryFileUploadProgressAllObject] (val x: Self) extends AnyVal {
    
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
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("bitrate", js.undefined)
    
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
