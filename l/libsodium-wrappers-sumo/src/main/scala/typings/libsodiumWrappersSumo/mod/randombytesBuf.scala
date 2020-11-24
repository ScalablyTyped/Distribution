package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "randombytes_buf")
@js.native
object randombytesBuf extends js.Object {
  
  def apply(length: Double): Uint8Array = js.native
  def apply(length: Double, outputFormat: StringOutputFormat): String = js.native
  def apply(length: Double, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}
