package typings.guacamoleCommonJs

import typings.guacamoleCommonJs.outputStreamMod.OutputStream
import typings.guacamoleCommonJs.statusMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringWriterMod {
  
  @JSImport("guacamole-common-js/lib/StringWriter", "StringWriter")
  @js.native
  open class StringWriter protected () extends StObject {
    /**
      * @param stream The stream that data will be written to.
      */
    def this(stream: OutputStream) = this()
    
    /**
      * Fired for received data, if acknowledged by the server.
      * @event
      * @param status The status of the operation.
      */
    var onack: Null | (js.Function1[/* status */ Status, Unit]) = js.native
    
    /**
      * Signals that no further text will be sent, effectively closing the
      * stream.
      */
    def sendEnd(): Unit = js.native
    
    /**
      * Sends the given text.
      * @param text The text to send.
      */
    def sendText(text: String): Unit = js.native
  }
}
