package typings.jupyterlabServices

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.terminalTerminalMod.TerminalSession.IMessage
import typings.jupyterlabServices.terminalTerminalMod.TerminalSession.IModel
import typings.jupyterlabServices.terminalTerminalMod.TerminalSession.IOptions
import typings.jupyterlabServices.terminalTerminalMod.TerminalSession.ISession
import typings.phosphorSignaling.mod.ISignal
import typings.phosphorSignaling.mod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/terminal/default", JSImport.Namespace)
@js.native
object terminalDefaultMod extends js.Object {
  @js.native
  class DefaultTerminalSession protected () extends ISession {
    /**
      * Construct a new terminal session.
      */
    def this(name: String) = this()
    def this(name: String, options: IOptions) = this()
    var _disconnected: js.Any = js.native
    /**
      * Connect to the websocket.
      */
    var _initializeSocket: js.Any = js.native
    var _isDisposed: js.Any = js.native
    var _isReady: js.Any = js.native
    var _messageReceived: js.Any = js.native
    var _name: js.Any = js.native
    var _noOp: js.Any = js.native
    var _readyPromise: js.Any = js.native
    var _reconnectAttempt: js.Any = js.native
    var _reconnectLimit: js.Any = js.native
    var _reconnectSocket: js.Any = js.native
    var _terminated: js.Any = js.native
    var _url: js.Any = js.native
    var _ws: js.Any = js.native
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the session is ready.
      */
    /* CompleteClass */
    override val isReady: Boolean = js.native
    /**
      * A signal emitted when a message is received from the server.
      */
    /* CompleteClass */
    override var messageReceived: ISignal[ISession, IMessage] = js.native
    /**
      * A signal emitted when a message is received from the server.
      */
    @JSName("messageReceived")
    val messageReceived_DefaultTerminalSession: ISignal[this.type, IMessage] = js.native
    /**
      * The model associated with the session.
      */
    /* CompleteClass */
    override val model: IModel = js.native
    /**
      * Get the name of the terminal session.
      */
    /* CompleteClass */
    override val name: String = js.native
    /**
      * A promise that fulfills when the session is initially ready.
      */
    /* CompleteClass */
    override val ready: js.Promise[Unit] = js.native
    /**
      * The server settings for the session.
      */
    /* CompleteClass */
    override val serverSettings: ISettings = js.native
    /**
      * A signal emitted when the session is shut down.
      */
    /* CompleteClass */
    override var terminated: ISignal[ISession, Unit] = js.native
    /**
      * A signal emitted when the session is shut down.
      */
    @JSName("terminated")
    val terminated_DefaultTerminalSession: Signal[this.type, Unit] = js.native
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /**
      * Reconnect to the terminal.
      *
      * @returns A promise that resolves when the terminal has reconnected.
      */
    /* CompleteClass */
    override def reconnect(): js.Promise[Unit] = js.native
    /**
      * Send a message to the terminal session.
      */
    /* CompleteClass */
    override def send(message: IMessage): Unit = js.native
    /**
      * Shut down the terminal session.
      */
    /* CompleteClass */
    override def shutdown(): js.Promise[Unit] = js.native
  }
  
  @js.native
  object DefaultTerminalSession extends js.Object {
    def connectTo(name: String): js.Promise[ISession] = js.native
    def connectTo(name: String, options: IOptions): js.Promise[ISession] = js.native
    /**
      * Whether the terminal service is available.
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
      * @param settings - The server settings to use.
      *
      * @returns A promise that resolves when all the sessions are shut down.
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
  
}

