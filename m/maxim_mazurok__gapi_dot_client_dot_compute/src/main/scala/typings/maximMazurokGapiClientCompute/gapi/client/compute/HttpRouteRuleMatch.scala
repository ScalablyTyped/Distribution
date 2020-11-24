package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRouteRuleMatch extends js.Object {
  
  /**
    * For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be
    * part of the original URL.
    * fullPathMatch must be between 1 and 1024 characters.
    * Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
    */
  var fullPathMatch: js.UndefOr[String] = js.native
  
  /** Specifies a list of header match criteria, all of which must match corresponding headers in the request. */
  var headerMatches: js.UndefOr[js.Array[HttpHeaderMatch]] = js.native
  
  /**
    * Specifies that prefixMatch and fullPathMatch matches are case sensitive.
    * The default value is false.
    * ignoreCase must not be used with regexMatch.
    * Not supported when the URL map is bound to target gRPC proxy.
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  /**
    * Opaque filter criteria used by Loadbalancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to Loadbalancer, xDS clients present
    * node metadata. When there is a match, the relevant routing configuration is made available to those proxies.
    * For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata.
    * If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadataFilters are
    * specified, all of them need to be satisfied in order to be considered a match.
    * metadataFilters specified here will be applied after those specified in ForwardingRule that refers to the UrlMap this HttpRouteRuleMatch belongs to.
    * metadataFilters only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var metadataFilters: js.UndefOr[js.Array[MetadataFilter]] = js.native
  
  /**
    * For satisfying the matchRule condition, the request's path must begin with the specified prefixMatch. prefixMatch must begin with a /.
    * The value must be between 1 and 1024 characters.
    * Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
    */
  var prefixMatch: js.UndefOr[String] = js.native
  
  /**
    * Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
    * Not supported when the URL map is bound to target gRPC proxy.
    */
  var queryParameterMatches: js.UndefOr[js.Array[HttpQueryParameterMatch]] = js.native
  
  /**
    * For satisfying the matchRule condition, the path of the request must satisfy the regular expression specified in regexMatch after removing any query parameters and anchor supplied
    * with the original URL. For regular expression grammar please see en.cppreference.com/w/cpp/regex/ecmascript
    * Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
    * Note that regexMatch only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    */
  var regexMatch: js.UndefOr[String] = js.native
}
object HttpRouteRuleMatch {
  
  @scala.inline
  def apply(): HttpRouteRuleMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRouteRuleMatch]
  }
  
  @scala.inline
  implicit class HttpRouteRuleMatchOps[Self <: HttpRouteRuleMatch] (val x: Self) extends AnyVal {
    
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
    def setFullPathMatch(value: String): Self = this.set("fullPathMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullPathMatch: Self = this.set("fullPathMatch", js.undefined)
    
    @scala.inline
    def setHeaderMatchesVarargs(value: HttpHeaderMatch*): Self = this.set("headerMatches", js.Array(value :_*))
    
    @scala.inline
    def setHeaderMatches(value: js.Array[HttpHeaderMatch]): Self = this.set("headerMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderMatches: Self = this.set("headerMatches", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    
    @scala.inline
    def setMetadataFiltersVarargs(value: MetadataFilter*): Self = this.set("metadataFilters", js.Array(value :_*))
    
    @scala.inline
    def setMetadataFilters(value: js.Array[MetadataFilter]): Self = this.set("metadataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataFilters: Self = this.set("metadataFilters", js.undefined)
    
    @scala.inline
    def setPrefixMatch(value: String): Self = this.set("prefixMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixMatch: Self = this.set("prefixMatch", js.undefined)
    
    @scala.inline
    def setQueryParameterMatchesVarargs(value: HttpQueryParameterMatch*): Self = this.set("queryParameterMatches", js.Array(value :_*))
    
    @scala.inline
    def setQueryParameterMatches(value: js.Array[HttpQueryParameterMatch]): Self = this.set("queryParameterMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParameterMatches: Self = this.set("queryParameterMatches", js.undefined)
    
    @scala.inline
    def setRegexMatch(value: String): Self = this.set("regexMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexMatch: Self = this.set("regexMatch", js.undefined)
  }
}
