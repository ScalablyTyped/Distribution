package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
@js.native
object cryptoAeadChacha20poly1305IetfEncryptDetached extends js.Object {
  def apply(
    message: String | Uint8Array,
    additional_data: String | Uint8Array | Null,
    secret_nonce: String | Uint8Array | Null,
    public_nonce: Uint8Array,
    key: Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: String | Uint8Array,
    additional_data: String | Uint8Array | Null,
    secret_nonce: String | Uint8Array | Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
}

