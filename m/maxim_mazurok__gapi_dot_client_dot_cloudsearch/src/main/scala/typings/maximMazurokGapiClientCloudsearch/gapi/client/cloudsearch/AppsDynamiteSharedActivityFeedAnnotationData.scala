package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedActivityFeedAnnotationData extends StObject {
  
  /**
    * Unique id of the Activity Feed message. This will be in the form of "space-id/message-id" or "dm-id/message-id", where the space-/dm-id and message-id components are extracted from
    * the top-level MessageId in message.proto (http://shortn/_SulV51DNfF). This is copied into annotations so that no client changes are needed to access this value. Clients will need a
    * unique id for every Activity Feed message to implement click-to-source.
    */
  var activityFeedMessageId: js.UndefOr[String] = js.undefined
  
  var chatItem: js.UndefOr[AppsDynamiteSharedChatItem] = js.undefined
  
  /** Only populated on read path and should not be persisted in storage. */
  var sharedUserInfo: js.UndefOr[UserInfo] = js.undefined
  
  /** Use shared_user_info instead. */
  var userInfo: js.UndefOr[AppsDynamiteSharedActivityFeedAnnotationDataUserInfo] = js.undefined
}
object AppsDynamiteSharedActivityFeedAnnotationData {
  
  inline def apply(): AppsDynamiteSharedActivityFeedAnnotationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedActivityFeedAnnotationData]
  }
  
  extension [Self <: AppsDynamiteSharedActivityFeedAnnotationData](x: Self) {
    
    inline def setActivityFeedMessageId(value: String): Self = StObject.set(x, "activityFeedMessageId", value.asInstanceOf[js.Any])
    
    inline def setActivityFeedMessageIdUndefined: Self = StObject.set(x, "activityFeedMessageId", js.undefined)
    
    inline def setChatItem(value: AppsDynamiteSharedChatItem): Self = StObject.set(x, "chatItem", value.asInstanceOf[js.Any])
    
    inline def setChatItemUndefined: Self = StObject.set(x, "chatItem", js.undefined)
    
    inline def setSharedUserInfo(value: UserInfo): Self = StObject.set(x, "sharedUserInfo", value.asInstanceOf[js.Any])
    
    inline def setSharedUserInfoUndefined: Self = StObject.set(x, "sharedUserInfo", js.undefined)
    
    inline def setUserInfo(value: AppsDynamiteSharedActivityFeedAnnotationDataUserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
  }
}
