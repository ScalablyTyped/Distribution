package typings.atJupyterlabServices.libTerminalTerminalMod

import typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSessionNs.IManager
import typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSessionNs.IMessage
import typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSessionNs.IModel
import typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSessionNs.IOptions
import typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSessionNs.ISession
import typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSessionNs.MessageType
import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.atPhosphorCoreutils.libJsonMod.JSONPrimitive
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/terminal/terminal", "TerminalSession")
@js.native
object TerminalSessionNs extends js.Object {
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
  
  /**
    * A message from the terminal session.
    */
  trait IMessage extends js.Object {
    /**
      * The content of the message.
      */
    val content: js.UndefOr[js.Array[JSONPrimitive]] = js.undefined
    /**
      * The type of the message.
      */
    val `type`: MessageType
  }
  
  /**
    * The server model for a terminal session.
    */
  trait IModel extends JSONObject {
    /**
      * The name of the terminal session.
      */
    val name: String
  }
  
  /**
    * The options for initializing a terminal session object.
    */
  trait IOptions extends js.Object {
    /**
      * The server settings for the session.
      */
    var serverSettings: js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
      ] = js.undefined
  }
  
  /**
    * An interface for a terminal session.
    */
  trait ISession extends IDisposable {
    /**
      * Test whether the session is ready.
      */
    val isReady: Boolean
    /**
      * A signal emitted when a message is received from the server.
      */
    var messageReceived: ISignal[ISession, IMessage]
    /**
      * The model associated with the session.
      */
    val model: IModel
    /**
      * Get the name of the terminal session.
      */
    val name: String
    /**
      * A promise that fulfills when the session is initially ready.
      */
    val ready: js.Promise[Unit]
    /**
      * The server settings for the session.
      */
    val serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
    /**
      * A signal emitted when the session is shut down.
      */
    var terminated: ISignal[ISession, Unit]
    /**
      * Reconnect to the terminal.
      *
      * @returns A promise that resolves when the terminal has reconnected.
      */
    def reconnect(): js.Promise[Unit]
    /**
      * Send a message to the terminal session.
      */
    def send(message: IMessage): Unit
    /**
      * Shut down the terminal session.
      */
    def shutdown(): js.Promise[Unit]
  }
  
  /**
    * Valid message types for the terminal.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.stdout
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.disconnect
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.set_size
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.stdin
  */
  trait MessageType extends js.Object
  
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
  def listRunning(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[js.Array[IModel]] = js.native
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
  def shutdown(
    name: String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[Unit] = js.native
  /**
    * Shut down all terminal sessions.
    *
    * @returns A promise that resolves when all of the sessions are shut down.
    */
  def shutdownAll(): js.Promise[Unit] = js.native
  def shutdownAll(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[Unit] = js.native
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

