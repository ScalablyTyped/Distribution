package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.KeyPair
import typings.libsodiumWrappers.mod.StringKeyPair
import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_sign_seed_keypair")
@js.native
object cryptoSignSeedKeypair extends js.Object {
  def apply(seed: Uint8Array): KeyPair = js.native
  def apply(seed: Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  def apply(seed: Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
}

