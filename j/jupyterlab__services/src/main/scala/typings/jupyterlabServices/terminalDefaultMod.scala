package typings.jupyterlabServices

import typings.jupyterlabServices.terminalRestapiMod.IModel
import typings.jupyterlabServices.terminalTerminalMod.ConnectionStatus
import typings.jupyterlabServices.terminalTerminalMod.IMessage
import typings.jupyterlabServices.terminalTerminalMod.ITerminalConnection
import typings.jupyterlabServices.terminalTerminalMod.ITerminalConnection.IOptions
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalDefaultMod {
  
  @JSImport("@jupyterlab/services/lib/terminal/default", "TerminalConnection")
  @js.native
  class TerminalConnection protected () extends ITerminalConnection {
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
    var _clearSocket: js.Any = js.native
    
    var _connectionStatus: js.Any = js.native
    
    var _connectionStatusChanged: js.Any = js.native
    
    /**
      * Create the terminal websocket connection and add socket status handlers.
      *
      * #### Notes
      * You are responsible for updating the connection status as appropriate.
      */
    var _createSocket: js.Any = js.native
    
    var _disposed: js.Any = js.native
    
    /**
      * Utility function to throw an error if this instance is disposed.
      */
    var _errorIfDisposed: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _messageReceived: js.Any = js.native
    
    var _name: js.Any = js.native
    
    var _noOp: js.Any = js.native
    
    var _onWSClose: js.Any = js.native
    
    var _onWSMessage: js.Any = js.native
    
    var _pendingMessages: js.Any = js.native
    
    /**
      * Attempt a connection if we have not exhausted connection attempts.
      */
    def _reconnect(): Unit = js.native
    
    var _reconnectAttempt: js.Any = js.native
    
    var _reconnectLimit: js.Any = js.native
    
    var _reconnectTimeout: js.Any = js.native
    
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
    var _sendPending: js.Any = js.native
    
    /**
      * Handle connection status changes.
      */
    var _updateConnectionStatus: js.Any = js.native
    
    var _ws: js.Any = js.native
    
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
      * A signal emitted when the session is disposed.
      */
    @JSName("disposed")
    def disposed_MTerminalConnection: ISignal[this.type, Unit] = js.native
    
    /**
      * Test whether the session is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MTerminalConnection: Boolean = js.native
    
    /**
      * A signal emitted when a message is received from the server.
      */
    @JSName("messageReceived")
    def messageReceived_MTerminalConnection: ISignal[this.type, IMessage] = js.native
    
    /**
      * Get the model for the terminal session.
      */
    @JSName("model")
    def model_MTerminalConnection: IModel = js.native
    
    /**
      * Get the name of the terminal session.
      */
    @JSName("name")
    def name_MTerminalConnection: String = js.native
  }
}
