package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.matrixJsSdk.anon.GetAccessToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClientOption extends StObject {
  
  var accessToken: js.UndefOr[String] = js.undefined
  
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var cryptoCallbacks: js.UndefOr[StringDictionary[js.Function1[/* repeated */ Any, Unit]]] = js.undefined
  
  var cryptoStore: js.UndefOr[Any] = js.undefined
  
  var deviceId: js.UndefOr[String] = js.undefined
  
  var deviceToImport: js.UndefOr[Any] = js.undefined
  
  var fallbackICEServerAllowed: js.UndefOr[Boolean] = js.undefined
  
  var forceTURN: js.UndefOr[Boolean] = js.undefined
  
  var idBaseUrl: js.UndefOr[String] = js.undefined
  
  var identityServer: js.UndefOr[GetAccessToken] = js.undefined
  
  var localTimeoutMs: js.UndefOr[Double] = js.undefined
  
  var queryParams: js.UndefOr[Any] = js.undefined
  
  var request: js.UndefOr[Any] = js.undefined
  
  var scheduler: js.UndefOr[MatrixScheduler] = js.undefined
  
  var store: js.UndefOr[MatrixStore] = js.undefined
  
  var timelineSupport: js.UndefOr[Boolean] = js.undefined
  
  var unstableClientRelationAggregation: js.UndefOr[Boolean] = js.undefined
  
  var useAuthorizationHeader: js.UndefOr[Boolean] = js.undefined
  
  var userId: js.UndefOr[String] = js.undefined
  
  var verificationMethods: js.UndefOr[js.Array[String]] = js.undefined
}
object CreateClientOption {
  
  inline def apply(): CreateClientOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClientOption]
  }
  
  extension [Self <: CreateClientOption](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setCryptoCallbacks(value: StringDictionary[js.Function1[/* repeated */ Any, Unit]]): Self = StObject.set(x, "cryptoCallbacks", value.asInstanceOf[js.Any])
    
    inline def setCryptoCallbacksUndefined: Self = StObject.set(x, "cryptoCallbacks", js.undefined)
    
    inline def setCryptoStore(value: Any): Self = StObject.set(x, "cryptoStore", value.asInstanceOf[js.Any])
    
    inline def setCryptoStoreUndefined: Self = StObject.set(x, "cryptoStore", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceToImport(value: Any): Self = StObject.set(x, "deviceToImport", value.asInstanceOf[js.Any])
    
    inline def setDeviceToImportUndefined: Self = StObject.set(x, "deviceToImport", js.undefined)
    
    inline def setFallbackICEServerAllowed(value: Boolean): Self = StObject.set(x, "fallbackICEServerAllowed", value.asInstanceOf[js.Any])
    
    inline def setFallbackICEServerAllowedUndefined: Self = StObject.set(x, "fallbackICEServerAllowed", js.undefined)
    
    inline def setForceTURN(value: Boolean): Self = StObject.set(x, "forceTURN", value.asInstanceOf[js.Any])
    
    inline def setForceTURNUndefined: Self = StObject.set(x, "forceTURN", js.undefined)
    
    inline def setIdBaseUrl(value: String): Self = StObject.set(x, "idBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setIdBaseUrlUndefined: Self = StObject.set(x, "idBaseUrl", js.undefined)
    
    inline def setIdentityServer(value: GetAccessToken): Self = StObject.set(x, "identityServer", value.asInstanceOf[js.Any])
    
    inline def setIdentityServerUndefined: Self = StObject.set(x, "identityServer", js.undefined)
    
    inline def setLocalTimeoutMs(value: Double): Self = StObject.set(x, "localTimeoutMs", value.asInstanceOf[js.Any])
    
    inline def setLocalTimeoutMsUndefined: Self = StObject.set(x, "localTimeoutMs", js.undefined)
    
    inline def setQueryParams(value: Any): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setScheduler(value: MatrixScheduler): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
    
    inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
    
    inline def setStore(value: MatrixStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setTimelineSupport(value: Boolean): Self = StObject.set(x, "timelineSupport", value.asInstanceOf[js.Any])
    
    inline def setTimelineSupportUndefined: Self = StObject.set(x, "timelineSupport", js.undefined)
    
    inline def setUnstableClientRelationAggregation(value: Boolean): Self = StObject.set(x, "unstableClientRelationAggregation", value.asInstanceOf[js.Any])
    
    inline def setUnstableClientRelationAggregationUndefined: Self = StObject.set(x, "unstableClientRelationAggregation", js.undefined)
    
    inline def setUseAuthorizationHeader(value: Boolean): Self = StObject.set(x, "useAuthorizationHeader", value.asInstanceOf[js.Any])
    
    inline def setUseAuthorizationHeaderUndefined: Self = StObject.set(x, "useAuthorizationHeader", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setVerificationMethods(value: js.Array[String]): Self = StObject.set(x, "verificationMethods", value.asInstanceOf[js.Any])
    
    inline def setVerificationMethodsUndefined: Self = StObject.set(x, "verificationMethods", js.undefined)
    
    inline def setVerificationMethodsVarargs(value: String*): Self = StObject.set(x, "verificationMethods", js.Array(value*))
  }
}
