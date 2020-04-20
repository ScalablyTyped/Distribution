package typings.jsMd5.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Md5_ extends js.Object {
  def array(): js.Array[Double]
  def arrayBuffer(): ArrayBuffer
  def base64(): String
  def buffer(): ArrayBuffer
  def digest(): js.Array[Double]
  def hex(): String
  def update(message: message): Md5_
}

object Md5_ {
  @scala.inline
  def apply(
    array: () => js.Array[Double],
    arrayBuffer: () => ArrayBuffer,
    base64: () => String,
    buffer: () => ArrayBuffer,
    digest: () => js.Array[Double],
    hex: () => String,
    update: message => Md5_
  ): Md5_ = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), arrayBuffer = js.Any.fromFunction0(arrayBuffer), base64 = js.Any.fromFunction0(base64), buffer = js.Any.fromFunction0(buffer), digest = js.Any.fromFunction0(digest), hex = js.Any.fromFunction0(hex), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Md5_]
  }
}

