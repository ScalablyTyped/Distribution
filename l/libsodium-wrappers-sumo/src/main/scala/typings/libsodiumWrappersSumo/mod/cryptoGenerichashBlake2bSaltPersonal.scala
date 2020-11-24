package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_salt_personal")
@js.native
object cryptoGenerichashBlake2bSaltPersonal extends js.Object {
  
  def apply(subkey_len: Double, key: String, id: Uint8Array, ctx: Uint8Array): Uint8Array = js.native
  def apply(subkey_len: Double, key: String, id: Uint8Array, ctx: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(
    subkey_len: Double,
    key: String,
    id: Uint8Array,
    ctx: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def apply(subkey_len: Double, key: Null, id: Uint8Array, ctx: Uint8Array): Uint8Array = js.native
  def apply(subkey_len: Double, key: Null, id: Uint8Array, ctx: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(
    subkey_len: Double,
    key: Null,
    id: Uint8Array,
    ctx: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def apply(subkey_len: Double, key: Uint8Array, id: Uint8Array, ctx: Uint8Array): Uint8Array = js.native
  def apply(
    subkey_len: Double,
    key: Uint8Array,
    id: Uint8Array,
    ctx: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    subkey_len: Double,
    key: Uint8Array,
    id: Uint8Array,
    ctx: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
}
