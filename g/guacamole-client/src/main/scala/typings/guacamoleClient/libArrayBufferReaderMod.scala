package typings.guacamoleClient

import typings.guacamoleClient.libInputStreamMod.InputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libArrayBufferReaderMod {
  
  @JSImport("guacamole-client/lib/ArrayBufferReader", "ArrayBufferReader")
  @js.native
  open class ArrayBufferReader protected () extends StObject {
    /**
      * @param stream The stream that data will be read from.
      */
    def this(stream: InputStream) = this()
    
    /**
      * Fired once for every blob of data received.
      * @event
      * @param buffer The data packet received.
      */
    var ondata: Null | (js.Function1[/* data */ js.typedarray.ArrayBuffer, Unit]) = js.native
    
    /**
      * Fired once this stream is finished and no further data will be written.
      * @event
      */
    var onend: Null | js.Function0[Unit] = js.native
  }
}
