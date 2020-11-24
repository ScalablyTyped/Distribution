package typings.jsCookie.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsCookie.jsCookieStrings.Lax
import typings.jsCookie.jsCookieStrings.None
import typings.jsCookie.jsCookieStrings.Strict
import typings.jsCookie.jsCookieStrings.lax_
import typings.jsCookie.jsCookieStrings.none_
import typings.jsCookie.jsCookieStrings.strict_
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieAttributes
  extends /**
  * An attribute which will be serialized, conformably to RFC 6265
  * section 5.2.
  */
/* property */ StringDictionary[js.Any] {
  
  /**
    * Define the domain where the cookie is available. Defaults to
    * the domain of the page where the cookie was created.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * Define when the cookie will be removed. Value can be a Number
    * which will be interpreted as days from time of creation or a
    * Date instance. If omitted, the cookie becomes a session cookie.
    */
  var expires: js.UndefOr[Double | Date] = js.native
  
  /**
    * Define the path where the cookie is available. Defaults to '/'
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Asserts that a cookie must not be sent with cross-origin requests,
    * providing some protection against cross-site request forgery
    * attacks (CSRF)
    */
  var sameSite: js.UndefOr[strict_ | Strict | lax_ | Lax | none_ | None] = js.native
  
  /**
    * A Boolean indicating if the cookie transmission requires a
    * secure protocol (https). Defaults to false.
    */
  var secure: js.UndefOr[Boolean] = js.native
}
object CookieAttributes {
  
  @scala.inline
  def apply(): CookieAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieAttributes]
  }
  
  @scala.inline
  implicit class CookieAttributesOps[Self <: CookieAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setExpires(value: Double | Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSameSite(value: strict_ | Strict | lax_ | Lax | none_ | None): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSameSite: Self = this.set("sameSite", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
  }
}
