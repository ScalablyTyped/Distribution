package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_aead_chacha20poly1305_ietf_decrypt")
@js.native
object crypto_aead_chacha20poly1305_ietf_decrypt extends js.Object {
  def apply(
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    ciphertext: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
}

