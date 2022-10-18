package typings.guacamoleCommonJs.mod

import typings.guacamoleCommonJs.libGuacCommonMod.Mimetype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-common-js", "BlobReader")
@js.native
open class BlobReader protected ()
  extends typings.guacamoleCommonJs.libBlobReaderMod.BlobReader {
  /**
    * @param stream The stream that data will be read from.
    * @param mimetype The mimetype of the blob being built.
    */
  def this(stream: typings.guacamoleCommonJs.libInputStreamMod.InputStream, mimetype: Mimetype) = this()
}
