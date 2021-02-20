package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.is_complete_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.is_complete_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIsCompleteReplyMsg
  extends IShellMessage[is_complete_reply]
     with _Message {
  
  @JSName("content")
  var content_IIsCompleteReplyMsg: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther] = js.native
  
  @JSName("parent_header")
  var parent_header_IIsCompleteReplyMsg: IHeader[is_complete_request] = js.native
}
object IIsCompleteReplyMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther],
    header: IHeader[is_complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[is_complete_request]
  ): IIsCompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsCompleteReplyMsg]
  }
  
  @scala.inline
  implicit class IIsCompleteReplyMsgMutableBuilder[Self <: IIsCompleteReplyMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_header(value: IHeader[is_complete_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
