package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpRouteRuleMatch extends StObject {
  
  /**
    * For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be
    * part of the original URL.
    * fullPathMatch must be between 1 and 1024 characters.
    * Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
    */
  var fullPathMatch: js.UndefOr[String] = js.undefined
  
  /** Specifies a list of header match criteria, all of which must match corresponding headers in the request. */
  var headerMatches: js.UndefOr[js.Array[HttpHeaderMatch]] = js.undefined
  
  /**
    * Specifies that prefixMatch and fullPathMatch matches are case sensitive.
    * The default value is false.
    * ignoreCase must not be used with regexMatch.
    * Not supported when the URL map is bound to target gRPC proxy.
    */
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
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
  var metadataFilters: js.UndefOr[js.Array[MetadataFilter]] = js.undefined
  
  /**
    * For satisfying the matchRule condition, the request's path must begin with the specified prefixMatch. prefixMatch must begin with a /.
    * The value must be between 1 and 1024 characters.
    * Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
    */
  var prefixMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
    * Not supported when the URL map is bound to target gRPC proxy.
    */
  var queryParameterMatches: js.UndefOr[js.Array[HttpQueryParameterMatch]] = js.undefined
  
  /**
    * For satisfying the matchRule condition, the path of the request must satisfy the regular expression specified in regexMatch after removing any query parameters and anchor supplied
    * with the original URL. For regular expression grammar please see en.cppreference.com/w/cpp/regex/ecmascript
    * Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
    * Note that regexMatch only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    */
  var regexMatch: js.UndefOr[String] = js.undefined
}
object HttpRouteRuleMatch {
  
  @scala.inline
  def apply(): HttpRouteRuleMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRouteRuleMatch]
  }
  
  @scala.inline
  implicit class HttpRouteRuleMatchMutableBuilder[Self <: HttpRouteRuleMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullPathMatch(value: String): Self = StObject.set(x, "fullPathMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullPathMatchUndefined: Self = StObject.set(x, "fullPathMatch", js.undefined)
    
    @scala.inline
    def setHeaderMatches(value: js.Array[HttpHeaderMatch]): Self = StObject.set(x, "headerMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderMatchesUndefined: Self = StObject.set(x, "headerMatches", js.undefined)
    
    @scala.inline
    def setHeaderMatchesVarargs(value: HttpHeaderMatch*): Self = StObject.set(x, "headerMatches", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    @scala.inline
    def setMetadataFilters(value: js.Array[MetadataFilter]): Self = StObject.set(x, "metadataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataFiltersUndefined: Self = StObject.set(x, "metadataFilters", js.undefined)
    
    @scala.inline
    def setMetadataFiltersVarargs(value: MetadataFilter*): Self = StObject.set(x, "metadataFilters", js.Array(value :_*))
    
    @scala.inline
    def setPrefixMatch(value: String): Self = StObject.set(x, "prefixMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixMatchUndefined: Self = StObject.set(x, "prefixMatch", js.undefined)
    
    @scala.inline
    def setQueryParameterMatches(value: js.Array[HttpQueryParameterMatch]): Self = StObject.set(x, "queryParameterMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParameterMatchesUndefined: Self = StObject.set(x, "queryParameterMatches", js.undefined)
    
    @scala.inline
    def setQueryParameterMatchesVarargs(value: HttpQueryParameterMatch*): Self = StObject.set(x, "queryParameterMatches", js.Array(value :_*))
    
    @scala.inline
    def setRegexMatch(value: String): Self = StObject.set(x, "regexMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexMatchUndefined: Self = StObject.set(x, "regexMatch", js.undefined)
  }
}
