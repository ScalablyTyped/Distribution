package typings.hellosignEmbedded.mod.HelloSign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEventPayload extends StObject {
  
  var payload: js.UndefOr[js.Object] = js.undefined
  
  var `type`: Messages
}
object MessageEventPayload {
  
  inline def apply(`type`: Messages): MessageEventPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEventPayload]
  }
  
  extension [Self <: MessageEventPayload](x: Self) {
    
    inline def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setType(value: Messages): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
