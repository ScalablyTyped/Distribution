package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_sign_final_create")
@js.native
object crypto_sign_final_create extends js.Object {
  def apply(state_address: sign_state_address, privateKey: Uint8Array): Uint8Array = js.native
  def apply(state_address: sign_state_address, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(state_address: sign_state_address, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}

