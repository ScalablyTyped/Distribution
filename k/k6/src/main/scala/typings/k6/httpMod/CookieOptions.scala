package typings.k6.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieOptions extends StObject {
  
  /** Domain allowed to receive. */
  var domain: js.UndefOr[String] = js.undefined
  
  /** Expiry time in RFC1123 format. */
  var expires: js.UndefOr[String] = js.undefined
  
  /** HTTP only. */
  var http_only: js.UndefOr[Boolean] = js.undefined
  
  /** Seconds until expiration. */
  var max_age: js.UndefOr[Double] = js.undefined
  
  /** Scope path. */
  var path: js.UndefOr[String] = js.undefined
  
  /** Secure. */
  var secure: js.UndefOr[Boolean] = js.undefined
}
object CookieOptions {
  
  inline def apply(): CookieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CookieOptions] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setHttp_only(value: Boolean): Self = StObject.set(x, "http_only", value.asInstanceOf[js.Any])
    
    inline def setHttp_onlyUndefined: Self = StObject.set(x, "http_only", js.undefined)
    
    inline def setMax_age(value: Double): Self = StObject.set(x, "max_age", value.asInstanceOf[js.Any])
    
    inline def setMax_ageUndefined: Self = StObject.set(x, "max_age", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
  }
}
