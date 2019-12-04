package typings.atJupyterlabServices.atJupyterlabServicesMod

import typings.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.atJupyterlabServices.libSessionSessionMod.Session.IModel
import typings.atJupyterlabServices.libSessionSessionMod.Session.IOptions
import typings.atJupyterlabServices.libSessionSessionMod.Session.ISession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "Session")
@js.native
object Session extends js.Object {
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
  def connectTo(model: IModel): ISession = js.native
  def connectTo(model: IModel, settings: ISettings): ISession = js.native
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
  def findById(id: String): js.Promise[IModel] = js.native
  def findById(id: String, settings: ISettings): js.Promise[IModel] = js.native
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
  def findByPath(path: String): js.Promise[IModel] = js.native
  def findByPath(path: String, settings: ISettings): js.Promise[IModel] = js.native
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
  def listRunning(): js.Promise[js.Array[IModel]] = js.native
  def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
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
  def shutdown(id: String): js.Promise[Unit] = js.native
  def shutdown(id: String, settings: ISettings): js.Promise[Unit] = js.native
  /**
    * Shut down all sessions.
    *
    * @returns A promise that resolves when all of the sessions are shut down.
    */
  def shutdownAll(): js.Promise[Unit] = js.native
  def shutdownAll(settings: ISettings): js.Promise[Unit] = js.native
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
  def startNew(options: IOptions): js.Promise[ISession] = js.native
}

