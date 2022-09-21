package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteQueryParameterMatch extends StObject {
  
  /**
    * The value of the query parameter must exactly match the contents of exact_match. Only one of exact_match, regex_match, or present_match must be set.
    */
  var exactMatch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies that the QueryParameterMatcher matches if request contains query parameter, irrespective of whether the parameter has a value or not. Only one of exact_match, regex_match, or present_match must be set.
    */
  var presentMatch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name of the query parameter to match.
    */
  var queryParameter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the query parameter must match the regular expression specified by regex_match. For regular expression grammar, please see https://github.com/google/re2/wiki/Syntax Only one of exact_match, regex_match, or present_match must be set.
    */
  var regexMatch: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpRouteQueryParameterMatch {
  
  inline def apply(): SchemaHttpRouteQueryParameterMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteQueryParameterMatch]
  }
  
  extension [Self <: SchemaHttpRouteQueryParameterMatch](x: Self) {
    
    inline def setExactMatch(value: String): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
    
    inline def setExactMatchNull: Self = StObject.set(x, "exactMatch", null)
    
    inline def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
    
    inline def setPresentMatch(value: Boolean): Self = StObject.set(x, "presentMatch", value.asInstanceOf[js.Any])
    
    inline def setPresentMatchNull: Self = StObject.set(x, "presentMatch", null)
    
    inline def setPresentMatchUndefined: Self = StObject.set(x, "presentMatch", js.undefined)
    
    inline def setQueryParameter(value: String): Self = StObject.set(x, "queryParameter", value.asInstanceOf[js.Any])
    
    inline def setQueryParameterNull: Self = StObject.set(x, "queryParameter", null)
    
    inline def setQueryParameterUndefined: Self = StObject.set(x, "queryParameter", js.undefined)
    
    inline def setRegexMatch(value: String): Self = StObject.set(x, "regexMatch", value.asInstanceOf[js.Any])
    
    inline def setRegexMatchNull: Self = StObject.set(x, "regexMatch", null)
    
    inline def setRegexMatchUndefined: Self = StObject.set(x, "regexMatch", js.undefined)
  }
}
