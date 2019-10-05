package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_generichash_init")
@js.native
object crypto_generichash_init extends js.Object {
  def apply(): state_address = js.native
  def apply(key: String): state_address = js.native
  def apply(key: String, hash_length: Double): state_address = js.native
  def apply(key: Null, hash_length: Double): state_address = js.native
  def apply(key: Uint8Array): state_address = js.native
  def apply(key: Uint8Array, hash_length: Double): state_address = js.native
}

