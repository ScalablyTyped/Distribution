package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "from_base64")
@js.native
object fromBase64 extends js.Object {
  def apply(input: String): Uint8Array = js.native
  def apply(input: String, variant: base64Variants): Uint8Array = js.native
}

