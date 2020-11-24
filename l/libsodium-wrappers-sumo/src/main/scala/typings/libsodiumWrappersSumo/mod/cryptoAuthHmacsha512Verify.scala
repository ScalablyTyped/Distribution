package typings.libsodiumWrappersSumo.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512_verify")
@js.native
object cryptoAuthHmacsha512Verify extends js.Object {
  
  def apply(tag: Uint8Array, message: String, key: Uint8Array): Boolean = js.native
  def apply(tag: Uint8Array, message: Uint8Array, key: Uint8Array): Boolean = js.native
}
