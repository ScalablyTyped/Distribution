package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_generichash_final")
@js.native
object crypto_generichash_final extends js.Object {
  def apply(state_address: generichash_state_address, hash_length: Double): Uint8Array = js.native
  def apply(state_address: generichash_state_address, hash_length: Double, outputFormat: StringOutputFormat): String = js.native
  def apply(
    state_address: generichash_state_address,
    hash_length: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
}

