package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_box_open_detached")
@js.native
object crypto_box_open_detached extends js.Object {
  def apply(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array
  ): Uint8Array = js.native
  def apply(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def apply(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array
  ): Uint8Array = js.native
  def apply(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
}

