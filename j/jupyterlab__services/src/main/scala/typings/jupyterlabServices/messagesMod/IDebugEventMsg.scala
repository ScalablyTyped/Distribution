package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Event
import typings.jupyterlabServices.jupyterlabServicesStrings.debug_event
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDebugEventMsg
  extends StObject
     with IIOPubMessage[debug_event]
     with _Message {
  
  @JSName("content")
  var content_IDebugEventMsg: Event
}
object IDebugEventMsg {
  
  inline def apply(
    content: Event,
    header: IHeader[debug_event],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IDebugEventMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugEventMsg]
  }
  
  extension [Self <: IDebugEventMsg](x: Self) {
    
    inline def setContent(value: Event): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
