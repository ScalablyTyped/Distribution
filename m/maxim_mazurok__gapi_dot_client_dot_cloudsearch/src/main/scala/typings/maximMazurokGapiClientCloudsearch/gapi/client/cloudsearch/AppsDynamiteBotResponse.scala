package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteBotResponse extends StObject {
  
  var botId: js.UndefOr[AppsDynamiteUserId] = js.undefined
  
  var requiredAction: js.UndefOr[String] = js.undefined
  
  var responseType: js.UndefOr[String] = js.undefined
  
  /** URL for setting up bot. */
  var setupUrl: js.UndefOr[String] = js.undefined
}
object AppsDynamiteBotResponse {
  
  inline def apply(): AppsDynamiteBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteBotResponse]
  }
  
  extension [Self <: AppsDynamiteBotResponse](x: Self) {
    
    inline def setBotId(value: AppsDynamiteUserId): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setRequiredAction(value: String): Self = StObject.set(x, "requiredAction", value.asInstanceOf[js.Any])
    
    inline def setRequiredActionUndefined: Self = StObject.set(x, "requiredAction", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setSetupUrl(value: String): Self = StObject.set(x, "setupUrl", value.asInstanceOf[js.Any])
    
    inline def setSetupUrlUndefined: Self = StObject.set(x, "setupUrl", js.undefined)
  }
}
