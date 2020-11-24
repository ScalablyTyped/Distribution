package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_sk_to_seed")
@js.native
object cryptoSignEd25519SkToSeed extends js.Object {
  
  def apply(privateKey: Uint8Array): Uint8Array = js.native
  def apply(privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}
