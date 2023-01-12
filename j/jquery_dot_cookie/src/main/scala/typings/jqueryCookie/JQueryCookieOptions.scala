package typings.jqueryCookie

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryCookieOptions extends StObject {
  
  /**
    * Define the domain where the cookie is valid. Default: domain of page where the cookie was created.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * Define lifetime of the cookie. Value can be a Number which will be interpreted as days from time of creation or a Date object. If omitted, the cookie becomes a session cookie.
    */
  var expires: js.UndefOr[Any] = js.undefined
  
  /**
    * Define the path where the cookie is valid. By default the path of the cookie is the path of the page where the cookie was created (standard browser behavior). If you want to make it available for instance across the entire domain use path: '/'. Default: path of page where the cookie was created.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the cookie transmission requires a secure protocol (https). Default: false.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
}
object JQueryCookieOptions {
  
  inline def apply(): JQueryCookieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryCookieOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryCookieOptions] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExpires(value: Any): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
  }
}
