package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedMessageInfo extends StObject {
  
  /** Id of the source chat message. This is kept here because the top-level message ID to refers the AF message ID. */
  var messageId: js.UndefOr[AppsDynamiteMessageId] = js.undefined
  
  /**
    * Timestamp of when the topic containing the message has been read by the user. This is populated if the message references an inline reply, in which case the space may be marked as
    * read but the topic still has unread messages.
    */
  var topicReadTimeUsec: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedMessageInfo {
  
  inline def apply(): AppsDynamiteSharedMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedMessageInfo]
  }
  
  extension [Self <: AppsDynamiteSharedMessageInfo](x: Self) {
    
    inline def setMessageId(value: AppsDynamiteMessageId): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setTopicReadTimeUsec(value: String): Self = StObject.set(x, "topicReadTimeUsec", value.asInstanceOf[js.Any])
    
    inline def setTopicReadTimeUsecUndefined: Self = StObject.set(x, "topicReadTimeUsec", js.undefined)
  }
}
