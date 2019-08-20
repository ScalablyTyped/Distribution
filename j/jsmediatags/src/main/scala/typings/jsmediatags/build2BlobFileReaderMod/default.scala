package typings.jsmediatags.build2BlobFileReaderMod

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/BlobFileReader", JSImport.Default)
@js.native
class default protected () extends BlobFileReader {
  def this(blob: Blob) = this()
}

/* static members */
@JSImport("jsmediatags/build2/BlobFileReader", JSImport.Default)
@js.native
object default extends js.Object {
  def canReadFile(file: js.Any): Boolean = js.native
}

