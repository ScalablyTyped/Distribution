package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.input_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.input_request
import typings.jupyterlabServices.jupyterlabServicesStrings.stdin
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInputReplyMsg
  extends IStdinMessage[input_reply]
     with _Message {
  
  @JSName("content")
  var content_IInputReplyMsg: ReplyContent[IInputReply] = js.native
  
  @JSName("parent_header")
  var parent_header_IInputReplyMsg: IHeader[input_request] = js.native
}
object IInputReplyMsg {
  
  @scala.inline
  def apply(
    channel: stdin,
    content: ReplyContent[IInputReply],
    header: IHeader[input_reply],
    metadata: JSONObject,
    parent_header: IHeader[input_request]
  ): IInputReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputReplyMsg]
  }
  
  @scala.inline
  implicit class IInputReplyMsgMutableBuilder[Self <: IInputReplyMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ReplyContent[IInputReply]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_header(value: IHeader[input_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
