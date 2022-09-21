package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedChatItem extends StObject {
  
  /** Information needed to render the specific type of feed item. */
  var activityInfo: js.UndefOr[js.Array[AppsDynamiteSharedChatItemActivityInfo]] = js.undefined
  
  /** Only populated on read path and should not be persisted in storage. */
  var groupInfo: js.UndefOr[AppsDynamiteSharedChatItemGroupInfo] = js.undefined
  
  /** Additional information about the original chat message that isn't captured in the top-level message proto. */
  var messageInfo: js.UndefOr[AppsDynamiteSharedMessageInfo] = js.undefined
}
object AppsDynamiteSharedChatItem {
  
  inline def apply(): AppsDynamiteSharedChatItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedChatItem]
  }
  
  extension [Self <: AppsDynamiteSharedChatItem](x: Self) {
    
    inline def setActivityInfo(value: js.Array[AppsDynamiteSharedChatItemActivityInfo]): Self = StObject.set(x, "activityInfo", value.asInstanceOf[js.Any])
    
    inline def setActivityInfoUndefined: Self = StObject.set(x, "activityInfo", js.undefined)
    
    inline def setActivityInfoVarargs(value: AppsDynamiteSharedChatItemActivityInfo*): Self = StObject.set(x, "activityInfo", js.Array(value*))
    
    inline def setGroupInfo(value: AppsDynamiteSharedChatItemGroupInfo): Self = StObject.set(x, "groupInfo", value.asInstanceOf[js.Any])
    
    inline def setGroupInfoUndefined: Self = StObject.set(x, "groupInfo", js.undefined)
    
    inline def setMessageInfo(value: AppsDynamiteSharedMessageInfo): Self = StObject.set(x, "messageInfo", value.asInstanceOf[js.Any])
    
    inline def setMessageInfoUndefined: Self = StObject.set(x, "messageInfo", js.undefined)
  }
}
