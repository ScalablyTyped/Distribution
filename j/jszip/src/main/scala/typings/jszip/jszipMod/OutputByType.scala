package typings.jszip.jszipMod

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputByType extends js.Object {
  var array: js.Array[Double]
  var arraybuffer: ArrayBuffer
  var base64: String
  var binarystring: String
  var blob: Blob
  var nodebuffer: Buffer
  var string: String
  var text: String
  var uint8array: Uint8Array
}

object OutputByType {
  @scala.inline
  def apply(
    array: js.Array[Double],
    arraybuffer: ArrayBuffer,
    base64: String,
    binarystring: String,
    blob: Blob,
    nodebuffer: Buffer,
    string: String,
    text: String,
    uint8array: Uint8Array
  ): OutputByType = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], arraybuffer = arraybuffer.asInstanceOf[js.Any], base64 = base64.asInstanceOf[js.Any], binarystring = binarystring.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], nodebuffer = nodebuffer.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], uint8array = uint8array.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutputByType]
  }
}

