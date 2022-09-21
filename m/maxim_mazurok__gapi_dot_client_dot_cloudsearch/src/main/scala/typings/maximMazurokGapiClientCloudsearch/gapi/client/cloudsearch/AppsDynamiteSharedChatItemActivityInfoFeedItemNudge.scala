package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedChatItemActivityInfoFeedItemNudge extends StObject {
  
  /** Nudge type of the nudge feed item. */
  var nudgeType: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedChatItemActivityInfoFeedItemNudge {
  
  inline def apply(): AppsDynamiteSharedChatItemActivityInfoFeedItemNudge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedChatItemActivityInfoFeedItemNudge]
  }
  
  extension [Self <: AppsDynamiteSharedChatItemActivityInfoFeedItemNudge](x: Self) {
    
    inline def setNudgeType(value: String): Self = StObject.set(x, "nudgeType", value.asInstanceOf[js.Any])
    
    inline def setNudgeTypeUndefined: Self = StObject.set(x, "nudgeType", js.undefined)
  }
}
