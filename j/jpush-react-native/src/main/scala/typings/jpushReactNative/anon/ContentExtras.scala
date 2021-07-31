package typings.jpushReactNative.anon

import typings.jpushReactNative.mod.Extra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentExtras extends StObject {
  
  /**
    * 对应 Portal 推送消息界面上的“自定义消息内容”字段
    */
  var content: String
  
  /**
    * 对应 Portal 推送消息界面上的“可选设置”里的附加字段
    */
  var extras: Extra
  
  /**
    * 唯一标识自定义消息的 ID
    */
  var messageID: String
}
object ContentExtras {
  
  @scala.inline
  def apply(content: String, extras: Extra, messageID: String): ContentExtras = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentExtras]
  }
  
  @scala.inline
  implicit class ContentExtrasMutableBuilder[Self <: ContentExtras] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtras(value: Extra): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageID(value: String): Self = StObject.set(x, "messageID", value.asInstanceOf[js.Any])
  }
}
