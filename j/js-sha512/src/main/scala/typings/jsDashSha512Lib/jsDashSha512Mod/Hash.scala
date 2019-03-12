package typings
package jsDashSha512Lib.jsDashSha512Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends js.Object {
  def array(): js.Array[scala.Double]
  def arrayBuffer(): stdLib.ArrayBuffer
  def digest(): js.Array[scala.Double]
  def hex(): java.lang.String
  def update(messageToHash: java.lang.String): Hash
}

object Hash {
  @scala.inline
  def apply(
    array: () => js.Array[scala.Double],
    arrayBuffer: () => stdLib.ArrayBuffer,
    digest: () => js.Array[scala.Double],
    hex: () => java.lang.String,
    update: java.lang.String => Hash
  ): Hash = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), arrayBuffer = js.Any.fromFunction0(arrayBuffer), digest = js.Any.fromFunction0(digest), hex = js.Any.fromFunction0(hex), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Hash]
  }
}

