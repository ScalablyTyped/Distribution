package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers", "crypto_scalarmult")
@js.native
object cryptoScalarmult extends js.Object {
  
  def apply(privateKey: Uint8Array, publicKey: Uint8Array): Uint8Array = js.native
  def apply(privateKey: Uint8Array, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(privateKey: Uint8Array, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}
