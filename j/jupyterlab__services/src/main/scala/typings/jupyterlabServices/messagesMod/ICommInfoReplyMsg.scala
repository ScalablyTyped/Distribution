package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.comm_info_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_info_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommInfoReplyMsg
  extends IShellMessage[comm_info_reply]
     with _Message {
  
  @JSName("content")
  var content_ICommInfoReplyMsg: ReplyContent[ICommInfoReply] = js.native
  
  @JSName("parent_header")
  var parent_header_ICommInfoReplyMsg: IHeader[comm_info_request] = js.native
}
object ICommInfoReplyMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[ICommInfoReply],
    header: IHeader[comm_info_reply],
    metadata: JSONObject,
    parent_header: IHeader[comm_info_request]
  ): ICommInfoReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommInfoReplyMsg]
  }
  
  @scala.inline
  implicit class ICommInfoReplyMsgOps[Self <: ICommInfoReplyMsg] (val x: Self) extends AnyVal {
    
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
    def setContent(value: ReplyContent[ICommInfoReply]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_header(value: IHeader[comm_info_request]): Self = this.set("parent_header", value.asInstanceOf[js.Any])
  }
}
