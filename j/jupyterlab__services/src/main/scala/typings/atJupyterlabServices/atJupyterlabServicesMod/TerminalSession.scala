package typings.atJupyterlabServices.atJupyterlabServicesMod

import typings.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession.IModel
import typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession.IOptions
import typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession.ISession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "TerminalSession")
@js.native
object TerminalSession extends js.Object {
  def connectTo(name: String): js.Promise[ISession] = js.native
  def connectTo(name: String, options: IOptions): js.Promise[ISession] = js.native
  /**
    * Test whether the terminal service is available.
    */
  def isAvailable(): Boolean = js.native
  /**
    * List the running terminal sessions.
    *
    * @param settings - The server settings to use.
    *
    * @returns A promise that resolves with the list of running session models.
    */
  def listRunning(): js.Promise[js.Array[IModel]] = js.native
  def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
  /**
    * Shut down a terminal session by name.
    *
    * @param name - The name of the target session.
    *
    * @param settings - The server settings to use.
    *
    * @returns A promise that resolves when the session is shut down.
    */
  def shutdown(name: String): js.Promise[Unit] = js.native
  def shutdown(name: String, settings: ISettings): js.Promise[Unit] = js.native
  /**
    * Shut down all terminal sessions.
    *
    * @returns A promise that resolves when all of the sessions are shut down.
    */
  def shutdownAll(): js.Promise[Unit] = js.native
  def shutdownAll(settings: ISettings): js.Promise[Unit] = js.native
  /**
    * Start a new terminal session.
    *
    * @param options - The session options to use.
    *
    * @returns A promise that resolves with the session instance.
    */
  def startNew(): js.Promise[ISession] = js.native
  def startNew(options: IOptions): js.Promise[ISession] = js.native
}

