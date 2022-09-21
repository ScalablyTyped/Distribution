package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteHeaderMatch extends StObject {
  
  /**
    * The value of the header should match exactly the content of exact_match.
    */
  var exactMatch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the HTTP header to match against.
    */
  var header: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If specified, the match result will be inverted before checking. Default value is set to false.
    */
  var invertMatch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The value of the header must start with the contents of prefix_match.
    */
  var prefixMatch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A header with header_name must exist. The match takes place whether or not the header has a value.
    */
  var presentMatch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If specified, the rule will match if the request header value is within the range.
    */
  var rangeMatch: js.UndefOr[SchemaHttpRouteHeaderMatchIntegerRange] = js.undefined
  
  /**
    * The value of the header must match the regular expression specified in regex_match. For regular expression grammar, please see: https://github.com/google/re2/wiki/Syntax
    */
  var regexMatch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the header must end with the contents of suffix_match.
    */
  var suffixMatch: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpRouteHeaderMatch {
  
  inline def apply(): SchemaHttpRouteHeaderMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteHeaderMatch]
  }
  
  extension [Self <: SchemaHttpRouteHeaderMatch](x: Self) {
    
    inline def setExactMatch(value: String): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
    
    inline def setExactMatchNull: Self = StObject.set(x, "exactMatch", null)
    
    inline def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setInvertMatch(value: Boolean): Self = StObject.set(x, "invertMatch", value.asInstanceOf[js.Any])
    
    inline def setInvertMatchNull: Self = StObject.set(x, "invertMatch", null)
    
    inline def setInvertMatchUndefined: Self = StObject.set(x, "invertMatch", js.undefined)
    
    inline def setPrefixMatch(value: String): Self = StObject.set(x, "prefixMatch", value.asInstanceOf[js.Any])
    
    inline def setPrefixMatchNull: Self = StObject.set(x, "prefixMatch", null)
    
    inline def setPrefixMatchUndefined: Self = StObject.set(x, "prefixMatch", js.undefined)
    
    inline def setPresentMatch(value: Boolean): Self = StObject.set(x, "presentMatch", value.asInstanceOf[js.Any])
    
    inline def setPresentMatchNull: Self = StObject.set(x, "presentMatch", null)
    
    inline def setPresentMatchUndefined: Self = StObject.set(x, "presentMatch", js.undefined)
    
    inline def setRangeMatch(value: SchemaHttpRouteHeaderMatchIntegerRange): Self = StObject.set(x, "rangeMatch", value.asInstanceOf[js.Any])
    
    inline def setRangeMatchUndefined: Self = StObject.set(x, "rangeMatch", js.undefined)
    
    inline def setRegexMatch(value: String): Self = StObject.set(x, "regexMatch", value.asInstanceOf[js.Any])
    
    inline def setRegexMatchNull: Self = StObject.set(x, "regexMatch", null)
    
    inline def setRegexMatchUndefined: Self = StObject.set(x, "regexMatch", js.undefined)
    
    inline def setSuffixMatch(value: String): Self = StObject.set(x, "suffixMatch", value.asInstanceOf[js.Any])
    
    inline def setSuffixMatchNull: Self = StObject.set(x, "suffixMatch", null)
    
    inline def setSuffixMatchUndefined: Self = StObject.set(x, "suffixMatch", js.undefined)
  }
}
