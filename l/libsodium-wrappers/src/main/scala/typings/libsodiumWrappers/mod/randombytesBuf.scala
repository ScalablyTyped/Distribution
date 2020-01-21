package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "randombytes_buf")
@js.native
object randombytesBuf extends js.Object {
  def apply(length: Double): Uint8Array = js.native
  def apply(length: Double, outputFormat: StringOutputFormat): String = js.native
  def apply(length: Double, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}

