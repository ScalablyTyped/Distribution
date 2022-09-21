package typings.guacamoleClient

import typings.guacamoleClient.inputStreamMod.InputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataURIReaderMod {
  
  @JSImport("guacamole-client/lib/DataURIReader", "DataURIReader")
  @js.native
  open class DataURIReader protected () extends StObject {
    /**
      * @param stream The stream that data will be read from.
      */
    def this(stream: InputStream) = this()
    
    /**
      * Returns the data URI of all data received through the underlying stream
      * thus far.
      * @returns The data URI of all data received through the underlying stream thus far.
      */
    def getURI(): String = js.native
    
    /**
      * Fired once this stream is finished and no further data will be written.
      * @event
      */
    var onend: Null | js.Function0[Unit] = js.native
  }
}
