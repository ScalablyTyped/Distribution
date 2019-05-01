package typings
package jsDashSha3Lib.jsDashSha3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hasher extends js.Object {
  /**
    * Return hash in integer array.
    */
  def array(): js.Array[scala.Double]
  /**
    * Return hash in ArrayBuffer.
    */
  def arrayBuffer(): stdLib.ArrayBuffer
  /**
    * Return hash in integer array.
    */
  def digest(): js.Array[scala.Double]
  /**
    * Return hash in hex string.
    */
  def hex(): java.lang.String
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
    array: () => js.Array[scala.Double],
    arrayBuffer: () => stdLib.ArrayBuffer,
    digest: () => js.Array[scala.Double],
    hex: () => java.lang.String,
    toString: () => java.lang.String,
    update: Message => Hasher
  ): Hasher = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), arrayBuffer = js.Any.fromFunction0(arrayBuffer), digest = js.Any.fromFunction0(digest), hex = js.Any.fromFunction0(hex), toString = js.Any.fromFunction0(toString), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Hasher]
  }
}

