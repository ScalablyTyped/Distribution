package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteBuffer extends js.Object {
  var buffer: stdLib.Uint8Array
  var position: scala.Double
  def get(index: scala.Double): scala.Double
  def getInt(index: scala.Double): scala.Double
  def getShort(index: scala.Double): scala.Double
  def getString(index: scala.Double): java.lang.String
  def put(b: scala.Double): scala.Unit
  def putInt(num: scala.Double): scala.Unit
  def putShort(num: scala.Double): scala.Unit
  def putString(str: java.lang.String): scala.Unit
  def readInt(): scala.Double
  def reallocate(): scala.Unit
  def shrink(): stdLib.Uint8Array
  def size(): scala.Double
}

object ByteBuffer {
  @scala.inline
  def apply(
    buffer: stdLib.Uint8Array,
    get: js.Function1[scala.Double, scala.Double],
    getInt: js.Function1[scala.Double, scala.Double],
    getShort: js.Function1[scala.Double, scala.Double],
    getString: js.Function1[scala.Double, java.lang.String],
    position: scala.Double,
    put: js.Function1[scala.Double, scala.Unit],
    putInt: js.Function1[scala.Double, scala.Unit],
    putShort: js.Function1[scala.Double, scala.Unit],
    putString: js.Function1[java.lang.String, scala.Unit],
    readInt: js.Function0[scala.Double],
    reallocate: js.Function0[scala.Unit],
    shrink: js.Function0[stdLib.Uint8Array],
    size: js.Function0[scala.Double]
  ): ByteBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getInt")(getInt)
    __obj.updateDynamic("getShort")(getShort)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("put")(put)
    __obj.updateDynamic("putInt")(putInt)
    __obj.updateDynamic("putShort")(putShort)
    __obj.updateDynamic("putString")(putString)
    __obj.updateDynamic("readInt")(readInt)
    __obj.updateDynamic("reallocate")(reallocate)
    __obj.updateDynamic("shrink")(shrink)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ByteBuffer]
  }
}

