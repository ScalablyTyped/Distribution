package typings.matrixJsSdk

import typings.matrixJsSdk.anon.CacheSecretStorageKey
import typings.matrixJsSdk.anon.DeviceId
import typings.std.Record
import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrixMod {
  
  @JSImport("matrix-js-sdk/lib/matrix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("matrix-js-sdk/lib/matrix", "ContentHelpers")
  @js.native
  val ContentHelpers: js.Promise[js.Any] = js.native
  
  @scala.inline
  def createClient(opts: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def createClient(opts: ICreateClientOpts): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def getRequest(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")().asInstanceOf[js.Any]
  
  @scala.inline
  def request(r: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(r.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setCryptoStoreFactory(fac: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCryptoStoreFactory")(fac.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def wrapRequest(wrapper: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapRequest")(wrapper.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type CryptoStore = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MemoryCryptoStore */ js.Any
  
  trait ICreateClientOpts extends StObject {
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var baseUrl: String
    
    var cryptoCallbacks: js.UndefOr[CacheSecretStorageKey] = js.undefined
    
    var cryptoStore: js.UndefOr[CryptoStore] = js.undefined
    
    var deviceId: js.UndefOr[String] = js.undefined
    
    var deviceToImport: js.UndefOr[DeviceId] = js.undefined
    
    var fallbackICEServerAllowed: js.UndefOr[Boolean] = js.undefined
    
    var forceTURN: js.UndefOr[Boolean] = js.undefined
    
    var idBaseUrl: js.UndefOr[String] = js.undefined
    
    var identityServer: js.UndefOr[js.Any] = js.undefined
    
    var localTimeoutMs: js.UndefOr[Double] = js.undefined
    
    var queryParams: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var request: js.UndefOr[Request] = js.undefined
    
    var scheduler: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MatrixScheduler */ js.Any
      ] = js.undefined
    
    var sessionStore: js.UndefOr[js.Any] = js.undefined
    
    var store: js.UndefOr[Store] = js.undefined
    
    var unstableClientRelationAggregation: js.UndefOr[Boolean] = js.undefined
    
    var useAuthorizationHeader: js.UndefOr[Boolean] = js.undefined
    
    var userId: js.UndefOr[String] = js.undefined
    
    var verificationMethods: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object ICreateClientOpts {
    
    @scala.inline
    def apply(baseUrl: String): ICreateClientOpts = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICreateClientOpts]
    }
    
    @scala.inline
    implicit class ICreateClientOptsMutableBuilder[Self <: ICreateClientOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCryptoCallbacks(value: CacheSecretStorageKey): Self = StObject.set(x, "cryptoCallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCryptoCallbacksUndefined: Self = StObject.set(x, "cryptoCallbacks", js.undefined)
      
      @scala.inline
      def setCryptoStore(value: CryptoStore): Self = StObject.set(x, "cryptoStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCryptoStoreUndefined: Self = StObject.set(x, "cryptoStore", js.undefined)
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      @scala.inline
      def setDeviceToImport(value: DeviceId): Self = StObject.set(x, "deviceToImport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceToImportUndefined: Self = StObject.set(x, "deviceToImport", js.undefined)
      
      @scala.inline
      def setFallbackICEServerAllowed(value: Boolean): Self = StObject.set(x, "fallbackICEServerAllowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackICEServerAllowedUndefined: Self = StObject.set(x, "fallbackICEServerAllowed", js.undefined)
      
      @scala.inline
      def setForceTURN(value: Boolean): Self = StObject.set(x, "forceTURN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceTURNUndefined: Self = StObject.set(x, "forceTURN", js.undefined)
      
      @scala.inline
      def setIdBaseUrl(value: String): Self = StObject.set(x, "idBaseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdBaseUrlUndefined: Self = StObject.set(x, "idBaseUrl", js.undefined)
      
      @scala.inline
      def setIdentityServer(value: js.Any): Self = StObject.set(x, "identityServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityServerUndefined: Self = StObject.set(x, "identityServer", js.undefined)
      
      @scala.inline
      def setLocalTimeoutMs(value: Double): Self = StObject.set(x, "localTimeoutMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalTimeoutMsUndefined: Self = StObject.set(x, "localTimeoutMs", js.undefined)
      
      @scala.inline
      def setQueryParams(value: Record[String, js.Any]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setScheduler(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MatrixScheduler */ js.Any
      ): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
      
      @scala.inline
      def setSessionStore(value: js.Any): Self = StObject.set(x, "sessionStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionStoreUndefined: Self = StObject.set(x, "sessionStore", js.undefined)
      
      @scala.inline
      def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setUnstableClientRelationAggregation(value: Boolean): Self = StObject.set(x, "unstableClientRelationAggregation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstableClientRelationAggregationUndefined: Self = StObject.set(x, "unstableClientRelationAggregation", js.undefined)
      
      @scala.inline
      def setUseAuthorizationHeader(value: Boolean): Self = StObject.set(x, "useAuthorizationHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAuthorizationHeaderUndefined: Self = StObject.set(x, "useAuthorizationHeader", js.undefined)
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      
      @scala.inline
      def setVerificationMethods(value: js.Array[js.Any]): Self = StObject.set(x, "verificationMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationMethodsUndefined: Self = StObject.set(x, "verificationMethods", js.undefined)
      
      @scala.inline
      def setVerificationMethodsVarargs(value: js.Any*): Self = StObject.set(x, "verificationMethods", js.Array(value :_*))
    }
  }
  
  type Store = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StubStore */ js.Any
}
