package typings.jsDashSha3.jsDashSha3Mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CshakeHash extends js.Object {
  /**
    * Hash and return hex string.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    * @param functionName The function name string.
    * @param customization The customization string.
    */
  def apply(message: Message, outputBits: Double, functionName: Message, customization: Message): String = js.native
  /**
    * Hash and return integer array.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    * @param functionName The function name string.
    * @param customization The customization string.
    */
  def array(message: Message, outputBits: Double, functionName: Message, customization: Message): js.Array[Double] = js.native
  /**
    * Hash and return ArrayBuffer.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    * @param functionName The function name string.
    * @param customization The customization string.
    */
  def arrayBuffer(message: Message, outputBits: Double, functionName: Message, customization: Message): ArrayBuffer = js.native
  /**
    * Create a hash object.
    *
    * @param outputBits The length of output.
    * @param outputBits The length of output.
    */
  def create(outputBits: Double): Hasher = js.native
  /**
    * Create a hash object.
    *
    * @param outputBits The length of output.
    * @param functionName The function name string.
    * @param customization The customization string.
    */
  def create(outputBits: Double, functionName: Message, customization: Message): Hasher = js.native
  /**
    * Hash and return integer array.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    * @param functionName The function name string.
    * @param customization The customization string.
    */
  def digest(message: Message, outputBits: Double, functionName: Message, customization: Message): js.Array[Double] = js.native
  /**
    * Hash and return hex string.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    * @param functionName The function name string.
    * @param customization The customization string.
    */
  def hex(message: Message, outputBits: Double, functionName: Message, customization: Message): String = js.native
  /**
    * Create a hash object and hash message.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    * @param functionName The function name string.
    * @param customization The customization string.
    */
  def update(message: Message, outputBits: Double, functionName: Message, customization: Message): Hasher = js.native
}

