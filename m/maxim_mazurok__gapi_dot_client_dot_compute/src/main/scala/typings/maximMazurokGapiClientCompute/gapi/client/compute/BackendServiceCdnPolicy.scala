package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendServiceCdnPolicy extends StObject {
  
  /** The CacheKeyPolicy for this CdnPolicy. */
  var cacheKeyPolicy: js.UndefOr[CacheKeyPolicy] = js.undefined
  
  /**
    * Maximum number of seconds the response to a signed URL request will be considered fresh. After this time period, the response will be revalidated before being served. Defaults to
    * 1hr (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as though all responses from this backend had a "Cache-Control: public, max-age=[TTL]"
    * header, regardless of any existing Cache-Control header. The actual headers served in responses will not be altered.
    */
  var signedUrlCacheMaxAgeSec: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Names of the keys for signing request URLs. */
  var signedUrlKeyNames: js.UndefOr[js.Array[String]] = js.undefined
}
object BackendServiceCdnPolicy {
  
  @scala.inline
  def apply(): BackendServiceCdnPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceCdnPolicy]
  }
  
  @scala.inline
  implicit class BackendServiceCdnPolicyMutableBuilder[Self <: BackendServiceCdnPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheKeyPolicy(value: CacheKeyPolicy): Self = StObject.set(x, "cacheKeyPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheKeyPolicyUndefined: Self = StObject.set(x, "cacheKeyPolicy", js.undefined)
    
    @scala.inline
    def setSignedUrlCacheMaxAgeSec(value: String): Self = StObject.set(x, "signedUrlCacheMaxAgeSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedUrlCacheMaxAgeSecUndefined: Self = StObject.set(x, "signedUrlCacheMaxAgeSec", js.undefined)
    
    @scala.inline
    def setSignedUrlKeyNames(value: js.Array[String]): Self = StObject.set(x, "signedUrlKeyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedUrlKeyNamesUndefined: Self = StObject.set(x, "signedUrlKeyNames", js.undefined)
    
    @scala.inline
    def setSignedUrlKeyNamesVarargs(value: String*): Self = StObject.set(x, "signedUrlKeyNames", js.Array(value :_*))
  }
}
