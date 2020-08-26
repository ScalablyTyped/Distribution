package typings.kuromoji.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteBuffer extends js.Object {
  var buffer: Uint8Array = js.native
  var position: Double = js.native
  def get(index: Double): Double = js.native
  def getInt(index: Double): Double = js.native
  def getShort(index: Double): Double = js.native
  def getString(index: Double): String = js.native
  def put(b: Double): Unit = js.native
  def putInt(num: Double): Unit = js.native
  def putShort(num: Double): Unit = js.native
  def putString(str: String): Unit = js.native
  def readInt(): Double = js.native
  def reallocate(): Unit = js.native
  def shrink(): Uint8Array = js.native
  def size(): Double = js.native
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
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getInt = js.Any.fromFunction1(getInt), getShort = js.Any.fromFunction1(getShort), getString = js.Any.fromFunction1(getString), position = position.asInstanceOf[js.Any], put = js.Any.fromFunction1(put), putInt = js.Any.fromFunction1(putInt), putShort = js.Any.fromFunction1(putShort), putString = js.Any.fromFunction1(putString), readInt = js.Any.fromFunction0(readInt), reallocate = js.Any.fromFunction0(reallocate), shrink = js.Any.fromFunction0(shrink), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[ByteBuffer]
  }
  @scala.inline
  implicit class ByteBufferOps[Self <: ByteBuffer] (val x: Self) extends AnyVal {
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
    def setBuffer(value: Uint8Array): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: Double => Double): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetInt(value: Double => Double): Self = this.set("getInt", js.Any.fromFunction1(value))
    @scala.inline
    def setGetShort(value: Double => Double): Self = this.set("getShort", js.Any.fromFunction1(value))
    @scala.inline
    def setGetString(value: Double => String): Self = this.set("getString", js.Any.fromFunction1(value))
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setPut(value: Double => Unit): Self = this.set("put", js.Any.fromFunction1(value))
    @scala.inline
    def setPutInt(value: Double => Unit): Self = this.set("putInt", js.Any.fromFunction1(value))
    @scala.inline
    def setPutShort(value: Double => Unit): Self = this.set("putShort", js.Any.fromFunction1(value))
    @scala.inline
    def setPutString(value: String => Unit): Self = this.set("putString", js.Any.fromFunction1(value))
    @scala.inline
    def setReadInt(value: () => Double): Self = this.set("readInt", js.Any.fromFunction0(value))
    @scala.inline
    def setReallocate(value: () => Unit): Self = this.set("reallocate", js.Any.fromFunction0(value))
    @scala.inline
    def setShrink(value: () => Uint8Array): Self = this.set("shrink", js.Any.fromFunction0(value))
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
  }
  
}

