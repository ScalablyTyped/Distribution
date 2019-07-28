package typings.jsonDashSocket.jsonDashSocketMod

import typings.node.netMod.Socket
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-socket", JSImport.Namespace)
@js.native
class ^ protected () extends JsonSocket {
  def this(socket: Socket) = this()
}

@JSImport("json-socket", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * sends a single message and closes the connection instantly. Use this if you need to send a server a message,
    * but you don't need any response.
    * @param port port to send the message to
    * @param host host to send the message to
    * @param message the message to send
    * @param callback will be called after the message has been sent
    */
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
  def sendSingleMessageAndReceive(
    port: Double,
    host: String,
    message: js.Any,
    callback: js.Function2[/* err */ Error, /* message */ js.Any, Unit]
  ): Unit = js.native
}

