package typings.jupyterlabServices.sessionSessionMod.Session

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session/session", "Session.listRunning")
@js.native
object listRunning extends js.Object {
  /**
    * List the running sessions.
    *
    * @param settings - The server settings to use for the request.
    *
    * @returns A promise that resolves with the list of session models.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/sessions), and validates the response.
    *
    * All client-side sessions are updated with current information.
    *
    * The promise is fulfilled on a valid response and rejected otherwise.
    */
  def apply(): js.Promise[js.Array[IModel]] = js.native
  def apply(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
}

