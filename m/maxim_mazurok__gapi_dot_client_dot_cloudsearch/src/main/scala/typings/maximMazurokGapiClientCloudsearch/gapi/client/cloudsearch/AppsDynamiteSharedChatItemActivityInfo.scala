package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedChatItemActivityInfo extends StObject {
  
  var feedItemNudge: js.UndefOr[AppsDynamiteSharedChatItemActivityInfoFeedItemNudge] = js.undefined
  
  var feedItemReactions: js.UndefOr[Any] = js.undefined
  
  var feedItemThreadReply: js.UndefOr[AppsDynamiteSharedChatItemActivityInfoFeedItemThreadReply] = js.undefined
  
  var feedItemUserMention: js.UndefOr[AppsDynamiteSharedChatItemActivityInfoFeedItemUserMention] = js.undefined
}
object AppsDynamiteSharedChatItemActivityInfo {
  
  inline def apply(): AppsDynamiteSharedChatItemActivityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedChatItemActivityInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedChatItemActivityInfo] (val x: Self) extends AnyVal {
    
    inline def setFeedItemNudge(value: AppsDynamiteSharedChatItemActivityInfoFeedItemNudge): Self = StObject.set(x, "feedItemNudge", value.asInstanceOf[js.Any])
    
    inline def setFeedItemNudgeUndefined: Self = StObject.set(x, "feedItemNudge", js.undefined)
    
    inline def setFeedItemReactions(value: Any): Self = StObject.set(x, "feedItemReactions", value.asInstanceOf[js.Any])
    
    inline def setFeedItemReactionsUndefined: Self = StObject.set(x, "feedItemReactions", js.undefined)
    
    inline def setFeedItemThreadReply(value: AppsDynamiteSharedChatItemActivityInfoFeedItemThreadReply): Self = StObject.set(x, "feedItemThreadReply", value.asInstanceOf[js.Any])
    
    inline def setFeedItemThreadReplyUndefined: Self = StObject.set(x, "feedItemThreadReply", js.undefined)
    
    inline def setFeedItemUserMention(value: AppsDynamiteSharedChatItemActivityInfoFeedItemUserMention): Self = StObject.set(x, "feedItemUserMention", value.asInstanceOf[js.Any])
    
    inline def setFeedItemUserMentionUndefined: Self = StObject.set(x, "feedItemUserMention", js.undefined)
  }
}
