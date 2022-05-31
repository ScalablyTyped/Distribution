package typings.jupyterlabServices

import typings.jupyterlabServices.anon.OmitIOptionsserverSettingModel
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.terminalRestapiMod.IModel
import typings.jupyterlabServices.terminalTerminalMod.ITerminalConnection.IOptions
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoCoreutils.jsonMod.JSONPrimitive
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalTerminalMod {
  
  @JSImport("@jupyterlab/services/lib/terminal/terminal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabServices.jupyterlabServicesStrings.connected
    - typings.jupyterlabServices.jupyterlabServicesStrings.connecting
    - typings.jupyterlabServices.jupyterlabServicesStrings.disconnected
  */
  trait ConnectionStatus extends StObject
  object ConnectionStatus {
    
    inline def connected: typings.jupyterlabServices.jupyterlabServicesStrings.connected = "connected".asInstanceOf[typings.jupyterlabServices.jupyterlabServicesStrings.connected]
    
    inline def connecting: typings.jupyterlabServices.jupyterlabServicesStrings.connecting = "connecting".asInstanceOf[typings.jupyterlabServices.jupyterlabServicesStrings.connecting]
    
    inline def disconnected: typings.jupyterlabServices.jupyterlabServicesStrings.disconnected = "disconnected".asInstanceOf[typings.jupyterlabServices.jupyterlabServicesStrings.disconnected]
  }
  
  @js.native
  trait IManager
    extends StObject
       with typings.jupyterlabServices.basemanagerMod.IManager {
    
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
      * A signal emitted when the running terminals change.
      */
    var runningChanged: ISignal[IManager, js.Array[IModel]] = js.native
    
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
  
  trait IMessage extends StObject {
    
    /**
      * The content of the message.
      */
    val content: js.UndefOr[js.Array[JSONPrimitive]] = js.undefined
    
    /**
      * The type of the message.
      */
    val `type`: MessageType
  }
  object IMessage {
    
    inline def apply(`type`: MessageType): IMessage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMessage]
    }
    
    extension [Self <: IMessage](x: Self) {
      
      inline def setContent(value: js.Array[JSONPrimitive]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: JSONPrimitive*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITerminalConnection
    extends StObject
       with IObservableDisposable {
    
    /**
      * The current connection status of the terminal.
      */
    val connectionStatus: ConnectionStatus
    
    /**
      * A signal emitted when the terminal connection status changes.
      */
    var connectionStatusChanged: ISignal[this.type, ConnectionStatus]
    
    /**
      * A signal emitted when a message is received from the server.
      */
    var messageReceived: ISignal[ITerminalConnection, IMessage]
    
    /**
      * The model associated with the session.
      */
    val model: IModel
    
    /**
      * Get the name of the terminal session.
      */
    val name: String
    
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
      * The server settings for the session.
      */
    val serverSettings: ISettings
    
    /**
      * Shut down the terminal session.
      */
    def shutdown(): js.Promise[Unit]
  }
  object ITerminalConnection {
    
    inline def apply(
      connectionStatus: ConnectionStatus,
      connectionStatusChanged: ISignal[ITerminalConnection, ConnectionStatus],
      dispose: () => Unit,
      disposed: ISignal[ITerminalConnection, Unit],
      isDisposed: Boolean,
      messageReceived: ISignal[ITerminalConnection, IMessage],
      model: IModel,
      name: String,
      reconnect: () => js.Promise[Unit],
      send: IMessage => Unit,
      serverSettings: ISettings,
      shutdown: () => js.Promise[Unit]
    ): ITerminalConnection = {
      val __obj = js.Dynamic.literal(connectionStatus = connectionStatus.asInstanceOf[js.Any], connectionStatusChanged = connectionStatusChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), disposed = disposed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], messageReceived = messageReceived.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reconnect = js.Any.fromFunction0(reconnect), send = js.Any.fromFunction1(send), serverSettings = serverSettings.asInstanceOf[js.Any], shutdown = js.Any.fromFunction0(shutdown))
      __obj.asInstanceOf[ITerminalConnection]
    }
    
    trait IOptions extends StObject {
      
      /**
        * Terminal model.
        */
      var model: IModel
      
      /**
        * The server settings.
        */
      var serverSettings: js.UndefOr[ISettings] = js.undefined
    }
    object IOptions {
      
      inline def apply(model: IModel): IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        inline def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
    
    extension [Self <: ITerminalConnection](x: Self) {
      
      inline def setConnectionStatus(value: ConnectionStatus): Self = StObject.set(x, "connectionStatus", value.asInstanceOf[js.Any])
      
      inline def setConnectionStatusChanged(value: ISignal[ITerminalConnection, ConnectionStatus]): Self = StObject.set(x, "connectionStatusChanged", value.asInstanceOf[js.Any])
      
      inline def setMessageReceived(value: ISignal[ITerminalConnection, IMessage]): Self = StObject.set(x, "messageReceived", value.asInstanceOf[js.Any])
      
      inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReconnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "reconnect", js.Any.fromFunction0(value))
      
      inline def setSend(value: IMessage => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
      
      inline def setShutdown(value: () => js.Promise[Unit]): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabServices.jupyterlabServicesStrings.stdout
    - typings.jupyterlabServices.jupyterlabServicesStrings.disconnect
    - typings.jupyterlabServices.jupyterlabServicesStrings.set_size
    - typings.jupyterlabServices.jupyterlabServicesStrings.stdin
  */
  trait MessageType extends StObject
  object MessageType {
    
    inline def disconnect: typings.jupyterlabServices.jupyterlabServicesStrings.disconnect = "disconnect".asInstanceOf[typings.jupyterlabServices.jupyterlabServicesStrings.disconnect]
    
    inline def set_size: typings.jupyterlabServices.jupyterlabServicesStrings.set_size = "set_size".asInstanceOf[typings.jupyterlabServices.jupyterlabServicesStrings.set_size]
    
    inline def stdin: typings.jupyterlabServices.jupyterlabServicesStrings.stdin = "stdin".asInstanceOf[typings.jupyterlabServices.jupyterlabServicesStrings.stdin]
    
    inline def stdout: typings.jupyterlabServices.jupyterlabServicesStrings.stdout = "stdout".asInstanceOf[typings.jupyterlabServices.jupyterlabServicesStrings.stdout]
  }
}
