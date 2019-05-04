package typings
package atJupyterlabServicesLib.atJupyterlabServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "ServerConnection")
@js.native
object ServerConnectionNs extends js.Object {
  /**
    * A wrapped error for a network error.
    */
  @js.native
  class NetworkError protected ()
    extends atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.NetworkError {
    /**
      * Create a new network error.
      */
    def this(original: stdLib.TypeError) = this()
  }
  
  /**
    * A wrapped error for a fetch response.
    */
  @js.native
  class ResponseError protected ()
    extends atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ResponseError {
    /**
      * Create a new response error.
      */
    def this(response: stdLib.Response) = this()
    def this(response: stdLib.Response, message: java.lang.String) = this()
  }
  
  /**
    * The default settings.
    */
  val defaultSettings: atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings = js.native
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
  def makeRequest(
    url: java.lang.String,
    init: stdLib.RequestInit,
    settings: atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings
  ): js.Promise[stdLib.Response] = js.native
  /**
    * Create a settings object given a subset of options.
    *
    * @param options - An optional partial set of options.
    *
    * @returns The full settings object.
    */
  def makeSettings(): atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings = js.native
  def makeSettings(
    options: stdLib.Partial[atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings]
  ): atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings = js.native
}

