package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_add")
@js.native
object cryptoCoreRistretto255Add extends js.Object {
  def apply(p: Uint8Array, q: Uint8Array): Uint8Array = js.native
  def apply(p: Uint8Array, q: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(p: Uint8Array, q: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}

