package typings.jupyterlabServices.terminalTerminalMod

import typings.jupyterlabServices.OmitIOptionsserverSettingModel
import typings.jupyterlabServices.terminalRestapiMod.IModel
import typings.jupyterlabServices.terminalTerminalMod.ITerminalConnection.IOptions
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IManager
  extends typings.jupyterlabServices.basemanagerMod.IManager {
  /**
    * A signal emitted when the running terminals change.
    */
  var runningChanged: ISignal[IManager, js.Array[IModel]] = js.native
  def connectTo(options: OmitIOptionsserverSettingModel): ITerminalConnection = js.native
  /**
    * Whether the terminal service is available.
    */
  def isAvailable(): Boolean = js.native
  /**
    * Force a refresh of the running terminal sessions.
    *
    * @returns A promise that with the list of running sessions.
    *
    * #### Notes
    * This is not typically meant to be called by the user, since the
    * manager maintains its own internal state.
    */
  def refreshRunning(): js.Promise[Unit] = js.native
  /**
    * Create an iterator over the known running terminals.
    *
    * @returns A new iterator over the running terminals.
    */
  def running(): IIterator[IModel] = js.native
  /**
    * Shut down a terminal session by name.
    *
    * @param name - The name of the terminal session.
    *
    * @returns A promise that resolves when the session is shut down.
    */
  def shutdown(name: String): js.Promise[Unit] = js.native
  /**
    * Shut down all terminal sessions.
    *
    * @returns A promise that resolves when all of the sessions are shut down.
    */
  def shutdownAll(): js.Promise[Unit] = js.native
  /**
    * Create a new terminal session.
    *
    * @param options - The options used to create the session.
    *
    * @returns A promise that resolves with the terminal instance.
    *
    * #### Notes
    * The manager `serverSettings` will be always be used.
    */
  def startNew(): js.Promise[ITerminalConnection] = js.native
  def startNew(options: IOptions): js.Promise[ITerminalConnection] = js.native
}

