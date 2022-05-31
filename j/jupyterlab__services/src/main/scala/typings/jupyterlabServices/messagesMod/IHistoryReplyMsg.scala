package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.history_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.history_request
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHistoryReplyMsg
  extends StObject
     with IShellMessage[history_reply]
     with _Message {
  
  @JSName("content")
  var content_IHistoryReplyMsg: ReplyContent[IHistoryReply]
  
  @JSName("parent_header")
  var parent_header_IHistoryReplyMsg: IHeader[history_request]
}
object IHistoryReplyMsg {
  
  inline def apply(
    content: ReplyContent[IHistoryReply],
    header: IHeader[history_reply],
    metadata: JSONObject,
    parent_header: IHeader[history_request]
  ): IHistoryReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryReplyMsg]
  }
  
  extension [Self <: IHistoryReplyMsg](x: Self) {
    
    inline def setContent(value: ReplyContent[IHistoryReply]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setParent_header(value: IHeader[history_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
