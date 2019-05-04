package typings
package atJupyterlabServicesLib.libServerconnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/serverconnection", "ServerConnection")
@js.native
object ServerConnectionNs extends js.Object {
  /**
    * A Jupyter server settings object.
    * Note that all of the settings are optional when passed to
    * [[makeSettings]].  The default settings are given in [[defaultSettings]].
    */
  @js.native
  trait ISettings extends js.Object {
    /**
      * The `Headers` object constructor.
      */
    val Headers: atJupyterlabServicesLib.Anon_InitHeaders = js.native
    /**
      * The `Request` object constructor.
      */
    val Request: atJupyterlabServicesLib.Anon_Init = js.native
    /**
      * The `WebSocket` object constructor.
      */
    val WebSocket: atJupyterlabServicesLib.Anon_CLOSED = js.native
    /**
      * The base url of the server.
      */
    val baseUrl: java.lang.String = js.native
    /**
      * The default request init options.
      */
    val init: stdLib.RequestInit = js.native
    /**
      * The page url of the JupyterLab application.
      */
    val pageUrl: java.lang.String = js.native
    /**
      * The authentication token for requests.  Use an empty string to disable.
      */
    val token: java.lang.String = js.native
    /**
      * The base ws url of the server.
      */
    val wsUrl: java.lang.String = js.native
    /**
      * The `fetch` method to use.
      */
    def fetch(input: stdLib.RequestInfo): js.Promise[stdLib.Response] = js.native
    def fetch(input: stdLib.RequestInfo, init: stdLib.RequestInit): js.Promise[stdLib.Response] = js.native
  }
  
  /**
    * A wrapped error for a network error.
    */
  @js.native
  class NetworkError protected ()
    extends stdLib.TypeError {
    /**
      * Create a new network error.
      */
    def this(original: stdLib.TypeError) = this()
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
  /**
    * A wrapped error for a fetch response.
    */
  @js.native
  class ResponseError protected ()
    extends stdLib.Error {
    /**
      * Create a new response error.
      */
    def this(response: stdLib.Response) = this()
    def this(response: stdLib.Response, message: java.lang.String) = this()
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /**
      * The response associated with the error.
      */
    var response: stdLib.Response = js.native
  }
  
  /**
    * The default settings.
    */
  val defaultSettings: ISettings = js.native
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
  def makeRequest(url: java.lang.String, init: stdLib.RequestInit, settings: ISettings): js.Promise[stdLib.Response] = js.native
  /**
    * Create a settings object given a subset of options.
    *
    * @param options - An optional partial set of options.
    *
    * @returns The full settings object.
    */
  def makeSettings(): ISettings = js.native
  def makeSettings(options: stdLib.Partial[ISettings]): ISettings = js.native
}

