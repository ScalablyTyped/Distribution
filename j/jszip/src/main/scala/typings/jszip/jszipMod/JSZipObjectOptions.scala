package typings.jszip.jszipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSZipObjectOptions extends js.Object {
  var compression: Compression
}

object JSZipObjectOptions {
  @scala.inline
  def apply(compression: Compression): JSZipObjectOptions = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JSZipObjectOptions]
  }
}

