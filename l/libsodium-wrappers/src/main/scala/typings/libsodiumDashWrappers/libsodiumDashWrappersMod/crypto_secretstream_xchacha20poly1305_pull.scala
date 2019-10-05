package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.libsodiumDashWrappers.Anon_Message
import typings.libsodiumDashWrappers.Anon_MessageTag
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_secretstream_xchacha20poly1305_pull")
@js.native
object crypto_secretstream_xchacha20poly1305_pull extends js.Object {
  def apply(state_address: secretstream_xchacha20poly1305_state_address, cipher: String): Anon_Message = js.native
  def apply(state_address: secretstream_xchacha20poly1305_state_address, cipher: String, ad: String): Anon_Message = js.native
  def apply(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: String,
    ad: String,
    outputFormat: StringOutputFormat
  ): Anon_MessageTag = js.native
  def apply(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: String,
    ad: String,
    outputFormat: Uint8ArrayOutputFormat
  ): Anon_Message = js.native
  def apply(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: String,
    ad: Null,
    outputFormat: StringOutputFormat
  ): Anon_MessageTag = js.native
  def apply(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: String,
    ad: Null,
    outputFormat: Uint8ArrayOutputFormat
  ): Anon_Message = js.native
  def apply(state_address: secretstream_xchacha20poly1305_state_address, cipher: String, ad: Uint8Array): Anon_Message = js.native
  def apply(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: String,
    ad: Uint8Array,
    outputFormat: StringOutputFormat
  ): Anon_MessageTag = js.native
  def apply(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: String,
    ad: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Anon_Message = js.native
  def apply(state_address: secretstream_xchacha20poly1305_state_address, cipher: Uint8Array): Anon_Message = js.native
  def apply(state_address: secretstream_xchacha20poly1305_state_address, cipher: Uint8Array, ad: String): Anon_Message = js.native
  def apply(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: Uint8Array,
    ad: String,
    outputFormat: StringOutputFormat
  ): Anon_MessageTag = js.native
  def apply(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: Uint8Array,
    ad: String,
    outputFormat: Uint8ArrayOutputFormat
  ): Anon_Message = js.native
  def apply(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: Uint8Array,
    ad: Null,
    outputFormat: StringOutputFormat
  ): Anon_MessageTag = js.native
  def apply(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: Uint8Array,
    ad: Null,
    outputFormat: Uint8ArrayOutputFormat
  ): Anon_Message = js.native
  def apply(state_address: secretstream_xchacha20poly1305_state_address, cipher: Uint8Array, ad: Uint8Array): Anon_Message = js.native
  def apply(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: Uint8Array,
    ad: Uint8Array,
    outputFormat: StringOutputFormat
  ): Anon_MessageTag = js.native
  def apply(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: Uint8Array,
    ad: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Anon_Message = js.native
}

