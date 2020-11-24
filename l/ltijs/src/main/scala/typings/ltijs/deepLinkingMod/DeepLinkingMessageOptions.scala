package typings.ltijs.deepLinkingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeepLinkingMessageOptions extends js.Object {
  
  var errlog: js.UndefOr[String] = js.native
  
  var errmessage: js.UndefOr[String] = js.native
  
  var log: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
}
object DeepLinkingMessageOptions {
  
  @scala.inline
  def apply(): DeepLinkingMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepLinkingMessageOptions]
  }
  
  @scala.inline
  implicit class DeepLinkingMessageOptionsOps[Self <: DeepLinkingMessageOptions] (val x: Self) extends AnyVal {
    
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
    def setErrlog(value: String): Self = this.set("errlog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrlog: Self = this.set("errlog", js.undefined)
    
    @scala.inline
    def setErrmessage(value: String): Self = this.set("errmessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrmessage: Self = this.set("errmessage", js.undefined)
    
    @scala.inline
    def setLog(value: String): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
