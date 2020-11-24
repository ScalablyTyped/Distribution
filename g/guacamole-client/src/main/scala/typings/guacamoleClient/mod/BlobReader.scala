package typings.guacamoleClient.mod

import typings.guacamoleClient.guacCommonMod.Mimetype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "BlobReader")
@js.native
class BlobReader protected ()
  extends typings.guacamoleClient.blobReaderMod.BlobReader {
  /**
    * @param stream The stream that data will be read from.
    * @param mimetype The mimetype of the blob being built.
    */
  def this(stream: typings.guacamoleClient.inputStreamMod.InputStream, mimetype: Mimetype) = this()
}
