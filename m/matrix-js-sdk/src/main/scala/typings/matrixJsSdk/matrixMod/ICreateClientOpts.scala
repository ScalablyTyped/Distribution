package typings.matrixJsSdk.matrixMod

import typings.matrixJsSdk.anon.CacheSecretStorageKey
import typings.matrixJsSdk.anon.DeviceId
import typings.std.Record
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICreateClientOpts extends js.Object {
  
  var accessToken: js.UndefOr[String] = js.native
  
  var baseUrl: String = js.native
  
  var cryptoCallbacks: js.UndefOr[CacheSecretStorageKey] = js.native
  
  var cryptoStore: js.UndefOr[CryptoStore] = js.native
  
  var deviceId: js.UndefOr[String] = js.native
  
  var deviceToImport: js.UndefOr[DeviceId] = js.native
  
  var fallbackICEServerAllowed: js.UndefOr[Boolean] = js.native
  
  var forceTURN: js.UndefOr[Boolean] = js.native
  
  var idBaseUrl: js.UndefOr[String] = js.native
  
  var identityServer: js.UndefOr[js.Any] = js.native
  
  var localTimeoutMs: js.UndefOr[Double] = js.native
  
  var queryParams: js.UndefOr[Record[String, _]] = js.native
  
  var request: js.UndefOr[Request] = js.native
  
  var scheduler: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MatrixScheduler */ js.Any
  ] = js.native
  
  var sessionStore: js.UndefOr[js.Any] = js.native
  
  var store: js.UndefOr[Store] = js.native
  
  var unstableClientRelationAggregation: js.UndefOr[Boolean] = js.native
  
  var useAuthorizationHeader: js.UndefOr[Boolean] = js.native
  
  var userId: js.UndefOr[String] = js.native
  
  var verificationMethods: js.UndefOr[js.Array[_]] = js.native
}
object ICreateClientOpts {
  
  @scala.inline
  def apply(baseUrl: String): ICreateClientOpts = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateClientOpts]
  }
  
  @scala.inline
  implicit class ICreateClientOptsOps[Self <: ICreateClientOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setCryptoCallbacks(value: CacheSecretStorageKey): Self = this.set("cryptoCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoCallbacks: Self = this.set("cryptoCallbacks", js.undefined)
    
    @scala.inline
    def setCryptoStore(value: CryptoStore): Self = this.set("cryptoStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoStore: Self = this.set("cryptoStore", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setDeviceToImport(value: DeviceId): Self = this.set("deviceToImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceToImport: Self = this.set("deviceToImport", js.undefined)
    
    @scala.inline
    def setFallbackICEServerAllowed(value: Boolean): Self = this.set("fallbackICEServerAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackICEServerAllowed: Self = this.set("fallbackICEServerAllowed", js.undefined)
    
    @scala.inline
    def setForceTURN(value: Boolean): Self = this.set("forceTURN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceTURN: Self = this.set("forceTURN", js.undefined)
    
    @scala.inline
    def setIdBaseUrl(value: String): Self = this.set("idBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdBaseUrl: Self = this.set("idBaseUrl", js.undefined)
    
    @scala.inline
    def setIdentityServer(value: js.Any): Self = this.set("identityServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityServer: Self = this.set("identityServer", js.undefined)
    
    @scala.inline
    def setLocalTimeoutMs(value: Double): Self = this.set("localTimeoutMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalTimeoutMs: Self = this.set("localTimeoutMs", js.undefined)
    
    @scala.inline
    def setQueryParams(value: Record[String, _]): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
    
    @scala.inline
    def setRequest(value: Request): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setScheduler(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MatrixScheduler */ js.Any
    ): Self = this.set("scheduler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduler: Self = this.set("scheduler", js.undefined)
    
    @scala.inline
    def setSessionStore(value: js.Any): Self = this.set("sessionStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionStore: Self = this.set("sessionStore", js.undefined)
    
    @scala.inline
    def setStore(value: Store): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setUnstableClientRelationAggregation(value: Boolean): Self = this.set("unstableClientRelationAggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnstableClientRelationAggregation: Self = this.set("unstableClientRelationAggregation", js.undefined)
    
    @scala.inline
    def setUseAuthorizationHeader(value: Boolean): Self = this.set("useAuthorizationHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAuthorizationHeader: Self = this.set("useAuthorizationHeader", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    
    @scala.inline
    def setVerificationMethodsVarargs(value: js.Any*): Self = this.set("verificationMethods", js.Array(value :_*))
    
    @scala.inline
    def setVerificationMethods(value: js.Array[_]): Self = this.set("verificationMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationMethods: Self = this.set("verificationMethods", js.undefined)
  }
}
