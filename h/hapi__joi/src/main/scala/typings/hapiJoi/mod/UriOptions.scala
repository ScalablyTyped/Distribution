package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriOptions extends StObject {
  
  /**
    * Allows unencoded square brackets inside the query string.
    * This is NOT RFC 3986 compliant but query strings like abc[]=123&abc[]=456 are very common these days.
    *
    * @default false
    */
  var allowQuerySquareBrackets: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow relative URIs.
    *
    * @default false
    */
  var allowRelative: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Validate the domain component using the options specified in `string.domain()`.
    */
  var domain: js.UndefOr[DomainOptions] = js.undefined
  
  /**
    * Restrict only relative URIs.
    *
    * @default false
    */
  var relativeOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies one or more acceptable Schemes, should only include the scheme name.
    * Can be an Array or String (strings are automatically escaped for use in a Regular Expression).
    */
  var scheme: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
}
object UriOptions {
  
  inline def apply(): UriOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UriOptions]
  }
  
  extension [Self <: UriOptions](x: Self) {
    
    inline def setAllowQuerySquareBrackets(value: Boolean): Self = StObject.set(x, "allowQuerySquareBrackets", value.asInstanceOf[js.Any])
    
    inline def setAllowQuerySquareBracketsUndefined: Self = StObject.set(x, "allowQuerySquareBrackets", js.undefined)
    
    inline def setAllowRelative(value: Boolean): Self = StObject.set(x, "allowRelative", value.asInstanceOf[js.Any])
    
    inline def setAllowRelativeUndefined: Self = StObject.set(x, "allowRelative", js.undefined)
    
    inline def setDomain(value: DomainOptions): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setRelativeOnly(value: Boolean): Self = StObject.set(x, "relativeOnly", value.asInstanceOf[js.Any])
    
    inline def setRelativeOnlyUndefined: Self = StObject.set(x, "relativeOnly", js.undefined)
    
    inline def setScheme(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setSchemeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "scheme", js.Array(value*))
  }
}
