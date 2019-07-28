package typings.jszip.jszipMod

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
    val __obj = js.Dynamic.literal(arraybuffer = arraybuffer, blob = blob, nodebuffer = nodebuffer, uint8array = uint8array)
  
    __obj.asInstanceOf[JSZipSupport]
  }
}

