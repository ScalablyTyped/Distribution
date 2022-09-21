package typings.googleapis.networksecurityV1beta1Mod.networksecurityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpHeaderMatch extends StObject {
  
  /**
    * Required. The name of the HTTP header to match. For matching against the HTTP request's authority, use a headerMatch with the header name ":authority". For matching a request's method, use the headerName ":method".
    */
  var headerName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The value of the header must match the regular expression specified in regexMatch. For regular expression grammar, please see: en.cppreference.com/w/cpp/regex/ecmascript For matching against a port specified in the HTTP request, use a headerMatch with headerName set to Host and a regular expression that satisfies the RFC2616 Host header's port specifier.
    */
  var regexMatch: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpHeaderMatch {
  
  inline def apply(): SchemaHttpHeaderMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpHeaderMatch]
  }
  
  extension [Self <: SchemaHttpHeaderMatch](x: Self) {
    
    inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
    
    inline def setHeaderNameNull: Self = StObject.set(x, "headerName", null)
    
    inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
    
    inline def setRegexMatch(value: String): Self = StObject.set(x, "regexMatch", value.asInstanceOf[js.Any])
    
    inline def setRegexMatchNull: Self = StObject.set(x, "regexMatch", null)
    
    inline def setRegexMatchUndefined: Self = StObject.set(x, "regexMatch", js.undefined)
  }
}
