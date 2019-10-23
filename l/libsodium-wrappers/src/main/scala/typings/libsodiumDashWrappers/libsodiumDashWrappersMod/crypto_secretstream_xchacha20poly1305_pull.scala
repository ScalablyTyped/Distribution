package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_secretstream_xchacha20poly1305_pull")
@js.native
object crypto_secretstream_xchacha20poly1305_pull extends js.Object {
  def apply(state_address: StateAddress, cipher: String): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: String, ad: String): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: String, ad: String, outputFormat: StringOutputFormat): StringMessageTag = js.native
  def apply(state_address: StateAddress, cipher: String, ad: String, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: String, ad: Null, outputFormat: StringOutputFormat): StringMessageTag = js.native
  def apply(state_address: StateAddress, cipher: String, ad: Null, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: String, ad: Uint8Array): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: String, ad: Uint8Array, outputFormat: StringOutputFormat): StringMessageTag = js.native
  def apply(state_address: StateAddress, cipher: String, ad: Uint8Array, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: Uint8Array): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: Uint8Array, ad: String): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: Uint8Array, ad: String, outputFormat: StringOutputFormat): StringMessageTag = js.native
  def apply(state_address: StateAddress, cipher: Uint8Array, ad: String, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: Uint8Array, ad: Null, outputFormat: StringOutputFormat): StringMessageTag = js.native
  def apply(state_address: StateAddress, cipher: Uint8Array, ad: Null, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: Uint8Array, ad: Uint8Array): MessageTag = js.native
  def apply(state_address: StateAddress, cipher: Uint8Array, ad: Uint8Array, outputFormat: StringOutputFormat): StringMessageTag = js.native
  def apply(
    state_address: StateAddress,
    cipher: Uint8Array,
    ad: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = js.native
}

