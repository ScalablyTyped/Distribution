package typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession

import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a terminal manager.
  *
  * #### Notes
  * The manager is responsible for maintaining the state of running
  * terminal sessions.
  */
@js.native
trait IManager extends IDisposable {
  /**
    * A signal emitted when there is a connection failure.
    */
  var connectionFailure: ISignal[
    IManager, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.NetworkError */ _
  ] = js.native
  /**
    * Test whether the manager is ready.
    */
  val isReady: Boolean = js.native
  /**
    * A promise that fulfills when the manager is ready.
    */
  val ready: js.Promise[Unit] = js.native
  /**
    * A signal emitted when the running terminals change.
    */
  var runningChanged: ISignal[IManager, js.Array[IModel]] = js.native
  /**
    * The server settings for the manager.
    */
  val serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any = js.native
  def connectTo(name: String): js.Promise[ISession] = js.native
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
  def startNew(): js.Promise[ISession] = js.native
  def startNew(options: IOptions): js.Promise[ISession] = js.native
}

