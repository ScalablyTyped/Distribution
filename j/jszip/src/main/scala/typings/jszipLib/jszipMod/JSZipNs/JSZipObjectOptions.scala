package typings
package jszipLib.jszipMod.JSZipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSZipObjectOptions extends js.Object {
  var compression: jszipLib.Compression
}

object JSZipObjectOptions {
  @scala.inline
  def apply(compression: jszipLib.Compression): JSZipObjectOptions = {
    val __obj = js.Dynamic.literal(compression = compression)
  
    __obj.asInstanceOf[JSZipObjectOptions]
  }
}

