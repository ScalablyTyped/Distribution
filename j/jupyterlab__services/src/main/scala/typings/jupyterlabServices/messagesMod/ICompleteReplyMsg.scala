package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.complete_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.complete_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompleteReplyMsg
  extends IShellMessage[complete_reply]
     with _Message {
  
  @JSName("content")
  var content_ICompleteReplyMsg: ReplyContent[ICompleteReply] = js.native
  
  @JSName("parent_header")
  var parent_header_ICompleteReplyMsg: IHeader[complete_request] = js.native
}
object ICompleteReplyMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[ICompleteReply],
    header: IHeader[complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[complete_request]
  ): ICompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteReplyMsg]
  }
  
  @scala.inline
  implicit class ICompleteReplyMsgMutableBuilder[Self <: ICompleteReplyMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ReplyContent[ICompleteReply]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_header(value: IHeader[complete_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
