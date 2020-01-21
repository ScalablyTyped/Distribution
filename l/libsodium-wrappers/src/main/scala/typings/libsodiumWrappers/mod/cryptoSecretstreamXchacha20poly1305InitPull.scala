package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_secretstream_xchacha20poly1305_init_pull")
@js.native
object cryptoSecretstreamXchacha20poly1305InitPull extends js.Object {
  def apply(header: Uint8Array, key: Uint8Array): StateAddress = js.native
}

