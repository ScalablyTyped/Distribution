package typings.i18nextBrowserLanguagedetector

import org.scalablytyped.runtime.StringDictionary
import typings.i18next.mod.LanguageDetectorModule
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.cookie
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.htmlTag
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.languageDetector
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.localStorage
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.navigator
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.querystring
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.sessionStorage
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18next-browser-languagedetector", JSImport.Default)
  @js.native
  class default () extends I18nextBrowserLanguageDetector {
    def this(services: js.Any) = this()
    def this(services: js.UndefOr[scala.Nothing], options: DetectorOptions) = this()
    def this(services: js.Any, options: DetectorOptions) = this()
  }
  
  @js.native
  trait CustomDetector extends StObject {
    
    var cacheUserLanguage: js.UndefOr[js.Function2[/* lng */ String, /* options */ DetectorOptions, Unit]] = js.native
    
    def lookup(options: DetectorOptions): js.UndefOr[String] = js.native
    
    var name: String = js.native
  }
  object CustomDetector {
    
    @scala.inline
    def apply(lookup: DetectorOptions => js.UndefOr[String], name: String): CustomDetector = {
      val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomDetector]
    }
    
    @scala.inline
    implicit class CustomDetectorMutableBuilder[Self <: CustomDetector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheUserLanguage(value: (/* lng */ String, /* options */ DetectorOptions) => Unit): Self = StObject.set(x, "cacheUserLanguage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCacheUserLanguageUndefined: Self = StObject.set(x, "cacheUserLanguage", js.undefined)
      
      @scala.inline
      def setLookup(value: DetectorOptions => js.UndefOr[String]): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DetectorOptions extends StObject {
    
    /**
      * cache user language on
      */
    var caches: js.UndefOr[js.Array[String]] = js.native
    
    var cookieDomain: js.UndefOr[String] = js.native
    
    /**
      * optional expire and domain for set cookie
      * @default 10
      */
    var cookieMinutes: js.UndefOr[Double] = js.native
    
    /**
      * languages to not persist (cookie, localStorage)
      */
    var excludeCacheFor: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * optional htmlTag with lang attribute
      * @default document.documentElement
      */
    var htmlTag: js.UndefOr[HTMLElement | Null] = js.native
    
    var lookupCookie: js.UndefOr[String] = js.native
    
    var lookupFromPathIndex: js.UndefOr[Double] = js.native
    
    var lookupFromSubdomainIndex: js.UndefOr[Double] = js.native
    
    var lookupLocalStorage: js.UndefOr[String] = js.native
    
    /**
      * keys or params to lookup language from
      */
    var lookupQuerystring: js.UndefOr[String] = js.native
    
    var lookupSessionStorage: js.UndefOr[String] = js.native
    
    /**
      * order and from where user language should be detected
      */
    var order: js.UndefOr[
        js.Array[
          querystring | cookie | sessionStorage | localStorage | navigator | htmlTag | String
        ]
      ] = js.native
  }
  object DetectorOptions {
    
    @scala.inline
    def apply(): DetectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetectorOptions]
    }
    
    @scala.inline
    implicit class DetectorOptionsMutableBuilder[Self <: DetectorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaches(value: js.Array[String]): Self = StObject.set(x, "caches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachesUndefined: Self = StObject.set(x, "caches", js.undefined)
      
      @scala.inline
      def setCachesVarargs(value: String*): Self = StObject.set(x, "caches", js.Array(value :_*))
      
      @scala.inline
      def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      @scala.inline
      def setCookieMinutes(value: Double): Self = StObject.set(x, "cookieMinutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieMinutesUndefined: Self = StObject.set(x, "cookieMinutes", js.undefined)
      
      @scala.inline
      def setExcludeCacheFor(value: js.Array[String]): Self = StObject.set(x, "excludeCacheFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeCacheForUndefined: Self = StObject.set(x, "excludeCacheFor", js.undefined)
      
      @scala.inline
      def setExcludeCacheForVarargs(value: String*): Self = StObject.set(x, "excludeCacheFor", js.Array(value :_*))
      
      @scala.inline
      def setHtmlTag(value: HTMLElement): Self = StObject.set(x, "htmlTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlTagNull: Self = StObject.set(x, "htmlTag", null)
      
      @scala.inline
      def setHtmlTagUndefined: Self = StObject.set(x, "htmlTag", js.undefined)
      
      @scala.inline
      def setLookupCookie(value: String): Self = StObject.set(x, "lookupCookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupCookieUndefined: Self = StObject.set(x, "lookupCookie", js.undefined)
      
      @scala.inline
      def setLookupFromPathIndex(value: Double): Self = StObject.set(x, "lookupFromPathIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupFromPathIndexUndefined: Self = StObject.set(x, "lookupFromPathIndex", js.undefined)
      
      @scala.inline
      def setLookupFromSubdomainIndex(value: Double): Self = StObject.set(x, "lookupFromSubdomainIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupFromSubdomainIndexUndefined: Self = StObject.set(x, "lookupFromSubdomainIndex", js.undefined)
      
      @scala.inline
      def setLookupLocalStorage(value: String): Self = StObject.set(x, "lookupLocalStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupLocalStorageUndefined: Self = StObject.set(x, "lookupLocalStorage", js.undefined)
      
      @scala.inline
      def setLookupQuerystring(value: String): Self = StObject.set(x, "lookupQuerystring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupQuerystringUndefined: Self = StObject.set(x, "lookupQuerystring", js.undefined)
      
      @scala.inline
      def setLookupSessionStorage(value: String): Self = StObject.set(x, "lookupSessionStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupSessionStorageUndefined: Self = StObject.set(x, "lookupSessionStorage", js.undefined)
      
      @scala.inline
      def setOrder(
        value: js.Array[
              querystring | cookie | sessionStorage | localStorage | navigator | htmlTag | String
            ]
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(value: (querystring | cookie | sessionStorage | localStorage | navigator | htmlTag | String)*): Self = StObject.set(x, "order", js.Array(value :_*))
    }
  }
  
  @js.native
  trait I18nextBrowserLanguageDetector extends LanguageDetectorModule {
    
    /**
      * Adds detector.
      */
    def addDetector(detector: CustomDetector): I18nextBrowserLanguageDetector = js.native
    
    def cacheUserLanguage(lng: String, caches: js.Array[String]): Unit = js.native
    
    def detect(
      detectionOrder: js.UndefOr[
          js.Array[
            querystring | cookie | sessionStorage | localStorage | navigator | htmlTag | String
          ]
        ]
    ): js.UndefOr[String] = js.native
    
    var detectors: StringDictionary[js.Any] = js.native
    
    var i18nOptions: js.Any = js.native
    
    /**
      * Initializes detector.
      */
    def init(): Unit = js.native
    def init(services: js.UndefOr[scala.Nothing], options: DetectorOptions): Unit = js.native
    def init(services: js.Any): Unit = js.native
    def init(services: js.Any, options: DetectorOptions): Unit = js.native
    
    var services: js.Any = js.native
    
    @JSName("type")
    var type_I18nextBrowserLanguageDetector: languageDetector = js.native
  }
}
