package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.libsodiumDashWrappers.Anon_Header
import typings.libsodiumDashWrappers.Anon_HeaderState
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_secretstream_xchacha20poly1305_init_push")
@js.native
object crypto_secretstream_xchacha20poly1305_init_push extends js.Object {
  def apply(key: Uint8Array): Anon_Header = js.native
  def apply(key: Uint8Array, outputFormat: StringOutputFormat): Anon_HeaderState = js.native
  def apply(key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Anon_Header = js.native
}

