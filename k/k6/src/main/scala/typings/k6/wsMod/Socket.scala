package typings.k6.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/ws", "Socket")
@js.native
abstract class Socket () extends js.Object {
  
  /**
    * Close connection.
    * https://k6.io/docs/javascript-api/k6-ws/socket/socket-close
    * @param code - WebSocket status code.
    * @example
    * socket.close();
    */
  def close(): Unit = js.native
  def close(code: Double): Unit = js.native
  
  /**
    * Listen to event.
    * https://k6.io/docs/javascript-api/k6-ws/socket/socket-on-event-callback
    * @param event - Event type.
    * @param handler - Event handler.
    * @example
    * socket.on('message', function(message) {
    *   console.log(`Received message: ${message}`);
    * });
    * socket.on('close', function() {
    *   console.log('disconnected');
    * });
    */
  def on[ET /* <: EventType */](event: ET, handler: EventHandler[ET]): Unit = js.native
  
  /**
    * Send ping.
    * https://k6.io/docs/javascript-api/k6-ws/socket/socket-ping
    * @example
    * socket.ping();
    */
  def ping(): Unit = js.native
  
  /**
    * Send data.
    * https://k6.io/docs/javascript-api/k6-ws/socket/socket-send-data
    * @param data - Data to send.
    * @example
    * socket.send(JSON.stringify({ data: 'hola' }));
    */
  def send(data: String): Unit = js.native
  
  /**
    * Call a function repeatedly, while the WebSocket connection is open.
    * https://k6.io/docs/javascript-api/k6-ws/socket/socket-setinterval-callback-interval
    * @param handler - The function to call every `interval` milliseconds.
    * @param interval - Milliseconds between two calls to `callback`.
    * @example
    * socket.setInterval(function timeout() {
    *  socket.ping();
    *  console.log('Pinging every 1sec (setInterval test)');
    * }, 1000);
    */
  def setInterval(handler: TimerHandler, interval: Double): Unit = js.native
  
  /**
    * Call a function at a later time,
    * if the WebSocket connection is still open then.
    * https://k6.io/docs/javascript-api/k6-ws/socket/socket-settimeout-callback-delay
    * @param handler - The function to call when `delay` has expired.
    * @param delay - Delay in milliseconds.
    * @example
    * socket.setTimeout(function timeout() {
    *  console.log('Call after 1second');
    * }, 1000);
    */
  def setTimeout(handler: TimerHandler, delay: Double): Unit = js.native
}
