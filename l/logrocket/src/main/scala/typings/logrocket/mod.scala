package typings.logrocket

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.logrocket.anon.BaseHref
import typings.logrocket.anon.IsEnabled
import typings.logrocket.anon.RequestSanitizer
import typings.logrocket.anon.UrlSanitizer
import typings.logrocket.mod.LR.LogRocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("logrocket", JSImport.Namespace)
  @js.native
  val ^ : LogRocket = js.native
  
  object LR {
    
    type Action = StringDictionary[Any]
    
    trait ICaptureOptions extends StObject {
      
      var extra: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.undefined
      
      var tags: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.undefined
    }
    object ICaptureOptions {
      
      inline def apply(): ICaptureOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICaptureOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ICaptureOptions] (val x: Self) extends AnyVal {
        
        inline def setExtra(value: StringDictionary[String | Double | Boolean]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
        
        inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
        
        inline def setTags(value: StringDictionary[String | Double | Boolean]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      }
    }
    
    trait IOptions extends StObject {
      
      var browser: js.UndefOr[UrlSanitizer] = js.undefined
      
      /**
        * Controls domains to which a parent window can post messages
        * in order to merge recording with cross-domain iframes
        * */
      var childDomains: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      var console: js.UndefOr[IsEnabled] = js.undefined
      
      /** Disables automatic busy frames tracking used for CPU Usage monitoring
        */
      var disableBusyFramesTracker: js.UndefOr[Boolean] = js.undefined
      
      var dom: js.UndefOr[BaseHref] = js.undefined
      
      /**
        * Convenience option for configuring the SDK for an on-prem install.
        * Include the protocol (eg. https://ingest.example.com)
        * */
      var ingestServer: js.UndefOr[String] = js.undefined
      
      var mergeIframes: js.UndefOr[Boolean] = js.undefined
      
      var network: js.UndefOr[RequestSanitizer] = js.undefined
      
      /**
        * Controls domain to which an iframe window can post messages
        * in order to merge recording with a cross-domain parent window
        * */
      var parentDomain: js.UndefOr[String | Null] = js.undefined
      
      var release: js.UndefOr[String] = js.undefined
      
      /**
        * Enable sharing sessions across subdomains by setting this to the top-level hostname.
        * */
      var rootHostname: js.UndefOr[String] = js.undefined
      
      /**
        * Convenience option for configuring
        * where the full SDK should be loaded from for on-prem installs
        * */
      var sdkServer: js.UndefOr[String] = js.undefined
      
      var shouldAugmentNPS: js.UndefOr[Boolean] = js.undefined
      
      /** Controls collection of IP addresses and related features, such as GeoIP */
      var shouldCaptureIP: js.UndefOr[Boolean] = js.undefined
      
      var shouldDebugLog: js.UndefOr[Boolean] = js.undefined
      
      /** Controls automatic detection of JS errors using Raven.js
        *  Does not impact captureException or aggregation of console errors
        */
      var shouldDetectExceptions: js.UndefOr[Boolean] = js.undefined
      
      var shouldParseXHRBlob: js.UndefOr[Boolean] = js.undefined
      
      /** a callback which determines whether to send data at a particular moment of time. * */
      var shouldSendData: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      var uploadTimeInterval: js.UndefOr[Double] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setBrowser(value: UrlSanitizer): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
        
        inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
        
        inline def setChildDomains(value: js.Array[String]): Self = StObject.set(x, "childDomains", value.asInstanceOf[js.Any])
        
        inline def setChildDomainsNull: Self = StObject.set(x, "childDomains", null)
        
        inline def setChildDomainsUndefined: Self = StObject.set(x, "childDomains", js.undefined)
        
        inline def setChildDomainsVarargs(value: String*): Self = StObject.set(x, "childDomains", js.Array(value*))
        
        inline def setConsole(value: IsEnabled): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
        
        inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
        
        inline def setDisableBusyFramesTracker(value: Boolean): Self = StObject.set(x, "disableBusyFramesTracker", value.asInstanceOf[js.Any])
        
        inline def setDisableBusyFramesTrackerUndefined: Self = StObject.set(x, "disableBusyFramesTracker", js.undefined)
        
        inline def setDom(value: BaseHref): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
        
        inline def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
        
        inline def setIngestServer(value: String): Self = StObject.set(x, "ingestServer", value.asInstanceOf[js.Any])
        
        inline def setIngestServerUndefined: Self = StObject.set(x, "ingestServer", js.undefined)
        
        inline def setMergeIframes(value: Boolean): Self = StObject.set(x, "mergeIframes", value.asInstanceOf[js.Any])
        
        inline def setMergeIframesUndefined: Self = StObject.set(x, "mergeIframes", js.undefined)
        
        inline def setNetwork(value: RequestSanitizer): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
        
        inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
        
        inline def setParentDomain(value: String): Self = StObject.set(x, "parentDomain", value.asInstanceOf[js.Any])
        
        inline def setParentDomainNull: Self = StObject.set(x, "parentDomain", null)
        
        inline def setParentDomainUndefined: Self = StObject.set(x, "parentDomain", js.undefined)
        
        inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
        
        inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
        
        inline def setRootHostname(value: String): Self = StObject.set(x, "rootHostname", value.asInstanceOf[js.Any])
        
        inline def setRootHostnameUndefined: Self = StObject.set(x, "rootHostname", js.undefined)
        
        inline def setSdkServer(value: String): Self = StObject.set(x, "sdkServer", value.asInstanceOf[js.Any])
        
        inline def setSdkServerUndefined: Self = StObject.set(x, "sdkServer", js.undefined)
        
        inline def setShouldAugmentNPS(value: Boolean): Self = StObject.set(x, "shouldAugmentNPS", value.asInstanceOf[js.Any])
        
        inline def setShouldAugmentNPSUndefined: Self = StObject.set(x, "shouldAugmentNPS", js.undefined)
        
        inline def setShouldCaptureIP(value: Boolean): Self = StObject.set(x, "shouldCaptureIP", value.asInstanceOf[js.Any])
        
        inline def setShouldCaptureIPUndefined: Self = StObject.set(x, "shouldCaptureIP", js.undefined)
        
        inline def setShouldDebugLog(value: Boolean): Self = StObject.set(x, "shouldDebugLog", value.asInstanceOf[js.Any])
        
        inline def setShouldDebugLogUndefined: Self = StObject.set(x, "shouldDebugLog", js.undefined)
        
        inline def setShouldDetectExceptions(value: Boolean): Self = StObject.set(x, "shouldDetectExceptions", value.asInstanceOf[js.Any])
        
        inline def setShouldDetectExceptionsUndefined: Self = StObject.set(x, "shouldDetectExceptions", js.undefined)
        
        inline def setShouldParseXHRBlob(value: Boolean): Self = StObject.set(x, "shouldParseXHRBlob", value.asInstanceOf[js.Any])
        
        inline def setShouldParseXHRBlobUndefined: Self = StObject.set(x, "shouldParseXHRBlob", js.undefined)
        
        inline def setShouldSendData(value: () => Boolean): Self = StObject.set(x, "shouldSendData", js.Any.fromFunction0(value))
        
        inline def setShouldSendDataUndefined: Self = StObject.set(x, "shouldSendData", js.undefined)
        
        inline def setUploadTimeInterval(value: Double): Self = StObject.set(x, "uploadTimeInterval", value.asInstanceOf[js.Any])
        
        inline def setUploadTimeIntervalUndefined: Self = StObject.set(x, "uploadTimeInterval", js.undefined)
      }
    }
    
    trait IReduxMiddlewareOptions extends StObject {
      
      /** Sanitizer function to scrub or ignore specific redux actions */
      var actionSanitizer: js.UndefOr[js.Function1[/* action */ Action, Null | Action]] = js.undefined
      
      /** Sanitizer function to scrub redux state */
      var stateSanitizer: js.UndefOr[js.Function1[/* state */ State, State]] = js.undefined
    }
    object IReduxMiddlewareOptions {
      
      inline def apply(): IReduxMiddlewareOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IReduxMiddlewareOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IReduxMiddlewareOptions] (val x: Self) extends AnyVal {
        
        inline def setActionSanitizer(value: /* action */ Action => Null | Action): Self = StObject.set(x, "actionSanitizer", js.Any.fromFunction1(value))
        
        inline def setActionSanitizerUndefined: Self = StObject.set(x, "actionSanitizer", js.undefined)
        
        inline def setStateSanitizer(value: /* state */ State => State): Self = StObject.set(x, "stateSanitizer", js.Any.fromFunction1(value))
        
        inline def setStateSanitizerUndefined: Self = StObject.set(x, "stateSanitizer", js.undefined)
      }
    }
    
    trait IRequest extends StObject {
      
      var body: js.UndefOr[String] = js.undefined
      
      var credentials: js.UndefOr[String] = js.undefined
      
      var headers: StringDictionary[js.UndefOr[String]]
      
      var method: String
      
      var mode: js.UndefOr[String] = js.undefined
      
      var referrer: js.UndefOr[String] = js.undefined
      
      var reqId: String
      
      var url: String
    }
    object IRequest {
      
      inline def apply(headers: StringDictionary[js.UndefOr[String]], method: String, reqId: String, url: String): IRequest = {
        val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRequest]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IRequest] (val x: Self) extends AnyVal {
        
        inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        inline def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
        
        inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
        
        inline def setHeaders(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
        
        inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
        
        inline def setReqId(value: String): Self = StObject.set(x, "reqId", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    trait IResponse extends StObject {
      
      var body: js.UndefOr[String] = js.undefined
      
      var headers: StringDictionary[js.UndefOr[String]]
      
      var method: String
      
      var reqId: String
      
      var status: js.UndefOr[Double] = js.undefined
    }
    object IResponse {
      
      inline def apply(headers: StringDictionary[js.UndefOr[String]], method: String, reqId: String): IResponse = {
        val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any])
        __obj.asInstanceOf[IResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IResponse] (val x: Self) extends AnyVal {
        
        inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        inline def setHeaders(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setReqId(value: String): Self = StObject.set(x, "reqId", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    type IUserTraits = StringDictionary[String | Double | Boolean]
    
    @js.native
    trait LogRocket extends StObject {
      
      /** Manually report exceptions to LogRocket */
      def captureException(/** Error instance */
      exception: js.Error): Unit = js.native
      def captureException(/** Error instance */
      exception: js.Error, /** Error metadata */
      options: ICaptureOptions): Unit = js.native
      
      /** Manually report string errors to LogRocket */
      def captureMessage(/** identifier */
      message: String): Unit = js.native
      def captureMessage(/** identifier */
      message: String, /** error metadata */
      options: ICaptureOptions): Unit = js.native
      
      def debug(props: Any*): Unit = js.native
      
      def error(props: Any*): Unit = js.native
      
      /** Get the current session URL in a callback function */
      def getSessionURL(/** Callback to get session URL */
      callback: js.Function1[/* sessionURL */ String, Unit]): Unit = js.native
      
      def identify(traits: IUserTraits): Unit = js.native
      /** Identify a user with the current session, with optional user traits */
      def identify(uid: String): Unit = js.native
      def identify(uid: String, traits: IUserTraits): Unit = js.native
      
      def info(props: Any*): Unit = js.native
      
      /** Configures LogRocket */
      def init(/** Your LogRocket appID (find it in LogRocket settings) */
      appID: String): Unit = js.native
      def init(
        /** Your LogRocket appID (find it in LogRocket settings) */
      appID: String,
        /** Optional configuration to change what LogRocket records */
      options: IOptions
      ): Unit = js.native
      
      // logging functions
      def log(props: Any*): Unit = js.native
      
      /** Returns a redux middleware which adds redux logs to LogRocket sessions */
      def reduxMiddleware(): Any = js.native
      def reduxMiddleware(/** Optional sanitizer configuration */
      options: IReduxMiddlewareOptions): Any = js.native
      
      /** Current session URL if LogRocket has been loaded, null otherwise */
      var sessionURL: String | Null = js.native
      
      /** Start a new session and end the current one */
      def startNewSession(): Unit = js.native
      
      /** Send an event to LogRocket */
      def track(eventName: String): Unit = js.native
      def track(eventName: String, eventProperties: TrackEventProperties): Unit = js.native
      
      /** Current SDK version if LogRocket has been loaded, undefined otherwise */
      var version: js.UndefOr[String] = js.native
      
      def warn(props: Any*): Unit = js.native
    }
    
    type State = StringDictionary[Any]
    
    trait TrackEventProperties
      extends StObject
         with /* key */ StringDictionary[js.UndefOr[String | Double | Boolean | (js.Array[Boolean | Double | String])]] {
      
      var revenue: js.UndefOr[Double] = js.undefined
    }
    object TrackEventProperties {
      
      inline def apply(): TrackEventProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TrackEventProperties]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TrackEventProperties] (val x: Self) extends AnyVal {
        
        inline def setRevenue(value: Double): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
        
        inline def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
      }
    }
  }
  
  type _To = LogRocket
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: LogRocket = ^
}
