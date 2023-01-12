package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedChatItemActivityInfoFeedItemUserMention extends StObject {
  
  /** User mention type */
  var `type`: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedChatItemActivityInfoFeedItemUserMention {
  
  inline def apply(): AppsDynamiteSharedChatItemActivityInfoFeedItemUserMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedChatItemActivityInfoFeedItemUserMention]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedChatItemActivityInfoFeedItemUserMention] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
