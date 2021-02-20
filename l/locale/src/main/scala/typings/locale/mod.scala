package typings.locale

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This module exports a function that can be used as Express/Connect
    * middleware. It takes one argument, a list of supported locales, and adds a
    * `locale` property to incoming HTTP requests, reflecting the most appropriate
    * locale determined using the `best` method described below.
    */
  @JSImport("locale", JSImport.Namespace)
  @js.native
  def apply(): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  @JSImport("locale", JSImport.Namespace)
  @js.native
  def apply(supported: js.UndefOr[scala.Nothing], `def`: String): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  @JSImport("locale", JSImport.Namespace)
  @js.native
  def apply(supported: String): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  @JSImport("locale", JSImport.Namespace)
  @js.native
  def apply(supported: String, `def`: String): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  @JSImport("locale", JSImport.Namespace)
  @js.native
  def apply(supported: js.Array[String | Locale]): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  @JSImport("locale", JSImport.Namespace)
  @js.native
  def apply(supported: js.Array[String | Locale], `def`: String): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  @JSImport("locale", JSImport.Namespace)
  @js.native
  def apply(supported: Locales): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  @JSImport("locale", JSImport.Namespace)
  @js.native
  def apply(supported: Locales, `def`: String): js.Function3[/* req */ js.Object, /* res */ js.Any, /* next */ js.Function0[Unit], Unit] = js.native
  
  @JSImport("locale", "Locale")
  @js.native
  class Locale protected () extends StObject {
    /**
      * The Locale constructor takes a
      * [language tag](http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.10)
      * string consisting of an ISO-639 language abbreviation and optional
      * two-letter ISO-3166 country code, and returns an object with a
      * `language` property containing the former and a `country` property
      * containing the latter.
      */
    def this(str: String) = this()
    
    /**
      * returns user-generated input used to construct the Locale. Eg, `en-US`
      */
    var code: String = js.native
    
    /**
      * returns the second 2 letters of the code if present, uppercased.
      * Returns `undefined` otherwise
      */
    var country: js.UndefOr[String] = js.native
    
    /** returns the first 2 letters of the code, lowercased */
    var language: String = js.native
    
    /**
      * returns the language, followed by a `_` and the country, if the
      * country is present
      */
    var normalized: String = js.native
    
    def toJSON(): String | Null = js.native
  }
  object Locale {
    
    @JSImport("locale", "Locale")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default locale for the environment, as parsed from
      * `process.env.LANG`. This is used as the fallback when the best
      * language is calculated from the intersection of requested and
      * supported locales and supported languages has not default.
      */
    /* static member */
    @JSImport("locale", "Locale.default")
    @js.native
    def default: Locale = js.native
    @scala.inline
    def default_=(x: Locale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("locale", "Locales")
  @js.native
  /**
    * The Locales constructor takes a string compliant with the
    * [`Accept-Language` HTTP header](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.4),
    * and returns a list of acceptible locales, optionally sorted in
    * descending order by quality score. Second argument is optional
    * default value used as the fallback when the best language is
    * calculated. Otherwise `locale.Locale["default"]` is used as fallback.
    */
  class Locales () extends StObject {
    def this(str: String) = this()
    def this(str: js.Array[String | Locale]) = this()
    def this(str: Locale) = this()
    def this(str: Locales) = this()
    def this(str: js.UndefOr[scala.Nothing], `def`: String) = this()
    def this(str: String, `def`: String) = this()
    def this(str: js.Array[String | Locale], `def`: String) = this()
    def this(str: Locale, `def`: String) = this()
    def this(str: Locales, `def`: String) = this()
    
    /**
      * This method takes the target locale and compares it against the
      * optionally provided list of supported locales, and returns the most
      * appropriate locale based on the quality scores of the target locale.
      * If no exact match exists (i.e. language+country) then it will
      * fallback to `language` if supported, or if the language isn't
      * supported it will return the default locale.
      *
      * @example
      * const supported = new locale.Locales(['en', 'en_US'], 'en');
      * (new locale.Locales('en')).best(supported).toString();     // 'en'
      * (new locale.Locales('en_GB')).best(supported).toString();  // 'en'
      * (new locale.Locales('en_US')).best(supported).toString();  // 'en_US'
      * (new locale.Locales('jp')).best(supported);                // supported.default || locale.Locale["default"]
      */
    def best(): Locale = js.native
    def best(locales: Locales): Locale = js.native
    
    def index(): StringDictionary[Double] = js.native
    
    def push(items: String*): Double = js.native
    
    def sort(): this.type = js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    def toJSON(): js.Array[Locale] = js.native
  }
  
  object global {
    
    object Express {
      
      @js.native
      trait Request extends StObject {
        
        var locale: String = js.native
        
        var rawLocale: Locale = js.native
      }
      object Request {
        
        @scala.inline
        def apply(locale: String, rawLocale: Locale): Request = {
          val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], rawLocale = rawLocale.asInstanceOf[js.Any])
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRawLocale(value: Locale): Self = StObject.set(x, "rawLocale", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
