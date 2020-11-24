package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StateAddress
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512_update")
@js.native
object cryptoHashSha512Update extends js.Object {
  
  def apply(stateAddress: StateAddress, message: Uint8Array): Unit = js.native
}
