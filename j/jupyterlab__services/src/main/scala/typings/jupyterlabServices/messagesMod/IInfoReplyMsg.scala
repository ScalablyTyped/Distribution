package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.kernel_info_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.kernel_info_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInfoReplyMsg
  extends IShellMessage[kernel_info_reply]
     with _Message {
  
  @JSName("content")
  var content_IInfoReplyMsg: ReplyContent[IInfoReply] = js.native
  
  @JSName("parent_header")
  var parent_header_IInfoReplyMsg: IHeader[kernel_info_request] = js.native
}
object IInfoReplyMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[IInfoReply],
    header: IHeader[kernel_info_reply],
    metadata: JSONObject,
    parent_header: IHeader[kernel_info_request]
  ): IInfoReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfoReplyMsg]
  }
  
  @scala.inline
  implicit class IInfoReplyMsgMutableBuilder[Self <: IInfoReplyMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ReplyContent[IInfoReply]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_header(value: IHeader[kernel_info_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
