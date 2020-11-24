package typings.guacamoleClient

import typings.guacamoleClient.guacCommonMod.Mimetype
import typings.guacamoleClient.inputStreamMod.InputStream
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client/lib/BlobReader", JSImport.Namespace)
@js.native
object blobReaderMod extends js.Object {
  
  @js.native
  class BlobReader protected () extends js.Object {
    /**
      * @param stream The stream that data will be read from.
      * @param mimetype The mimetype of the blob being built.
      */
    def this(stream: InputStream, mimetype: Mimetype) = this()
    
    /**
      * Returns the contents of this Guacamole.BlobReader as a Blob.
      * @return The contents of this Guacamole.BlobReader.
      */
    def getBlob(): Blob = js.native
    
    /**
      * Returns the current length of this Guacamole.InputStream, in bytes.
      * @return The current length of this Guacamole.InputStream.
      */
    def getLength(): Double = js.native
    
    /**
      * Fired once this stream is finished and no further data will be written.
      * @event
      */
    var onend: Null | js.Function0[Unit] = js.native
    
    /**
      * Fired once for every blob of data received.
      * @event
      * @param length The number of bytes received.
      */
    var onprogress: Null | (js.Function1[/* length */ Double, Unit]) = js.native
  }
}
