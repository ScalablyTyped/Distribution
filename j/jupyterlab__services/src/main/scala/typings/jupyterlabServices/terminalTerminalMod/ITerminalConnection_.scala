package typings.jupyterlabServices.terminalTerminalMod

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.terminalRestapiMod.IModel
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITerminalConnection_ extends IObservableDisposable {
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
    * The server settings for the session.
    */
  val serverSettings: ISettings
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
}

