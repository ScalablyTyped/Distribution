package typings.hdrHistogramJs.byteBufferMod

import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteBuffer extends js.Object {
  var data: Uint8Array
  var int32ArrayForConvert: Uint32Array
  var int8ArrayForConvert: Uint8Array
  var position: Double
  def get(): Double
  def getInt32(): Double
  def getInt64(): Double
  def put(value: Double): Unit
  def putArray(array: Uint8Array): Unit
  def putInt32(value: Double): Unit
  def putInt64(value: Double): Unit
  def resetPosition(): Unit
}

object ByteBuffer {
  @scala.inline
  def apply(
    data: Uint8Array,
    get: () => Double,
    getInt32: () => Double,
    getInt64: () => Double,
    int32ArrayForConvert: Uint32Array,
    int8ArrayForConvert: Uint8Array,
    position: Double,
    put: Double => Unit,
    putArray: Uint8Array => Unit,
    putInt32: Double => Unit,
    putInt64: Double => Unit,
    resetPosition: () => Unit
  ): ByteBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], get = js.Any.fromFunction0(get), getInt32 = js.Any.fromFunction0(getInt32), getInt64 = js.Any.fromFunction0(getInt64), int32ArrayForConvert = int32ArrayForConvert.asInstanceOf[js.Any], int8ArrayForConvert = int8ArrayForConvert.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], put = js.Any.fromFunction1(put), putArray = js.Any.fromFunction1(putArray), putInt32 = js.Any.fromFunction1(putInt32), putInt64 = js.Any.fromFunction1(putInt64), resetPosition = js.Any.fromFunction0(resetPosition))
    __obj.asInstanceOf[ByteBuffer]
  }
}

