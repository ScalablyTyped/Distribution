package typings.jpushReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageID extends js.Object {
  
  var messageID: String = js.native
}
object MessageID {
  
  @scala.inline
  def apply(messageID: String): MessageID = {
    val __obj = js.Dynamic.literal(messageID = messageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageID]
  }
  
  @scala.inline
  implicit class MessageIDOps[Self <: MessageID] (val x: Self) extends AnyVal {
    
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
    def setMessageID(value: String): Self = this.set("messageID", value.asInstanceOf[js.Any])
  }
}
