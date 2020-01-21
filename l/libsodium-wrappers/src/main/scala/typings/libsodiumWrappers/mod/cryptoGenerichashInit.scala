package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_generichash_init")
@js.native
object cryptoGenerichashInit extends js.Object {
  def apply(key: String, hash_length: Double): StateAddress = js.native
  def apply(key: Null, hash_length: Double): StateAddress = js.native
  def apply(key: Uint8Array, hash_length: Double): StateAddress = js.native
}

