package typings
package k6Lib.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/ws", "Socket")
@js.native
abstract class Socket () extends js.Object {
  var __brand: scala.Nothing = js.native
  /**
    * Close connection.
    * https://docs.k6.io/docs/socketclose
    * @param code - WebSocket status code.
    */
  def close(): scala.Unit = js.native
  def close(code: scala.Double): scala.Unit = js.native
  /**
    * Listen to event.
    * https://docs.k6.io/docs/socketon
    * @param event - Event type.
    * @param handler - Event handler.
    */
  def on[ET /* <: EventType */](event: ET, handler: EventHandler[ET]): scala.Unit = js.native
  /**
    * Send ping.
    * https://docs.k6.io/docs/socketping
    */
  def ping(): scala.Unit = js.native
  /**
    * Send data.
    * https://docs.k6.io/docs/socketsend
    * @param data - Data to send.
    */
  def send(data: java.lang.String): scala.Unit = js.native
  /**
    * Call a function repeatedly, while the WebSocket connection is open.
    * https://docs.k6.io/docs/socketsetinterval
    * @param handler - The function to call every `interval` milliseconds.
    * @param interval - Milliseconds between two calls to `callback`.
    */
  def setInterval(handler: TimerHandler, interval: scala.Double): scala.Unit = js.native
  /**
    * Call a function at a later time,
    * if the WebSocket connection is still open then.
    * https://docs.k6.io/docs/socketsettimeout
    * @param handler - The function to call when `delay` has expired.
    * @param delay - Delay in milliseconds.
    */
  def setTimeout(handler: TimerHandler, delay: scala.Double): scala.Unit = js.native
}

