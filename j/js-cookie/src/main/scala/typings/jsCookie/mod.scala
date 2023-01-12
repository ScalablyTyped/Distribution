package typings.jsCookie

import org.scalablytyped.runtime.StringDictionary
import typings.jsCookie.anon.RequiredConverterstring
import typings.jsCookie.jsCookieStrings.Lax
import typings.jsCookie.jsCookieStrings.None
import typings.jsCookie.jsCookieStrings.Strict
import typings.jsCookie.jsCookieStrings.lax_
import typings.jsCookie.jsCookieStrings.none_
import typings.jsCookie.jsCookieStrings.strict_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined js-cookie.js-cookie.CookiesStatic<string> & {  noConflict :(): js-cookie.js-cookie.CookiesStatic<string> | undefined} */
object mod {
  
  @JSImport("js-cookie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("js-cookie", "attributes")
  @js.native
  val attributes: CookieAttributes = js.native
  
  @JSImport("js-cookie", "converter")
  @js.native
  val converter: RequiredConverterstring = js.native
  
  /**
    * Read all available cookies
    */
  inline def get(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[StringDictionary[String]]
  /**
    * Read cookie
    */
  inline def get(name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  /**
    * If there is any danger of a conflict with the namespace Cookies,
    * the noConflict method will allow you to define a new namespace
    * and preserve the original one. This is especially useful when
    * running the script on third party sites e.g. as part of a widget
    * or SDK. Note: The noConflict method is not necessary when using
    * AMD or CommonJS, thus it is not exposed in those environments.
    */
  @JSImport("js-cookie", "noConflict")
  @js.native
  def noConflict: js.UndefOr[js.Function0[CookiesStatic[String]]] = js.native
  inline def noConflict_=(x: js.UndefOr[js.Function0[CookiesStatic[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noConflict")(x.asInstanceOf[js.Any])
  
  /**
    * Delete cookie
    */
  inline def remove(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def remove(name: String, options: CookieAttributes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create a cookie
    */
  inline def set(name: String, value: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def set(name: String, value: String, options: CookieAttributes): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  /**
    * Cookie attribute defaults can be set globally by creating an
    * instance of the api via withAttributes(), or individually for
    * each call to Cookies.set(...) by passing a plain object as the
    * last argument. Per-call attributes override the default attributes.
    */
  inline def withAttributes(attributes: CookieAttributes): CookiesStatic[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("withAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[CookiesStatic[String]]
  
  /**
    * Create a new instance of the api that overrides the default
    * decoding implementation. All methods that rely in a proper
    * decoding to work, such as Cookies.remove() and Cookies.get(),
    * will run the converter first for each cookie. The returned
    * string will be used as the cookie value.
    */
  inline def withConverter[TConv](converter: Converter[TConv]): CookiesStatic[TConv] = ^.asInstanceOf[js.Dynamic].applyDynamic("withConverter")(converter.asInstanceOf[js.Any]).asInstanceOf[CookiesStatic[TConv]]
  
  trait Converter[TConv] extends StObject {
    
    var read: js.UndefOr[CookieReadConverter[TConv]] = js.undefined
    
    var write: js.UndefOr[CookieWriteConverter[TConv]] = js.undefined
  }
  object Converter {
    
    inline def apply[TConv](): Converter[TConv] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Converter[TConv]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Converter[?], TConv] (val x: Self & Converter[TConv]) extends AnyVal {
      
      inline def setRead(value: (/* value */ String, /* name */ String) => String | TConv): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setWrite(value: (/* value */ String | TConv, /* name */ String) => String): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
  
  trait CookieAttributes
    extends StObject
       with /**
    * An attribute which will be serialized, conformably to RFC 6265
    * section 5.2.
    */
  /* property */ StringDictionary[Any] {
    
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
    var expires: js.UndefOr[Double | js.Date] = js.undefined
    
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
    
    inline def apply(): CookieAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CookieAttributes] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpires(value: Double | js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSameSite(value: strict_ | Strict | lax_ | Lax | none_ | None): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  type CookieReadConverter[T] = js.Function2[/* value */ String, /* name */ String, String | T]
  
  type CookieWriteConverter[T] = js.Function2[/* value */ String | T, /* name */ String, String]
  
  @js.native
  trait CookiesStatic[T] extends StObject {
    
    val attributes: CookieAttributes = js.native
    
    val converter: RequiredConverterstring = js.native
    
    /**
      * Read all available cookies
      */
    def get(): StringDictionary[String] = js.native
    /**
      * Read cookie
      */
    def get(name: String): js.UndefOr[String | T] = js.native
    
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
    
    /**
      * Cookie attribute defaults can be set globally by creating an
      * instance of the api via withAttributes(), or individually for
      * each call to Cookies.set(...) by passing a plain object as the
      * last argument. Per-call attributes override the default attributes.
      */
    def withAttributes(attributes: CookieAttributes): CookiesStatic[T] = js.native
    
    /**
      * Create a new instance of the api that overrides the default
      * decoding implementation. All methods that rely in a proper
      * decoding to work, such as Cookies.remove() and Cookies.get(),
      * will run the converter first for each cookie. The returned
      * string will be used as the cookie value.
      */
    def withConverter[TConv](converter: Converter[TConv]): CookiesStatic[TConv] = js.native
  }
}
