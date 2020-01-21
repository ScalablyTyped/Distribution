package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.KeyPair
import typings.libsodiumWrappers.mod.StringKeyPair
import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_keypair")
@js.native
object cryptoBoxCurve25519xchacha20poly1305Keypair extends js.Object {
  def apply(publicKey: Uint8Array, secretKey: Uint8Array): KeyPair = js.native
  def apply(publicKey: Uint8Array, secretKey: Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  def apply(publicKey: Uint8Array, secretKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
}

