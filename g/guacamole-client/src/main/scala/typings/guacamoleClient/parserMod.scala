package typings.guacamoleClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client/lib/Parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  @js.native
  class Parser () extends js.Object {
    /**
      * Fired once for every complete Guacamole instruction received, in order.
      * @event
      * @param opcode The Guacamole instruction opcode.
      * @param parameters The parameters provided for the instruction, if any.
      */
    var oninstruction: Null | (js.Function2[/* opcode */ String, /* params */ js.Array[_], Unit]) = js.native
    /**
      * Appends the given instruction data packet to the internal buffer of
      * this Guacamole.Parser, executing all completed instructions at
      * the beginning of this buffer, if any.
      * @param packet The instruction data to receive.
      */
    def receive(packet: String): Unit = js.native
  }
  
}

