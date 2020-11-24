package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers", "crypto_secretbox_detached")
@js.native
object cryptoSecretboxDetached extends js.Object {
  
  def apply(message: String, nonce: Uint8Array, key: Uint8Array): SecretBox = js.native
  def apply(message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): StringSecretBox = js.native
  def apply(message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): SecretBox = js.native
  def apply(message: Uint8Array, nonce: Uint8Array, key: Uint8Array): SecretBox = js.native
  def apply(message: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): StringSecretBox = js.native
  def apply(message: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): SecretBox = js.native
}
