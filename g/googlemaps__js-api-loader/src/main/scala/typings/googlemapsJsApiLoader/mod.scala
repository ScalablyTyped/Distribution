package typings.googlemapsJsApiLoader

import typings.googlemapsJsApiLoader.anon.Typeofgoogle
import typings.googlemapsJsApiLoader.googlemapsJsApiLoaderStrings.drawing
import typings.googlemapsJsApiLoader.googlemapsJsApiLoaderStrings.geometry
import typings.googlemapsJsApiLoader.googlemapsJsApiLoaderStrings.localContext
import typings.googlemapsJsApiLoader.googlemapsJsApiLoaderStrings.origin
import typings.googlemapsJsApiLoader.googlemapsJsApiLoaderStrings.places
import typings.googlemapsJsApiLoader.googlemapsJsApiLoaderStrings.visualization
import typings.std.ErrorEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@googlemaps/js-api-loader", "DEFAULT_ID")
  @js.native
  val DEFAULT_ID: /* "__googleMapsScriptId" */ String = js.native
  
  @JSImport("@googlemaps/js-api-loader", "Loader")
  @js.native
  open class Loader protected () extends StObject {
    /**
      * Creates an instance of Loader using [[LoaderOptions]]. No defaults are set
      * using this library, instead the defaults are set by the Google Maps
      * JavaScript API server.
      *
      * ```
      * const loader = Loader({apiKey, version: 'weekly', libraries: ['places']});
      * ```
      */
    def this(param0: LoaderOptions) = this()
    
    /* private */ var CALLBACK: Any = js.native
    
    /**
      * See [[LoaderOptions.apiKey]]
      */
    val apiKey: String = js.native
    
    /**
      * See [[LoaderOptions.authReferrerPolicy]]
      */
    val authReferrerPolicy: origin = js.native
    
    /* private */ var callback: Any = js.native
    
    /* private */ var callbacks: Any = js.native
    
    /**
      * See [[LoaderOptions.channel]]
      */
    val channel: String = js.native
    
    /**
      * See [[LoaderOptions.client]]
      */
    val client: String = js.native
    
    /**
      * CreateUrl returns the Google Maps JavaScript API script url given the [[LoaderOptions]].
      *
      * @ignore
      */
    def createUrl(): String = js.native
    
    def deleteScript(): Unit = js.native
    
    /* private */ var done: Any = js.native
    
    /* private */ var errors: Any = js.native
    
    /* private */ var execute: Any = js.native
    
    /* private */ def failed: Any = js.native
    
    /**
      * See [[LoaderOptions.id]]
      */
    val id: String = js.native
    
    /**
      * See [[LoaderOptions.language]]
      */
    val language: String = js.native
    
    /**
      * See [[LoaderOptions.libraries]]
      */
    val libraries: Libraries = js.native
    
    /**
      * Load the Google Maps JavaScript API script and return a Promise.
      */
    def load(): js.Promise[Typeofgoogle] = js.native
    
    /**
      * Load the Google Maps JavaScript API script with a callback.
      */
    def loadCallback(fn: js.Function1[/* e */ ErrorEvent, Unit]): Unit = js.native
    
    /* private */ var loadErrorCallback: Any = js.native
    
    /**
      * Load the Google Maps JavaScript API script and return a Promise.
      *
      * @ignore
      */
    def loadPromise(): js.Promise[Typeofgoogle] = js.native
    
    /* private */ var loading: Any = js.native
    
    /**
      * See [[LoaderOptions.mapIds]]
      */
    val mapIds: js.Array[String] = js.native
    
    /**
      * See [[LoaderOptions.nonce]]
      */
    val nonce: String | Null = js.native
    
    /* private */ var onerrorEvent: Any = js.native
    
    def options: LoaderOptions = js.native
    
    /**
      * See [[LoaderOptions.region]]
      */
    val region: String = js.native
    
    /**
      * Reset the loader state.
      */
    /* private */ var reset: Any = js.native
    
    /* private */ var resetIfRetryingFailed: Any = js.native
    
    /**
      * See [[LoaderOptions.retries]]
      */
    val retries: Double = js.native
    
    /* private */ var setCallback: Any = js.native
    
    /**
      * Set the script on document.
      */
    /* private */ var setScript: Any = js.native
    
    def status: LoaderStatus = js.native
    
    /**
      * See [[LoaderOptions.url]]
      */
    val url: String = js.native
    
    /**
      * See [[LoaderOptions.version]]
      */
    val version: String = js.native
  }
  /* static members */
  object Loader {
    
    @JSImport("@googlemaps/js-api-loader", "Loader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@googlemaps/js-api-loader", "Loader.instance")
    @js.native
    def instance: Any = js.native
    inline def instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait LoaderStatus extends StObject
  @JSImport("@googlemaps/js-api-loader", "LoaderStatus")
  @js.native
  object LoaderStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LoaderStatus & Double] = js.native
    
    @js.native
    sealed trait FAILURE
      extends StObject
         with LoaderStatus
    /* 3 */ val FAILURE: typings.googlemapsJsApiLoader.mod.LoaderStatus.FAILURE & Double = js.native
    
    @js.native
    sealed trait INITIALIZED
      extends StObject
         with LoaderStatus
    /* 0 */ val INITIALIZED: typings.googlemapsJsApiLoader.mod.LoaderStatus.INITIALIZED & Double = js.native
    
    @js.native
    sealed trait LOADING
      extends StObject
         with LoaderStatus
    /* 1 */ val LOADING: typings.googlemapsJsApiLoader.mod.LoaderStatus.LOADING & Double = js.native
    
    @js.native
    sealed trait SUCCESS
      extends StObject
         with LoaderStatus
    /* 2 */ val SUCCESS: typings.googlemapsJsApiLoader.mod.LoaderStatus.SUCCESS & Double = js.native
  }
  
  type Libraries = js.Array[drawing | geometry | localContext | places | visualization]
  
  trait LoaderOptions extends StObject {
    
    /**
      * See https://developers.google.com/maps/documentation/javascript/get-api-key.
      */
    var apiKey: String
    
    /**
      * Maps JS customers can configure HTTP Referrer Restrictions in the Cloud
      * Console to limit which URLs are allowed to use a particular API Key. By
      * default, these restrictions can be configured to allow only certain paths
      * to use an API Key. If any URL on the same domain or origin may use the API
      * Key, you can set `auth_referrer_policy=origin` to limit the amount of data
      * sent when authorizing requests from the Maps JavaScript API. This is
      * available starting in version 3.46. When this parameter is specified and
      * HTTP Referrer Restrictions are enabled on Cloud Console, Maps JavaScript
      * API will only be able to load if there is an HTTP Referrer Restriction that
      * matches the current website's domain without a path specified.
      */
    var authReferrerPolicy: js.UndefOr[origin] = js.undefined
    
    /**
      * @deprecated See https://developers.google.com/maps/premium/overview.
      */
    var channel: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated See https://developers.google.com/maps/premium/overview, use `apiKey` instead.
      */
    var client: js.UndefOr[String] = js.undefined
    
    /**
      * The id of the script tag. Before adding a new script, the Loader will check for an existing one.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * By default, the Maps JavaScript API uses the user's preferred language
      * setting as specified in the browser, when displaying textual information
      * such as the names for controls, copyright notices, driving directions and
      * labels on maps. In most cases, it's preferable to respect the browser
      * setting. However, if you want the Maps JavaScript API to ignore the
      * browser's language setting, you can force it to display information in a
      * particular language when loading the Maps JavaScript API code.
      *
      * For example, the following example localizes the language to Japan:
      *
      * ```
      * const loader = Loader({apiKey, language: 'ja', region: 'JP'});
      * ```
      *
      * See the [list of supported
      * languages](https://developers.google.com/maps/faq#languagesupport). Note
      * that new languages are added often, so this list may not be exhaustive.
      *
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * When loading the Maps JavaScript API via the URL you may optionally load
      * additional libraries through use of the libraries URL parameter. Libraries
      * are modules of code that provide additional functionality to the main Maps
      * JavaScript API but are not loaded unless you specifically request them.
      *
      * ```
      * const loader = Loader({
      *  apiKey,
      *  libraries: ['drawing', 'geometry', 'places', 'visualization'],
      * });
      * ```
      *
      * Set the [list of libraries](https://developers.google.com/maps/documentation/javascript/libraries) for more options.
      */
    var libraries: js.UndefOr[Libraries] = js.undefined
    
    /**
      * @deprecated Passing `mapIds` is no longer required in the script tag.
      */
    var mapIds: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Use a cryptographic nonce attribute.
      */
    var nonce: js.UndefOr[String] = js.undefined
    
    /**
      * When you load the Maps JavaScript API from maps.googleapis.com it applies a
      * default bias for application behavior towards the United States. If you
      * want to alter your application to serve different map tiles or bias the
      * application (such as biasing geocoding results towards the region), you can
      * override this default behavior by adding a region parameter when loading
      * the Maps JavaScript API code.
      *
      * The region parameter accepts Unicode region subtag identifiers which
      * (generally) have a one-to-one mapping to country code Top-Level Domains
      * (ccTLDs). Most Unicode region identifiers are identical to ISO 3166-1
      * codes, with some notable exceptions. For example, Great Britain's ccTLD is
      * "uk" (corresponding to the domain .co.uk) while its region identifier is
      * "GB."
      *
      * For example, the following example localizes the map to the United Kingdom:
      *
      * ```
      * const loader = Loader({apiKey, region: 'GB'});
      * ```
      */
    var region: js.UndefOr[String] = js.undefined
    
    /**
      * The number of script load retries.
      */
    var retries: js.UndefOr[Double] = js.undefined
    
    /**
      * Use a custom url and path to load the Google Maps API script.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * In your application you can specify release channels or version numbers:
      *
      * The weekly version is specified with `version=weekly`. This version is
      * updated once per week, and is the most current.
      *
      * ```
      * const loader = Loader({apiKey, version: 'weekly'});
      * ```
      *
      * The quarterly version is specified with `version=quarterly`. This version
      * is updated once per quarter, and is the most predictable.
      *
      * ```
      * const loader = Loader({apiKey, version: 'quarterly'});
      * ```
      *
      * The version number is specified with `version=n.nn`. You can choose
      * `version=3.40`, `version=3.39`, or `version=3.38`. Version numbers are
      * updated once per quarter.
      *
      * ```
      * const loader = Loader({apiKey, version: '3.40'});
      * ```
      *
      * If you do not explicitly specify a version, you will receive the
      * weekly version by default.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object LoaderOptions {
    
    inline def apply(apiKey: String): LoaderOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoaderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setAuthReferrerPolicy(value: origin): Self = StObject.set(x, "authReferrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setAuthReferrerPolicyUndefined: Self = StObject.set(x, "authReferrerPolicy", js.undefined)
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLibraries(value: Libraries): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
      
      inline def setLibrariesUndefined: Self = StObject.set(x, "libraries", js.undefined)
      
      inline def setLibrariesVarargs(value: (drawing | geometry | localContext | places | visualization)*): Self = StObject.set(x, "libraries", js.Array(value*))
      
      inline def setMapIds(value: js.Array[String]): Self = StObject.set(x, "mapIds", value.asInstanceOf[js.Any])
      
      inline def setMapIdsUndefined: Self = StObject.set(x, "mapIds", js.undefined)
      
      inline def setMapIdsVarargs(value: String*): Self = StObject.set(x, "mapIds", js.Array(value*))
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /**
    * @ignore
    */
  object global {
    
    trait Window extends StObject {
      
      def __googleMapsCallback(e: Event): Unit
    }
    object Window {
      
      inline def apply(__googleMapsCallback: Event => Unit): Window = {
        val __obj = js.Dynamic.literal(__googleMapsCallback = js.Any.fromFunction1(__googleMapsCallback))
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def set__googleMapsCallback(value: Event => Unit): Self = StObject.set(x, "__googleMapsCallback", js.Any.fromFunction1(value))
      }
    }
  }
}
