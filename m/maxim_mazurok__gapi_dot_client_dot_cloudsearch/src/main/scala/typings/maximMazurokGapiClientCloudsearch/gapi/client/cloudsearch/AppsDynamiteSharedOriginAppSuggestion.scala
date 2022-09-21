package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedOriginAppSuggestion extends StObject {
  
  var appId: js.UndefOr[AppsDynamiteAppId] = js.undefined
  
  var cardClickSuggestion: js.UndefOr[AppsDynamiteSharedCardClickSuggestion] = js.undefined
}
object AppsDynamiteSharedOriginAppSuggestion {
  
  inline def apply(): AppsDynamiteSharedOriginAppSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedOriginAppSuggestion]
  }
  
  extension [Self <: AppsDynamiteSharedOriginAppSuggestion](x: Self) {
    
    inline def setAppId(value: AppsDynamiteAppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setCardClickSuggestion(value: AppsDynamiteSharedCardClickSuggestion): Self = StObject.set(x, "cardClickSuggestion", value.asInstanceOf[js.Any])
    
    inline def setCardClickSuggestionUndefined: Self = StObject.set(x, "cardClickSuggestion", js.undefined)
  }
}
