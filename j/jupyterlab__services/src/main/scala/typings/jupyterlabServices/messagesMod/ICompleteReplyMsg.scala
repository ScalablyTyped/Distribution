package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.complete_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.complete_request
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompleteReplyMsg
  extends StObject
     with IShellMessage[complete_reply]
     with _Message {
  
  @JSName("content")
  var content_ICompleteReplyMsg: ReplyContent[ICompleteReply]
  
  @JSName("parent_header")
  var parent_header_ICompleteReplyMsg: IHeader[complete_request]
}
object ICompleteReplyMsg {
  
  inline def apply(
    content: ReplyContent[ICompleteReply],
    header: IHeader[complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[complete_request]
  ): ICompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteReplyMsg]
  }
  
  extension [Self <: ICompleteReplyMsg](x: Self) {
    
    inline def setContent(value: ReplyContent[ICompleteReply]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setParent_header(value: IHeader[complete_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
