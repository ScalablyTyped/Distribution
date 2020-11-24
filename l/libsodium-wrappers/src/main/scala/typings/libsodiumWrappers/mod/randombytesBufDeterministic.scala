package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers", "randombytes_buf_deterministic")
@js.native
object randombytesBufDeterministic extends js.Object {
  
  def apply(length: Double, seed: Uint8Array): Uint8Array = js.native
  def apply(length: Double, seed: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(length: Double, seed: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}
