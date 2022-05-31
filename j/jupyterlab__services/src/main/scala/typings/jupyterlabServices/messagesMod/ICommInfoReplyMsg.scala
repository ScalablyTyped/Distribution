package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.comm_info_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_info_request
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommInfoReplyMsg
  extends StObject
     with IShellMessage[comm_info_reply]
     with _Message {
  
  @JSName("content")
  var content_ICommInfoReplyMsg: ReplyContent[ICommInfoReply]
  
  @JSName("parent_header")
  var parent_header_ICommInfoReplyMsg: IHeader[comm_info_request]
}
object ICommInfoReplyMsg {
  
  inline def apply(
    content: ReplyContent[ICommInfoReply],
    header: IHeader[comm_info_reply],
    metadata: JSONObject,
    parent_header: IHeader[comm_info_request]
  ): ICommInfoReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommInfoReplyMsg]
  }
  
  extension [Self <: ICommInfoReplyMsg](x: Self) {
    
    inline def setContent(value: ReplyContent[ICommInfoReply]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setParent_header(value: IHeader[comm_info_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
