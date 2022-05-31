package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.CodeString
import typings.jupyterlabServices.jupyterlabServicesStrings.is_complete_request
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIsCompleteRequestMsg
  extends StObject
     with IShellMessage[is_complete_request]
     with _Message {
  
  @JSName("content")
  var content_IIsCompleteRequestMsg: CodeString
}
object IIsCompleteRequestMsg {
  
  inline def apply(
    content: CodeString,
    header: IHeader[is_complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IIsCompleteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsCompleteRequestMsg]
  }
  
  extension [Self <: IIsCompleteRequestMsg](x: Self) {
    
    inline def setContent(value: CodeString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
