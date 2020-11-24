package typings.jsSha3.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShakeHash extends js.Object {
  
  /**
    * Hash and return hex string.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    */
  def apply(message: Message, outputBits: Double): String = js.native
  
  /**
    * Hash and return integer array.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    */
  def array(message: Message, outputBits: Double): js.Array[Double] = js.native
  
  /**
    * Hash and return ArrayBuffer.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    */
  def arrayBuffer(message: Message, outputBits: Double): ArrayBuffer = js.native
  
  /**
    * Create a hash object.
    *
    * @param outputBits The length of output.
    * @param outputBits The length of output.
    */
  def create(outputBits: Double): Hasher = js.native
  
  /**
    * Hash and return integer array.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    */
  def digest(message: Message, outputBits: Double): js.Array[Double] = js.native
  
  /**
    * Hash and return hex string.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    */
  def hex(message: Message, outputBits: Double): String = js.native
  
  /**
    * Create a hash object and hash message.
    *
    * @param message The message you want to hash.
    * @param outputBits The length of output.
    */
  def update(message: Message, outputBits: Double): Hasher = js.native
}
