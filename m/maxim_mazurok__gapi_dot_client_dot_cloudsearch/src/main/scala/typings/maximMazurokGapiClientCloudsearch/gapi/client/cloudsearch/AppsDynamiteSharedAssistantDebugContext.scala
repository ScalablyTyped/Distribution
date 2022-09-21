package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedAssistantDebugContext extends StObject {
  
  /** The query that triggered the resulting suggestion. */
  var query: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedAssistantDebugContext {
  
  inline def apply(): AppsDynamiteSharedAssistantDebugContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedAssistantDebugContext]
  }
  
  extension [Self <: AppsDynamiteSharedAssistantDebugContext](x: Self) {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
