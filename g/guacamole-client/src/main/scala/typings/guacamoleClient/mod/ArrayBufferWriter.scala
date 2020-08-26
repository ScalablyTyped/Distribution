package typings.guacamoleClient.mod

import typings.guacamoleClient.guacamoleClientNumbers.`6048`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client", "ArrayBufferWriter")
@js.native
class ArrayBufferWriter protected ()
  extends typings.guacamoleClient.arrayBufferWriterMod.ArrayBufferWriter {
  /**
    * @param stream The stream that data will be written
    */
  def this(stream: typings.guacamoleClient.outputStreamMod.OutputStream) = this()
}

/* static members */
@JSImport("guacamole-client", "ArrayBufferWriter")
@js.native
object ArrayBufferWriter extends js.Object {
  /**
    * The default maximum blob length for new Guacamole.ArrayBufferWriter
    * instances.
    */
  val DEFAULT_BLOB_LENGTH: `6048` = js.native
}

