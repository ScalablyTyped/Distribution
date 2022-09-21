package typings.jsCookie

import org.scalablytyped.runtime.StringDictionary
import typings.jsCookie.anon.RequiredConverterstring
import typings.jsCookie.mod.Converter
import typings.jsCookie.mod.CookieAttributes
import typings.jsCookie.mod.CookiesStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* Inlined js-cookie.js-cookie.CookiesStatic<string> & {  noConflict :(): js-cookie.js-cookie.CookiesStatic<string> | undefined} */
  object Cookies {
    
    @JSGlobal("Cookies")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Cookies.attributes")
    @js.native
    val attributes: CookieAttributes = js.native
    
    @JSGlobal("Cookies.converter")
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
    @JSGlobal("Cookies.noConflict")
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
  }
}
