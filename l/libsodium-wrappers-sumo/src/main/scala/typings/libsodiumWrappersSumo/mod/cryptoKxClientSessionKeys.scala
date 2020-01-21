package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.CryptoKX
import typings.libsodiumWrappers.mod.StringCryptoKX
import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_kx_client_session_keys")
@js.native
object cryptoKxClientSessionKeys extends js.Object {
  def apply(clientPublicKey: Uint8Array, clientSecretKey: Uint8Array, serverPublicKey: Uint8Array): CryptoKX = js.native
  def apply(
    clientPublicKey: Uint8Array,
    clientSecretKey: Uint8Array,
    serverPublicKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = js.native
  def apply(
    clientPublicKey: Uint8Array,
    clientSecretKey: Uint8Array,
    serverPublicKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = js.native
}

