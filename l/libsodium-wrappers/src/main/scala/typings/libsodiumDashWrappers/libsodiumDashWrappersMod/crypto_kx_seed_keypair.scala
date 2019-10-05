package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_kx_seed_keypair")
@js.native
object crypto_kx_seed_keypair extends js.Object {
  def apply(seed: Uint8Array): StringKeyPair = js.native
  def apply(seed: Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  def apply(seed: Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
}

