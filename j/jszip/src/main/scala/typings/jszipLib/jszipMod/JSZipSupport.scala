package typings
package jszipLib.jszipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSZipSupport extends js.Object {
  var arraybuffer: scala.Boolean
  var blob: scala.Boolean
  var nodebuffer: scala.Boolean
  var uint8array: scala.Boolean
}

object JSZipSupport {
  @scala.inline
  def apply(
    arraybuffer: scala.Boolean,
    blob: scala.Boolean,
    nodebuffer: scala.Boolean,
    uint8array: scala.Boolean
  ): JSZipSupport = {
    val __obj = js.Dynamic.literal(arraybuffer = arraybuffer, blob = blob, nodebuffer = nodebuffer, uint8array = uint8array)
  
    __obj.asInstanceOf[JSZipSupport]
  }
}

