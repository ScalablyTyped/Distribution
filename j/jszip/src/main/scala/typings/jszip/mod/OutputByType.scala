package typings.jszip.mod

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputByType extends js.Object {
  var array: js.Array[Double] = js.native
  var arraybuffer: ArrayBuffer = js.native
  var base64: String = js.native
  var binarystring: String = js.native
  var blob: Blob = js.native
  var nodebuffer: Buffer = js.native
  var string: String = js.native
  var text: String = js.native
  var uint8array: Uint8Array = js.native
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
  @scala.inline
  implicit class OutputByTypeOps[Self <: OutputByType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArrayVarargs(value: Double*): Self = this.set("array", js.Array(value :_*))
    @scala.inline
    def setArray(value: js.Array[Double]): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def setArraybuffer(value: ArrayBuffer): Self = this.set("arraybuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase64(value: String): Self = this.set("base64", value.asInstanceOf[js.Any])
    @scala.inline
    def setBinarystring(value: String): Self = this.set("binarystring", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlob(value: Blob): Self = this.set("blob", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodebuffer(value: Buffer): Self = this.set("nodebuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setUint8array(value: Uint8Array): Self = this.set("uint8array", value.asInstanceOf[js.Any])
  }
  
}

