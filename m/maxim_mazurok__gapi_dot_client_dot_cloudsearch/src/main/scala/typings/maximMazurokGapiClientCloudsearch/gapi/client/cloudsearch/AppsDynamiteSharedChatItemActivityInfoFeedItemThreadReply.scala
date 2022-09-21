package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedChatItemActivityInfoFeedItemThreadReply extends StObject {
  
  /** Reply type of the thread reply feed item. The field is not persisted in storage. It's populated when constructing Activity Feed payload. */
  var replyType: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedChatItemActivityInfoFeedItemThreadReply {
  
  inline def apply(): AppsDynamiteSharedChatItemActivityInfoFeedItemThreadReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedChatItemActivityInfoFeedItemThreadReply]
  }
  
  extension [Self <: AppsDynamiteSharedChatItemActivityInfoFeedItemThreadReply](x: Self) {
    
    inline def setReplyType(value: String): Self = StObject.set(x, "replyType", value.asInstanceOf[js.Any])
    
    inline def setReplyTypeUndefined: Self = StObject.set(x, "replyType", js.undefined)
  }
}
