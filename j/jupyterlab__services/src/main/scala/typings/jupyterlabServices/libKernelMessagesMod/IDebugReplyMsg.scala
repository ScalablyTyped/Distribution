package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.anon.Body
import typings.jupyterlabServices.jupyterlabServicesStrings.debug_reply
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDebugReplyMsg
  extends StObject
     with IControlMessage[debug_reply]
     with _Message {
  
  @JSName("content")
  var content_IDebugReplyMsg: Body
}
object IDebugReplyMsg {
  
  inline def apply(
    content: Body,
    header: IHeader[debug_reply],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IDebugReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "control", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugReplyMsg]
  }
  
  extension [Self <: IDebugReplyMsg](x: Self) {
    
    inline def setContent(value: Body): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
