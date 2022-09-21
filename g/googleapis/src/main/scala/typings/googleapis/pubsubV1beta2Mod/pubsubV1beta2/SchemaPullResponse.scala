package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPullResponse extends StObject {
  
  /**
    * Received Pub/Sub messages. The Pub/Sub system will return zero messages if there are no more available in the backlog. The Pub/Sub system may return fewer than the `maxMessages` requested even if there are more messages available in the backlog.
    */
  var receivedMessages: js.UndefOr[js.Array[SchemaReceivedMessage]] = js.undefined
}
object SchemaPullResponse {
  
  inline def apply(): SchemaPullResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullResponse]
  }
  
  extension [Self <: SchemaPullResponse](x: Self) {
    
    inline def setReceivedMessages(value: js.Array[SchemaReceivedMessage]): Self = StObject.set(x, "receivedMessages", value.asInstanceOf[js.Any])
    
    inline def setReceivedMessagesUndefined: Self = StObject.set(x, "receivedMessages", js.undefined)
    
    inline def setReceivedMessagesVarargs(value: SchemaReceivedMessage*): Self = StObject.set(x, "receivedMessages", js.Array(value*))
  }
}
