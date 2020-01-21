package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_sk_to_curve25519")
@js.native
object cryptoSignEd25519SkToCurve25519 extends js.Object {
  def apply(edSk: Uint8Array): Uint8Array = js.native
  def apply(edSk: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(edSk: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}

