package typings.guacamoleClient

import typings.guacamoleClient.guacamoleClientInts.`6048`
import typings.guacamoleClient.libGuacCommonMod.TypedArray
import typings.guacamoleClient.libOutputStreamMod.OutputStream
import typings.guacamoleClient.libStatusMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libArrayBufferWriterMod {
  
  @JSImport("guacamole-client/lib/ArrayBufferWriter", "ArrayBufferWriter")
  @js.native
  open class ArrayBufferWriter protected () extends StObject {
    /**
      * @param stream The stream that data will be written
      */
    def this(stream: OutputStream) = this()
    
    /**
      * The maximum length of any blob sent by this Guacamole.ArrayBufferWriter,
      * in bytes. Data sent via sendData() which exceeds
      * this length will be split into multiple blobs. As the Guacamole protocol
      * limits the maximum size of any instruction or instruction element to
      * 8192 bytes, and the contents of blobs will be base64-encoded, this value
      * should only be increased with extreme caution.
      *
      */
    var blobLength: Double = js.native
    
    /**
      * Fired for received data, if acknowledged by the server.
      * @event
      * @param status The status of the operation.
      */
    var onack: Null | (js.Function1[/* status */ Status, Unit]) = js.native
    
    /**
      * Sends the given data.
      * @param data The data to send.
      */
    def sendData(data: js.typedarray.ArrayBuffer): Unit = js.native
    def sendData(data: TypedArray): Unit = js.native
    
    /**
      * Signals that no further text will be sent, effectively closing the
      * stream.
      */
    def sendEnd(): Unit = js.native
  }
  /* static members */
  object ArrayBufferWriter {
    
    /**
      * The default maximum blob length for new Guacamole.ArrayBufferWriter
      * instances.
      */
    @JSImport("guacamole-client/lib/ArrayBufferWriter", "ArrayBufferWriter.DEFAULT_BLOB_LENGTH")
    @js.native
    val DEFAULT_BLOB_LENGTH: `6048` = js.native
  }
}
