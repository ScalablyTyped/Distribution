package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_secretbox_open_detached")
@js.native
object cryptoSecretboxOpenDetached extends js.Object {
  
  def apply(ciphertext: String, mac: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def apply(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def apply(ciphertext: Uint8Array, mac: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def apply(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
}
