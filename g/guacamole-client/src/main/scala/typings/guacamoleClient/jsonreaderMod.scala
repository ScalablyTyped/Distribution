package typings.guacamoleClient

import typings.guacamoleClient.inputStreamMod.InputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client/lib/JSONReader", JSImport.Namespace)
@js.native
object jsonreaderMod extends js.Object {
  
  @js.native
  class JSONReader protected () extends js.Object {
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
