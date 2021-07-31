package typings.guacamoleClient

import typings.guacamoleClient.inputStreamMod.InputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringReaderMod {
  
  @JSImport("guacamole-client/lib/StringReader", "StringReader")
  @js.native
  class StringReader protected () extends StObject {
    /**
      * @param stream The stream that data will be read from.
      */
    def this(stream: InputStream) = this()
    
    /**
      * Fired once this stream is finished and no further data will be written.
      * @event
      */
    var onend: Null | js.Function0[Unit] = js.native
    
    /**
      * Fired once for every blob of text data received.
      *
      * @event
      * @param text The data packet received.
      */
    var ontext: Null | (js.Function1[/* text */ String, Unit]) = js.native
  }
}
