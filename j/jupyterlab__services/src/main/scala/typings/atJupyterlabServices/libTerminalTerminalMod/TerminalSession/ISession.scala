package typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession

import typings.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val serverSettings: ISettings
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

object ISession {
  @scala.inline
  def apply(
    dispose: () => Unit,
    isDisposed: Boolean,
    isReady: Boolean,
    messageReceived: ISignal[ISession, IMessage],
    model: IModel,
    name: String,
    ready: js.Promise[Unit],
    reconnect: () => js.Promise[Unit],
    send: IMessage => Unit,
    serverSettings: ISettings,
    shutdown: () => js.Promise[Unit],
    terminated: ISignal[ISession, Unit]
  ): ISession = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], messageReceived = messageReceived.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], reconnect = js.Any.fromFunction0(reconnect), send = js.Any.fromFunction1(send), serverSettings = serverSettings.asInstanceOf[js.Any], shutdown = js.Any.fromFunction0(shutdown), terminated = terminated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISession]
  }
}

