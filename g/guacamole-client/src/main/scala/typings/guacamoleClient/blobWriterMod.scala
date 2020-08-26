package typings.guacamoleClient

import typings.guacamoleClient.outputStreamMod.OutputStream
import typings.guacamoleClient.statusMod.Status
import typings.std.Blob
import typings.std.DOMError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client/lib/BlobWriter", JSImport.Namespace)
@js.native
object blobWriterMod extends js.Object {
  @js.native
  class BlobWriter protected () extends js.Object {
    /**
      * @param stream The stream that data will be written to.
      */
    def this(stream: OutputStream) = this()
    /**
      * Fired for received data, if acknowledged by the server.
      * @event
      * @param status The status of the operation.
      */
    var onack: Null | (js.Function1[/* statue */ Status, Unit]) = js.native
    /**
      * Fired when a blob passed to sendBlob() has finished being sent.
      * @event
      * @param blob The blob that was sent.
      */
    var oncomplete: Null | (js.Function1[/* blob */ Blob, Unit]) = js.native
    /**
      * Fired when an error occurs reading a blob passed to sendBlob(). The transfer for the
      * the given blob will cease, but the stream will remain open.
      * @event
      * @param blob The blob that was being read when the error occurred.
      * @param offset The offset of the failed read attempt within the blob, in bytes.
      * @param error The error that occurred.
      */
    var onerror: Null | (js.Function3[/* blob */ Blob, /* offset */ Double, /* error */ DOMError, Unit]) = js.native
    /**
      * Fired for each successfully-read chunk of data as a blob is being sent via sendBlob().
      * @event
      * @param blob The blob that is being read.
      * @param offset The offset of the read that just succeeded.
      */
    var onprogress: Null | (js.Function2[/* blob */ Blob, /* offset */ Double, Unit]) = js.native
    /**
      * Sends the contents of the given blob over the underlying stream.
      * @param blob The blob to send.
      */
    def sendBlob(blob: Blob): Unit = js.native
    /**
      * Signals that no further text will be sent, effectively closing the
      * stream.
      */
    def sendEnd(): Unit = js.native
  }
  
}

