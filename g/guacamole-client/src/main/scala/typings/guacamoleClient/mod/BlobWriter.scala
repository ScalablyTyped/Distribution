package typings.guacamoleClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client", "BlobWriter")
@js.native
class BlobWriter protected ()
  extends typings.guacamoleClient.blobWriterMod.BlobWriter {
  /**
    * @param stream The stream that data will be written to.
    */
  def this(stream: typings.guacamoleClient.outputStreamMod.OutputStream) = this()
}

