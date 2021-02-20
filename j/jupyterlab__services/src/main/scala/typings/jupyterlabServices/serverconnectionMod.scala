package typings.jupyterlabServices

import typings.jupyterlabServices.anon.PartialISettings
import typings.jupyterlabServices.anon.TypeofWebSocket
import typings.std.Error
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.TypeError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverconnectionMod {
  
  object ServerConnection {
    
    /**
      * A wrapped error for a network error.
      */
    @JSImport("@jupyterlab/services/lib/serverconnection", "ServerConnection.NetworkError")
    @js.native
    class NetworkError protected () extends Error {
      /**
        * Create a new network error.
        */
      def this(original: TypeError) = this()
    }
    
    /**
      * A wrapped error for a fetch response.
      */
    @JSImport("@jupyterlab/services/lib/serverconnection", "ServerConnection.ResponseError")
    @js.native
    class ResponseError protected () extends Error {
      /**
        * Create a new response error.
        */
      def this(response: Response) = this()
      def this(response: Response, message: String) = this()
      def this(response: Response, message: js.UndefOr[scala.Nothing], traceback: String) = this()
      def this(response: Response, message: String, traceback: String) = this()
      
      /**
        * The response associated with the error.
        */
      var response: Response = js.native
      
      /**
        * The traceback associated with the error.
        */
      var traceback: String = js.native
    }
    object ResponseError {
      
      /**
        * Create a ResponseError from a response, handling the traceback and message
        * as appropriate.
        *
        * @param response The response object.
        *
        * @returns A promise that resolves with a `ResponseError` object.
        */
      /* static member */
      @JSImport("@jupyterlab/services/lib/serverconnection", "ServerConnection.ResponseError.create")
      @js.native
      def create(response: Response): js.Promise[ResponseError] = js.native
    }
    
    /**
      * Make an request to the notebook server.
      *
      * @param url - The url for the request.
      *
      * @param init - The initialization options for the request.
      *
      * @param settings - The server settings to apply to the request.
      *
      * @returns a Promise that resolves with the response.
      *
      * @throws If the url of the request is not a notebook server url.
      *
      * #### Notes
      * The `url` must start with `settings.baseUrl`.  The `init` settings are
      * merged with `settings.init`, with `init` taking precedence.
      * The headers in the two objects are not merged.
      * If there is no body data, we set the content type to `application/json`
      * because it is required by the Notebook server.
      */
    @JSImport("@jupyterlab/services/lib/serverconnection", "ServerConnection.makeRequest")
    @js.native
    def makeRequest(url: String, init: RequestInit, settings: ISettings): js.Promise[Response] = js.native
    
    /**
      * Create a settings object given a subset of options.
      *
      * @param options - An optional partial set of options.
      *
      * @returns The full settings object.
      */
    @JSImport("@jupyterlab/services/lib/serverconnection", "ServerConnection.makeSettings")
    @js.native
    def makeSettings(): ISettings = js.native
    @JSImport("@jupyterlab/services/lib/serverconnection", "ServerConnection.makeSettings")
    @js.native
    def makeSettings(options: PartialISettings): ISettings = js.native
    
    /**
      * A Jupyter server settings object.
      * Note that all of the settings are optional when passed to
      * [[makeSettings]].  The default settings are given in [[defaultSettings]].
      */
    @js.native
    trait ISettings extends StObject {
      
      /**
        * The `Headers` object constructor.
        */
      val Headers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Headers */ js.Any = js.native
      
      /**
        * The `Request` object constructor.
        */
      val Request: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Request */ js.Any = js.native
      
      /**
        * The `WebSocket` object constructor.
        */
      val WebSocket: TypeofWebSocket = js.native
      
      /**
        * The app url of the JupyterLab application.
        */
      val appUrl: String = js.native
      
      /**
        * The base url of the server.
        */
      val baseUrl: String = js.native
      
      /**
        * The `fetch` method to use.
        */
      def fetch(input: RequestInfo): js.Promise[Response] = js.native
      def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
      
      /**
        * The default request init options.
        */
      val init: RequestInit = js.native
      
      /**
        * The authentication token for requests.  Use an empty string to disable.
        */
      val token: String = js.native
      
      /**
        * The base ws url of the server.
        */
      val wsUrl: String = js.native
    }
  }
}
