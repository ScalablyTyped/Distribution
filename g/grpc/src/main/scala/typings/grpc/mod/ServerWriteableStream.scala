package typings.grpc.mod

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "ServerWriteableStream")
@js.native
class ServerWriteableStream[RequestType] protected () extends Writable {
  /**
    * Indicates if the call has been cancelled
    */
  var cancelled: Boolean = js.native
  /**
    * The request metadata from the client
    */
  var metadata: Metadata = js.native
  /**
    * The request message from the client
    */
  var request: RequestType = js.native
  /**
    * Get the endpoint this call/stream is connected to.
    * @return The URI of the endpoint
    */
  def getPeer(): String = js.native
  /**
    * Send the initial metadata for a writable stream.
    * @param responseMetadata Metadata to send
    */
  def sendMetadata(responseMetadata: Metadata): Unit = js.native
}

