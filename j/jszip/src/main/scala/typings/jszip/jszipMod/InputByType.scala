package typings.jszip.jszipMod

import typings.node.NodeJS.ReadableStream
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputByType extends js.Object {
  var array: js.Array[Double]
  var arraybuffer: ArrayBuffer
  var base64: String
  var binarystring: String
  var blob: Blob
  var stream: ReadableStream
  var string: String
  var text: String
  var uint8array: Uint8Array
}

object InputByType {
  @scala.inline
  def apply(
    array: js.Array[Double],
    arraybuffer: ArrayBuffer,
    base64: String,
    binarystring: String,
    blob: Blob,
    stream: ReadableStream,
    string: String,
    text: String,
    uint8array: Uint8Array
  ): InputByType = {
    val __obj = js.Dynamic.literal(array = array, arraybuffer = arraybuffer, base64 = base64, binarystring = binarystring, blob = blob, stream = stream, string = string, text = text, uint8array = uint8array)
  
    __obj.asInstanceOf[InputByType]
  }
}

