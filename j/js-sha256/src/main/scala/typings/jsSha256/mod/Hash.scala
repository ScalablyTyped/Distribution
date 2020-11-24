package typings.jsSha256.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hash extends js.Object {
  
  /**
    * Hash and return hex string.
    *
    * @param message The message you want to hash.
    */
  def apply(message: Message): String = js.native
  
  /**
    * Return hash in integer array.
    *
    * @param message The message you want to hash.
    */
  def array(message: Message): js.Array[Double] = js.native
  
  /**
    * Return hash in ArrayBuffer.
    *
    * @param message The message you want to hash.
    */
  def arrayBuffer(message: Message): ArrayBuffer = js.native
  
  /**
    * Create a hash object.
    */
  def create(): Hasher = js.native
  
  /**
    * Return hash in integer array.
    *
    * @param message The message you want to hash.
    */
  def digest(message: Message): js.Array[Double] = js.native
  
  /**
    * Return hash in hex string.
    *
    * @param message The message you want to hash.
    */
  def hex(message: Message): String = js.native
  
  /**
    * Computes a Hash-based message authentication code (HMAC) using a secret key
    *
    * @param secretKey The Secret Key
    * @param message The message you want to hash.
    */
  /**
    * HMAC interface
    */
  def hmac(secretKey: String, message: Message): String = js.native
  /**
    * HMAC interface
    */
  @JSName("hmac")
  var hmac_Original: Hmac = js.native
  
  /**
    * Create a hash object and hash message.
    *
    * @param message The message you want to hash.
    */
  def update(message: Message): Hasher = js.native
}
