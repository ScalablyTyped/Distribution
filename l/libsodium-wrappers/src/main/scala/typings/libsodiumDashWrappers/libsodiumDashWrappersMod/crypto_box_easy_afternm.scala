package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_box_easy_afternm")
@js.native
object crypto_box_easy_afternm extends js.Object {
  def apply(message: String, nonce: Uint8Array, sharedKey: Uint8Array): Uint8Array = js.native
  def apply(message: String, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(message: String, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def apply(message: Uint8Array, nonce: Uint8Array, sharedKey: Uint8Array): Uint8Array = js.native
  def apply(message: Uint8Array, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(
    message: Uint8Array,
    nonce: Uint8Array,
    sharedKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
}

