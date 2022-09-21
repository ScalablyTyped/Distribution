package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedReaction extends StObject {
  
  /** The total number of users who have reacted. */
  var count: js.UndefOr[Double] = js.undefined
  
  /** When the first emoji of this type was added. */
  var createTimestamp: js.UndefOr[String] = js.undefined
  
  /** Whether the current user reacted using this emoji. Note: Unlike most properties of messages, this is different per-user. */
  var currentUserParticipated: js.UndefOr[Boolean] = js.undefined
  
  var emoji: js.UndefOr[AppsDynamiteSharedEmoji] = js.undefined
}
object AppsDynamiteSharedReaction {
  
  inline def apply(): AppsDynamiteSharedReaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedReaction]
  }
  
  extension [Self <: AppsDynamiteSharedReaction](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCreateTimestamp(value: String): Self = StObject.set(x, "createTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreateTimestampUndefined: Self = StObject.set(x, "createTimestamp", js.undefined)
    
    inline def setCurrentUserParticipated(value: Boolean): Self = StObject.set(x, "currentUserParticipated", value.asInstanceOf[js.Any])
    
    inline def setCurrentUserParticipatedUndefined: Self = StObject.set(x, "currentUserParticipated", js.undefined)
    
    inline def setEmoji(value: AppsDynamiteSharedEmoji): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
  }
}
