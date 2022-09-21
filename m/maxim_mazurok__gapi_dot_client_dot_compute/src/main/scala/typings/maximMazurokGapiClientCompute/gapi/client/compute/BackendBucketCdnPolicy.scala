package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendBucketCdnPolicy extends StObject {
  
  /**
    * Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization headers. Up to 5 headers can be specified. The cache is bypassed for all
    * cdnPolicy.cacheMode settings.
    */
  var bypassCacheOnRequestHeaders: js.UndefOr[js.Array[BackendBucketCdnPolicyBypassCacheOnRequestHeader]] = js.undefined
  
  /**
    * Specifies the cache setting for all responses from this backend. The possible values are: USE_ORIGIN_HEADERS Requires the origin to set valid caching headers to cache content.
    * Responses without these headers will not be cached at Google's edge, and will require a full trip to the origin on every request, potentially impacting performance and increasing
    * load on the origin server. FORCE_CACHE_ALL Cache all content, ignoring any "private", "no-store" or "no-cache" directives in Cache-Control response headers. Warning: this may result
    * in Cloud CDN caching private, per-user (user identifiable) content. CACHE_ALL_STATIC Automatically cache static content, including common image formats, media (video and audio), and
    * web assets (JavaScript and CSS). Requests and responses that are marked as uncacheable, as well as dynamic content (including HTML), will not be cached.
    */
  var cacheMode: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a separate client (e.g. browser client) maximum TTL. This is used to clamp the max-age (or Expires) value sent to the client. With FORCE_CACHE_ALL, the lesser of
    * client_ttl and default_ttl is used for the response max-age directive, along with a "public" directive. For cacheable content in CACHE_ALL_STATIC mode, client_ttl clamps the max-age
    * from the origin (if specified), or else sets the response max-age directive to the lesser of the client_ttl and default_ttl, and also ensures a "public" cache-control directive is
    * present. If a client TTL is not specified, a default value (1 hour) will be used. The maximum allowed value is 86400s (1 day).
    */
  var clientTtl: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age). Setting a TTL of "0" means "always
    * revalidate". The value of defaultTTL cannot be set to a value greater than that of maxTTL, but can be equal. When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will
    * overwrite the TTL set in all responses. The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined
    * TTL.
    */
  var defaultTtl: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the maximum allowed TTL for cached content served by this origin. Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more
    * than maxTTL seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive. Headers sent to the client will not be
    * modified. Setting a TTL of "0" means "always revalidate". The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache
    * before the defined TTL.
    */
  var maxTtl: js.UndefOr[Double] = js.undefined
  
  /**
    * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve
    * end-user experience by reducing response latency. When the cache mode is set to CACHE_ALL_STATIC or USE_ORIGIN_HEADERS, negative caching applies to responses with the specified
    * response code that lack any Cache-Control, Expires, or Pragma: no-cache directives. When the cache mode is set to FORCE_CACHE_ALL, negative caching applies to all responses with the
    * specified response code, and override any caching headers. By default, Cloud CDN will apply the following default TTLs to these status codes: HTTP 300 (Multiple Choice), 301, 308
    * (Permanent Redirects): 10m HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s HTTP 405 (Method Not Found), 421 (Misdirected Request), 501 (Not Implemented):
    * 60s. These defaults can be overridden in negative_caching_policy.
    */
  var negativeCaching: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets a cache TTL for the specified HTTP status code. negative_caching must be enabled to configure negative_caching_policy. Omitting the policy and leaving negative_caching enabled
    * will use Cloud CDN's default cache TTLs. Note that when specifying an explicit negative_caching_policy, you should take care to specify a cache TTL for all response codes that you
    * wish to cache. Cloud CDN will not apply any default negative caching when a policy exists.
    */
  var negativeCachingPolicy: js.UndefOr[js.Array[BackendBucketCdnPolicyNegativeCachingPolicy]] = js.undefined
  
  /** If true then Cloud CDN will combine multiple concurrent cache fill requests into a small number of requests to the origin. */
  var requestCoalescing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache. This setting defines the
    * default "max-stale" duration for any cached responses that do not specify a max-stale directive. Stale responses that exceed the TTL configured here will not be served. The default
    * limit (max-stale) is 86400s (1 day), which will allow stale content to be served up to this limit beyond the max-age (or s-max-age) of a cached response. The maximum allowed value
    * is 604800 (1 week). Set this to zero (0) to disable serve-while-stale.
    */
  var serveWhileStale: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum number of seconds the response to a signed URL request will be considered fresh. After this time period, the response will be revalidated before being served. Defaults to
    * 1hr (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as though all responses from this backend had a "Cache-Control: public, max-age=[TTL]"
    * header, regardless of any existing Cache-Control header. The actual headers served in responses will not be altered.
    */
  var signedUrlCacheMaxAgeSec: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Names of the keys for signing request URLs. */
  var signedUrlKeyNames: js.UndefOr[js.Array[String]] = js.undefined
}
object BackendBucketCdnPolicy {
  
