package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteConsentedAppUnfurlMetadata extends StObject {
  
  /** Client specified AppId, which will not be sanitized and is untrusted. */
  var clientSpecifiedAppId: js.UndefOr[AppsDynamiteUserId] = js.undefined
}
object AppsDynamiteConsentedAppUnfurlMetadata {
  
  inline def apply(): AppsDynamiteConsentedAppUnfurlMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteConsentedAppUnfurlMetadata]
  }
  
  extension [Self <: AppsDynamiteConsentedAppUnfurlMetadata](x: Self) {
    
    inline def setClientSpecifiedAppId(value: AppsDynamiteUserId): Self = StObject.set(x, "clientSpecifiedAppId", value.asInstanceOf[js.Any])
    
    inline def setClientSpecifiedAppIdUndefined: Self = StObject.set(x, "clientSpecifiedAppId", js.undefined)
  }
}
