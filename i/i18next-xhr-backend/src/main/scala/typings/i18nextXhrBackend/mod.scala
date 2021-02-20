package typings.i18nextXhrBackend

import org.scalablytyped.runtime.StringDictionary
import typings.i18next.mod.BackendModule
import typings.i18next.mod.ReadCallback
import typings.i18nextXhrBackend.i18nextXhrBackendStrings.backend
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18next-xhr-backend", JSImport.Default)
  @js.native
  class default () extends I18NextXhrBackend {
    def this(services: js.Any) = this()
    def this(services: js.UndefOr[scala.Nothing], options: BackendOptions) = this()
    def this(services: js.Any, options: BackendOptions) = this()
  }
  
  type AjaxRequestCallback = js.Function2[/* response */ String, /* x */ XMLHttpRequest, Unit]
  
  @js.native
  trait BackendOptions extends StObject {
    
    /**
      * path to post missing resources
      */
    var addPath: js.UndefOr[String] = js.native
    
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
      ] = js.native
    
    /**
      * your backend server supports multiLoading
      * locales/resources.json?lng=de+en&ns=ns1+ns2
      * set loadPath: '/locales/resources.json?lng={{lng}}&ns={{ns}}' to adapt to multiLoading
      */
    var allowMultiLoading: js.UndefOr[Boolean] = js.native
    
    /**
      * allow cross domain requests
      */
    var crossDomain: js.UndefOr[Boolean] = js.native
    
    /**
      * @see https://github.com/i18next/i18next-xhr-backend/blob/281c7e235e1157b33122adacef1957252e5700f1/src/ajax.js#L52
      */
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * path where resources get loaded from, or a function
      * returning a path:
      * function(lngs, namespaces) { return customPath; }
      * the returned path will interpolate lng, ns if provided like giving a static path
      */
    var loadPath: js.UndefOr[LoadPathOption] = js.native
    
    /**
      * parse data after it has been fetched
      * in example use https://www.npmjs.com/package/json5
      * here it removes the letter a from the json (bad idea)
      */
    var parse: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
    
    /**
      * parse data before it has been sent by addPath
      */
    var parsePayload: js.UndefOr[
        js.Function3[
          /* namespace */ String, 
          /* key */ String, 
          /* fallbackValue */ js.UndefOr[String], 
          StringDictionary[_]
        ]
      ] = js.native
    
    /**
      * adds parameters to resource URL. 'example.com' -> 'example.com?v=1.3.5'
      */
    var queryStringParams: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * allow credentials on cross domain requests
      */
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  object BackendOptions {
    
    @scala.inline
    def apply(): BackendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackendOptions]
    }
    
    @scala.inline
    implicit class BackendOptionsMutableBuilder[Self <: BackendOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddPath(value: String): Self = StObject.set(x, "addPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddPathUndefined: Self = StObject.set(x, "addPath", js.undefined)
      
      @scala.inline
      def setAjax(
        value: (/* url */ String, BackendOptions, /* callback */ AjaxRequestCallback, /* data */ js.Object | String, /* cache */ Boolean) => Unit
      ): Self = StObject.set(x, "ajax", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
      
      @scala.inline
      def setAllowMultiLoading(value: Boolean): Self = StObject.set(x, "allowMultiLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultiLoadingUndefined: Self = StObject.set(x, "allowMultiLoading", js.undefined)
      
      @scala.inline
      def setCrossDomain(value: Boolean): Self = StObject.set(x, "crossDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossDomainUndefined: Self = StObject.set(x, "crossDomain", js.undefined)
      
      @scala.inline
      def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setLoadPath(value: LoadPathOption): Self = StObject.set(x, "loadPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadPathFunction2(value: (/* lngs */ js.Array[String], /* namespaces */ js.Array[String]) => String): Self = StObject.set(x, "loadPath", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadPathUndefined: Self = StObject.set(x, "loadPath", js.undefined)
      
      @scala.inline
      def setParse(value: /* data */ String => String): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParsePayload(
        value: (/* namespace */ String, /* key */ String, /* fallbackValue */ js.UndefOr[String]) => StringDictionary[_]
      ): Self = StObject.set(x, "parsePayload", js.Any.fromFunction3(value))
      
      @scala.inline
      def setParsePayloadUndefined: Self = StObject.set(x, "parsePayload", js.undefined)
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setQueryStringParams(value: StringDictionary[String]): Self = StObject.set(x, "queryStringParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryStringParamsUndefined: Self = StObject.set(x, "queryStringParams", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  @js.native
  trait I18NextXhrBackend extends BackendModule[BackendOptions] {
    
    def create(languages: String, namespace: String, key: String, fallbackValue: String): Unit = js.native
    
    def init(): Unit = js.native
    def init(services: js.UndefOr[scala.Nothing], options: BackendOptions): Unit = js.native
    def init(services: js.Any): Unit = js.native
    def init(services: js.Any, options: BackendOptions): Unit = js.native
    
    def loadUrl(url: String, callback: ReadCallback): Unit = js.native
    
    var options: BackendOptions = js.native
    
    @JSName("readMulti")
    def readMulti_MI18NextXhrBackend(languages: js.Array[String], namespaces: js.Array[String], callback: ReadCallback): Unit = js.native
    
    var services: js.Any = js.native
    
    @JSName("type")
    var type_I18NextXhrBackend: backend = js.native
  }
  
  type LoadPathOption = String | (js.Function2[/* lngs */ js.Array[String], /* namespaces */ js.Array[String], String])
}
