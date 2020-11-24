package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_box_beforenm")
@js.native
object cryptoBoxBeforenm extends js.Object {
  
  def apply(publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  def apply(publicKey: Uint8Array, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(publicKey: Uint8Array, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}
