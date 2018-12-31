package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "ServerDuplexStream")
@js.native
class ServerDuplexStream[RequestType, ResponseType] protected ()
  extends nodeLib.streamMod.Duplex {
  /**
    * Indicates if the call has been cancelled
    */
  var cancelled: scala.Boolean = js.native
  /**
    * The request metadata from the client
    */
  var metadata: Metadata = js.native
  /**
    * Get the endpoint this call/stream is connected to.
    * @return The URI of the endpoint
    */
  def getPeer(): java.lang.String = js.native
  /**
    * Send the initial metadata for a writable stream.
    * @param responseMetadata Metadata to send
    */
  def sendMetadata(responseMetadata: Metadata): scala.Unit = js.native
}

