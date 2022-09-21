package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedChatItemGroupInfo extends StObject {
  
  /** This is needed to determine what type of group the source message came from to support click-to-source. */
  var attributeCheckerGroupType: js.UndefOr[String] = js.undefined
  
  var groupName: js.UndefOr[String] = js.undefined
  
  /** Timestamp of when the group containing the message has been read by the user. */
  var groupReadTimeUsec: js.UndefOr[String] = js.undefined
  
  /** Indicates whether the group has inline replies enabled. If enabled, clients will render the space with inline replies. */
  var inlineThreadingEnabled: js.UndefOr[Boolean] = js.undefined
}
object AppsDynamiteSharedChatItemGroupInfo {
  
  inline def apply(): AppsDynamiteSharedChatItemGroupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedChatItemGroupInfo]
  }
  
  extension [Self <: AppsDynamiteSharedChatItemGroupInfo](x: Self) {
    
    inline def setAttributeCheckerGroupType(value: String): Self = StObject.set(x, "attributeCheckerGroupType", value.asInstanceOf[js.Any])
    
    inline def setAttributeCheckerGroupTypeUndefined: Self = StObject.set(x, "attributeCheckerGroupType", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    inline def setGroupReadTimeUsec(value: String): Self = StObject.set(x, "groupReadTimeUsec", value.asInstanceOf[js.Any])
    
    inline def setGroupReadTimeUsecUndefined: Self = StObject.set(x, "groupReadTimeUsec", js.undefined)
    
    inline def setInlineThreadingEnabled(value: Boolean): Self = StObject.set(x, "inlineThreadingEnabled", value.asInstanceOf[js.Any])
    
    inline def setInlineThreadingEnabledUndefined: Self = StObject.set(x, "inlineThreadingEnabled", js.undefined)
  }
}
