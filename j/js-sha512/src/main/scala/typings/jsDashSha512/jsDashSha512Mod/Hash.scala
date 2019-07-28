package typings.jsDashSha512.jsDashSha512Mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends js.Object {
  def array(): js.Array[Double]
  def arrayBuffer(): ArrayBuffer
  def digest(): js.Array[Double]
  def hex(): String
  def update(messageToHash: String): Hash
}

object Hash {
  @scala.inline
  def apply(
    array: () => js.Array[Double],
    arrayBuffer: () => ArrayBuffer,
    digest: () => js.Array[Double],
    hex: () => String,
    update: String => Hash
  ): Hash = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), arrayBuffer = js.Any.fromFunction0(arrayBuffer), digest = js.Any.fromFunction0(digest), hex = js.Any.fromFunction0(hex), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Hash]
  }
}

