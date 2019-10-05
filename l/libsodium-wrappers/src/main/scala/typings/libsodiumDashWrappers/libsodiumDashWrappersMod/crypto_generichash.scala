package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_generichash")
@js.native
object crypto_generichash extends js.Object {
  def apply(): Uint8Array = js.native
  def apply(hash_length: Double): Uint8Array = js.native
  def apply(hash_length: Double, message: String): Uint8Array = js.native
  def apply(hash_length: Double, message: String, key: String): Uint8Array = js.native
  def apply(hash_length: Double, message: String, key: String, outputFormat: StringOutputFormat): String = js.native
  def apply(hash_length: Double, message: String, key: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def apply(hash_length: Double, message: String, key: Null, outputFormat: StringOutputFormat): String = js.native
  def apply(hash_length: Double, message: String, key: Null, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def apply(hash_length: Double, message: String, key: Uint8Array): Uint8Array = js.native
  def apply(hash_length: Double, message: String, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(hash_length: Double, message: String, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def apply(hash_length: Double, message: Uint8Array): Uint8Array = js.native
  def apply(hash_length: Double, message: Uint8Array, key: String): Uint8Array = js.native
  def apply(hash_length: Double, message: Uint8Array, key: String, outputFormat: StringOutputFormat): String = js.native
  def apply(hash_length: Double, message: Uint8Array, key: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def apply(hash_length: Double, message: Uint8Array, key: Null, outputFormat: StringOutputFormat): String = js.native
  def apply(hash_length: Double, message: Uint8Array, key: Null, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def apply(hash_length: Double, message: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def apply(hash_length: Double, message: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(hash_length: Double, message: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}

