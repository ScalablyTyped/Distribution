package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteRouteMatch extends StObject {
  
  /**
    * The HTTP request path value should exactly match this value. Only one of full_path_match, prefix_match, or regex_match should be used.
    */
  var fullPathMatch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies a list of HTTP request headers to match against. ALL of the supplied headers must be matched.
    */
  var headers: js.UndefOr[js.Array[SchemaHttpRouteHeaderMatch]] = js.undefined
  
  /**
    * Specifies if prefix_match and full_path_match matches are case sensitive. The default value is false.
    */
  var ignoreCase: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The HTTP request path value must begin with specified prefix_match. prefix_match must begin with a /. Only one of full_path_match, prefix_match, or regex_match should be used.
    */
  var prefixMatch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies a list of query parameters to match against. ALL of the query parameters must be matched.
    */
  var queryParameters: js.UndefOr[js.Array[SchemaHttpRouteQueryParameterMatch]] = js.undefined
  
  /**
    * The HTTP request path value must satisfy the regular expression specified by regex_match after removing any query parameters and anchor supplied with the original URL. For regular expression grammar, please see https://github.com/google/re2/wiki/Syntax Only one of full_path_match, prefix_match, or regex_match should be used.
    */
  var regexMatch: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpRouteRouteMatch {
  
  inline def apply(): SchemaHttpRouteRouteMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteRouteMatch]
  }
  
  extension [Self <: SchemaHttpRouteRouteMatch](x: Self) {
    
    inline def setFullPathMatch(value: String): Self = StObject.set(x, "fullPathMatch", value.asInstanceOf[js.Any])
    
    inline def setFullPathMatchNull: Self = StObject.set(x, "fullPathMatch", null)
    
    inline def setFullPathMatchUndefined: Self = StObject.set(x, "fullPathMatch", js.undefined)
    
    inline def setHeaders(value: js.Array[SchemaHttpRouteHeaderMatch]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: SchemaHttpRouteHeaderMatch*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseNull: Self = StObject.set(x, "ignoreCase", null)
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setPrefixMatch(value: String): Self = StObject.set(x, "prefixMatch", value.asInstanceOf[js.Any])
    
    inline def setPrefixMatchNull: Self = StObject.set(x, "prefixMatch", null)
    
    inline def setPrefixMatchUndefined: Self = StObject.set(x, "prefixMatch", js.undefined)
    
    inline def setQueryParameters(value: js.Array[SchemaHttpRouteQueryParameterMatch]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    inline def setQueryParametersVarargs(value: SchemaHttpRouteQueryParameterMatch*): Self = StObject.set(x, "queryParameters", js.Array(value*))
    
    inline def setRegexMatch(value: String): Self = StObject.set(x, "regexMatch", value.asInstanceOf[js.Any])
    
    inline def setRegexMatchNull: Self = StObject.set(x, "regexMatch", null)
    
    inline def setRegexMatchUndefined: Self = StObject.set(x, "regexMatch", js.undefined)
  }
}
