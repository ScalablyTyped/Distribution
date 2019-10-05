package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_sign_final_verify")
@js.native
object crypto_sign_final_verify extends js.Object {
  def apply(state_address: sign_state_address, signature: Uint8Array, publicKey: Uint8Array): Boolean = js.native
}

