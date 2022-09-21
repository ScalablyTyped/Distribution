package typings.jsonSocket

import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-socket", JSImport.Namespace)
  @js.native
  open class ^ protected () extends JsonSocket {
    def this(socket: Socket) = this()
  }
  @JSImport("json-socket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * sends a single message and closes the connection instantly. Use this if you need to send a server a message,
    * but you don't need any response.
    * @param port port to send the message to
    * @param host host to send the message to
    * @param message the message to send
    * @param callback will be called after the message has been sent
    */
  /* static member */
  inline def sendSingleMessage(port: Double, host: String, message: Any, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSingleMessage")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def sendSingleMessageAndReceive(
    port: Double,
    host: String,
    message: Any,
    callback: js.Function2[/* err */ js.Error, /* message */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSingleMessageAndReceive")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait JsonSocket extends Socket {
    
    /**
      * Same as {@link JsonSocket.sendError}, except that the socket is closed right after the message has been sent
      * using <a href="https://nodejs.org/api/net.html#net_socket_end_data_encoding">net.end()</a>.
      * No more messages can be sent from either the server or client through this socket.
      * @param err
      * @param callback
      */
    def sendEndError(err: js.Error, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    /**
      * Same as {@link JsonSocket.sendMessage}, except that the socket is closed right after the message has been sent
      * using <a href="https://nodejs.org/api/net.html#net_socket_end_data_encoding">net.end()</a>.
      * No more messages can be sent from either the server or client through this socket.
      * @param message the message to send
      * @param callback will be called after the message has been sent
      */
    def sendEndMessage(message: Any, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    /**
      * Convenience method for sending an error as a message.
      * @param err an Error object that should be formatted as a message
      * @param callback will be called after the message has been sent
      */
    def sendError(err: js.Error, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    /**
      * Sends a JSON message over the socket.
      * @param message the message to send
      * @param callback will be called after the message has been sent
      */
    def sendMessage(message: Any, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  }
}
