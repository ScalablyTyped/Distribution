package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_sign_open")
@js.native
object crypto_sign_open extends js.Object {
  def apply(signedMessage: String, publicKey: Uint8Array): Uint8Array = js.native
  def apply(signedMessage: String, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(signedMessage: String, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def apply(signedMessage: Uint8Array, publicKey: Uint8Array): Uint8Array = js.native
  def apply(signedMessage: Uint8Array, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(signedMessage: Uint8Array, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}

