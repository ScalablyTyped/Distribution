package typings.libsodiumWrappersSumo.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_verify")
@js.native
object cryptoOnetimeauthVerify extends js.Object {
  def apply(hash: Uint8Array, message: String, key: Uint8Array): Boolean = js.native
  def apply(hash: Uint8Array, message: Uint8Array, key: Uint8Array): Boolean = js.native
}

