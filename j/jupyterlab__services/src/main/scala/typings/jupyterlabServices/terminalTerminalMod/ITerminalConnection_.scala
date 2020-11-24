package typings.jupyterlabServices.terminalTerminalMod

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.terminalRestapiMod.IModel
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITerminalConnection_ extends IObservableDisposable {
  
  /**
    * The current connection status of the terminal.
    */
  val connectionStatus: ConnectionStatus = js.native
  
  /**
    * A signal emitted when the terminal connection status changes.
    */
  var connectionStatusChanged: ISignal[this.type, ConnectionStatus] = js.native
  
  /**
    * A signal emitted when a message is received from the server.
    */
  var messageReceived: ISignal[ITerminalConnection, IMessage] = js.native
  
  /**
    * The model associated with the session.
    */
  val model: IModel = js.native
  
  /**
    * Get the name of the terminal session.
    */
  val name: String = js.native
  
  /**
    * Reconnect to the terminal.
    *
    * @returns A promise that resolves when the terminal has reconnected.
    */
  def reconnect(): js.Promise[Unit] = js.native
  
  /**
    * Send a message to the terminal session.
    */
  def send(message: IMessage): Unit = js.native
  
  /**
    * The server settings for the session.
    */
  val serverSettings: ISettings = js.native
  
  /**
    * Shut down the terminal session.
    */
  def shutdown(): js.Promise[Unit] = js.native
}
object ITerminalConnection_ {
  
  @scala.inline
  def apply(
    connectionStatus: ConnectionStatus,
    connectionStatusChanged: ISignal[ITerminalConnection_, ConnectionStatus],
    dispose: () => Unit,
    disposed: ISignal[ITerminalConnection_, Unit],
    isDisposed: Boolean,
    messageReceived: ISignal[ITerminalConnection, IMessage],
    model: IModel,
    name: String,
    reconnect: () => js.Promise[Unit],
    send: IMessage => Unit,
    serverSettings: ISettings,
    shutdown: () => js.Promise[Unit]
  ): ITerminalConnection_ = {
    val __obj = js.Dynamic.literal(connectionStatus = connectionStatus.asInstanceOf[js.Any], connectionStatusChanged = connectionStatusChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), disposed = disposed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], messageReceived = messageReceived.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reconnect = js.Any.fromFunction0(reconnect), send = js.Any.fromFunction1(send), serverSettings = serverSettings.asInstanceOf[js.Any], shutdown = js.Any.fromFunction0(shutdown))
    __obj.asInstanceOf[ITerminalConnection_]
  }
  
  @scala.inline
  implicit class ITerminalConnection_Ops[Self <: ITerminalConnection_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectionStatus(value: ConnectionStatus): Self = this.set("connectionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStatusChanged(value: ISignal[ITerminalConnection_, ConnectionStatus]): Self = this.set("connectionStatusChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageReceived(value: ISignal[ITerminalConnection, IMessage]): Self = this.set("messageReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: IModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnect(value: () => js.Promise[Unit]): Self = this.set("reconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSend(value: IMessage => Unit): Self = this.set("send", js.Any.fromFunction1(value))
    
    @scala.inline
    def setServerSettings(value: ISettings): Self = this.set("serverSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShutdown(value: () => js.Promise[Unit]): Self = this.set("shutdown", js.Any.fromFunction0(value))
  }
}
