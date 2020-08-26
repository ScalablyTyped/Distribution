package typings.guacamoleClient

import typings.guacamoleClient.clientMod.Client
import typings.guacamoleClient.statusMod.Status.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client/lib/InputStream", JSImport.Namespace)
@js.native
object inputStreamMod extends js.Object {
  @js.native
  class InputStream protected () extends js.Object {
    /**
      * @param client The client owning this stream.
      * @param index The index of this stream.
      */
    def this(client: Client, index: Double) = this()
    /**
      * The index of this stream.
      */
    val index: Double = js.native
    /**
      * Called when a blob of data is received.
      * @event
      * @param data The received base64 data.
      */
    var onblob: Null | (js.Function1[/* data64 */ String, Unit]) = js.native
    /**
      * Called when this stream is closed.
      * @event
      */
    var onend: Null | js.Function0[Unit] = js.native
    /**
      * Acknowledges the receipt of a blob.
      * @param message A human-readable message describing the error or status.
      * @param code The error code, if any, or 0 for success.
      */
    def sendAck(message: String, code: Code): Unit = js.native
  }
  
}

