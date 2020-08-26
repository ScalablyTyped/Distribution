package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing what to include in the cache key for a request for Cloud
  * CDN.
  */
@js.native
trait SchemaCacheKeyPolicy extends js.Object {
  /**
    * If true, requests to different hosts will be cached separately.
    */
  var includeHost: js.UndefOr[Boolean] = js.native
  /**
    * If true, http and https requests will be cached separately.
    */
  var includeProtocol: js.UndefOr[Boolean] = js.native
  /**
    * If true, include query string parameters in the cache key according to
    * query_string_whitelist and query_string_blacklist. If neither is set, the
    * entire query string will be included. If false, the query string will be
    * excluded from the cache key entirely.
    */
  var includeQueryString: js.UndefOr[Boolean] = js.native
  /**
    * Names of query string parameters to exclude in cache keys. All other
    * parameters will be included. Either specify query_string_whitelist or
    * query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be
    * percent encoded and not treated as delimiters.
    */
  var queryStringBlacklist: js.UndefOr[js.Array[String]] = js.native
  /**
    * Names of query string parameters to include in cache keys. All other
    * parameters will be excluded. Either specify query_string_whitelist or
    * query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be
    * percent encoded and not treated as delimiters.
    */
  var queryStringWhitelist: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCacheKeyPolicy {
  @scala.inline
  def apply(): SchemaCacheKeyPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCacheKeyPolicy]
  }
  @scala.inline
  implicit class SchemaCacheKeyPolicyOps[Self <: SchemaCacheKeyPolicy] (val x: Self) extends AnyVal {
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

