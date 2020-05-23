package typings.libsodiumWrappers.mod

import typings.libsodiumWrappers.anon.Header
import typings.libsodiumWrappers.anon.State
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_secretstream_xchacha20poly1305_init_push")
@js.native
object cryptoSecretstreamXchacha20poly1305InitPush extends js.Object {
  def apply(key: Uint8Array): Header = js.native
  def apply(key: Uint8Array, outputFormat: StringOutputFormat): State = js.native
  def apply(key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Header = js.native
}

