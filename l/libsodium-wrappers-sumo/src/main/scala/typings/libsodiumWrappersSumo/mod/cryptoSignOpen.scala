package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_sign_open")
@js.native
object cryptoSignOpen extends js.Object {
  
  def apply(signedMessage: String, publicKey: Uint8Array): Uint8Array = js.native
  def apply(signedMessage: String, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(signedMessage: String, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def apply(signedMessage: Uint8Array, publicKey: Uint8Array): Uint8Array = js.native
  def apply(signedMessage: Uint8Array, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(signedMessage: Uint8Array, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}
