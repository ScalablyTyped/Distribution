package typings
package jsonDashSocketLib.jsonDashSocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-socket", JSImport.Namespace)
@js.native
class namespaced protected () extends JsonSocket {
  def this(socket: nodeLib.netMod.Socket) = this()
}

@JSImport("json-socket", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
       * sends a single message and closes the connection instantly. Use this if you need to send a server a message,
       * but you don't need any response.
       * @param port port to send the message to
       * @param host host to send the message to
       * @param message the message to send
       * @param callback will be called after the message has been sent
       */
  def sendSingleMessage(
    port: scala.Double,
    host: java.lang.String,
    message: js.Any,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
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
    port: scala.Double,
    host: java.lang.String,
    message: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* message */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

