package typings.jqueryCookie

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryCookieOptions extends StObject {
  
  /**
    * Define the domain where the cookie is valid. Default: domain of page where the cookie was created.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * Define lifetime of the cookie. Value can be a Number which will be interpreted as days from time of creation or a Date object. If omitted, the cookie becomes a session cookie.
    */
  var expires: js.UndefOr[js.Any] = js.native
  
  /**
    * Define the path where the cookie is valid. By default the path of the cookie is the path of the page where the cookie was created (standard browser behavior). If you want to make it available for instance across the entire domain use path: '/'. Default: path of page where the cookie was created.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * If true, the cookie transmission requires a secure protocol (https). Default: false.
    */
  var secure: js.UndefOr[Boolean] = js.native
}
object JQueryCookieOptions {
  
  @scala.inline
  def apply(): JQueryCookieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryCookieOptions]
  }
  
  @scala.inline
  implicit class JQueryCookieOptionsMutableBuilder[Self <: JQueryCookieOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setExpires(value: js.Any): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
  }
}
