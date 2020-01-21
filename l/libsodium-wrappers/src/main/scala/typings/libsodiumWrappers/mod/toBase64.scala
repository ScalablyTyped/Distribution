package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "to_base64")
@js.native
object toBase64 extends js.Object {
  def apply(input: String): String = js.native
  def apply(input: String, variant: base64Variants): String = js.native
  def apply(input: Uint8Array): String = js.native
  def apply(input: Uint8Array, variant: base64Variants): String = js.native
}

