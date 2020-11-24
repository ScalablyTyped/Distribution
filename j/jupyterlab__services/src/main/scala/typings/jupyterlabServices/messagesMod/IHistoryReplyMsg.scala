package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.history_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.history_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHistoryReplyMsg
  extends IShellMessage[history_reply]
     with _Message {
  
  @JSName("content")
  var content_IHistoryReplyMsg: ReplyContent[IHistoryReply] = js.native
  
  @JSName("parent_header")
  var parent_header_IHistoryReplyMsg: IHeader[history_request] = js.native
}
object IHistoryReplyMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[IHistoryReply],
    header: IHeader[history_reply],
    metadata: JSONObject,
    parent_header: IHeader[history_request]
  ): IHistoryReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryReplyMsg]
  }
  
  @scala.inline
  implicit class IHistoryReplyMsgOps[Self <: IHistoryReplyMsg] (val x: Self) extends AnyVal {
    
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
    def setContent(value: ReplyContent[IHistoryReply]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_header(value: IHeader[history_request]): Self = this.set("parent_header", value.asInstanceOf[js.Any])
  }
}
