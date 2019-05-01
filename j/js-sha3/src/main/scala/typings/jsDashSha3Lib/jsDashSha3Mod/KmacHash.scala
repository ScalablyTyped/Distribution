package typings
package jsDashSha3Lib.jsDashSha3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmacHash extends js.Object {
  /**
    * Hash and return hex string.
    *
    * @param key The key string.
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    * @param customization The customization string.
    */
  def apply(key: Message, message: Message, outputBits: scala.Double, customization: Message): java.lang.String = js.native
  /**
    * Hash and return integer array.
    *
    * @param key The key string.
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    * @param customization The customization string.
    */
  def array(key: Message, message: Message, outputBits: scala.Double, customization: Message): js.Array[scala.Double] = js.native
  /**
    * Hash and return ArrayBuffer.
    *
    * @param key The key string.
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    * @param customization The customization string.
    */
  def arrayBuffer(key: Message, message: Message, outputBits: scala.Double, customization: Message): stdLib.ArrayBuffer = js.native
  /**
    * Create a hash object.
    *
    * @param key The key string.
    * @param outputBits The length of output.
    * @param customization The customization string.
    */
  def create(key: Message, outputBits: scala.Double, customization: Message): Hasher = js.native
  /**
    * Hash and return integer array.
    *
    * @param key The key string.
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    * @param customization The customization string.
    */
  def digest(key: Message, message: Message, outputBits: scala.Double, customization: Message): js.Array[scala.Double] = js.native
  /**
    * Hash and return hex string.
    *
    * @param key The key string.
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    * @param customization The customization string.
    */
  def hex(key: Message, message: Message, outputBits: scala.Double, customization: Message): java.lang.String = js.native
  /**
    * Create a hash object and hash message.
    *
    * @param key The key string.
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    * @param customization The customization string.
    */
  def update(key: Message, message: Message, outputBits: scala.Double, customization: Message): Hasher = js.native
}

