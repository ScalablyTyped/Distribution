package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedAssistantSessionContext extends StObject {
  
  /**
    * Unique identifier populated by the contextual request handler for each vertical (Ex: File Suggestions, Smart Scheduling, etc.) that can be used to track sessions end-to-end. May
    * span multiple users (sender-specific).
    */
  var contextualSessionId: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedAssistantSessionContext {
  
  inline def apply(): AppsDynamiteSharedAssistantSessionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedAssistantSessionContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedAssistantSessionContext] (val x: Self) extends AnyVal {
    
    inline def setContextualSessionId(value: String): Self = StObject.set(x, "contextualSessionId", value.asInstanceOf[js.Any])
    
    inline def setContextualSessionIdUndefined: Self = StObject.set(x, "contextualSessionId", js.undefined)
  }
}
