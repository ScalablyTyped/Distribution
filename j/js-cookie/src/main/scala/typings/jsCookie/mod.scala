package typings.jsCookie

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.jsCookie.anon.Read
import typings.jsCookie.jsCookieStrings.Lax
import typings.jsCookie.jsCookieStrings.None
import typings.jsCookie.jsCookieStrings.Strict
import typings.jsCookie.jsCookieStrings.lax_
import typings.jsCookie.jsCookieStrings.none_
import typings.jsCookie.jsCookieStrings.strict_
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("js-cookie", JSImport.Namespace)
  @js.native
  val ^ : CookiesStatic[js.Object] = js.native
  
  trait CookieAttributes
    extends StObject
       with /**
    * An attribute which will be serialized, conformably to RFC 6265
    * section 5.2.
    */
  /* property */ StringDictionary[js.Any] {
    
    /**
      * Define the domain where the cookie is available. Defaults to
      * the domain of the page where the cookie was created.
      */
    var domain: js.UndefOr[String] = js.undefined
    
    /**
      * Define when the cookie will be removed. Value can be a Number
      * which will be interpreted as days from time of creation or a
      * Date instance. If omitted, the cookie becomes a session cookie.
      */
    var expires: js.UndefOr[Double | Date] = js.undefined
    
    /**
      * Define the path where the cookie is available. Defaults to '/'
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Asserts that a cookie must not be sent with cross-origin requests,
      * providing some protection against cross-site request forgery
      * attacks (CSRF)
      */
    var sameSite: js.UndefOr[strict_ | Strict | lax_ | Lax | none_ | None] = js.undefined
    
    /**
      * A Boolean indicating if the cookie transmission requires a
      * secure protocol (https). Defaults to false.
      */
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object CookieAttributes {
    
    @scala.inline
    def apply(): CookieAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieAttributes]
    }
    
    @scala.inline
    implicit class CookieAttributesMutableBuilder[Self <: CookieAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setExpires(value: Double | Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSameSite(value: strict_ | Strict | lax_ | Lax | none_ | None): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  type CookieReadConverter = js.Function2[/* value */ String, /* name */ String, String]
  
  type CookieWriteConverter[T /* <: js.Object */] = js.Function2[/* value */ String | T, /* name */ String, String]
  
  @js.native
  trait CookiesStatic[T /* <: js.Object */] extends StObject {
    
    /**
      * Allows default cookie attributes to be accessed, changed, or reset
      */
    var defaults: CookieAttributes = js.native
    
    /**
      * Read all available cookies
      */
    def get(): StringDictionary[String] = js.native
    /**
      * Read cookie
      */
    def get(name: String): js.UndefOr[String] = js.native
    
    /**
      * Returns the parsed representation of
      * all cookies according to JSON.parse
      */
    def getJSON(): StringDictionary[js.Any] = js.native
    /**
      * Returns the parsed representation of the string
      * stored in the cookie according to JSON.parse
      */
    def getJSON(name: String): js.Any = js.native
    
    /**
      * If there is any danger of a conflict with the namespace Cookies,
      * the noConflict method will allow you to define a new namespace
      * and preserve the original one. This is especially useful when
      * running the script on third party sites e.g. as part of a widget
      * or SDK. Note: The noConflict method is not necessary when using
      * AMD or CommonJS, thus it is not exposed in those environments.
      */
    var noConflict: js.UndefOr[js.Function0[CookiesStatic[T]]] = js.native
    
    /**
      * Delete cookie
      */
    def remove(name: String): Unit = js.native
    def remove(name: String, options: CookieAttributes): Unit = js.native
    
    def set(name: String, value: T): js.UndefOr[String] = js.native
    def set(name: String, value: T, options: CookieAttributes): js.UndefOr[String] = js.native
    /**
      * Create a cookie
      */
    def set(name: String, value: String): js.UndefOr[String] = js.native
    def set(name: String, value: String, options: CookieAttributes): js.UndefOr[String] = js.native
    
    def withConverter[TConv /* <: js.Object */](converter: Read[TConv]): CookiesStatic[TConv] = js.native
    /**
      * Create a new instance of the api that overrides the default
      * decoding implementation. All methods that rely in a proper
      * decoding to work, such as Cookies.remove() and Cookies.get(),
      * will run the converter first for each cookie. The returned
      * string will be used as the cookie value.
      */
    def withConverter[TConv /* <: js.Object */](converter: CookieReadConverter): CookiesStatic[TConv] = js.native
  }
  
  type _To = CookiesStatic[js.Object]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CookiesStatic[js.Object] = ^
}
