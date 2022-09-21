package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJwtLocation extends StObject {
  
  /**
    * Specifies cookie name to extract JWT token.
    */
  var cookie: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies HTTP header name to extract JWT token.
    */
  var header: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies URL query parameter name to extract JWT token.
    */
  var query: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value prefix. The value format is "value_prefix{token\}" Only applies to "in" header type. Must be empty for "in" query type. If not empty, the header value has to match (case sensitive) this prefix. If not matched, JWT will not be extracted. If matched, JWT will be extracted after the prefix is removed. For example, for "Authorization: Bearer {JWT\}", value_prefix="Bearer " with a space at the end.
    */
  var valuePrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaJwtLocation {
  
  inline def apply(): SchemaJwtLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJwtLocation]
  }
  
  extension [Self <: SchemaJwtLocation](x: Self) {
    
    inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setCookieNull: Self = StObject.set(x, "cookie", null)
    
    inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
    
    inline def setValuePrefixNull: Self = StObject.set(x, "valuePrefix", null)
    
    inline def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
  }
}
