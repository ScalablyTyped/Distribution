package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StateAddress
import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_final")
@js.native
object cryptoOnetimeauthFinal extends js.Object {
  
  def apply(stateAddress: StateAddress): Uint8Array = js.native
  def apply(stateAddress: StateAddress, outputFormat: StringOutputFormat): String = js.native
  def apply(stateAddress: StateAddress, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}
