package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_sub")
@js.native
object cryptoCoreRistretto255ScalarSub extends js.Object {
  def apply(x: Uint8Array, y: Uint8Array): Uint8Array = js.native
  def apply(x: Uint8Array, y: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(x: Uint8Array, y: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}

