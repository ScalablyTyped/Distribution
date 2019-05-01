package typings
package jsDashSha3Lib.jsDashSha3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash extends js.Object {
  /**
    * Hash and return hex string.
    *
    * @param message The message you want to hash.
    */
  def apply(message: Message): java.lang.String = js.native
  /**
    * Hash and return integer array.
    *
    * @param message The message you want to hash.
    */
  def array(message: Message): js.Array[scala.Double] = js.native
  /**
    * Hash and return ArrayBuffer.
    *
    * @param message The message you want to hash.
    */
  def arrayBuffer(message: Message): stdLib.ArrayBuffer = js.native
  /**
    * Create a hash object.
    */
  def create(): Hasher = js.native
  /**
    * Hash and return integer array.
    *
    * @param message The message you want to hash.
    */
  def digest(message: Message): js.Array[scala.Double] = js.native
  /**
    * Hash and return hex string.
    *
    * @param message The message you want to hash.
    */
  def hex(message: Message): java.lang.String = js.native
  /**
    * Create a hash object and hash message.
    *
    * @param message The message you want to hash.
    */
  def update(message: Message): Hasher = js.native
}

