package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventContentTypeMessage extends StObject {
  
  var body: String
  
  var msgtype: MsgType
}
object EventContentTypeMessage {
  
  inline def apply(body: String, msgtype: MsgType): EventContentTypeMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventContentTypeMessage]
  }
  
  extension [Self <: EventContentTypeMessage](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setMsgtype(value: MsgType): Self = StObject.set(x, "msgtype", value.asInstanceOf[js.Any])
  }
}
