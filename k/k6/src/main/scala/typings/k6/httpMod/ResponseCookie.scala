package typings.k6.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseCookie extends StObject {
  
  /** Domain allowed to receive. */
  var domain: String
  
  /** Expiry time in millisecond Unix time. */
  var expires: Double
  
  /** HTTP only. */
  var httpOnly: Boolean
  
  /** Seconds until expiration. */
  var maxAge: Double
  
  /** Name. */
  var name: String
  
  /** Scope path. */
  var path: String
  
  /** Secure. */
  var secure: Boolean
  
  /** Value. */
  var value: String
}
object ResponseCookie {
  
  inline def apply(
    domain: String,
    expires: Double,
    httpOnly: Boolean,
    maxAge: Double,
    name: String,
    path: String,
    secure: Boolean,
    value: String
  ): ResponseCookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCookie]
  }
  
  extension [Self <: ResponseCookie](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
