package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.execute_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.execute_request
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExecuteReplyMsg
  extends StObject
     with IShellMessage[execute_reply]
     with _Message {
  
  @JSName("content")
  var content_IExecuteReplyMsg: ReplyContent[IExecuteReply] & IExecuteCount
  
  @JSName("parent_header")
  var parent_header_IExecuteReplyMsg: IHeader[execute_request]
}
object IExecuteReplyMsg {
  
  inline def apply(
    content: ReplyContent[IExecuteReply] & IExecuteCount,
    header: IHeader[execute_reply],
    metadata: JSONObject,
    parent_header: IHeader[execute_request]
  ): IExecuteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteReplyMsg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IExecuteReplyMsg] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ReplyContent[IExecuteReply] & IExecuteCount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setParent_header(value: IHeader[execute_request]): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
