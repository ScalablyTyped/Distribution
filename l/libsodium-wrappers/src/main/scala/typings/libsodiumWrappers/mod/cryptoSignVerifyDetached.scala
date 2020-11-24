package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers", "crypto_sign_verify_detached")
@js.native
object cryptoSignVerifyDetached extends js.Object {
  
  def apply(signature: Uint8Array, message: String, publicKey: Uint8Array): Boolean = js.native
  def apply(signature: Uint8Array, message: Uint8Array, publicKey: Uint8Array): Boolean = js.native
}
