package typings.guacamoleCommonJs

import typings.guacamoleCommonJs.libClientMod.Client
import typings.guacamoleCommonJs.libStatusMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOutputStreamMod {
  
  @JSImport("guacamole-common-js/lib/OutputStream", "OutputStream")
  @js.native
  open class OutputStream protected () extends StObject {
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
      * Fired whenever an acknowledgement is received from the server, indicating
      * that a stream operation has completed, or an error has occurred.
      * @event
      * @param status The status of the operation.
      */
    var onack: Null | (js.Function1[/* status */ Status, Unit]) = js.native
    
    /**
      * Writes the given base64-encoded data to this stream as a blob.
      * @param data The base64-encoded data to send.
      */
    def sendBlob(data64: String): Unit = js.native
    
    /**
      * Closes this stream.
      */
    def sendEnd(): Unit = js.native
  }
}
