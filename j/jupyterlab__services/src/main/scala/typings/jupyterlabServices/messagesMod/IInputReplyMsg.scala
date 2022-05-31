package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.input_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.input_request
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInputReplyMsg
  extends StObject
     with IStdinMessage[input_reply]
     with _Message {
  
  @JSName("content")
  var content_IInputReplyMsg: ReplyContent[IInputReply]
  
  @JSName("parent_header")
  var parent_header_IInputReplyMsg: IHeader[input_request]
}
object IInputReplyMsg {
  
  inline def apply(
    content: ReplyContent[IInputReply],
    header: IHeader[input_reply],
    metadata: JSONObject,
    parent_header: IHeader[input_request]
  ): IInputReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "stdin", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputReplyMsg]
  }
  
  extension [Self <: IInputReplyMsg](x: Self) {
    
    inline def setContent(value: ReplyContent[IInputReply]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setParent_header(value: IHeader[input_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
