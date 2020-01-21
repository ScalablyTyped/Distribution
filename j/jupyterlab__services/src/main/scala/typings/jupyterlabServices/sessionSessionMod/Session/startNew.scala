package typings.jupyterlabServices.sessionSessionMod.Session

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session/session", "Session.startNew")
@js.native
object startNew extends js.Object {
  /**
    * Start a new session.
    *
    * @param options - The options used to start the session.
    *
    * @returns A promise that resolves with the session instance.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/sessions), and validates the response.
    *
    * A path must be provided.  If a kernel id is given, it will
    * connect to an existing kernel.  If no kernel id or name is given,
    * the server will start the default kernel type.
    *
    * The promise is fulfilled on a valid response and rejected otherwise.
    *
    * Wrap the result in an Session object. The promise is fulfilled
    * when the session is created on the server, otherwise the promise is
    * rejected.
    */
  def apply(options: IOptions): js.Promise[ISession] = js.native
}

