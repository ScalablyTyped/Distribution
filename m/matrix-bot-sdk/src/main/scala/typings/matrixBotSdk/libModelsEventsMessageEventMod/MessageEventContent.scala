package typings.matrixBotSdk.libModelsEventsMessageEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEventContent extends StObject {
  
  var body: String
  
  var external_url: js.UndefOr[String] = js.undefined
  
  var msgtype: MessageType
}
object MessageEventContent {
  
  inline def apply(body: String, msgtype: MessageType): MessageEventContent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEventContent]
  }
  
  extension [Self <: MessageEventContent](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
    
    inline def setExternal_urlUndefined: Self = StObject.set(x, "external_url", js.undefined)
    
    inline def setMsgtype(value: MessageType): Self = StObject.set(x, "msgtype", value.asInstanceOf[js.Any])
  }
}
