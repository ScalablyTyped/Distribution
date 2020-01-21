package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_ll")
@js.native
object cryptoPwhashScryptsalsa208sha256Ll extends js.Object {
  def apply(password: String, salt: String, opsLimit: Double, r: Double, p: Double, keyLength: Double): Uint8Array = js.native
  def apply(
    password: String,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    password: String,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def apply(password: String, salt: Uint8Array, opsLimit: Double, r: Double, p: Double, keyLength: Double): Uint8Array = js.native
  def apply(
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def apply(password: Uint8Array, salt: String, opsLimit: Double, r: Double, p: Double, keyLength: Double): Uint8Array = js.native
  def apply(
    password: Uint8Array,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    password: Uint8Array,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def apply(password: Uint8Array, salt: Uint8Array, opsLimit: Double, r: Double, p: Double, keyLength: Double): Uint8Array = js.native
  def apply(
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
}

