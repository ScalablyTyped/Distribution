package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Code
import typings.jupyterlabServices.jupyterlabServicesStrings.complete_request
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompleteRequestMsg
  extends StObject
     with IShellMessage[complete_request]
     with _Message {
  
  @JSName("content")
  var content_ICompleteRequestMsg: Code
}
object ICompleteRequestMsg {
  
  inline def apply(
    content: Code,
    header: IHeader[complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICompleteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteRequestMsg]
  }
  
  extension [Self <: ICompleteRequestMsg](x: Self) {
    
    inline def setContent(value: Code): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
