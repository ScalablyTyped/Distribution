package typings
package intercomjsLib.intercomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Intercom extends js.Object {
  /**
            * Bind to a socket.io socket and forward all received messages to all windows and/or back to the socket.
            * @param socket A socket.io socket to bind to.
            * @param options Object with "send" and "receive" keys having values of Boolean or Boolean-producing function to determine whether message(s) should be forwarded to/from the socket.
            */
  def bind(socket: js.Any): scala.Unit = js.native
  /**
            * Bind to a socket.io socket and forward all received messages to all windows and/or back to the socket.
            * @param socket A socket.io socket to bind to.
            * @param options Object with "send" and "receive" keys having values of Boolean or Boolean-producing function to determine whether message(s) should be forwarded to/from the socket.
            */
  def bind(socket: js.Any, options: SocketBindingOptions): scala.Unit = js.native
  /**
            * Broadcasts a message to all open windows (including the current window).
            * @param name The string event name
            * @param message The event data/message
            */
  def emit(name: java.lang.String): scala.Unit = js.native
  /**
            * Broadcasts a message to all open windows (including the current window).
            * @param name The string event name
            * @param message The event data/message
            */
  def emit(name: java.lang.String, message: js.Any): scala.Unit = js.native
  /**
           * Remove a registered event listener
           * @param name The string event listener name.
           * @param fn The listener method to remove.
           */
  def off(name: java.lang.String, fn: js.Function): scala.Unit = js.native
  /**
            * Sets up a listener to be invoked when a message with the given name is received.
            * @param name The string event name to listen for.
            * @param fn The listener method to invoke.
            */
  def on(name: java.lang.String, fn: js.Function): scala.Unit = js.native
  /**
            * Given a unique key to represent the function, fn will be invoked in only one window. The ttl argument represents the number of seconds before the function can be called again.
            * @param key The unique function identifier key
            * @param fn The function to be called once
            * @param ttl The amount of time in seconds to wait before allowing the function to be invoked again.
            */
  def once(key: java.lang.String, fn: js.Function): scala.Unit = js.native
  /**
            * Given a unique key to represent the function, fn will be invoked in only one window. The ttl argument represents the number of seconds before the function can be called again.
            * @param key The unique function identifier key
            * @param fn The function to be called once
            * @param ttl The amount of time in seconds to wait before allowing the function to be invoked again.
            */
  def once(key: java.lang.String, fn: js.Function, ttl: scala.Double): scala.Unit = js.native
}

