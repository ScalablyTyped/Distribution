package typings.jszip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSZipSupport extends js.Object {
  var arraybuffer: Boolean
  var blob: Boolean
  var nodebuffer: Boolean
  var uint8array: Boolean
}

object JSZipSupport {
  @scala.inline
  def apply(arraybuffer: Boolean, blob: Boolean, nodebuffer: Boolean, uint8array: Boolean): JSZipSupport = {
    val __obj = js.Dynamic.literal(arraybuffer = arraybuffer.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], nodebuffer = nodebuffer.asInstanceOf[js.Any], uint8array = uint8array.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSZipSupport]
  }
}

