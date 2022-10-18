package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.inspect_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.inspect_request
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInspectReplyMsg
  extends StObject
     with IShellMessage[inspect_reply]
     with _Message {
  
  @JSName("content")
  var content_IInspectReplyMsg: ReplyContent[IInspectReply]
  
  @JSName("parent_header")
  var parent_header_IInspectReplyMsg: IHeader[inspect_request]
}
object IInspectReplyMsg {
  
  inline def apply(
    content: ReplyContent[IInspectReply],
    header: IHeader[inspect_reply],
    metadata: JSONObject,
    parent_header: IHeader[inspect_request]
  ): IInspectReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectReplyMsg]
  }
  
  extension [Self <: IInspectReplyMsg](x: Self) {
    
    inline def setContent(value: ReplyContent[IInspectReply]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setParent_header(value: IHeader[inspect_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
