package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `Pull` method.
  */
@js.native
trait SchemaPullResponse extends StObject {
  
  /**
    * Received Pub/Sub messages. The list will be empty if there are no more
    * messages available in the backlog. For JSON, the response can be entirely
    * empty. The Pub/Sub system may return fewer than the `maxMessages`
    * requested even if there are more messages available in the backlog.
    */
  var receivedMessages: js.UndefOr[js.Array[SchemaReceivedMessage]] = js.native
}
object SchemaPullResponse {
  
  @scala.inline
  def apply(): SchemaPullResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullResponse]
  }
  
  @scala.inline
  implicit class SchemaPullResponseMutableBuilder[Self <: SchemaPullResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReceivedMessages(value: js.Array[SchemaReceivedMessage]): Self = StObject.set(x, "receivedMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedMessagesUndefined: Self = StObject.set(x, "receivedMessages", js.undefined)
    
    @scala.inline
    def setReceivedMessagesVarargs(value: SchemaReceivedMessage*): Self = StObject.set(x, "receivedMessages", js.Array(value :_*))
  }
}
