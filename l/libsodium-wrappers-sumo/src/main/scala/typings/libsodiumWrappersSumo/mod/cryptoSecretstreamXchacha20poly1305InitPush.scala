package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.anon.Header
import typings.libsodiumWrappers.anon.State
import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_init_push")
@js.native
object cryptoSecretstreamXchacha20poly1305InitPush extends js.Object {
  def apply(key: Uint8Array): Header = js.native
  def apply(key: Uint8Array, outputFormat: StringOutputFormat): State = js.native
  def apply(key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Header = js.native
}

