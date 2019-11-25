package typings.jsDashMd5.jsDashMd5Mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Md5 extends js.Object {
  def array(): js.Array[Double]
  def arrayBuffer(): ArrayBuffer
  def base64(): String
  def buffer(): ArrayBuffer
  def digest(): js.Array[Double]
  def hex(): String
  def update(message: message): Md5
}

object Md5 {
  @scala.inline
  def apply(
    array: () => js.Array[Double],
    arrayBuffer: () => ArrayBuffer,
    base64: () => String,
    buffer: () => ArrayBuffer,
    digest: () => js.Array[Double],
    hex: () => String,
    update: message => Md5
  ): Md5 = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), arrayBuffer = js.Any.fromFunction0(arrayBuffer), base64 = js.Any.fromFunction0(base64), buffer = js.Any.fromFunction0(buffer), digest = js.Any.fromFunction0(digest), hex = js.Any.fromFunction0(hex), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Md5]
  }
}

@js.native
trait md5 extends js.Object {
  def apply(message: message): String = js.native
  def array(message: message): js.Array[Double] = js.native
  def arrayBuffer(message: message): ArrayBuffer = js.native
  def base64(message: message): String = js.native
  def buffer(message: message): ArrayBuffer = js.native
  def create(): Md5 = js.native
  def digest(message: message): js.Array[Double] = js.native
  def hex(message: message): String = js.native
  def update(message: message): Md5 = js.native
}

