package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCacheKeyPolicy extends StObject {
  
  /**
    * If true, requests to different hosts will be cached separately.
    */
  var includeHost: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Allows HTTP request headers (by name) to be used in the cache key.
    */
  var includeHttpHeaders: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in the cache key Cloud CDN generates.
    */
  var includeNamedCookies: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * If true, http and https requests will be cached separately.
    */
  var includeProtocol: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, include query string parameters in the cache key according to query_string_whitelist and query_string_blacklist. If neither is set, the entire query string will be included. If false, the query string will be excluded from the cache key entirely.
    */
  var includeQueryString: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and '=' will be percent encoded and not treated as delimiters.
    */
  var queryStringBlacklist: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and '=' will be percent encoded and not treated as delimiters.
    */
  var queryStringWhitelist: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCacheKeyPolicy {
  
  inline def apply(): SchemaCacheKeyPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCacheKeyPolicy]
  }
  
  extension [Self <: SchemaCacheKeyPolicy](x: Self) {
    
    inline def setIncludeHost(value: Boolean): Self = StObject.set(x, "includeHost", value.asInstanceOf[js.Any])
    
    inline def setIncludeHostNull: Self = StObject.set(x, "includeHost", null)
    
    inline def setIncludeHostUndefined: Self = StObject.set(x, "includeHost", js.undefined)
    
    inline def setIncludeHttpHeaders(value: js.Array[String]): Self = StObject.set(x, "includeHttpHeaders", value.asInstanceOf[js.Any])
    
    inline def setIncludeHttpHeadersNull: Self = StObject.set(x, "includeHttpHeaders", null)
    
    inline def setIncludeHttpHeadersUndefined: Self = StObject.set(x, "includeHttpHeaders", js.undefined)
    
    inline def setIncludeHttpHeadersVarargs(value: String*): Self = StObject.set(x, "includeHttpHeaders", js.Array(value*))
    
    inline def setIncludeNamedCookies(value: js.Array[String]): Self = StObject.set(x, "includeNamedCookies", value.asInstanceOf[js.Any])
    
    inline def setIncludeNamedCookiesNull: Self = StObject.set(x, "includeNamedCookies", null)
    
    inline def setIncludeNamedCookiesUndefined: Self = StObject.set(x, "includeNamedCookies", js.undefined)
    
    inline def setIncludeNamedCookiesVarargs(value: String*): Self = StObject.set(x, "includeNamedCookies", js.Array(value*))
    
    inline def setIncludeProtocol(value: Boolean): Self = StObject.set(x, "includeProtocol", value.asInstanceOf[js.Any])
    
    inline def setIncludeProtocolNull: Self = StObject.set(x, "includeProtocol", null)
    
    inline def setIncludeProtocolUndefined: Self = StObject.set(x, "includeProtocol", js.undefined)
    
    inline def setIncludeQueryString(value: Boolean): Self = StObject.set(x, "includeQueryString", value.asInstanceOf[js.Any])
    
    inline def setIncludeQueryStringNull: Self = StObject.set(x, "includeQueryString", null)
    
    inline def setIncludeQueryStringUndefined: Self = StObject.set(x, "includeQueryString", js.undefined)
    
    inline def setQueryStringBlacklist(value: js.Array[String]): Self = StObject.set(x, "queryStringBlacklist", value.asInstanceOf[js.Any])
    
    inline def setQueryStringBlacklistNull: Self = StObject.set(x, "queryStringBlacklist", null)
    
    inline def setQueryStringBlacklistUndefined: Self = StObject.set(x, "queryStringBlacklist", js.undefined)
    
    inline def setQueryStringBlacklistVarargs(value: String*): Self = StObject.set(x, "queryStringBlacklist", js.Array(value*))
    
    inline def setQueryStringWhitelist(value: js.Array[String]): Self = StObject.set(x, "queryStringWhitelist", value.asInstanceOf[js.Any])
    
    inline def setQueryStringWhitelistNull: Self = StObject.set(x, "queryStringWhitelist", null)
    
    inline def setQueryStringWhitelistUndefined: Self = StObject.set(x, "queryStringWhitelist", js.undefined)
    
    inline def setQueryStringWhitelistVarargs(value: String*): Self = StObject.set(x, "queryStringWhitelist", js.Array(value*))
  }
}
