package typings.grpc.mod

import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "ClientDuplexStream")
@js.native
class ClientDuplexStream[RequestType, ResponseType] protected () extends Duplex {
  /**
    * Cancel the ongoing call. Results in the call ending with a CANCELLED status,
    * unless it has already ended with some other status.
    */
  def cancel(): Unit = js.native
  /**
    * Get the endpoint this call/stream is connected to.
    * @return The URI of the endpoint
    */
  def getPeer(): String = js.native
  /**
    * Write a message to the request stream. If serializing the argument fails,
    * the call will be cancelled and the stream will end with an error.
    * @param message The message to write. Must be a valid argument to the
    *     serialize function of the corresponding method
    * @param flags Flags to modify how the message is written
    * @param callback Callback for when this chunk of data is flushed
    * @return As defined for [Writable]{@link external:Writable}
    */
  def write(message: RequestType): Boolean = js.native
  def write(message: RequestType, flags: js.Any with writeFlags): Boolean = js.native
  def write(message: RequestType, flags: js.Any with writeFlags, callback: js.Function): Boolean = js.native
}

