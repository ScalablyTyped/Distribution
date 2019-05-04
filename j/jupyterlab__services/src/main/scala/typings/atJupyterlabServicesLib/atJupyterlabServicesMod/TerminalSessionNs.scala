package typings
package atJupyterlabServicesLib.atJupyterlabServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "TerminalSession")
@js.native
object TerminalSessionNs extends js.Object {
  def connectTo(name: java.lang.String): js.Promise[atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.ISession] = js.native
  def connectTo(
    name: java.lang.String,
    options: atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.IOptions
  ): js.Promise[atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.ISession] = js.native
  /**
    * Test whether the terminal service is available.
    */
  def isAvailable(): scala.Boolean = js.native
  /**
    * List the running terminal sessions.
    *
    * @param settings - The server settings to use.
    *
    * @returns A promise that resolves with the list of running session models.
    */
  def listRunning(): js.Promise[
    js.Array[atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.IModel]
  ] = js.native
  def listRunning(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[
    js.Array[atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.IModel]
  ] = js.native
  /**
    * Shut down a terminal session by name.
    *
    * @param name - The name of the target session.
    *
    * @param settings - The server settings to use.
    *
    * @returns A promise that resolves when the session is shut down.
    */
  def shutdown(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def shutdown(
    name: java.lang.String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[scala.Unit] = js.native
  /**
    * Shut down all terminal sessions.
    *
    * @returns A promise that resolves when all of the sessions are shut down.
    */
  def shutdownAll(): js.Promise[scala.Unit] = js.native
  def shutdownAll(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[scala.Unit] = js.native
  /**
    * Start a new terminal session.
    *
    * @param options - The session options to use.
    *
    * @returns A promise that resolves with the session instance.
    */
  def startNew(): js.Promise[atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.ISession] = js.native
  def startNew(options: atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.IOptions): js.Promise[atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.ISession] = js.native
}

