package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.history_request
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHistoryRequestMsg
  extends StObject
     with IShellMessage[history_request]
     with _Message {
  
  @JSName("content")
  var content_IHistoryRequestMsg: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail
}
object IHistoryRequestMsg {
  
  inline def apply(
    content: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail,
    header: IHeader[history_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IHistoryRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryRequestMsg]
  }
  
  extension [Self <: IHistoryRequestMsg](x: Self) {
    
    inline def setContent(value: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
