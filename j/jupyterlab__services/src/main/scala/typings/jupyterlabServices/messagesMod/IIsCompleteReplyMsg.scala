package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.is_complete_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.is_complete_request
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIsCompleteReplyMsg
  extends StObject
     with IShellMessage[is_complete_reply]
     with _Message {
  
  @JSName("content")
  var content_IIsCompleteReplyMsg: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther]
  
  @JSName("parent_header")
  var parent_header_IIsCompleteReplyMsg: IHeader[is_complete_request]
}
object IIsCompleteReplyMsg {
  
  inline def apply(
    content: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther],
    header: IHeader[is_complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[is_complete_request]
  ): IIsCompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsCompleteReplyMsg]
  }
  
  extension [Self <: IIsCompleteReplyMsg](x: Self) {
    
    inline def setContent(value: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setParent_header(value: IHeader[is_complete_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
