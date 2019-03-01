package typings
package jszipLib.jszipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputByType extends js.Object {
  var array: js.Array[scala.Double]
  var arraybuffer: stdLib.ArrayBuffer
  var base64: java.lang.String
  var binarystring: java.lang.String
  var blob: stdLib.Blob
  var nodebuffer: nodeLib.Buffer
  var text: java.lang.String
  var uint8array: stdLib.Uint8Array
}

object OutputByType {
  @scala.inline
  def apply(
    array: js.Array[scala.Double],
    arraybuffer: stdLib.ArrayBuffer,
    base64: java.lang.String,
    binarystring: java.lang.String,
    blob: stdLib.Blob,
    nodebuffer: nodeLib.Buffer,
    text: java.lang.String,
    uint8array: stdLib.Uint8Array
  ): OutputByType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("array")(array)
    __obj.updateDynamic("arraybuffer")(arraybuffer)
    __obj.updateDynamic("base64")(base64)
    __obj.updateDynamic("binarystring")(binarystring)
    __obj.updateDynamic("blob")(blob)
    __obj.updateDynamic("nodebuffer")(nodebuffer)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("uint8array")(uint8array)
    __obj.asInstanceOf[OutputByType]
  }
}

