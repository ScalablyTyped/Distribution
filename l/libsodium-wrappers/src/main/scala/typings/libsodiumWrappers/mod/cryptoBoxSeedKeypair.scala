package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_box_seed_keypair")
@js.native
object cryptoBoxSeedKeypair extends js.Object {
  def apply(seed: Uint8Array): KeyPair = js.native
  def apply(seed: Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  def apply(seed: Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
}

