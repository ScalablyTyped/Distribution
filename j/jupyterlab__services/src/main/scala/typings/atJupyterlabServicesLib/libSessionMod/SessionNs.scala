package typings
package atJupyterlabServicesLib.libSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session", "Session")
@js.native
object SessionNs extends js.Object {
  /**
    * Connect to a running session.
    *
    * @param model - The model of the target session.
    *
    * @param settigns - The server settings.
    *
    * @returns The session instance.
    *
    * #### Notes
    * If the session was already started via `startNew`, the existing
    * Session object is used as the fulfillment value.
    *
    * Otherwise, we attempt to connect to the existing session.
    */
  def connectTo(model: atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IModel): atJupyterlabServicesLib.libSessionSessionMod.SessionNs.ISession = js.native
  def connectTo(
    model: atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IModel,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): atJupyterlabServicesLib.libSessionSessionMod.SessionNs.ISession = js.native
  /**
    * Find a session by id.
    *
    * @param id - The id of the target session.
    *
    * @param settings - The server settings.
    *
    * @returns A promise that resolves with the session model.
    *
    * #### Notes
    * If the session was already started via `startNew`, the existing
    * Session object's information is used in the fulfillment value.
    *
    * Otherwise, we attempt to find to the existing session.
    * The promise is fulfilled when the session is found,
    * otherwise the promise is rejected.
    */
  def findById(id: java.lang.String): js.Promise[atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IModel] = js.native
  def findById(
    id: java.lang.String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IModel] = js.native
  /**
    * Find a session by path.
    *
    * @param path - The path of the target session.
    *
    * @param settings: The server settings.
    *
    * @returns A promise that resolves with the session model.
    *
    * #### Notes
    * If the session was already started via `startNewSession`, the existing
    * Session object's info is used in the fulfillment value.
    *
    * Otherwise, we attempt to find to the existing
    * session using [listRunningSessions].
    * The promise is fulfilled when the session is found,
    * otherwise the promise is rejected.
    *
    * If the session was not already started and no `options` are given,
    * the promise is rejected.
    */
  def findByPath(path: java.lang.String): js.Promise[atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IModel] = js.native
  def findByPath(
    path: java.lang.String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IModel] = js.native
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
  def listRunning(): js.Promise[js.Array[atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IModel]] = js.native
  def listRunning(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[js.Array[atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IModel]] = js.native
  /**
    * Shut down a session by id.
    *
    * @param id - The id of the target session.
    *
    * @param settings - The server settings.
    *
    * @returns A promise that resolves when the session is shut down.
    *
    */
  def shutdown(id: java.lang.String): js.Promise[scala.Unit] = js.native
  def shutdown(
    id: java.lang.String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[scala.Unit] = js.native
  /**
    * Shut down all sessions.
    *
    * @returns A promise that resolves when all of the sessions are shut down.
    */
  def shutdownAll(): js.Promise[scala.Unit] = js.native
  def shutdownAll(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[scala.Unit] = js.native
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
  def startNew(options: atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IOptions): js.Promise[atJupyterlabServicesLib.libSessionSessionMod.SessionNs.ISession] = js.native
}

