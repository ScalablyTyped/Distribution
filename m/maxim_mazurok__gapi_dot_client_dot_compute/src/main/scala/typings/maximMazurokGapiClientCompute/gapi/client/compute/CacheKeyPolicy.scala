package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheKeyPolicy extends js.Object {
  
  /** If true, requests to different hosts will be cached separately. */
  var includeHost: js.UndefOr[Boolean] = js.native
  
  /** If true, http and https requests will be cached separately. */
  var includeProtocol: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, include query string parameters in the cache key according to query_string_whitelist and query_string_blacklist. If neither is set, the entire query string will be
    * included. If false, the query string will be excluded from the cache key entirely.
    */
  var includeQueryString: js.UndefOr[Boolean] = js.native
  
  /**
    * Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and
    * '=' will be percent encoded and not treated as delimiters.
    */
  var queryStringBlacklist: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and
    * '=' will be percent encoded and not treated as delimiters.
    */
  var queryStringWhitelist: js.UndefOr[js.Array[String]] = js.native
}
object CacheKeyPolicy {
  
  @scala.inline
  def apply(): CacheKeyPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheKeyPolicy]
  }
  
  @scala.inline
  implicit class CacheKeyPolicyOps[Self <: CacheKeyPolicy] (val x: Self) extends AnyVal {
    
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
    def setIncludeHost(value: Boolean): Self = this.set("includeHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeHost: Self = this.set("includeHost", js.undefined)
    
    @scala.inline
    def setIncludeProtocol(value: Boolean): Self = this.set("includeProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeProtocol: Self = this.set("includeProtocol", js.undefined)
    
    @scala.inline
    def setIncludeQueryString(value: Boolean): Self = this.set("includeQueryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeQueryString: Self = this.set("includeQueryString", js.undefined)
    
    @scala.inline
    def setQueryStringBlacklistVarargs(value: String*): Self = this.set("queryStringBlacklist", js.Array(value :_*))
    
    @scala.inline
    def setQueryStringBlacklist(value: js.Array[String]): Self = this.set("queryStringBlacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryStringBlacklist: Self = this.set("queryStringBlacklist", js.undefined)
    
    @scala.inline
    def setQueryStringWhitelistVarargs(value: String*): Self = this.set("queryStringWhitelist", js.Array(value :_*))
    
    @scala.inline
    def setQueryStringWhitelist(value: js.Array[String]): Self = this.set("queryStringWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryStringWhitelist: Self = this.set("queryStringWhitelist", js.undefined)
  }
}
