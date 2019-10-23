package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_generichash_update")
@js.native
object crypto_generichash_update extends js.Object {
  def apply(state_address: StateAddress, message_chunk: String): Unit = js.native
  def apply(state_address: StateAddress, message_chunk: Uint8Array): Unit = js.native
}

