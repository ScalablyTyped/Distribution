package typings.guacamoleClient

import typings.guacamoleClient.inputStreamMod.InputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonreaderMod {
  
  @JSImport("guacamole-client/lib/JSONReader", "JSONReader")
  @js.native
  open class JSONReader protected () extends StObject {
    /**
      * @param stream The stream that JSON will be read from.
      */
    def this(stream: InputStream) = this()
    
    /**
      * @return The contents of this Guacamole.JSONReader, as parsed from the JSON contents of the input stream.
      */
    def getJSON(): js.Object = js.native
    
    /**
      * @return The current length of this Guacamole.JSONReader.
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
      * @param length The number of characters received.
      */
    var onprogress: Null | (js.Function1[/* length */ Double, Unit]) = js.native
  }
}
