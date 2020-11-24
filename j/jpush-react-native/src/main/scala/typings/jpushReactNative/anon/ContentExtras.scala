package typings.jpushReactNative.anon

import typings.jpushReactNative.mod.Extra
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentExtras extends js.Object {
  
  /**
    * 对应 Portal 推送消息界面上的“自定义消息内容”字段
    */
  var content: String = js.native
  
  /**
    * 对应 Portal 推送消息界面上的“可选设置”里的附加字段
    */
  var extras: Extra = js.native
  
  /**
    * 唯一标识自定义消息的 ID
    */
  var messageID: String = js.native
}
object ContentExtras {
  
  @scala.inline
  def apply(content: String, extras: Extra, messageID: String): ContentExtras = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentExtras]
  }
  
  @scala.inline
  implicit class ContentExtrasOps[Self <: ContentExtras] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtras(value: Extra): Self = this.set("extras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageID(value: String): Self = this.set("messageID", value.asInstanceOf[js.Any])
  }
}
