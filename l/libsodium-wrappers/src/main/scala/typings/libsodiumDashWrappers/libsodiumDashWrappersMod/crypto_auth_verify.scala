package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_auth_verify")
@js.native
object crypto_auth_verify extends js.Object {
  def apply(tag: Uint8Array, message: String, key: Uint8Array): Boolean = js.native
  def apply(tag: Uint8Array, message: Uint8Array, key: Uint8Array): Boolean = js.native
}

