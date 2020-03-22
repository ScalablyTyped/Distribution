package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.AnonHeader
import typings.libsodiumWrappers.AnonState
import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_init_push")
@js.native
object cryptoSecretstreamXchacha20poly1305InitPush extends js.Object {
  def apply(key: Uint8Array): AnonHeader = js.native
  def apply(key: Uint8Array, outputFormat: StringOutputFormat): AnonState = js.native
  def apply(key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): AnonHeader = js.native
}

