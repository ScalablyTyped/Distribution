package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.inspect_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.inspect_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInspectReplyMsg
  extends IShellMessage[inspect_reply]
     with _Message {
  
  @JSName("content")
  var content_IInspectReplyMsg: ReplyContent[IInspectReply] = js.native
  
  @JSName("parent_header")
  var parent_header_IInspectReplyMsg: IHeader[inspect_request] = js.native
}
object IInspectReplyMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[IInspectReply],
    header: IHeader[inspect_reply],
    metadata: JSONObject,
    parent_header: IHeader[inspect_request]
  ): IInspectReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectReplyMsg]
  }
  
  @scala.inline
  implicit class IInspectReplyMsgMutableBuilder[Self <: IInspectReplyMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ReplyContent[IInspectReply]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_header(value: IHeader[inspect_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
