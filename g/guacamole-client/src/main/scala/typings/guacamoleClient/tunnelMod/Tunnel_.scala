package typings.guacamoleClient.tunnelMod

import typings.guacamoleClient.statusMod.Status
import typings.guacamoleClient.tunnelMod.Tunnel.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client/lib/Tunnel", "Tunnel")
@js.native
abstract class Tunnel_ () extends js.Object {
  /**
    * Fired whenever an error is encountered by the tunnel.
    * @event
    * @param status A status object which describes the error.
    */
  var onerror: Null | (js.Function1[/* status */ Status, Unit]) = js.native
  /**
    * Fired once for every complete Guacamole instruction received, in order.
    * @event
    * @param opcode The Guacamole instruction opcode.
    * @param parameters The parameters provided for the instruction, if any.
    */
  var oninstruction: Null | (js.Function2[/* opcode */ String, /* args */ js.Array[_], Unit]) = js.native
  /**
    * Fired whenever the state of the tunnel changes.
    * @event
    * @param state The new state of the client.
    */
  var onstatechange: Null | (js.Function1[/* state */ State, Unit]) = js.native
  /**
    * The maximum amount of time to wait for data to be received, in
    * milliseconds. If data is not received within this amount of time,
    * the tunnel is closed with an error. The default value is 15000.
    */
  var receiveTimeout: Double = js.native
  /**
    * The current state of this tunnel.
    */
  var state: State = js.native
  /**
    * The amount of time to wait for data to be received before considering
    * the connection to be unstable, in milliseconds. If data is not received
    * within this amount of time, the tunnel status is updated to warn that
    * the connection appears unresponsive and may close. The default value is
    * 1500.
    */
  var unstableThreshold: Double = js.native
  /**
    * The UUID uniquely identifying this tunnel. If not yet known, this will
    * be null.
    */
  var uuid: String | Null = js.native
  /**
    * Connect to the tunnel with the given optional data. This data is
    * typically used for authentication. The format of data accepted is
    * up to the tunnel implementation.
    *
    * @param data The data to send to the tunnel when connecting.
    */
  def connect(data: String): Unit = js.native
  /**
    * Disconnect from the tunnel.
    */
  def disconnect(): Unit = js.native
  /**
    * Returns whether this tunnel is currently connected.
    * @returns true if this tunnel is currently connected, false otherwise.
    */
  def isConnected(): Boolean = js.native
  /**
    * Send the given message through the tunnel to the service on the other
    * side. All messages are guaranteed to be received in the order sent.
    *
    * @param elements
    *     The elements of the message to send to the service on the other side
    *     of the tunnel.
    */
  def sendMessage(message: js.Any, messages: js.Any*): Unit = js.native
}

