package typings.i18nextBrowserLanguagedetector

import org.scalablytyped.runtime.StringDictionary
import typings.i18next.i18nextStrings.languageDetector
import typings.i18next.mod.InitOptions
import typings.i18next.mod.LanguageDetectorModule
import typings.i18next.mod.ModuleType
import typings.i18next.mod.Services
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.cookie
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.htmlTag
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.lax
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.localStorage
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.navigator
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.none
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.querystring
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.sessionStorage
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.strict
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18next-browser-languagedetector", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with I18nextBrowserLanguageDetector {
    def this(services: Any) = this()
    def this(services: Any, options: DetectorOptions) = this()
    def this(services: Unit, options: DetectorOptions) = this()
    
    /* CompleteClass */
    override def cacheUserLanguage(lng: String): Unit = js.native
    
    /** Must return detected language */
    /* CompleteClass */
    override def detect(): js.UndefOr[String | js.Array[String]] = js.native
    
    /* CompleteClass */
    override def init(services: Services, detectorOptions: js.Object, i18nextOptions: InitOptions): Unit = js.native
    
    /* CompleteClass */
    var `type`: ModuleType = js.native
    /* CompleteClass */
    @JSName("type")
    var type_LanguageDetectorModule: languageDetector = js.native
  }
  
  trait CookieOptions extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var expires: js.UndefOr[js.Date] = js.undefined
    
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.undefined
    
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
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSameSite(value: Boolean | lax | strict | none): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  trait CustomDetector extends StObject {
    
    var cacheUserLanguage: js.UndefOr[js.Function2[/* lng */ String, /* options */ DetectorOptions, Unit]] = js.undefined
    
    def lookup(options: DetectorOptions): js.UndefOr[String | js.Array[String]]
    
    var name: String
  }
  object CustomDetector {
    
    inline def apply(lookup: DetectorOptions => js.UndefOr[String | js.Array[String]], name: String): CustomDetector = {
      val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomDetector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomDetector] (val x: Self) extends AnyVal {
      
      inline def setCacheUserLanguage(value: (/* lng */ String, /* options */ DetectorOptions) => Unit): Self = StObject.set(x, "cacheUserLanguage", js.Any.fromFunction2(value))
      
      inline def setCacheUserLanguageUndefined: Self = StObject.set(x, "cacheUserLanguage", js.undefined)
      
      inline def setLookup(value: DetectorOptions => js.UndefOr[String | js.Array[String]]): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DetectorOptions extends StObject {
    
    /**
      * cache user language on
      */
    var caches: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * optional domain for set cookie
      */
    var cookieDomain: js.UndefOr[String] = js.undefined
    
    /**
      * optional expire for set cookie
      * @default 10
      */
    var cookieMinutes: js.UndefOr[Double] = js.undefined
    
    /**
      * optional cookie options
      */
    var cookieOptions: js.UndefOr[CookieOptions] = js.undefined
    
    /**
      * languages to not persist (cookie, localStorage)
      */
    var excludeCacheFor: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * optional htmlTag with lang attribute
      * @default document.documentElement
      */
    var htmlTag: js.UndefOr[HTMLElement | Null] = js.undefined
    
    var lookupCookie: js.UndefOr[String] = js.undefined
    
    var lookupFromPathIndex: js.UndefOr[Double] = js.undefined
    
    var lookupFromSubdomainIndex: js.UndefOr[Double] = js.undefined
    
    var lookupLocalStorage: js.UndefOr[String] = js.undefined
    
    /**
      * keys or params to lookup language from
      */
    var lookupQuerystring: js.UndefOr[String] = js.undefined
    
    var lookupSessionStorage: js.UndefOr[String] = js.undefined
    
    /**
      * order and from where user language should be detected
      */
    var order: js.UndefOr[
        js.Array[
          querystring | cookie | sessionStorage | localStorage | navigator | htmlTag | String
        ]
      ] = js.undefined
  }
  object DetectorOptions {
    
    inline def apply(): DetectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetectorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetectorOptions] (val x: Self) extends AnyVal {
      
      inline def setCaches(value: js.Array[String]): Self = StObject.set(x, "caches", value.asInstanceOf[js.Any])
      
      inline def setCachesUndefined: Self = StObject.set(x, "caches", js.undefined)
      
      inline def setCachesVarargs(value: String*): Self = StObject.set(x, "caches", js.Array(value*))
      
      inline def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      inline def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      inline def setCookieMinutes(value: Double): Self = StObject.set(x, "cookieMinutes", value.asInstanceOf[js.Any])
      
      inline def setCookieMinutesUndefined: Self = StObject.set(x, "cookieMinutes", js.undefined)
      
      inline def setCookieOptions(value: CookieOptions): Self = StObject.set(x, "cookieOptions", value.asInstanceOf[js.Any])
      
      inline def setCookieOptionsUndefined: Self = StObject.set(x, "cookieOptions", js.undefined)
      
      inline def setExcludeCacheFor(value: js.Array[String]): Self = StObject.set(x, "excludeCacheFor", value.asInstanceOf[js.Any])
      
      inline def setExcludeCacheForUndefined: Self = StObject.set(x, "excludeCacheFor", js.undefined)
      
      inline def setExcludeCacheForVarargs(value: String*): Self = StObject.set(x, "excludeCacheFor", js.Array(value*))
      
      inline def setHtmlTag(value: HTMLElement): Self = StObject.set(x, "htmlTag", value.asInstanceOf[js.Any])
      
      inline def setHtmlTagNull: Self = StObject.set(x, "htmlTag", null)
      
      inline def setHtmlTagUndefined: Self = StObject.set(x, "htmlTag", js.undefined)
      
      inline def setLookupCookie(value: String): Self = StObject.set(x, "lookupCookie", value.asInstanceOf[js.Any])
      
      inline def setLookupCookieUndefined: Self = StObject.set(x, "lookupCookie", js.undefined)
      
      inline def setLookupFromPathIndex(value: Double): Self = StObject.set(x, "lookupFromPathIndex", value.asInstanceOf[js.Any])
      
      inline def setLookupFromPathIndexUndefined: Self = StObject.set(x, "lookupFromPathIndex", js.undefined)
      
      inline def setLookupFromSubdomainIndex(value: Double): Self = StObject.set(x, "lookupFromSubdomainIndex", value.asInstanceOf[js.Any])
      
      inline def setLookupFromSubdomainIndexUndefined: Self = StObject.set(x, "lookupFromSubdomainIndex", js.undefined)
      
      inline def setLookupLocalStorage(value: String): Self = StObject.set(x, "lookupLocalStorage", value.asInstanceOf[js.Any])
      
      inline def setLookupLocalStorageUndefined: Self = StObject.set(x, "lookupLocalStorage", js.undefined)
      
      inline def setLookupQuerystring(value: String): Self = StObject.set(x, "lookupQuerystring", value.asInstanceOf[js.Any])
      
      inline def setLookupQuerystringUndefined: Self = StObject.set(x, "lookupQuerystring", js.undefined)
      
      inline def setLookupSessionStorage(value: String): Self = StObject.set(x, "lookupSessionStorage", value.asInstanceOf[js.Any])
      
      inline def setLookupSessionStorageUndefined: Self = StObject.set(x, "lookupSessionStorage", js.undefined)
      
      inline def setOrder(
        value: js.Array[
              querystring | cookie | sessionStorage | localStorage | navigator | htmlTag | String
            ]
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(value: (querystring | cookie | sessionStorage | localStorage | navigator | htmlTag | String)*): Self = StObject.set(x, "order", js.Array(value*))
    }
  }
  
  @js.native
  trait I18nextBrowserLanguageDetector
    extends StObject
       with LanguageDetectorModule {
    
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
    ): js.UndefOr[String | js.Array[String]] = js.native
    
    var detectors: StringDictionary[Any] = js.native
    
    var i18nOptions: Any = js.native
    
    /**
      * Initializes detector.
      */
    def init(): Unit = js.native
    def init(services: Any): Unit = js.native
    def init(services: Any, options: DetectorOptions): Unit = js.native
    def init(services: Unit, options: DetectorOptions): Unit = js.native
    
    var services: Any = js.native
    
    @JSName("type")
    var type_I18nextBrowserLanguageDetector: typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.languageDetector = js.native
  }
  
  /* augmented module */
  object i18nextAugmentingMod {
    
    trait CustomPluginOptions extends StObject {
      
      var detection: js.UndefOr[DetectorOptions] = js.undefined
    }
    object CustomPluginOptions {
      
      inline def apply(): CustomPluginOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CustomPluginOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CustomPluginOptions] (val x: Self) extends AnyVal {
        
        inline def setDetection(value: DetectorOptions): Self = StObject.set(x, "detection", value.asInstanceOf[js.Any])
        
        inline def setDetectionUndefined: Self = StObject.set(x, "detection", js.undefined)
      }
    }
  }
}
