package typings.jqueryJnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JNotifyInitOptions extends js.Object {
  
  var appendType: js.UndefOr[String] = js.native
  
  var oneAtTime: js.UndefOr[Boolean] = js.native
}
object JNotifyInitOptions {
  
  @scala.inline
  def apply(): JNotifyInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JNotifyInitOptions]
  }
  
  @scala.inline
  implicit class JNotifyInitOptionsOps[Self <: JNotifyInitOptions] (val x: Self) extends AnyVal {
    
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
    def setAppendType(value: String): Self = this.set("appendType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendType: Self = this.set("appendType", js.undefined)
    
    @scala.inline
    def setOneAtTime(value: Boolean): Self = this.set("oneAtTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneAtTime: Self = this.set("oneAtTime", js.undefined)
  }
}
