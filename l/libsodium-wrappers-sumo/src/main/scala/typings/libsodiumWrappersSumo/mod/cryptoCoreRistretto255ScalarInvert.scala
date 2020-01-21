package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_invert")
@js.native
object cryptoCoreRistretto255ScalarInvert extends js.Object {
  def apply(scalar: String): Uint8Array = js.native
  def apply(scalar: String, outputFormat: StringOutputFormat): String = js.native
  def apply(scalar: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def apply(scalar: Uint8Array): Uint8Array = js.native
  def apply(scalar: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(scalar: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}

