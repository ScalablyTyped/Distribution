package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReceivedMessage extends StObject {
  
  /**
    * This ID can be used to acknowledge the received message.
    */
  var ackId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The message.
    */
  var message: js.UndefOr[SchemaPubsubMessage] = js.undefined
}
object SchemaReceivedMessage {
  
  inline def apply(): SchemaReceivedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReceivedMessage]
  }
  
  extension [Self <: SchemaReceivedMessage](x: Self) {
    
    inline def setAckId(value: String): Self = StObject.set(x, "ackId", value.asInstanceOf[js.Any])
    
    inline def setAckIdNull: Self = StObject.set(x, "ackId", null)
    
    inline def setAckIdUndefined: Self = StObject.set(x, "ackId", js.undefined)
    
    inline def setMessage(value: SchemaPubsubMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
