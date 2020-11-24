package typings.jqueryJnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JNotifyOptions extends js.Object {
  
  var disappearTime: js.UndefOr[Double] = js.native
  
  var permanent: js.UndefOr[Boolean] = js.native
  
  var showIcon: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object JNotifyOptions {
  
  @scala.inline
  def apply(): JNotifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JNotifyOptions]
  }
  
  @scala.inline
  implicit class JNotifyOptionsOps[Self <: JNotifyOptions] (val x: Self) extends AnyVal {
    
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
    def setDisappearTime(value: Double): Self = this.set("disappearTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisappearTime: Self = this.set("disappearTime", js.undefined)
    
    @scala.inline
    def setPermanent(value: Boolean): Self = this.set("permanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermanent: Self = this.set("permanent", js.undefined)
    
    @scala.inline
    def setShowIcon(value: Boolean): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIcon: Self = this.set("showIcon", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