  inline def apply(): BackendBucketCdnPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendBucketCdnPolicy]
  }
  
  extension [Self <: BackendBucketCdnPolicy](x: Self) {
    
    inline def setBypassCacheOnRequestHeaders(value: js.Array[BackendBucketCdnPolicyBypassCacheOnRequestHeader]): Self = StObject.set(x, "bypassCacheOnRequestHeaders", value.asInstanceOf[js.Any])
    
    inline def setBypassCacheOnRequestHeadersUndefined: Self = StObject.set(x, "bypassCacheOnRequestHeaders", js.undefined)
    
    inline def setBypassCacheOnRequestHeadersVarargs(value: BackendBucketCdnPolicyBypassCacheOnRequestHeader*): Self = StObject.set(x, "bypassCacheOnRequestHeaders", js.Array(value*))
    
    inline def setCacheMode(value: String): Self = StObject.set(x, "cacheMode", value.asInstanceOf[js.Any])
    
    inline def setCacheModeUndefined: Self = StObject.set(x, "cacheMode", js.undefined)
    
    inline def setClientTtl(value: Double): Self = StObject.set(x, "clientTtl", value.asInstanceOf[js.Any])
    
    inline def setClientTtlUndefined: Self = StObject.set(x, "clientTtl", js.undefined)
    
    inline def setDefaultTtl(value: Double): Self = StObject.set(x, "defaultTtl", value.asInstanceOf[js.Any])
    
    inline def setDefaultTtlUndefined: Self = StObject.set(x, "defaultTtl", js.undefined)
    
    inline def setMaxTtl(value: Double): Self = StObject.set(x, "maxTtl", value.asInstanceOf[js.Any])
    
    inline def setMaxTtlUndefined: Self = StObject.set(x, "maxTtl", js.undefined)
    
    inline def setNegativeCaching(value: Boolean): Self = StObject.set(x, "negativeCaching", value.asInstanceOf[js.Any])
    
    inline def setNegativeCachingPolicy(value: js.Array[BackendBucketCdnPolicyNegativeCachingPolicy]): Self = StObject.set(x, "negativeCachingPolicy", value.asInstanceOf[js.Any])
    
    inline def setNegativeCachingPolicyUndefined: Self = StObject.set(x, "negativeCachingPolicy", js.undefined)
    
    inline def setNegativeCachingPolicyVarargs(value: BackendBucketCdnPolicyNegativeCachingPolicy*): Self = StObject.set(x, "negativeCachingPolicy", js.Array(value*))
    
    inline def setNegativeCachingUndefined: Self = StObject.set(x, "negativeCaching", js.undefined)
    
    inline def setRequestCoalescing(value: Boolean): Self = StObject.set(x, "requestCoalescing", value.asInstanceOf[js.Any])
    
    inline def setRequestCoalescingUndefined: Self = StObject.set(x, "requestCoalescing", js.undefined)
    
    inline def setServeWhileStale(value: Double): Self = StObject.set(x, "serveWhileStale", value.asInstanceOf[js.Any])
    
    inline def setServeWhileStaleUndefined: Self = StObject.set(x, "serveWhileStale", js.undefined)
    
    inline def setSignedUrlCacheMaxAgeSec(value: String): Self = StObject.set(x, "signedUrlCacheMaxAgeSec", value.asInstanceOf[js.Any])
    
    inline def setSignedUrlCacheMaxAgeSecUndefined: Self = StObject.set(x, "signedUrlCacheMaxAgeSec", js.undefined)
    
    inline def setSignedUrlKeyNames(value: js.Array[String]): Self = StObject.set(x, "signedUrlKeyNames", value.asInstanceOf[js.Any])
    
    inline def setSignedUrlKeyNamesUndefined: Self = StObject.set(x, "signedUrlKeyNames", js.undefined)
    
    inline def setSignedUrlKeyNamesVarargs(value: String*): Self = StObject.set(x, "signedUrlKeyNames", js.Array(value*))
  }
}
