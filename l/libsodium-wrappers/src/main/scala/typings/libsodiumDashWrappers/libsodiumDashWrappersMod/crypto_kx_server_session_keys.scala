package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_kx_server_session_keys")
@js.native
object crypto_kx_server_session_keys extends js.Object {
  def apply(serverPublicKey: Uint8Array, serverSecretKey: Uint8Array, clientPublicKey: Uint8Array): StringCryptoKX = js.native
  def apply(
    serverPublicKey: Uint8Array,
    serverSecretKey: Uint8Array,
    clientPublicKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = js.native
  def apply(
    serverPublicKey: Uint8Array,
    serverSecretKey: Uint8Array,
    clientPublicKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = js.native
}

