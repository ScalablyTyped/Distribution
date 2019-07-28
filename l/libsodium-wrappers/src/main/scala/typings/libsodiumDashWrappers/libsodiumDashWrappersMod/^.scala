package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.libsodiumDashWrappers.Anon_Header
import typings.libsodiumDashWrappers.Anon_HeaderState
import typings.libsodiumDashWrappers.Anon_Message
import typings.libsodiumDashWrappers.Anon_MessageTag
import typings.libsodiumDashWrappers.libsodiumDashWrappersNumbers.`true`
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val SODIUM_LIBRARY_VERSION_MAJOR: Double = js.native
  val SODIUM_LIBRARY_VERSION_MINOR: Double = js.native
  val SODIUM_VERSION_STRING: String = js.native
  val crypto_aead_chacha20poly1305_ABYTES: Double = js.native
  val crypto_aead_chacha20poly1305_KEYBYTES: Double = js.native
  val crypto_aead_chacha20poly1305_MESSAGEBYTES_MAX: Double = js.native
  val crypto_aead_chacha20poly1305_NPUBBYTES: Double = js.native
  val crypto_aead_chacha20poly1305_NSECBYTES: Double = js.native
  val crypto_aead_chacha20poly1305_ietf_ABYTES: Double = js.native
  val crypto_aead_chacha20poly1305_ietf_KEYBYTES: Double = js.native
  val crypto_aead_chacha20poly1305_ietf_MESSAGEBYTES_MAX: Double = js.native
  val crypto_aead_chacha20poly1305_ietf_NPUBBYTES: Double = js.native
  val crypto_aead_chacha20poly1305_ietf_NSECBYTES: Double = js.native
  val crypto_aead_xchacha20poly1305_ietf_ABYTES: Double = js.native
  val crypto_aead_xchacha20poly1305_ietf_KEYBYTES: Double = js.native
  val crypto_aead_xchacha20poly1305_ietf_MESSAGEBYTES_MAX: Double = js.native
  val crypto_aead_xchacha20poly1305_ietf_NPUBBYTES: Double = js.native
  val crypto_aead_xchacha20poly1305_ietf_NSECBYTES: Double = js.native
  val crypto_auth_BYTES: Double = js.native
  val crypto_auth_KEYBYTES: Double = js.native
  val crypto_box_BEFORENMBYTES: Double = js.native
  val crypto_box_MACBYTES: Double = js.native
  val crypto_box_MESSAGEBYTES_MAX: Double = js.native
  val crypto_box_NONCEBYTES: Double = js.native
  val crypto_box_PUBLICKEYBYTES: Double = js.native
  val crypto_box_SEALBYTES: Double = js.native
  val crypto_box_SECRETKEYBYTES: Double = js.native
  val crypto_box_SEEDBYTES: Double = js.native
  val crypto_core_hchacha20_CONSTBYTES: Double = js.native
  val crypto_core_hchacha20_INPUTBYTES: Double = js.native
  val crypto_core_hchacha20_KEYBYTES: Double = js.native
  val crypto_core_hchacha20_OUTPUTBYTES: Double = js.native
  val crypto_generichash_BYTES: Double = js.native
  val crypto_generichash_BYTES_MAX: Double = js.native
  val crypto_generichash_BYTES_MIN: Double = js.native
  val crypto_generichash_KEYBYTES: Double = js.native
  val crypto_generichash_KEYBYTES_MAX: Double = js.native
  val crypto_generichash_KEYBYTES_MIN: Double = js.native
  val crypto_hash_BYTES: Double = js.native
  val crypto_kdf_BYTES_MAX: Double = js.native
  val crypto_kdf_BYTES_MIN: Double = js.native
  val crypto_kdf_CONTEXTBYTES: Double = js.native
  val crypto_kdf_KEYBYTES: Double = js.native
  val crypto_kx_PUBLICKEYBYTES: Double = js.native
  val crypto_kx_SECRETKEYBYTES: Double = js.native
  val crypto_kx_SEEDBYTES: Double = js.native
  val crypto_kx_SESSIONKEYBYTES: Double = js.native
  val crypto_pwhash_ALG_ARGON2I13: Double = js.native
  val crypto_pwhash_ALG_ARGON2ID13: Double = js.native
  val crypto_pwhash_ALG_DEFAULT: Double = js.native
  val crypto_pwhash_BYTES_MAX: Double = js.native
  val crypto_pwhash_BYTES_MIN: Double = js.native
  val crypto_pwhash_MEMLIMIT_INTERACTIVE: Double = js.native
  val crypto_pwhash_MEMLIMIT_MAX: Double = js.native
  val crypto_pwhash_MEMLIMIT_MIN: Double = js.native
  val crypto_pwhash_MEMLIMIT_MODERATE: Double = js.native
  val crypto_pwhash_MEMLIMIT_SENSITIVE: Double = js.native
  val crypto_pwhash_OPSLIMIT_INTERACTIVE: Double = js.native
  val crypto_pwhash_OPSLIMIT_MAX: Double = js.native
  val crypto_pwhash_OPSLIMIT_MIN: Double = js.native
  val crypto_pwhash_OPSLIMIT_MODERATE: Double = js.native
  val crypto_pwhash_OPSLIMIT_SENSITIVE: Double = js.native
  val crypto_pwhash_PASSWD_MAX: Double = js.native
  val crypto_pwhash_PASSWD_MIN: Double = js.native
  val crypto_pwhash_SALTBYTES: Double = js.native
  val crypto_pwhash_STRBYTES: Double = js.native
  val crypto_pwhash_STRPREFIX: String = js.native
  val crypto_pwhash_STR_VERIFY: Double = js.native
  val crypto_scalarmult_BYTES: Double = js.native
  val crypto_scalarmult_SCALARBYTES: Double = js.native
  val crypto_secretbox_KEYBYTES: Double = js.native
  val crypto_secretbox_MACBYTES: Double = js.native
  val crypto_secretbox_MESSAGEBYTES_MAX: Double = js.native
  val crypto_secretbox_NONCEBYTES: Double = js.native
  val crypto_secretstream_xchacha20poly1305_ABYTES: Double = js.native
  val crypto_secretstream_xchacha20poly1305_HEADERBYTES: Double = js.native
  val crypto_secretstream_xchacha20poly1305_KEYBYTES: Double = js.native
  val crypto_secretstream_xchacha20poly1305_MESSAGEBYTES_MAX: Double = js.native
  val crypto_secretstream_xchacha20poly1305_MESSAGESBYTES_MAX: Double = js.native
  val crypto_secretstream_xchacha20poly1305_NPUBBYTES: Double = js.native
  val crypto_secretstream_xchacha20poly1305_TAG_FINAL: Double = js.native
  val crypto_secretstream_xchacha20poly1305_TAG_MESSAGE: Double = js.native
  val crypto_secretstream_xchacha20poly1305_TAG_PUSH: Double = js.native
  val crypto_secretstream_xchacha20poly1305_TAG_REKEY: Double = js.native
  val crypto_shorthash_BYTES: Double = js.native
  val crypto_shorthash_KEYBYTES: Double = js.native
  val crypto_sign_BYTES: Double = js.native
  val crypto_sign_MESSAGEBYTES_MAX: Double = js.native
  val crypto_sign_PUBLICKEYBYTES: Double = js.native
  val crypto_sign_SECRETKEYBYTES: Double = js.native
  val crypto_sign_SEEDBYTES: Double = js.native
  val crypto_stream_MESSAGEBYTES_MAX: Double = js.native
  val crypto_stream_chacha20_ietf_MESSAGEBYTES_MAX: Double = js.native
  val crypto_stream_xchacha20_MESSAGEBYTES_MAX: Double = js.native
  val randombytes_SEEDBYTES: Double = js.native
  val ready: js.Promise[Unit] = js.native
  def add(a: Uint8Array, b: Uint8Array): Unit = js.native
  def compare(b1: Uint8Array, b2: Uint8Array): Double = js.native
  def crypto_aead_chacha20poly1305_decrypt(
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    ciphertext: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSName("crypto_aead_chacha20poly1305_decrypt")
  def crypto_aead_chacha20poly1305_decrypt_String(
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    ciphertext: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[StringOutputFormat | Null]
  ): String = js.native
  def crypto_aead_chacha20poly1305_decrypt_detached(
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    ciphertext: js.UndefOr[String | Uint8Array],
    mac: js.UndefOr[Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSName("crypto_aead_chacha20poly1305_decrypt_detached")
  def crypto_aead_chacha20poly1305_decrypt_detached_String(
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    ciphertext: js.UndefOr[String | Uint8Array],
    mac: js.UndefOr[Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[StringOutputFormat | Null]
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt(
    message: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSName("crypto_aead_chacha20poly1305_encrypt")
  def crypto_aead_chacha20poly1305_encrypt_String(
    message: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[StringOutputFormat | Null]
  ): String = js.native
  def crypto_aead_chacha20poly1305_encrypt_detached(
    message: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): CryptoBox = js.native
  @JSName("crypto_aead_chacha20poly1305_encrypt_detached")
  def crypto_aead_chacha20poly1305_encrypt_detached_StringCryptoBox(
    message: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[StringOutputFormat | Null]
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt(
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    ciphertext: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSName("crypto_aead_chacha20poly1305_ietf_decrypt")
  def crypto_aead_chacha20poly1305_ietf_decrypt_String(
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    ciphertext: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[StringOutputFormat | Null]
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached(
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    ciphertext: js.UndefOr[String | Uint8Array],
    mac: js.UndefOr[Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSName("crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  def crypto_aead_chacha20poly1305_ietf_decrypt_detached_String(
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    ciphertext: js.UndefOr[String | Uint8Array],
    mac: js.UndefOr[Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[StringOutputFormat | Null]
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt(
    message: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSName("crypto_aead_chacha20poly1305_ietf_encrypt")
  def crypto_aead_chacha20poly1305_ietf_encrypt_String(
    message: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[StringOutputFormat | Null]
  ): String = js.native
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached(
    message: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): CryptoBox = js.native
  @JSName("crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  def crypto_aead_chacha20poly1305_ietf_encrypt_detached_StringCryptoBox(
    message: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[StringOutputFormat | Null]
  ): StringCryptoBox = js.native
  def crypto_aead_chacha20poly1305_ietf_keygen(): Uint8Array = js.native
  def crypto_aead_chacha20poly1305_ietf_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_aead_chacha20poly1305_ietf_keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_aead_chacha20poly1305_ietf_keygen")
  def crypto_aead_chacha20poly1305_ietf_keygen_String(): String = js.native
  def crypto_aead_chacha20poly1305_keygen(): Uint8Array = js.native
  def crypto_aead_chacha20poly1305_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_aead_chacha20poly1305_keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_aead_chacha20poly1305_keygen")
  def crypto_aead_chacha20poly1305_keygen_String(): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt(
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    ciphertext: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSName("crypto_aead_xchacha20poly1305_ietf_decrypt")
  def crypto_aead_xchacha20poly1305_ietf_decrypt_String(
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    ciphertext: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[StringOutputFormat | Null]
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached(
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    ciphertext: js.UndefOr[String | Uint8Array],
    mac: js.UndefOr[Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSName("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  def crypto_aead_xchacha20poly1305_ietf_decrypt_detached_String(
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    ciphertext: js.UndefOr[String | Uint8Array],
    mac: js.UndefOr[Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[StringOutputFormat | Null]
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt(
    message: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSName("crypto_aead_xchacha20poly1305_ietf_encrypt")
  def crypto_aead_xchacha20poly1305_ietf_encrypt_String(
    message: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[StringOutputFormat | Null]
  ): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached(
    message: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): CryptoBox = js.native
  @JSName("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  def crypto_aead_xchacha20poly1305_ietf_encrypt_detached_StringCryptoBox(
    message: js.UndefOr[String | Uint8Array],
    additional_data: js.UndefOr[String | Uint8Array | Null],
    secret_nonce: js.UndefOr[String | Uint8Array | Null],
    public_nonce: js.UndefOr[Uint8Array],
    key: js.UndefOr[Uint8Array],
    outputFormat: js.UndefOr[StringOutputFormat | Null]
  ): StringCryptoBox = js.native
  def crypto_aead_xchacha20poly1305_ietf_keygen(): Uint8Array = js.native
  def crypto_aead_xchacha20poly1305_ietf_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_aead_xchacha20poly1305_ietf_keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_aead_xchacha20poly1305_ietf_keygen")
  def crypto_aead_xchacha20poly1305_ietf_keygen_String(): String = js.native
  def crypto_auth(message: String, key: Uint8Array): Uint8Array = js.native
  def crypto_auth(message: String, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_auth(message: String, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_auth(message: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def crypto_auth(message: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_auth(message: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_auth")
  def crypto_auth_String(message: String, key: Uint8Array): String = js.native
  @JSName("crypto_auth")
  def crypto_auth_String(message: Uint8Array, key: Uint8Array): String = js.native
  def crypto_auth_keygen(): Uint8Array = js.native
  def crypto_auth_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_auth_keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_auth_keygen")
  def crypto_auth_keygen_String(): String = js.native
  def crypto_auth_verify(tag: Uint8Array, message: String, key: Uint8Array): Boolean = js.native
  def crypto_auth_verify(tag: Uint8Array, message: Uint8Array, key: Uint8Array): Boolean = js.native
  def crypto_box_beforenm(publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  def crypto_box_beforenm(publicKey: Uint8Array, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_box_beforenm(publicKey: Uint8Array, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_box_beforenm")
  def crypto_box_beforenm_String(publicKey: Uint8Array, privateKey: Uint8Array): String = js.native
  def crypto_box_detached(message: String, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): CryptoBox = js.native
  def crypto_box_detached(
    message: String,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_box_detached(
    message: String,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def crypto_box_detached(message: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): CryptoBox = js.native
  def crypto_box_detached(
    message: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def crypto_box_detached(
    message: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  @JSName("crypto_box_detached")
  def crypto_box_detached_StringCryptoBox(message: String, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): StringCryptoBox = js.native
  @JSName("crypto_box_detached")
  def crypto_box_detached_StringCryptoBox(message: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): StringCryptoBox = js.native
  def crypto_box_easy(message: String, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  def crypto_box_easy(
    message: String,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_easy(
    message: String,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def crypto_box_easy(message: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  def crypto_box_easy(
    message: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_easy(
    message: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSName("crypto_box_easy")
  def crypto_box_easy_String(message: String, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): String = js.native
  @JSName("crypto_box_easy")
  def crypto_box_easy_String(message: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): String = js.native
  def crypto_box_easy_afternm(message: String, nonce: Uint8Array, sharedKey: Uint8Array): Uint8Array = js.native
  def crypto_box_easy_afternm(message: String, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_box_easy_afternm(message: String, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_box_easy_afternm(message: Uint8Array, nonce: Uint8Array, sharedKey: Uint8Array): Uint8Array = js.native
  def crypto_box_easy_afternm(message: Uint8Array, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_box_easy_afternm(
    message: Uint8Array,
    nonce: Uint8Array,
    sharedKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSName("crypto_box_easy_afternm")
  def crypto_box_easy_afternm_String(message: String, nonce: Uint8Array, sharedKey: Uint8Array): String = js.native
  @JSName("crypto_box_easy_afternm")
  def crypto_box_easy_afternm_String(message: Uint8Array, nonce: Uint8Array, sharedKey: Uint8Array): String = js.native
  def crypto_box_keypair(): StringKeyPair = js.native
  def crypto_box_keypair(outputFormat: StringOutputFormat): StringKeyPair = js.native
  def crypto_box_keypair(outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  @JSName("crypto_box_keypair")
  def crypto_box_keypair_KeyPair(): KeyPair = js.native
  def crypto_box_open_detached(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array
  ): Uint8Array = js.native
  def crypto_box_open_detached(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_open_detached(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def crypto_box_open_detached(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array
  ): Uint8Array = js.native
  def crypto_box_open_detached(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_open_detached(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSName("crypto_box_open_detached")
  def crypto_box_open_detached_String(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array
  ): String = js.native
  @JSName("crypto_box_open_detached")
  def crypto_box_open_detached_String(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array
  ): String = js.native
  def crypto_box_open_easy(ciphertext: String, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  def crypto_box_open_easy(
    ciphertext: String,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_open_easy(
    ciphertext: String,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def crypto_box_open_easy(ciphertext: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  def crypto_box_open_easy(
    ciphertext: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_open_easy(
    ciphertext: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSName("crypto_box_open_easy")
  def crypto_box_open_easy_String(ciphertext: String, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): String = js.native
  @JSName("crypto_box_open_easy")
  def crypto_box_open_easy_String(ciphertext: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): String = js.native
  def crypto_box_open_easy_afternm(ciphertext: String, nonce: Uint8Array, sharedKey: Uint8Array): Uint8Array = js.native
  def crypto_box_open_easy_afternm(ciphertext: String, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_box_open_easy_afternm(ciphertext: String, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_box_open_easy_afternm(ciphertext: Uint8Array, nonce: Uint8Array, sharedKey: Uint8Array): Uint8Array = js.native
  def crypto_box_open_easy_afternm(ciphertext: Uint8Array, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_box_open_easy_afternm(
    ciphertext: Uint8Array,
    nonce: Uint8Array,
    sharedKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSName("crypto_box_open_easy_afternm")
  def crypto_box_open_easy_afternm_String(ciphertext: String, nonce: Uint8Array, sharedKey: Uint8Array): String = js.native
  @JSName("crypto_box_open_easy_afternm")
  def crypto_box_open_easy_afternm_String(ciphertext: Uint8Array, nonce: Uint8Array, sharedKey: Uint8Array): String = js.native
  def crypto_box_seal(message: String, publicKey: Uint8Array): Uint8Array = js.native
  def crypto_box_seal(message: String, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_box_seal(message: String, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_box_seal(message: Uint8Array, publicKey: Uint8Array): Uint8Array = js.native
  def crypto_box_seal(message: Uint8Array, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_box_seal(message: Uint8Array, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_box_seal")
  def crypto_box_seal_String(message: String, publicKey: Uint8Array): String = js.native
  @JSName("crypto_box_seal")
  def crypto_box_seal_String(message: Uint8Array, publicKey: Uint8Array): String = js.native
  def crypto_box_seal_open(ciphertext: String, publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  def crypto_box_seal_open(
    ciphertext: String,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_seal_open(
    ciphertext: String,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def crypto_box_seal_open(ciphertext: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  def crypto_box_seal_open(
    ciphertext: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_box_seal_open(
    ciphertext: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSName("crypto_box_seal_open")
  def crypto_box_seal_open_String(ciphertext: String, publicKey: Uint8Array, privateKey: Uint8Array): String = js.native
  @JSName("crypto_box_seal_open")
  def crypto_box_seal_open_String(ciphertext: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): String = js.native
  def crypto_box_seed_keypair(seed: Uint8Array): StringKeyPair = js.native
  def crypto_box_seed_keypair(seed: Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  def crypto_box_seed_keypair(seed: Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  @JSName("crypto_box_seed_keypair")
  def crypto_box_seed_keypair_KeyPair(seed: Uint8Array): KeyPair = js.native
  def crypto_generichash(): Uint8Array = js.native
  def crypto_generichash(hash_length: Double): Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: String): Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: String, key: String): Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: String, key: String, outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash(hash_length: Double, message: String, key: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: String, key: Null, outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash(hash_length: Double, message: String, key: Null, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: String, key: Uint8Array): Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: String, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash(hash_length: Double, message: String, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array): Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: String): Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: String, outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: Null, outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: Null, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash(hash_length: Double, message: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_generichash")
  def crypto_generichash_String(): String = js.native
  @JSName("crypto_generichash")
  def crypto_generichash_String(hash_length: Double): String = js.native
  @JSName("crypto_generichash")
  def crypto_generichash_String(hash_length: Double, message: String): String = js.native
  @JSName("crypto_generichash")
  def crypto_generichash_String(hash_length: Double, message: String, key: String): String = js.native
  @JSName("crypto_generichash")
  def crypto_generichash_String(hash_length: Double, message: String, key: Uint8Array): String = js.native
  @JSName("crypto_generichash")
  def crypto_generichash_String(hash_length: Double, message: Uint8Array): String = js.native
  @JSName("crypto_generichash")
  def crypto_generichash_String(hash_length: Double, message: Uint8Array, key: String): String = js.native
  @JSName("crypto_generichash")
  def crypto_generichash_String(hash_length: Double, message: Uint8Array, key: Uint8Array): String = js.native
  def crypto_generichash_final(state_address: generichash_state_address, hash_length: Double): Uint8Array = js.native
  def crypto_generichash_final(state_address: generichash_state_address, hash_length: Double, outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash_final(
    state_address: generichash_state_address,
    hash_length: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSName("crypto_generichash_final")
  def crypto_generichash_final_String(state_address: generichash_state_address, hash_length: Double): String = js.native
  def crypto_generichash_init(): state_address = js.native
  def crypto_generichash_init(key: String): state_address = js.native
  def crypto_generichash_init(key: String, hash_length: Double): state_address = js.native
  def crypto_generichash_init(key: Null, hash_length: Double): state_address = js.native
  def crypto_generichash_init(key: Uint8Array): state_address = js.native
  def crypto_generichash_init(key: Uint8Array, hash_length: Double): state_address = js.native
  def crypto_generichash_keygen(): Uint8Array = js.native
  def crypto_generichash_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_generichash_keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_generichash_keygen")
  def crypto_generichash_keygen_String(): String = js.native
  def crypto_generichash_update(state_address: generichash_state_address, message_chunk: String): Unit = js.native
  def crypto_generichash_update(state_address: generichash_state_address, message_chunk: Uint8Array): Unit = js.native
  def crypto_hash(message: String): Uint8Array = js.native
  def crypto_hash(message: String, outputFormat: StringOutputFormat): String = js.native
  def crypto_hash(message: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_hash(message: Uint8Array): Uint8Array = js.native
  def crypto_hash(message: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_hash(message: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_hash")
  def crypto_hash_String(message: String): String = js.native
  @JSName("crypto_hash")
  def crypto_hash_String(message: Uint8Array): String = js.native
  def crypto_kdf_derive_from_key(subkey_len: Double, subkey_id: Double, ctx: String, key: Uint8Array): Uint8Array = js.native
  def crypto_kdf_derive_from_key(
    subkey_len: Double,
    subkey_id: Double,
    ctx: String,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_kdf_derive_from_key(
    subkey_len: Double,
    subkey_id: Double,
    ctx: String,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSName("crypto_kdf_derive_from_key")
  def crypto_kdf_derive_from_key_String(subkey_len: Double, subkey_id: Double, ctx: String, key: Uint8Array): String = js.native
  def crypto_kdf_keygen(): Uint8Array = js.native
  def crypto_kdf_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_kdf_keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_kdf_keygen")
  def crypto_kdf_keygen_String(): String = js.native
  def crypto_kx_client_session_keys(clientPublicKey: Uint8Array, clientSecretKey: Uint8Array, serverPublicKey: Uint8Array): StringCryptoKX = js.native
  def crypto_kx_client_session_keys(
    clientPublicKey: Uint8Array,
    clientSecretKey: Uint8Array,
    serverPublicKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = js.native
  def crypto_kx_client_session_keys(
    clientPublicKey: Uint8Array,
    clientSecretKey: Uint8Array,
    serverPublicKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = js.native
  @JSName("crypto_kx_client_session_keys")
  def crypto_kx_client_session_keys_CryptoKX(clientPublicKey: Uint8Array, clientSecretKey: Uint8Array, serverPublicKey: Uint8Array): CryptoKX = js.native
  def crypto_kx_keypair(): StringKeyPair = js.native
  def crypto_kx_keypair(outputFormat: StringOutputFormat): StringKeyPair = js.native
  def crypto_kx_keypair(outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  @JSName("crypto_kx_keypair")
  def crypto_kx_keypair_KeyPair(): KeyPair = js.native
  def crypto_kx_seed_keypair(seed: Uint8Array): StringKeyPair = js.native
  def crypto_kx_seed_keypair(seed: Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  def crypto_kx_seed_keypair(seed: Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  @JSName("crypto_kx_seed_keypair")
  def crypto_kx_seed_keypair_KeyPair(seed: Uint8Array): KeyPair = js.native
  def crypto_kx_server_session_keys(serverPublicKey: Uint8Array, serverSecretKey: Uint8Array, clientPublicKey: Uint8Array): StringCryptoKX = js.native
  def crypto_kx_server_session_keys(
    serverPublicKey: Uint8Array,
    serverSecretKey: Uint8Array,
    clientPublicKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = js.native
  def crypto_kx_server_session_keys(
    serverPublicKey: Uint8Array,
    serverSecretKey: Uint8Array,
    clientPublicKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = js.native
  @JSName("crypto_kx_server_session_keys")
  def crypto_kx_server_session_keys_CryptoKX(serverPublicKey: Uint8Array, serverSecretKey: Uint8Array, clientPublicKey: Uint8Array): CryptoKX = js.native
  def crypto_pwhash(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): Uint8Array = js.native
  def crypto_pwhash(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_pwhash(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def crypto_pwhash(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): Uint8Array = js.native
  def crypto_pwhash(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_pwhash(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSName("crypto_pwhash")
  def crypto_pwhash_String(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): String = js.native
  @JSName("crypto_pwhash")
  def crypto_pwhash_String(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): String = js.native
  def crypto_pwhash_str(password: String, opsLimit: Double, memLimit: Double): String = js.native
  def crypto_pwhash_str(password: Uint8Array, opsLimit: Double, memLimit: Double): String = js.native
  def crypto_pwhash_str_verify(hashed_password: String, password: String): Boolean = js.native
  def crypto_pwhash_str_verify(hashed_password: String, password: Uint8Array): Boolean = js.native
  def crypto_scalarmult(privateKey: Uint8Array, publicKey: Uint8Array): Uint8Array = js.native
  def crypto_scalarmult(privateKey: Uint8Array, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_scalarmult(privateKey: Uint8Array, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_scalarmult")
  def crypto_scalarmult_String(privateKey: Uint8Array, publicKey: Uint8Array): String = js.native
  def crypto_scalarmult_base(privateKey: Uint8Array): Uint8Array = js.native
  def crypto_scalarmult_base(privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_scalarmult_base(privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_scalarmult_base")
  def crypto_scalarmult_base_String(privateKey: Uint8Array): String = js.native
  def crypto_secretbox_detached(message: String, nonce: Uint8Array, key: Uint8Array): StringSecretBox = js.native
  def crypto_secretbox_detached(message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): StringSecretBox = js.native
  def crypto_secretbox_detached(message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): SecretBox = js.native
  def crypto_secretbox_detached(message: Uint8Array, nonce: Uint8Array, key: Uint8Array): StringSecretBox = js.native
  def crypto_secretbox_detached(message: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): StringSecretBox = js.native
  def crypto_secretbox_detached(message: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): SecretBox = js.native
  @JSName("crypto_secretbox_detached")
  def crypto_secretbox_detached_SecretBox(message: String, nonce: Uint8Array, key: Uint8Array): SecretBox = js.native
  @JSName("crypto_secretbox_detached")
  def crypto_secretbox_detached_SecretBox(message: Uint8Array, nonce: Uint8Array, key: Uint8Array): SecretBox = js.native
  def crypto_secretbox_easy(message: String, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def crypto_secretbox_easy(message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_secretbox_easy(message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_secretbox_easy(message: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def crypto_secretbox_easy(message: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_secretbox_easy(message: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_secretbox_easy")
  def crypto_secretbox_easy_String(message: String, nonce: Uint8Array, key: Uint8Array): String = js.native
  @JSName("crypto_secretbox_easy")
  def crypto_secretbox_easy_String(message: Uint8Array, nonce: Uint8Array, key: Uint8Array): String = js.native
  def crypto_secretbox_keygen(): Uint8Array = js.native
  def crypto_secretbox_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_secretbox_keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_secretbox_keygen")
  def crypto_secretbox_keygen_String(): String = js.native
  def crypto_secretbox_open_detached(ciphertext: String, mac: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def crypto_secretbox_open_detached(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretbox_open_detached(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def crypto_secretbox_open_detached(ciphertext: Uint8Array, mac: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def crypto_secretbox_open_detached(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretbox_open_detached(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSName("crypto_secretbox_open_detached")
  def crypto_secretbox_open_detached_String(ciphertext: String, mac: Uint8Array, nonce: Uint8Array, key: Uint8Array): String = js.native
  @JSName("crypto_secretbox_open_detached")
  def crypto_secretbox_open_detached_String(ciphertext: Uint8Array, mac: Uint8Array, nonce: Uint8Array, key: Uint8Array): String = js.native
  def crypto_secretbox_open_easy(ciphertext: String, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def crypto_secretbox_open_easy(ciphertext: String, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_secretbox_open_easy(ciphertext: String, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_secretbox_open_easy(ciphertext: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def crypto_secretbox_open_easy(ciphertext: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_secretbox_open_easy(ciphertext: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_secretbox_open_easy")
  def crypto_secretbox_open_easy_String(ciphertext: String, nonce: Uint8Array, key: Uint8Array): String = js.native
  @JSName("crypto_secretbox_open_easy")
  def crypto_secretbox_open_easy_String(ciphertext: Uint8Array, nonce: Uint8Array, key: Uint8Array): String = js.native
  def crypto_secretstream_xchacha20poly1305_init_pull(header: Uint8Array, key: Uint8Array): state_address = js.native
  def crypto_secretstream_xchacha20poly1305_init_push(key: Uint8Array): Anon_Header = js.native
  def crypto_secretstream_xchacha20poly1305_init_push(key: Uint8Array, outputFormat: StringOutputFormat): Anon_HeaderState = js.native
  def crypto_secretstream_xchacha20poly1305_init_push(key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Anon_Header = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_init_push")
  def crypto_secretstream_xchacha20poly1305_init_push_Anon_HeaderState(key: Uint8Array): Anon_HeaderState = js.native
  def crypto_secretstream_xchacha20poly1305_keygen(): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_secretstream_xchacha20poly1305_keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_keygen")
  def crypto_secretstream_xchacha20poly1305_keygen_String(): String = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: secretstream_xchacha20poly1305_state_address, cipher: String): Anon_Message = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: secretstream_xchacha20poly1305_state_address, cipher: String, ad: String): Anon_Message = js.native
  def crypto_secretstream_xchacha20poly1305_pull(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: String,
    ad: String,
    outputFormat: StringOutputFormat
  ): Anon_MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: String,
    ad: String,
    outputFormat: Uint8ArrayOutputFormat
  ): Anon_Message = js.native
  def crypto_secretstream_xchacha20poly1305_pull(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: String,
    ad: Null,
    outputFormat: StringOutputFormat
  ): Anon_MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: String,
    ad: Null,
    outputFormat: Uint8ArrayOutputFormat
  ): Anon_Message = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: secretstream_xchacha20poly1305_state_address, cipher: String, ad: Uint8Array): Anon_Message = js.native
  def crypto_secretstream_xchacha20poly1305_pull(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: String,
    ad: Uint8Array,
    outputFormat: StringOutputFormat
  ): Anon_MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: String,
    ad: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Anon_Message = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: secretstream_xchacha20poly1305_state_address, cipher: Uint8Array): Anon_Message = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: secretstream_xchacha20poly1305_state_address, cipher: Uint8Array, ad: String): Anon_Message = js.native
  def crypto_secretstream_xchacha20poly1305_pull(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: Uint8Array,
    ad: String,
    outputFormat: StringOutputFormat
  ): Anon_MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: Uint8Array,
    ad: String,
    outputFormat: Uint8ArrayOutputFormat
  ): Anon_Message = js.native
  def crypto_secretstream_xchacha20poly1305_pull(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: Uint8Array,
    ad: Null,
    outputFormat: StringOutputFormat
  ): Anon_MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: Uint8Array,
    ad: Null,
    outputFormat: Uint8ArrayOutputFormat
  ): Anon_Message = js.native
  def crypto_secretstream_xchacha20poly1305_pull(state_address: secretstream_xchacha20poly1305_state_address, cipher: Uint8Array, ad: Uint8Array): Anon_Message = js.native
  def crypto_secretstream_xchacha20poly1305_pull(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: Uint8Array,
    ad: Uint8Array,
    outputFormat: StringOutputFormat
  ): Anon_MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_pull(
    state_address: secretstream_xchacha20poly1305_state_address,
    cipher: Uint8Array,
    ad: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Anon_Message = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_pull")
  def crypto_secretstream_xchacha20poly1305_pull_Anon_MessageTag(state_address: secretstream_xchacha20poly1305_state_address, cipher: String): Anon_MessageTag = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_pull")
  def crypto_secretstream_xchacha20poly1305_pull_Anon_MessageTag(state_address: secretstream_xchacha20poly1305_state_address, cipher: String, ad: String): Anon_MessageTag = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_pull")
  def crypto_secretstream_xchacha20poly1305_pull_Anon_MessageTag(state_address: secretstream_xchacha20poly1305_state_address, cipher: String, ad: Uint8Array): Anon_MessageTag = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_pull")
  def crypto_secretstream_xchacha20poly1305_pull_Anon_MessageTag(state_address: secretstream_xchacha20poly1305_state_address, cipher: Uint8Array): Anon_MessageTag = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_pull")
  def crypto_secretstream_xchacha20poly1305_pull_Anon_MessageTag(state_address: secretstream_xchacha20poly1305_state_address, cipher: Uint8Array, ad: String): Anon_MessageTag = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_pull")
  def crypto_secretstream_xchacha20poly1305_pull_Anon_MessageTag(state_address: secretstream_xchacha20poly1305_state_address, cipher: Uint8Array, ad: Uint8Array): Anon_MessageTag = js.native
  def crypto_secretstream_xchacha20poly1305_push(state_address: secretstream_xchacha20poly1305_state_address, message_chunk: String): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(state_address: secretstream_xchacha20poly1305_state_address, message_chunk: String, ad: String): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: String,
    ad: String,
    tag: Double
  ): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: String,
    ad: String,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: String,
    ad: String,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: String,
    ad: Null,
    tag: Double
  ): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: String,
    ad: Null,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: String,
    ad: Null,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(state_address: secretstream_xchacha20poly1305_state_address, message_chunk: String, ad: Uint8Array): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: String,
    ad: Uint8Array,
    tag: Double
  ): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: String,
    ad: Uint8Array,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: String,
    ad: Uint8Array,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(state_address: secretstream_xchacha20poly1305_state_address, message_chunk: Uint8Array): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(state_address: secretstream_xchacha20poly1305_state_address, message_chunk: Uint8Array, ad: String): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: Uint8Array,
    ad: String,
    tag: Double
  ): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: Uint8Array,
    ad: String,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: Uint8Array,
    ad: String,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: Uint8Array,
    ad: Null,
    tag: Double
  ): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: Uint8Array,
    ad: Null,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: Uint8Array,
    ad: Null,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: Uint8Array,
    ad: Uint8Array
  ): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: Uint8Array,
    ad: Uint8Array,
    tag: Double
  ): Uint8Array = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: Uint8Array,
    ad: Uint8Array,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def crypto_secretstream_xchacha20poly1305_push(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: Uint8Array,
    ad: Uint8Array,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_push")
  def crypto_secretstream_xchacha20poly1305_push_String(state_address: secretstream_xchacha20poly1305_state_address, message_chunk: String): String = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_push")
  def crypto_secretstream_xchacha20poly1305_push_String(state_address: secretstream_xchacha20poly1305_state_address, message_chunk: String, ad: String): String = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_push")
  def crypto_secretstream_xchacha20poly1305_push_String(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: String,
    ad: String,
    tag: Double
  ): String = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_push")
  def crypto_secretstream_xchacha20poly1305_push_String(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: String,
    ad: Null,
    tag: Double
  ): String = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_push")
  def crypto_secretstream_xchacha20poly1305_push_String(state_address: secretstream_xchacha20poly1305_state_address, message_chunk: String, ad: Uint8Array): String = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_push")
  def crypto_secretstream_xchacha20poly1305_push_String(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: String,
    ad: Uint8Array,
    tag: Double
  ): String = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_push")
  def crypto_secretstream_xchacha20poly1305_push_String(state_address: secretstream_xchacha20poly1305_state_address, message_chunk: Uint8Array): String = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_push")
  def crypto_secretstream_xchacha20poly1305_push_String(state_address: secretstream_xchacha20poly1305_state_address, message_chunk: Uint8Array, ad: String): String = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_push")
  def crypto_secretstream_xchacha20poly1305_push_String(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: Uint8Array,
    ad: String,
    tag: Double
  ): String = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_push")
  def crypto_secretstream_xchacha20poly1305_push_String(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: Uint8Array,
    ad: Null,
    tag: Double
  ): String = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_push")
  def crypto_secretstream_xchacha20poly1305_push_String(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: Uint8Array,
    ad: Uint8Array
  ): String = js.native
  @JSName("crypto_secretstream_xchacha20poly1305_push")
  def crypto_secretstream_xchacha20poly1305_push_String(
    state_address: secretstream_xchacha20poly1305_state_address,
    message_chunk: Uint8Array,
    ad: Uint8Array,
    tag: Double
  ): String = js.native
  def crypto_secretstream_xchacha20poly1305_rekey(state_address: secretstream_xchacha20poly1305_state_address): `true` = js.native
  def crypto_shorthash(message: String, key: Uint8Array): Uint8Array = js.native
  def crypto_shorthash(message: String, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_shorthash(message: String, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_shorthash(message: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def crypto_shorthash(message: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_shorthash(message: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_shorthash")
  def crypto_shorthash_String(message: String, key: Uint8Array): String = js.native
  @JSName("crypto_shorthash")
  def crypto_shorthash_String(message: Uint8Array, key: Uint8Array): String = js.native
  def crypto_shorthash_keygen(): Uint8Array = js.native
  def crypto_shorthash_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_shorthash_keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_shorthash_keygen")
  def crypto_shorthash_keygen_String(): String = js.native
  def crypto_sign(message: String, privateKey: Uint8Array): Uint8Array = js.native
  def crypto_sign(message: String, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_sign(message: String, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_sign(message: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  def crypto_sign(message: Uint8Array, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_sign(message: Uint8Array, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_sign")
  def crypto_sign_String(message: String, privateKey: Uint8Array): String = js.native
  @JSName("crypto_sign")
  def crypto_sign_String(message: Uint8Array, privateKey: Uint8Array): String = js.native
  def crypto_sign_detached(message: String, privateKey: Uint8Array): Uint8Array = js.native
  def crypto_sign_detached(message: String, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_sign_detached(message: String, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_sign_detached(message: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  def crypto_sign_detached(message: Uint8Array, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_sign_detached(message: Uint8Array, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_sign_detached")
  def crypto_sign_detached_String(message: String, privateKey: Uint8Array): String = js.native
  @JSName("crypto_sign_detached")
  def crypto_sign_detached_String(message: Uint8Array, privateKey: Uint8Array): String = js.native
  def crypto_sign_ed25519_pk_to_curve25519(edPk: Uint8Array): Uint8Array = js.native
  def crypto_sign_ed25519_pk_to_curve25519(edPk: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_sign_ed25519_pk_to_curve25519(edPk: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_sign_ed25519_pk_to_curve25519")
  def crypto_sign_ed25519_pk_to_curve25519_String(edPk: Uint8Array): String = js.native
  def crypto_sign_ed25519_sk_to_curve25519(edSk: Uint8Array): Uint8Array = js.native
  def crypto_sign_ed25519_sk_to_curve25519(edSk: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_sign_ed25519_sk_to_curve25519(edSk: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_sign_ed25519_sk_to_curve25519")
  def crypto_sign_ed25519_sk_to_curve25519_String(edSk: Uint8Array): String = js.native
  def crypto_sign_final_create(state_address: sign_state_address, privateKey: Uint8Array): Uint8Array = js.native
  def crypto_sign_final_create(state_address: sign_state_address, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_sign_final_create(state_address: sign_state_address, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_sign_final_create")
  def crypto_sign_final_create_String(state_address: sign_state_address, privateKey: Uint8Array): String = js.native
  def crypto_sign_final_verify(state_address: sign_state_address, signature: Uint8Array, publicKey: Uint8Array): Boolean = js.native
  def crypto_sign_init(): state_address = js.native
  def crypto_sign_keypair(): StringKeyPair = js.native
  def crypto_sign_keypair(outputFormat: StringOutputFormat): StringKeyPair = js.native
  def crypto_sign_keypair(outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  @JSName("crypto_sign_keypair")
  def crypto_sign_keypair_KeyPair(): KeyPair = js.native
  def crypto_sign_open(signedMessage: String, publicKey: Uint8Array): Uint8Array = js.native
  def crypto_sign_open(signedMessage: String, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_sign_open(signedMessage: String, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def crypto_sign_open(signedMessage: Uint8Array, publicKey: Uint8Array): Uint8Array = js.native
  def crypto_sign_open(signedMessage: Uint8Array, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def crypto_sign_open(signedMessage: Uint8Array, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_sign_open")
  def crypto_sign_open_String(signedMessage: String, publicKey: Uint8Array): String = js.native
  @JSName("crypto_sign_open")
  def crypto_sign_open_String(signedMessage: Uint8Array, publicKey: Uint8Array): String = js.native
  def crypto_sign_seed_keypair(seed: Uint8Array): StringKeyPair = js.native
  def crypto_sign_seed_keypair(seed: Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  def crypto_sign_seed_keypair(seed: Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  @JSName("crypto_sign_seed_keypair")
  def crypto_sign_seed_keypair_KeyPair(seed: Uint8Array): KeyPair = js.native
  def crypto_sign_update(state_address: sign_state_address, message_chunk: String): Unit = js.native
  def crypto_sign_update(state_address: sign_state_address, message_chunk: Uint8Array): Unit = js.native
  def crypto_sign_verify_detached(signature: Uint8Array, message: String, publicKey: Uint8Array): Boolean = js.native
  def crypto_sign_verify_detached(signature: Uint8Array, message: Uint8Array, publicKey: Uint8Array): Boolean = js.native
  def crypto_stream_keygen(): Uint8Array = js.native
  def crypto_stream_keygen(outputFormat: StringOutputFormat): String = js.native
  def crypto_stream_keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("crypto_stream_keygen")
  def crypto_stream_keygen_String(): String = js.native
  def from_base64(input: String): Uint8Array = js.native
  def from_base64(input: String, variant: base64_variants): Uint8Array = js.native
  def from_hex(input: String): Uint8Array = js.native
  def from_string(str: String): Uint8Array = js.native
  def increment(bytes: Uint8Array): Unit = js.native
  def is_zero(bytes: Uint8Array): Boolean = js.native
  def memcmp(b1: Uint8Array, b2: Uint8Array): Boolean = js.native
  def memzero(bytes: Uint8Array): Unit = js.native
  def pad(buf: Uint8Array, blocksize: Double): Uint8Array = js.native
  def randombytes_buf(length: Double): Uint8Array = js.native
  def randombytes_buf(length: Double, outputFormat: StringOutputFormat): String = js.native
  def randombytes_buf(length: Double, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("randombytes_buf")
  def randombytes_buf_String(length: Double): String = js.native
  def randombytes_buf_deterministic(length: Double, seed: Uint8Array): Uint8Array = js.native
  def randombytes_buf_deterministic(length: Double, seed: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def randombytes_buf_deterministic(length: Double, seed: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSName("randombytes_buf_deterministic")
  def randombytes_buf_deterministic_String(length: Double, seed: Uint8Array): String = js.native
  def randombytes_close(): Unit = js.native
  def randombytes_random(): Double = js.native
  def randombytes_set_implementation(implementation: Uint8Array): Unit = js.native
  def randombytes_stir(): Unit = js.native
  def randombytes_uniform(upper_bound: Double): Double = js.native
  def sodium_version_string(): String = js.native
  def symbols(): js.Array[String] = js.native
  def to_base64(input: String): String = js.native
  def to_base64(input: String, variant: base64_variants): String = js.native
  def to_base64(input: Uint8Array): String = js.native
  def to_base64(input: Uint8Array, variant: base64_variants): String = js.native
  def to_hex(input: String): String = js.native
  def to_hex(input: Uint8Array): String = js.native
  def to_string(bytes: Uint8Array): String = js.native
  def unpad(buf: Uint8Array, blocksize: Double): Uint8Array = js.native
}

