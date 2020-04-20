package typings.jsSha3.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hasher extends js.Object {
  /**
    * Return hash in integer array.
    */
  def array(): js.Array[Double]
  /**
    * Return hash in ArrayBuffer.
    */
  def arrayBuffer(): ArrayBuffer
  /**
    * Return hash in integer array.
    */
  def digest(): js.Array[Double]
  /**
    * Return hash in hex string.
    */
  def hex(): String
  /**
    * Update hash
    *
    * @param message The message you want to hash.
    */
  def update(message: Message): Hasher
}

object Hasher {
  @scala.inline
  def apply(
    array: () => js.Array[Double],
    arrayBuffer: () => ArrayBuffer,
    digest: () => js.Array[Double],
    hex: () => String,
    update: Message => Hasher
  ): Hasher = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), arrayBuffer = js.Any.fromFunction0(arrayBuffer), digest = js.Any.fromFunction0(digest), hex = js.Any.fromFunction0(hex), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Hasher]
  }
}

