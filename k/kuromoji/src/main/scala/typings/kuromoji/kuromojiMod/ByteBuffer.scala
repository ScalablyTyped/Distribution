package typings.kuromoji.kuromojiMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteBuffer extends js.Object {
  var buffer: Uint8Array
  var position: Double
  def get(index: Double): Double
  def getInt(index: Double): Double
  def getShort(index: Double): Double
  def getString(index: Double): String
  def put(b: Double): Unit
  def putInt(num: Double): Unit
  def putShort(num: Double): Unit
  def putString(str: String): Unit
  def readInt(): Double
  def reallocate(): Unit
  def shrink(): Uint8Array
  def size(): Double
}

object ByteBuffer {
  @scala.inline
  def apply(
    buffer: Uint8Array,
    get: Double => Double,
    getInt: Double => Double,
    getShort: Double => Double,
    getString: Double => String,
    position: Double,
    put: Double => Unit,
    putInt: Double => Unit,
    putShort: Double => Unit,
    putString: String => Unit,
    readInt: () => Double,
    reallocate: () => Unit,
    shrink: () => Uint8Array,
    size: () => Double
  ): ByteBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer, get = js.Any.fromFunction1(get), getInt = js.Any.fromFunction1(getInt), getShort = js.Any.fromFunction1(getShort), getString = js.Any.fromFunction1(getString), position = position, put = js.Any.fromFunction1(put), putInt = js.Any.fromFunction1(putInt), putShort = js.Any.fromFunction1(putShort), putString = js.Any.fromFunction1(putString), readInt = js.Any.fromFunction0(readInt), reallocate = js.Any.fromFunction0(reallocate), shrink = js.Any.fromFunction0(shrink), size = js.Any.fromFunction0(size))
  
    __obj.asInstanceOf[ByteBuffer]
  }
}

