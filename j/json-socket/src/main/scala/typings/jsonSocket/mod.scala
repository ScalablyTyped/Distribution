package typings.jsonSocket

import typings.node.netMod.Socket
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-socket", JSImport.Namespace)
  @js.native
  class ^ protected () extends JsonSocket {
    def this(socket: Socket) = this()
  }
  
  /**
    * sends a single message and closes the connection instantly. Use this if you need to send a server a message,
    * but you don't need any response.
    * @param port port to send the message to
    * @param host host to send the message to
    * @param message the message to send
    * @param callback will be called after the message has been sent
    */
  /* static member */
  @JSImport("json-socket", "sendSingleMessage")
  @js.native
  def sendSingleMessage(port: Double, host: String, message: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * sends a single message, waits for a single response message from the server and closes the connection right after.
    * Use this if you need to send a server a message, and get a response, but you don't need the connection to stay
    * open.
    * @param port port to send the message to
    * @param host host to send the message to
    * @param message the message to send
    * @param callback will be called when the response message has been received
    */
  /* static member */
  @JSImport("json-socket", "sendSingleMessageAndReceive")
  @js.native
  def sendSingleMessageAndReceive(
    port: Double,
    host: String,
    message: js.Any,
    callback: js.Function2[/* err */ Error, /* message */ js.Any, Unit]
  ): Unit = js.native
  
  @js.native
  trait JsonSocket extends Socket {
    
    /**
      * Same as {@link JsonSocket.sendError}, except that the socket is closed right after the message has been sent
      * using <a href="https://nodejs.org/api/net.html#net_socket_end_data_encoding">net.end()</a>.
      * No more messages can be sent from either the server or client through this socket.
      * @param err
      * @param callback
      */
    def sendEndError(err: Error, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    /**
      * Same as {@link JsonSocket.sendMessage}, except that the socket is closed right after the message has been sent
      * using <a href="https://nodejs.org/api/net.html#net_socket_end_data_encoding">net.end()</a>.
      * No more messages can be sent from either the server or client through this socket.
      * @param message the message to send
      * @param callback will be called after the message has been sent
      */
    def sendEndMessage(message: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    /**
      * Convenience method for sending an error as a message.
      * @param err an Error object that should be formatted as a message
      * @param callback will be called after the message has been sent
      */
    def sendError(err: Error, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    /**
      * Sends a JSON message over the socket.
      * @param message the message to send
      * @param callback will be called after the message has been sent
      */
    def sendMessage(message: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  }
}
