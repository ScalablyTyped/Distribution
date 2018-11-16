package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "ClientReadableStream")
@js.native
class ClientReadableStream[ResponseType] protected ()
  extends nodeLib.streamMod.Readable {
  /**
       * Cancel the ongoing call. Results in the call ending with a CANCELLED status,
       * unless it has already ended with some other status.
       */
  def cancel(): scala.Unit = js.native
  /**
       * Get the endpoint this call/stream is connected to.
       * @return The URI of the endpoint
       */
  def getPeer(): java.lang.String = js.native
}

