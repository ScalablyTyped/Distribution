package typings.logrocketReact

import typings.logrocket.mod.LR.ICaptureOptions
import typings.logrocket.mod.LR.IOptions
import typings.logrocket.mod.LR.IReduxMiddlewareOptions
import typings.logrocket.mod.LR.IUserTraits
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("logrocket-react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(logRocket: LR): Unit = js.native
  
  /* Inlined { readonly LR} & logrocket.logrocket.LR.LogRocket */
  @js.native
  trait LR extends js.Object {
    
    val LR: js.Any = js.native
    
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
}
