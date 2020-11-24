package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_pwhash")
@js.native
object cryptoPwhash extends js.Object {
  
  def apply(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
}
