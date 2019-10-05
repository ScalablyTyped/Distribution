package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_box_detached")
@js.native
object crypto_box_detached extends js.Object {
  def apply(message: String, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): CryptoBox = js.native
  def apply(
    message: String,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(message: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
}

