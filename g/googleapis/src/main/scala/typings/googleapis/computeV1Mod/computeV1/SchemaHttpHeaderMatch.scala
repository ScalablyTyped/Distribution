package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpHeaderMatch extends StObject {
  
  /**
    * The value should exactly match contents of exactMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
    */
  var exactMatch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the HTTP header to match. For matching against the HTTP request's authority, use a headerMatch with the header name ":authority". For matching a request's method, use the headerName ":method". When the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true, only non-binary user-specified custom metadata and the `content-type` header are supported. The following transport-level headers cannot be used in header matching rules: `:authority`, `:method`, `:path`, `:scheme`, `user-agent`, `accept-encoding`, `content-encoding`, `grpc-accept-encoding`, `grpc-encoding`, `grpc-previous-rpc-attempts`, `grpc-tags-bin`, `grpc-timeout` and `grpc-trace-bin`.
    */
  var headerName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set to false, the headerMatch is considered a match if the preceding match criteria are met. If set to true, the headerMatch is considered a match if the preceding match criteria are NOT met. The default setting is false.
    */
  var invertMatch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The value of the header must start with the contents of prefixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
    */
  var prefixMatch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A header with the contents of headerName must exist. The match takes place whether or not the request's header has a value. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
    */
  var presentMatch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The header value must be an integer and its value must be in the range specified in rangeMatch. If the header does not contain an integer, number or is empty, the match fails. For example for a range [-5, 0] - -3 will match. - 0 will not match. - 0.25 will not match. - -3someString will not match. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. rangeMatch is not supported for load balancers that have loadBalancingScheme set to EXTERNAL.
    */
  var rangeMatch: js.UndefOr[SchemaInt64RangeMatch] = js.undefined
  
  /**
    * The value of the header must match the regular expression specified in regexMatch. For more information about regular expression syntax, see Syntax. For matching against a port specified in the HTTP request, use a headerMatch with headerName set to PORT and a regular expression that satisfies the RFC2616 Host header's port specifier. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    */
  var regexMatch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the header must end with the contents of suffixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
    */
  var suffixMatch: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpHeaderMatch {
  
  inline def apply(): SchemaHttpHeaderMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpHeaderMatch]
  }
  
  extension [Self <: SchemaHttpHeaderMatch](x: Self) {
    
    inline def setExactMatch(value: String): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
    
    inline def setExactMatchNull: Self = StObject.set(x, "exactMatch", null)
    
    inline def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
    
    inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
    
    inline def setHeaderNameNull: Self = StObject.set(x, "headerName", null)
    
    inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
    
    inline def setInvertMatch(value: Boolean): Self = StObject.set(x, "invertMatch", value.asInstanceOf[js.Any])
    
    inline def setInvertMatchNull: Self = StObject.set(x, "invertMatch", null)
    
    inline def setInvertMatchUndefined: Self = StObject.set(x, "invertMatch", js.undefined)
    
    inline def setPrefixMatch(value: String): Self = StObject.set(x, "prefixMatch", value.asInstanceOf[js.Any])
    
    inline def setPrefixMatchNull: Self = StObject.set(x, "prefixMatch", null)
    
    inline def setPrefixMatchUndefined: Self = StObject.set(x, "prefixMatch", js.undefined)
    
    inline def setPresentMatch(value: Boolean): Self = StObject.set(x, "presentMatch", value.asInstanceOf[js.Any])
    
    inline def setPresentMatchNull: Self = StObject.set(x, "presentMatch", null)
    
    inline def setPresentMatchUndefined: Self = StObject.set(x, "presentMatch", js.undefined)
    
    inline def setRangeMatch(value: SchemaInt64RangeMatch): Self = StObject.set(x, "rangeMatch", value.asInstanceOf[js.Any])
    
    inline def setRangeMatchUndefined: Self = StObject.set(x, "rangeMatch", js.undefined)
    
    inline def setRegexMatch(value: String): Self = StObject.set(x, "regexMatch", value.asInstanceOf[js.Any])
    
    inline def setRegexMatchNull: Self = StObject.set(x, "regexMatch", null)
    
    inline def setRegexMatchUndefined: Self = StObject.set(x, "regexMatch", js.undefined)
    
    inline def setSuffixMatch(value: String): Self = StObject.set(x, "suffixMatch", value.asInstanceOf[js.Any])
    
    inline def setSuffixMatchNull: Self = StObject.set(x, "suffixMatch", null)
    
    inline def setSuffixMatchUndefined: Self = StObject.set(x, "suffixMatch", js.undefined)
  }
}
