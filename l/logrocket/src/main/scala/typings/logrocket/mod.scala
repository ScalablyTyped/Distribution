package typings.logrocket

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.logrocket.anon.BaseHref
import typings.logrocket.anon.IsEnabled
import typings.logrocket.anon.RequestSanitizer
import typings.logrocket.anon.UrlSanitizer
import typings.logrocket.mod.LR.LogRocket
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("logrocket", JSImport.Namespace)
  @js.native
  val ^ : LogRocket = js.native
  
  object LR {
    
    type Action = StringDictionary[js.Any]
    
    trait ICaptureOptions extends StObject {
      
      var extra: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.undefined
      
      var tags: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.undefined
    }
    object ICaptureOptions {
      
      @scala.inline
      def apply(): ICaptureOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICaptureOptions]
      }
      
      @scala.inline
      implicit class ICaptureOptionsMutableBuilder[Self <: ICaptureOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExtra(value: StringDictionary[String | Double | Boolean]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
        
        @scala.inline
        def setTags(value: StringDictionary[String | Double | Boolean]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      }
    }
    
    trait IOptions extends StObject {
      
      var browser: js.UndefOr[UrlSanitizer] = js.undefined
      
      var console: js.UndefOr[IsEnabled] = js.undefined
      
      var dom: js.UndefOr[BaseHref] = js.undefined
      
      /** Convenience option for configuring the SDK for an on-prem install. Include the protocol (eg. https://ingest.example.com) **/
      var ingestServer: js.UndefOr[String] = js.undefined
      
      var mergeIframes: js.UndefOr[Boolean] = js.undefined
      
      var network: js.UndefOr[RequestSanitizer] = js.undefined
      
      var release: js.UndefOr[String] = js.undefined
      
      /**
        * Enable sharing sessions across subdomains by setting this to the top-level hostname.
        **/
      var rootHostname: js.UndefOr[String] = js.undefined
      
      /** Convenience option for configuring where the full SDK should be loaded from for on-prem installs. **/
      var sdkServer: js.UndefOr[String] = js.undefined
      
      /** Controls collection of IP addresses and related features, such as GeoIP **/
      var shouldCaptureIP: js.UndefOr[Boolean] = js.undefined
      
      var shouldDebugLog: js.UndefOr[Boolean] = js.undefined
      
      /** a callback which determines whether to send data at a particular moment of time. **/
      var shouldSendData: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      var uploadTimeInterval: js.UndefOr[Double] = js.undefined
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBrowser(value: UrlSanitizer): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
        
        @scala.inline
        def setConsole(value: IsEnabled): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
        
        @scala.inline
        def setDom(value: BaseHref): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
        
        @scala.inline
        def setIngestServer(value: String): Self = StObject.set(x, "ingestServer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIngestServerUndefined: Self = StObject.set(x, "ingestServer", js.undefined)
        
        @scala.inline
        def setMergeIframes(value: Boolean): Self = StObject.set(x, "mergeIframes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMergeIframesUndefined: Self = StObject.set(x, "mergeIframes", js.undefined)
        
        @scala.inline
        def setNetwork(value: RequestSanitizer): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
        
        @scala.inline
        def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
        
        @scala.inline
        def setRootHostname(value: String): Self = StObject.set(x, "rootHostname", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRootHostnameUndefined: Self = StObject.set(x, "rootHostname", js.undefined)
        
        @scala.inline
        def setSdkServer(value: String): Self = StObject.set(x, "sdkServer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSdkServerUndefined: Self = StObject.set(x, "sdkServer", js.undefined)
        
        @scala.inline
        def setShouldCaptureIP(value: Boolean): Self = StObject.set(x, "shouldCaptureIP", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShouldCaptureIPUndefined: Self = StObject.set(x, "shouldCaptureIP", js.undefined)
        
        @scala.inline
        def setShouldDebugLog(value: Boolean): Self = StObject.set(x, "shouldDebugLog", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShouldDebugLogUndefined: Self = StObject.set(x, "shouldDebugLog", js.undefined)
        
        @scala.inline
        def setShouldSendData(value: () => Boolean): Self = StObject.set(x, "shouldSendData", js.Any.fromFunction0(value))
        
        @scala.inline
        def setShouldSendDataUndefined: Self = StObject.set(x, "shouldSendData", js.undefined)
        
        @scala.inline
        def setUploadTimeInterval(value: Double): Self = StObject.set(x, "uploadTimeInterval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUploadTimeIntervalUndefined: Self = StObject.set(x, "uploadTimeInterval", js.undefined)
      }
    }
    
    trait IReduxMiddlewareOptions extends StObject {
      
      /** Sanitizer function to scrub or ignore specific redux actions */
      var actionSanitizer: js.UndefOr[js.Function1[/* action */ Action, Null | Action]] = js.undefined
      
      /** Sanitizer function to scrub redux state */
      var stateSanitizer: js.UndefOr[js.Function1[/* state */ State, State]] = js.undefined
    }
    object IReduxMiddlewareOptions {
      
      @scala.inline
      def apply(): IReduxMiddlewareOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IReduxMiddlewareOptions]
      }
      
      @scala.inline
      implicit class IReduxMiddlewareOptionsMutableBuilder[Self <: IReduxMiddlewareOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActionSanitizer(value: /* action */ Action => Null | Action): Self = StObject.set(x, "actionSanitizer", js.Any.fromFunction1(value))
        
        @scala.inline
        def setActionSanitizerUndefined: Self = StObject.set(x, "actionSanitizer", js.undefined)
        
        @scala.inline
        def setStateSanitizer(value: /* state */ State => State): Self = StObject.set(x, "stateSanitizer", js.Any.fromFunction1(value))
        
        @scala.inline
        def setStateSanitizerUndefined: Self = StObject.set(x, "stateSanitizer", js.undefined)
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
      
      @scala.inline
      def apply(headers: StringDictionary[js.UndefOr[String]], method: String, reqId: String, url: String): IRequest = {
        val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRequest]
      }
      
      @scala.inline
      implicit class IRequestMutableBuilder[Self <: IRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        @scala.inline
        def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
        
        @scala.inline
        def setHeaders(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        @scala.inline
        def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
        
        @scala.inline
        def setReqId(value: String): Self = StObject.set(x, "reqId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
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
      
      @scala.inline
      def apply(headers: StringDictionary[js.UndefOr[String]], method: String, reqId: String): IResponse = {
        val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any])
        __obj.asInstanceOf[IResponse]
      }
      
      @scala.inline
      implicit class IResponseMutableBuilder[Self <: IResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        @scala.inline
        def setHeaders(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReqId(value: String): Self = StObject.set(x, "reqId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    type IUserTraits = StringDictionary[String | Double | Boolean]
    
    @js.native
    trait LogRocket extends StObject {
      
      /** Manually report exceptions to LogRocket */
      def captureException(/** Error instance */
      exception: Error): Unit = js.native
      def captureException(/** Error instance */
      exception: Error, /** Error metadata */
      options: ICaptureOptions): Unit = js.native
      
      /** Manually report string errors to LogRocket */
      def captureMessage(/** identifier */
      message: String): Unit = js.native
      def captureMessage(/** identifier */
      message: String, /** error metadata */
      options: ICaptureOptions): Unit = js.native
      
      def debug(props: js.Any*): Unit = js.native
      
      def error(props: js.Any*): Unit = js.native
      
      /** Get the current session URL in a callback function */
      def getSessionURL(/** Callback to get session URL */
      callback: js.Function1[/* sessionURL */ String, Unit]): Unit = js.native
      
      def identify(traits: IUserTraits): Unit = js.native
      /** Identify a user with the current session, with optional user traits */
      def identify(uid: String): Unit = js.native
      def identify(uid: String, traits: IUserTraits): Unit = js.native
      
      def info(props: js.Any*): Unit = js.native
      
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
      def log(props: js.Any*): Unit = js.native
      
      /** Returns a redux middleware which adds redux logs to LogRocket sessions */
      def reduxMiddleware(): js.Any = js.native
      def reduxMiddleware(/** Optional sanitizer configuration */
      options: IReduxMiddlewareOptions): js.Any = js.native
      
      /** Current session URL if LogRocket has been loaded, null otherwise */
      var sessionURL: String | Null = js.native
      
      /** Start a new session and end the current one */
      def startNewSession(): Unit = js.native
      
      /** Send an event to LogRocket */
      def track(eventName: String): Unit = js.native
      
      def warn(props: js.Any*): Unit = js.native
    }
    
    type State = StringDictionary[js.Any]
  }
  
  type _To = LogRocket
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: LogRocket = ^
}
