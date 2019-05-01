package typings
package jsDashSha3Lib.jsDashSha3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShakeHash extends js.Object {
  /**
    * Hash and return hex string.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    */
  def apply(message: Message, outputBits: scala.Double): java.lang.String = js.native
  /**
    * Hash and return integer array.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    */
  def array(message: Message, outputBits: scala.Double): js.Array[scala.Double] = js.native
  /**
    * Hash and return ArrayBuffer.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    */
  def arrayBuffer(message: Message, outputBits: scala.Double): stdLib.ArrayBuffer = js.native
  /**
    * Create a hash object.
    *
    * @param outputBits The length of output.
    * @param outputBits The length of output.
    */
  def create(outputBits: scala.Double): Hasher = js.native
  /**
    * Hash and return integer array.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    */
  def digest(message: Message, outputBits: scala.Double): js.Array[scala.Double] = js.native
  /**
    * Hash and return hex string.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    */
  def hex(message: Message, outputBits: scala.Double): java.lang.String = js.native
  /**
    * Create a hash object and hash message.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    */
  def update(message: Message, outputBits: scala.Double): Hasher = js.native
}

