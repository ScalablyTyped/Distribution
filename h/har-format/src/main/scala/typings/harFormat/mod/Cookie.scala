package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookie extends StObject {
  
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
  
  /** The host of the cookie. */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * Cookie expiration time.
    * (ISO 8601 - `YYYY-MM-DDThh:mm:ss.sTZD`,
    * e.g. `2009-07-24T19:20:30.123+02:00`).
    */
  var expires: js.UndefOr[String] = js.undefined
  
  /** Set to true if the cookie is HTTP only, false otherwise. */
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the cookie. */
  var name: String
  
  /** The path pertaining to the cookie. */
  var path: js.UndefOr[String] = js.undefined
  
  /** True if the cookie was transmitted over ssl, false otherwise. */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /** The cookie value. */
  var value: String
}
object Cookie {
  
  inline def apply(name: String, value: String): Cookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  
  extension [Self <: Cookie](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
