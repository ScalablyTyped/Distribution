package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `Pull` method.
  */
trait SchemaPullResponse extends StObject {
  
  /**
    * Received Pub/Sub messages. The list will be empty if there are no more
    * messages available in the backlog. For JSON, the response can be entirely
    * empty. The Pub/Sub system may return fewer than the `maxMessages`
    * requested even if there are more messages available in the backlog.
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
    
    inline def setReceivedMessagesVarargs(value: SchemaReceivedMessage*): Self = StObject.set(x, "receivedMessages", js.Array(value :_*))
  }
}
