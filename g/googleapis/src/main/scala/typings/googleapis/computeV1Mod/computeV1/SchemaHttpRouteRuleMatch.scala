package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteRuleMatch extends StObject {
  
  /**
    * For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be part of the original URL. fullPathMatch must be from 1 to 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
    */
  var fullPathMatch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies a list of header match criteria, all of which must match corresponding headers in the request.
    */
  var headerMatches: js.UndefOr[js.Array[SchemaHttpHeaderMatch]] = js.undefined
  
  /**
    * Specifies that prefixMatch and fullPathMatch matches are case sensitive. The default value is false. ignoreCase must not be used with regexMatch. Not supported when the URL map is bound to a target gRPC proxy.
    */
  var ignoreCase: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Opaque filter criteria used by the load balancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to the load balancer, xDS clients present node metadata. When there is a match, the relevant routing configuration is made available to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadata filters are specified, all of them need to be satisfied in order to be considered a match. metadataFilters specified here is applied after those specified in ForwardingRule that refers to the UrlMap this HttpRouteRuleMatch belongs to. metadataFilters only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
    */
  var metadataFilters: js.UndefOr[js.Array[SchemaMetadataFilter]] = js.undefined
  
  /**
    * For satisfying the matchRule condition, the request's path must begin with the specified prefixMatch. prefixMatch must begin with a /. The value must be from 1 to 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
    */
  var prefixMatch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request. Not supported when the URL map is bound to a target gRPC proxy.
    */
  var queryParameterMatches: js.UndefOr[js.Array[SchemaHttpQueryParameterMatch]] = js.undefined
  
  /**
    * For satisfying the matchRule condition, the path of the request must satisfy the regular expression specified in regexMatch after removing any query parameters and anchor supplied with the original URL. For more information about regular expression syntax, see Syntax. Only one of prefixMatch, fullPathMatch or regexMatch must be specified. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    */
  var regexMatch: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpRouteRuleMatch {
  
  inline def apply(): SchemaHttpRouteRuleMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteRuleMatch]
  }
  
  extension [Self <: SchemaHttpRouteRuleMatch](x: Self) {
    
    inline def setFullPathMatch(value: String): Self = StObject.set(x, "fullPathMatch", value.asInstanceOf[js.Any])
    
    inline def setFullPathMatchNull: Self = StObject.set(x, "fullPathMatch", null)
    
    inline def setFullPathMatchUndefined: Self = StObject.set(x, "fullPathMatch", js.undefined)
    
    inline def setHeaderMatches(value: js.Array[SchemaHttpHeaderMatch]): Self = StObject.set(x, "headerMatches", value.asInstanceOf[js.Any])
    
    inline def setHeaderMatchesUndefined: Self = StObject.set(x, "headerMatches", js.undefined)
    
    inline def setHeaderMatchesVarargs(value: SchemaHttpHeaderMatch*): Self = StObject.set(x, "headerMatches", js.Array(value*))
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseNull: Self = StObject.set(x, "ignoreCase", null)
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setMetadataFilters(value: js.Array[SchemaMetadataFilter]): Self = StObject.set(x, "metadataFilters", value.asInstanceOf[js.Any])
    
    inline def setMetadataFiltersUndefined: Self = StObject.set(x, "metadataFilters", js.undefined)
    
    inline def setMetadataFiltersVarargs(value: SchemaMetadataFilter*): Self = StObject.set(x, "metadataFilters", js.Array(value*))
    
    inline def setPrefixMatch(value: String): Self = StObject.set(x, "prefixMatch", value.asInstanceOf[js.Any])
    
    inline def setPrefixMatchNull: Self = StObject.set(x, "prefixMatch", null)
    
    inline def setPrefixMatchUndefined: Self = StObject.set(x, "prefixMatch", js.undefined)
    
    inline def setQueryParameterMatches(value: js.Array[SchemaHttpQueryParameterMatch]): Self = StObject.set(x, "queryParameterMatches", value.asInstanceOf[js.Any])
    
    inline def setQueryParameterMatchesUndefined: Self = StObject.set(x, "queryParameterMatches", js.undefined)
    
    inline def setQueryParameterMatchesVarargs(value: SchemaHttpQueryParameterMatch*): Self = StObject.set(x, "queryParameterMatches", js.Array(value*))
    
    inline def setRegexMatch(value: String): Self = StObject.set(x, "regexMatch", value.asInstanceOf[js.Any])
    
    inline def setRegexMatchNull: Self = StObject.set(x, "regexMatch", null)
    
    inline def setRegexMatchUndefined: Self = StObject.set(x, "regexMatch", js.undefined)
  }
}
