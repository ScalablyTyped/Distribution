package typings.i18nextXhrBackend

import org.scalablytyped.runtime.StringDictionary
import typings.i18next.i18nextStrings.`3rdParty`
import typings.i18next.i18nextStrings.backend
import typings.i18next.i18nextStrings.i18nFormat
import typings.i18next.i18nextStrings.languageDetector
import typings.i18next.i18nextStrings.logger
import typings.i18next.i18nextStrings.postProcessor
import typings.i18next.mod.BackendModule
import typings.i18next.mod.InitOptions
import typings.i18next.mod.ReadCallback
import typings.i18next.mod.Services
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18next-xhr-backend", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with I18NextXhrBackend {
    def this(services: js.Any) = this()
    def this(services: js.Any, options: BackendOptions) = this()
    def this(services: Unit, options: BackendOptions) = this()
    
    /** Save the missing translation */
    /* CompleteClass */
    override def create(languages: js.Array[String], namespace: String, key: String, fallbackValue: String): Unit = js.native
    
    /* CompleteClass */
    override def init(services: Services, backendOptions: BackendOptions, i18nextOptions: InitOptions): Unit = js.native
    
    /* CompleteClass */
    override def read(language: String, namespace: String, callback: ReadCallback): Unit = js.native
    
    /* CompleteClass */
    var `type`: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty` = js.native
    /* CompleteClass */
    @JSName("type")
    var type_BackendModule: backend = js.native
  }
  
  type AjaxRequestCallback = js.Function2[/* response */ String, /* x */ XMLHttpRequest, Unit]
  
  trait BackendOptions extends StObject {
    
    /**
      * path to post missing resources
      */
    var addPath: js.UndefOr[String] = js.undefined
    
    /**
      * define a custom xhr function
      * can be used to support XDomainRequest in IE 8 and 9
      */
    var ajax: js.UndefOr[
        js.Function5[
          /* url */ String, 
          /* options */ this.type, 
          /* callback */ AjaxRequestCallback, 
          /* data */ js.Object | String, 
          /* cache */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * your backend server supports multiLoading
      * locales/resources.json?lng=de+en&ns=ns1+ns2
      * set loadPath: '/locales/resources.json?lng={{lng}}&ns={{ns}}' to adapt to multiLoading
      */
    var allowMultiLoading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * allow cross domain requests
      */
    var crossDomain: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @see https://github.com/i18next/i18next-xhr-backend/blob/281c7e235e1157b33122adacef1957252e5700f1/src/ajax.js#L52
      */
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * path where resources get loaded from, or a function
      * returning a path:
      * function(lngs, namespaces) { return customPath; }
      * the returned path will interpolate lng, ns if provided like giving a static path
      */
    var loadPath: js.UndefOr[LoadPathOption] = js.undefined
    
    /**
      * parse data after it has been fetched
      * in example use https://www.npmjs.com/package/json5
      * here it removes the letter a from the json (bad idea)
      */
    var parse: js.UndefOr[js.Function1[/* data */ String, String]] = js.undefined
    
    /**
      * parse data before it has been sent by addPath
      */
    var parsePayload: js.UndefOr[
        js.Function3[
          /* namespace */ String, 
          /* key */ String, 
          /* fallbackValue */ js.UndefOr[String], 
          StringDictionary[js.Any]
        ]
      ] = js.undefined
    
    /**
      * adds parameters to resource URL. 'example.com' -> 'example.com?v=1.3.5'
      */
    var queryStringParams: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * allow credentials on cross domain requests
      */
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object BackendOptions {
    
    inline def apply(): BackendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackendOptions]
    }
    
    extension [Self <: BackendOptions](x: Self) {
      
      inline def setAddPath(value: String): Self = StObject.set(x, "addPath", value.asInstanceOf[js.Any])
      
      inline def setAddPathUndefined: Self = StObject.set(x, "addPath", js.undefined)
      
      inline def setAjax(
        value: (/* url */ String, BackendOptions, /* callback */ AjaxRequestCallback, /* data */ js.Object | String, /* cache */ Boolean) => Unit
      ): Self = StObject.set(x, "ajax", js.Any.fromFunction5(value))
      
      inline def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
      
      inline def setAllowMultiLoading(value: Boolean): Self = StObject.set(x, "allowMultiLoading", value.asInstanceOf[js.Any])
      
      inline def setAllowMultiLoadingUndefined: Self = StObject.set(x, "allowMultiLoading", js.undefined)
      
      inline def setCrossDomain(value: Boolean): Self = StObject.set(x, "crossDomain", value.asInstanceOf[js.Any])
      
      inline def setCrossDomainUndefined: Self = StObject.set(x, "crossDomain", js.undefined)
      
      inline def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setLoadPath(value: LoadPathOption): Self = StObject.set(x, "loadPath", value.asInstanceOf[js.Any])
      
      inline def setLoadPathFunction2(value: (/* lngs */ js.Array[String], /* namespaces */ js.Array[String]) => String): Self = StObject.set(x, "loadPath", js.Any.fromFunction2(value))
      
      inline def setLoadPathUndefined: Self = StObject.set(x, "loadPath", js.undefined)
      
      inline def setParse(value: /* data */ String => String): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setParsePayload(
        value: (/* namespace */ String, /* key */ String, /* fallbackValue */ js.UndefOr[String]) => StringDictionary[js.Any]
      ): Self = StObject.set(x, "parsePayload", js.Any.fromFunction3(value))
      
      inline def setParsePayloadUndefined: Self = StObject.set(x, "parsePayload", js.undefined)
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setQueryStringParams(value: StringDictionary[String]): Self = StObject.set(x, "queryStringParams", value.asInstanceOf[js.Any])
      
      inline def setQueryStringParamsUndefined: Self = StObject.set(x, "queryStringParams", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  @js.native
  trait I18NextXhrBackend
    extends StObject
       with BackendModule[BackendOptions] {
    
    def create(languages: String, namespace: String, key: String, fallbackValue: String): Unit = js.native
    
    def init(): Unit = js.native
    def init(services: js.Any): Unit = js.native
    def init(services: js.Any, options: BackendOptions): Unit = js.native
    def init(services: Unit, options: BackendOptions): Unit = js.native
    
    def loadUrl(url: String, callback: ReadCallback): Unit = js.native
    
    var options: BackendOptions = js.native
    
    @JSName("readMulti")
    def readMulti_MI18NextXhrBackend(languages: js.Array[String], namespaces: js.Array[String], callback: ReadCallback): Unit = js.native
    
    var services: js.Any = js.native
    
    @JSName("type")
    var type_I18NextXhrBackend: typings.i18nextXhrBackend.i18nextXhrBackendStrings.backend = js.native
  }
  
  type LoadPathOption = String | (js.Function2[/* lngs */ js.Array[String], /* namespaces */ js.Array[String], String])
}
