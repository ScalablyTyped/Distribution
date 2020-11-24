package typings.intercomjs.intercom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Intercom extends js.Object {
  
  /**
    * Bind to a socket.io socket and forward all received messages to all windows and/or back to the socket.
    * @param socket A socket.io socket to bind to.
    * @param options Object with "send" and "receive" keys having values of Boolean or Boolean-producing function to determine whether message(s) should be forwarded to/from the socket.
    */
  def bind(socket: js.Any): Unit = js.native
  def bind(socket: js.Any, options: SocketBindingOptions): Unit = js.native
  
  /**
    * Broadcasts a message to all open windows (including the current window).
    * @param name The string event name
    * @param message The event data/message
    */
  def emit(name: String): Unit = js.native
  def emit(name: String, message: js.Any): Unit = js.native
  
  /**
    * Remove a registered event listener
    * @param name The string event listener name.
    * @param fn The listener method to remove.
    */
  def off(name: String, fn: js.Function): Unit = js.native
  
  /**
    * Sets up a listener to be invoked when a message with the given name is received.
    * @param name The string event name to listen for.
    * @param fn The listener method to invoke.
    */
  def on(name: String, fn: js.Function): Unit = js.native
  
  /**
    * Given a unique key to represent the function, fn will be invoked in only one window. The ttl argument represents the number of seconds before the function can be called again.
    * @param key The unique function identifier key
    * @param fn The function to be called once
    * @param ttl The amount of time in seconds to wait before allowing the function to be invoked again.
    */
  def once(key: String, fn: js.Function): Unit = js.native
  def once(key: String, fn: js.Function, ttl: Double): Unit = js.native
}
