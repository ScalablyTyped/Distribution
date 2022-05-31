package typings.jupyterlabServices

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.terminalRestapiMod.IModel
import typings.jupyterlabServices.terminalTerminalMod.ConnectionStatus
import typings.jupyterlabServices.terminalTerminalMod.IMessage
import typings.jupyterlabServices.terminalTerminalMod.ITerminalConnection
import typings.jupyterlabServices.terminalTerminalMod.ITerminalConnection.IOptions
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalDefaultMod {
  
  @JSImport("@jupyterlab/services/lib/terminal/default", "TerminalConnection")
  @js.native
  class TerminalConnection protected ()
    extends StObject
       with ITerminalConnection {
    /**
      * Construct a new terminal session.
      */
    def this(options: IOptions) = this()
    
    /**
      * Forcefully clear the socket state.
      *
      * #### Notes
      * This will clear all socket state without calling any handlers and will
      * not update the connection status. If you call this method, you are
      * responsible for updating the connection status as needed and recreating
      * the socket if you plan to reconnect.
      */
    /* private */ var _clearSocket: js.Any = js.native
    
    /* private */ var _connectionStatus: js.Any = js.native
    
    /* private */ var _connectionStatusChanged: js.Any = js.native
    
    /**
      * Create the terminal websocket connection and add socket status handlers.
      *
      * #### Notes
      * You are responsible for updating the connection status as appropriate.
      */
    /* private */ var _createSocket: js.Any = js.native
    
    /* private */ var _disposed: js.Any = js.native
    
    /**
      * Utility function to throw an error if this instance is disposed.
      */
    /* private */ var _errorIfDisposed: js.Any = js.native
    
    /* private */ var _isDisposed: js.Any = js.native
    
    /* private */ var _messageReceived: js.Any = js.native
    
    /* private */ var _name: js.Any = js.native
    
    /* private */ var _noOp: js.Any = js.native
    
    /* private */ var _onWSClose: js.Any = js.native
    
    /* private */ var _onWSMessage: js.Any = js.native
    
    /* private */ var _pendingMessages: js.Any = js.native
    
    /**
      * Attempt a connection if we have not exhausted connection attempts.
      */
    def _reconnect(): Unit = js.native
    
    /* private */ var _reconnectAttempt: js.Any = js.native
    
    /* private */ var _reconnectLimit: js.Any = js.native
    
    /* private */ var _reconnectTimeout: js.Any = js.native
    
    /**
      * Send a message on the websocket, or possibly queue for later sending.
      *
      * @param queue - whether to queue the message if it cannot be sent
      */
    def _sendMessage(message: IMessage): Unit = js.native
    def _sendMessage(message: IMessage, queue: Boolean): Unit = js.native
    
    /**
      * Send pending messages to the kernel.
      */
    /* private */ var _sendPending: js.Any = js.native
    
    /**
      * Handle connection status changes.
      */
    /* private */ var _updateConnectionStatus: js.Any = js.native
    
    /* private */ var _ws: js.Any = js.native
    
    /**
      * The current connection status of the terminal.
      */
    /* CompleteClass */
    override val connectionStatus: ConnectionStatus = js.native
    
    /**
      * A signal emitted when the terminal connection status changes.
      */
    /* CompleteClass */
    var connectionStatusChanged: ISignal[this.type, ConnectionStatus] = js.native
    /**
      * A signal emitted when the terminal connection status changes.
      */
    @JSName("connectionStatusChanged")
    def connectionStatusChanged_MTerminalConnection: ISignal[this.type, ConnectionStatus] = js.native
    
    /**
      * The current connection status of the terminal connection.
      */
    @JSName("connectionStatus")
    def connectionStatus_MTerminalConnection: ConnectionStatus = js.native
    
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
      * A signal emitted when the object is disposed.
      */
    /* CompleteClass */
    override val disposed: ISignal[this.type, Unit] = js.native
    /**
      * A signal emitted when the session is disposed.
      */
    @JSName("disposed")
    def disposed_MTerminalConnection: ISignal[this.type, Unit] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the session is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MTerminalConnection: Boolean = js.native
    
    /**
      * A signal emitted when a message is received from the server.
      */
    /* CompleteClass */
    var messageReceived: ISignal[ITerminalConnection, IMessage] = js.native
    /**
      * A signal emitted when a message is received from the server.
      */
    @JSName("messageReceived")
    def messageReceived_MTerminalConnection: ISignal[this.type, IMessage] = js.native
    
    /**
      * The model associated with the session.
      */
    /* CompleteClass */
    override val model: IModel = js.native
    /**
      * Get the model for the terminal session.
      */
    @JSName("model")
    def model_MTerminalConnection: IModel = js.native
    
    /**
      * Get the name of the terminal session.
      */
    /* CompleteClass */
    override val name: String = js.native
    /**
      * Get the name of the terminal session.
      */
    @JSName("name")
    def name_MTerminalConnection: String = js.native
    
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
      * The server settings for the session.
      */
    /* CompleteClass */
    override val serverSettings: ISettings = js.native
    
    /**
      * Shut down the terminal session.
      */
    /* CompleteClass */
    override def shutdown(): js.Promise[Unit] = js.native
  }
}
