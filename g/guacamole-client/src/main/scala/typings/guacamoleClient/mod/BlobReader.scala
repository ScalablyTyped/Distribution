package typings.guacamoleClient.mod

import typings.guacamoleClient.libGuacCommonMod.Mimetype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "BlobReader")
@js.native
open class BlobReader protected ()
  extends typings.guacamoleClient.libBlobReaderMod.BlobReader {
  /**
    * @param stream The stream that data will be read from.
    * @param mimetype The mimetype of the blob being built.
    */
  def this(stream: typings.guacamoleClient.libInputStreamMod.InputStream, mimetype: Mimetype) = this()
}
