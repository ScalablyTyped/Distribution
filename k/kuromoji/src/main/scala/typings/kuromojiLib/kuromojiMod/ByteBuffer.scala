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
    get: scala.Double => scala.Double,
    getInt: scala.Double => scala.Double,
    getShort: scala.Double => scala.Double,
    getString: scala.Double => java.lang.String,
    position: scala.Double,
    put: scala.Double => scala.Unit,
    putInt: scala.Double => scala.Unit,
    putShort: scala.Double => scala.Unit,
    putString: java.lang.String => scala.Unit,
    readInt: () => scala.Double,
    reallocate: () => scala.Unit,
    shrink: () => stdLib.Uint8Array,
    size: () => scala.Double
  ): ByteBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer, get = js.Any.fromFunction1(get), getInt = js.Any.fromFunction1(getInt), getShort = js.Any.fromFunction1(getShort), getString = js.Any.fromFunction1(getString), position = position, put = js.Any.fromFunction1(put), putInt = js.Any.fromFunction1(putInt), putShort = js.Any.fromFunction1(putShort), putString = js.Any.fromFunction1(putString), readInt = js.Any.fromFunction0(readInt), reallocate = js.Any.fromFunction0(reallocate), shrink = js.Any.fromFunction0(shrink), size = js.Any.fromFunction0(size))
  
    __obj.asInstanceOf[ByteBuffer]
  }
}

