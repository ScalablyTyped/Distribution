package typings
package atJupyterlabServicesLib.libTerminalTerminalMod

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
  trait IManager
    extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
    /**
      * Test whether the manager is ready.
      */
    val isReady: scala.Boolean = js.native
    /**
      * A promise that fulfills when the manager is ready.
      */
    val ready: js.Promise[scala.Unit] = js.native
    /**
      * A signal emitted when the running terminals change.
      */
    var runningChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IManager, js.Array[IModel]] = js.native
    /**
      * The server settings for the manager.
      */
    val serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any = js.native
    def connectTo(name: java.lang.String): js.Promise[ISession] = js.native
    /**
      * Whether the terminal service is available.
      */
    def isAvailable(): scala.Boolean = js.native
    /**
      * Force a refresh of the running terminal sessions.
      *
      * @returns A promise that with the list of running sessions.
      *
      * #### Notes
      * This is not typically meant to be called by the user, since the
      * manager maintains its own internal state.
      */
    def refreshRunning(): js.Promise[scala.Unit] = js.native
    /**
      * Create an iterator over the known running terminals.
      *
      * @returns A new iterator over the running terminals.
      */
    def running(): atPhosphorAlgorithmLib.libIterMod.IIterator[IModel] = js.native
    /**
      * Shut down a terminal session by name.
      *
      * @param name - The name of the terminal session.
      *
      * @returns A promise that resolves when the session is shut down.
      */
    def shutdown(name: java.lang.String): js.Promise[scala.Unit] = js.native
    /**
      * Shut down all terminal sessions.
      *
      * @returns A promise that resolves when all of the sessions are shut down.
      */
    def shutdownAll(): js.Promise[scala.Unit] = js.native
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
    val content: js.UndefOr[js.Array[atPhosphorCoreutilsLib.libJsonMod.JSONPrimitive]] = js.undefined
    /**
      * The type of the message.
      */
    val `type`: MessageType
  }
  
  /**
    * The server model for a terminal session.
    */
  trait IModel
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    /**
      * The name of the terminal session.
      */
    val name: java.lang.String
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
  trait ISession
    extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
    /**
      * Test whether the session is ready.
      */
    val isReady: scala.Boolean
    /**
      * A signal emitted when a message is received from the server.
      */
    var messageReceived: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ISession, IMessage]
    /**
      * The model associated with the session.
      */
    val model: IModel
    /**
      * Get the name of the terminal session.
      */
    val name: java.lang.String
    /**
      * A promise that fulfills when the session is initially ready.
      */
    val ready: js.Promise[scala.Unit]
    /**
      * The server settings for the session.
      */
    val serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
    /**
      * A signal emitted when the session is shut down.
      */
    var terminated: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ISession, scala.Unit]
    /**
      * Reconnect to the terminal.
      *
      * @returns A promise that resolves when the terminal has reconnected.
      */
    def reconnect(): js.Promise[scala.Unit]
    /**
      * Send a message to the terminal session.
      */
    def send(message: IMessage): scala.Unit
    /**
      * Shut down the terminal session.
      */
    def shutdown(): js.Promise[scala.Unit]
  }
  
  /**
    * Valid message types for the terminal.
    */
  /* Rewritten from type alias, can be one of: 
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.stdout
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.disconnect
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.set_size
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.stdin
  */
  trait MessageType extends js.Object
  
  def connectTo(name: java.lang.String): js.Promise[ISession] = js.native
  def connectTo(name: java.lang.String, options: IOptions): js.Promise[ISession] = js.native
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
  def startNew(): js.Promise[ISession] = js.native
  def startNew(options: IOptions): js.Promise[ISession] = js.native
}

