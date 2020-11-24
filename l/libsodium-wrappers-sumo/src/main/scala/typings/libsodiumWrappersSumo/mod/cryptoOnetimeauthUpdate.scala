package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StateAddress
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_update")
@js.native
object cryptoOnetimeauthUpdate extends js.Object {
  
  def apply(stateAddress: StateAddress, message_chunk: String): Unit = js.native
  def apply(stateAddress: StateAddress, message_chunk: Uint8Array): Unit = js.native
}
