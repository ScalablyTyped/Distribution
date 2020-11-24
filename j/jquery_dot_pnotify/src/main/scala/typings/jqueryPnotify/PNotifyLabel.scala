package typings.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PNotifyLabel extends js.Object {
  
  var all: js.UndefOr[String] = js.native
  
  var close: js.UndefOr[String] = js.native
  
  var last: js.UndefOr[String] = js.native
  
  var redisplay: js.UndefOr[String] = js.native
  
  var stick: js.UndefOr[String] = js.native
}
object PNotifyLabel {
  
  @scala.inline
  def apply(): PNotifyLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyLabel]
  }
  
  @scala.inline
  implicit class PNotifyLabelOps[Self <: PNotifyLabel] (val x: Self) extends AnyVal {
    
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
    def setAll(value: String): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    
    @scala.inline
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setLast(value: String): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    
    @scala.inline
    def setRedisplay(value: String): Self = this.set("redisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedisplay: Self = this.set("redisplay", js.undefined)
    
    @scala.inline
    def setStick(value: String): Self = this.set("stick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStick: Self = this.set("stick", js.undefined)
  }
}
