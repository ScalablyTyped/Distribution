package typings.grpc.mod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "ServerReadableStream")
@js.native
class ServerReadableStream[RequestType] protected () extends Readable {
  /**
    * Indicates if the call has been cancelled
    */
  var cancelled: Boolean = js.native
  /**
    * The request metadata from the client
    */
  var metadata: Metadata = js.native
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

