package typings.libsodiumWrappersSumo

import typings.libsodiumWrappers.anon.Header
import typings.libsodiumWrappers.anon.State
import typings.libsodiumWrappers.mod.CryptoBox
import typings.libsodiumWrappers.mod.CryptoKX
import typings.libsodiumWrappers.mod.KeyPair
import typings.libsodiumWrappers.mod.MessageTag
import typings.libsodiumWrappers.mod.SecretBox
import typings.libsodiumWrappers.mod.StateAddress
import typings.libsodiumWrappers.mod.StringCryptoBox
import typings.libsodiumWrappers.mod.StringCryptoKX
import typings.libsodiumWrappers.mod.StringKeyPair
import typings.libsodiumWrappers.mod.StringMessageTag
import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.StringSecretBox
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.libsodiumWrappers.mod.base64Variants
import typings.libsodiumWrappersSumo.libsodiumWrappersSumoBooleans.`true`
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("libsodium-wrappers-sumo", "SODIUM_LIBRARY_VERSION_MAJOR")
  @js.native
  val SODIUM_LIBRARY_VERSION_MAJOR: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "SODIUM_LIBRARY_VERSION_MINOR")
  @js.native
  val SODIUM_LIBRARY_VERSION_MINOR: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "SODIUM_VERSION_STRING")
  @js.native
  val SODIUM_VERSION_STRING: String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "add")
  @js.native
  def add(a: Uint8Array, b: Uint8Array): Unit = js.native
  
  @JSImport("libsodium-wrappers-sumo", "base64_variants")
  @js.native
  object base64Variants extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.libsodiumWrappers.mod.base64Variants with Double] = js.native
    
    /* 0 */ val ORIGINAL: typings.libsodiumWrappers.mod.base64Variants.ORIGINAL with Double = js.native
    
    /* 1 */ val ORIGINAL_NO_PADDING: typings.libsodiumWrappers.mod.base64Variants.ORIGINAL_NO_PADDING with Double = js.native
    
    /* 2 */ val URLSAFE: typings.libsodiumWrappers.mod.base64Variants.URLSAFE with Double = js.native
    
    /* 3 */ val URLSAFE_NO_PADDING: typings.libsodiumWrappers.mod.base64Variants.URLSAFE_NO_PADDING with Double = js.native
  }
  
  @JSImport("libsodium-wrappers-sumo", "compare")
  @js.native
  def compare(b1: Uint8Array, b2: Uint8Array): Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ABYTES")
  @js.native
  val cryptoAeadChacha20poly1305ABYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: String | Uint8Array | Null,
    ciphertext: String | Uint8Array,
    additional_data: String | Uint8Array | Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: String | Uint8Array | Null,
    ciphertext: String | Uint8Array,
    mac: Uint8Array,
    additional_data: String | Uint8Array | Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: String | Uint8Array,
    additional_data: String | Uint8Array | Null,
    secret_nonce: String | Uint8Array | Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305Encrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: String | Uint8Array,
    additional_data: String | Uint8Array | Null,
    secret_nonce: String | Uint8Array | Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): CryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_ABYTES")
  @js.native
  val cryptoAeadChacha20poly1305IetfABYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: String | Uint8Array | Null,
    ciphertext: String | Uint8Array,
    additional_data: String | Uint8Array | Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: String | Uint8Array | Null,
    ciphertext: String | Uint8Array,
    mac: Uint8Array,
    additional_data: String | Uint8Array | Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String | Uint8Array,
    additional_data: String | Uint8Array | Null,
    secret_nonce: String | Uint8Array | Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String | Uint8Array,
    additional_data: String | Uint8Array | Null,
    secret_nonce: String | Uint8Array | Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): CryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_KEYBYTES")
  @js.native
  val cryptoAeadChacha20poly1305IetfKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_keygen")
  @js.native
  def cryptoAeadChacha20poly1305IetfKeygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_keygen")
  @js.native
  def cryptoAeadChacha20poly1305IetfKeygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_keygen")
  @js.native
  def cryptoAeadChacha20poly1305IetfKeygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_MESSAGEBYTES_MAX")
  @js.native
  val cryptoAeadChacha20poly1305IetfMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_NPUBBYTES")
  @js.native
  val cryptoAeadChacha20poly1305IetfNPUBBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_NSECBYTES")
  @js.native
  val cryptoAeadChacha20poly1305IetfNSECBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_KEYBYTES")
  @js.native
  val cryptoAeadChacha20poly1305KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_keygen")
  @js.native
  def cryptoAeadChacha20poly1305Keygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_keygen")
  @js.native
  def cryptoAeadChacha20poly1305Keygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_keygen")
  @js.native
  def cryptoAeadChacha20poly1305Keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_MESSAGEBYTES_MAX")
  @js.native
  val cryptoAeadChacha20poly1305MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_NPUBBYTES")
  @js.native
  val cryptoAeadChacha20poly1305NPUBBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_NSECBYTES")
  @js.native
  val cryptoAeadChacha20poly1305NSECBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_ABYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfABYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: String | Uint8Array | Null,
    ciphertext: String | Uint8Array,
    additional_data: String | Uint8Array | Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Uint8Array,
    ciphertext: String,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: String | Uint8Array | Null,
    ciphertext: String | Uint8Array,
    mac: Uint8Array,
    additional_data: String | Uint8Array | Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: String,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Uint8Array,
    ciphertext: Uint8Array,
    mac: Uint8Array,
    additional_data: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String | Uint8Array,
    additional_data: String | Uint8Array | Null,
    secret_nonce: String | Uint8Array | Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String | Uint8Array,
    additional_data: String | Uint8Array | Null,
    secret_nonce: String | Uint8Array | Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): CryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_KEYBYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_keygen")
  @js.native
  def cryptoAeadXchacha20poly1305IetfKeygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_keygen")
  @js.native
  def cryptoAeadXchacha20poly1305IetfKeygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_keygen")
  @js.native
  def cryptoAeadXchacha20poly1305IetfKeygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_MESSAGEBYTES_MAX")
  @js.native
  val cryptoAeadXchacha20poly1305IetfMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_NPUBBYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfNPUBBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_NSECBYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfNSECBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth")
  @js.native
  def cryptoAuth(message: String, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth")
  @js.native
  def cryptoAuth(message: String, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth")
  @js.native
  def cryptoAuth(message: String, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth")
  @js.native
  def cryptoAuth(message: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth")
  @js.native
  def cryptoAuth(message: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth")
  @js.native
  def cryptoAuth(message: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_BYTES")
  @js.native
  val cryptoAuthBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256")
  @js.native
  def cryptoAuthHmacsha256(message: String, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256")
  @js.native
  def cryptoAuthHmacsha256(message: String, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256")
  @js.native
  def cryptoAuthHmacsha256(message: String, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256")
  @js.native
  def cryptoAuthHmacsha256(message: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256")
  @js.native
  def cryptoAuthHmacsha256(message: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256")
  @js.native
  def cryptoAuthHmacsha256(message: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256_BYTES")
  @js.native
  val cryptoAuthHmacsha256BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256_KEYBYTES")
  @js.native
  val cryptoAuthHmacsha256KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256_keygen")
  @js.native
  def cryptoAuthHmacsha256Keygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256_keygen")
  @js.native
  def cryptoAuthHmacsha256Keygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256_keygen")
  @js.native
  def cryptoAuthHmacsha256Keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256_verify")
  @js.native
  def cryptoAuthHmacsha256Verify(tag: Uint8Array, message: String, key: Uint8Array): Boolean = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256_verify")
  @js.native
  def cryptoAuthHmacsha256Verify(tag: Uint8Array, message: Uint8Array, key: Uint8Array): Boolean = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512")
  @js.native
  def cryptoAuthHmacsha512(message: String, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512")
  @js.native
  def cryptoAuthHmacsha512(message: String, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512")
  @js.native
  def cryptoAuthHmacsha512(message: String, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512")
  @js.native
  def cryptoAuthHmacsha512(message: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512")
  @js.native
  def cryptoAuthHmacsha512(message: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512")
  @js.native
  def cryptoAuthHmacsha512(message: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512256_BYTES")
  @js.native
  val cryptoAuthHmacsha512256BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512256_KEYBYTES")
  @js.native
  val cryptoAuthHmacsha512256KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512_BYTES")
  @js.native
  val cryptoAuthHmacsha512BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512_KEYBYTES")
  @js.native
  val cryptoAuthHmacsha512KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512_keygen")
  @js.native
  def cryptoAuthHmacsha512Keygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512_keygen")
  @js.native
  def cryptoAuthHmacsha512Keygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512_keygen")
  @js.native
  def cryptoAuthHmacsha512Keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512_verify")
  @js.native
  def cryptoAuthHmacsha512Verify(tag: Uint8Array, message: String, key: Uint8Array): Boolean = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha512_verify")
  @js.native
  def cryptoAuthHmacsha512Verify(tag: Uint8Array, message: Uint8Array, key: Uint8Array): Boolean = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_KEYBYTES")
  @js.native
  val cryptoAuthKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_keygen")
  @js.native
  def cryptoAuthKeygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_keygen")
  @js.native
  def cryptoAuthKeygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_keygen")
  @js.native
  def cryptoAuthKeygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_verify")
  @js.native
  def cryptoAuthVerify(tag: Uint8Array, message: String, key: Uint8Array): Boolean = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_verify")
  @js.native
  def cryptoAuthVerify(tag: Uint8Array, message: Uint8Array, key: Uint8Array): Boolean = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_BEFORENMBYTES")
  @js.native
  val cryptoBoxBEFORENMBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_beforenm")
  @js.native
  def cryptoBoxBeforenm(publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_beforenm")
  @js.native
  def cryptoBoxBeforenm(publicKey: Uint8Array, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_beforenm")
  @js.native
  def cryptoBoxBeforenm(publicKey: Uint8Array, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_BEFORENMBYTES")
  @js.native
  val cryptoBoxCurve25519xchacha20poly1305BEFORENMBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_keypair")
  @js.native
  def cryptoBoxCurve25519xchacha20poly1305Keypair(publicKey: Uint8Array, secretKey: Uint8Array): KeyPair = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_keypair")
  @js.native
  def cryptoBoxCurve25519xchacha20poly1305Keypair(publicKey: Uint8Array, secretKey: Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_keypair")
  @js.native
  def cryptoBoxCurve25519xchacha20poly1305Keypair(publicKey: Uint8Array, secretKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_MACBYTES")
  @js.native
  val cryptoBoxCurve25519xchacha20poly1305MACBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_MESSAGEBYTES_MAX")
  @js.native
  val cryptoBoxCurve25519xchacha20poly1305MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_NONCEBYTES")
  @js.native
  val cryptoBoxCurve25519xchacha20poly1305NONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_PUBLICKEYBYTES")
  @js.native
  val cryptoBoxCurve25519xchacha20poly1305PUBLICKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_SEALBYTES")
  @js.native
  val cryptoBoxCurve25519xchacha20poly1305SEALBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_SECRETKEYBYTES")
  @js.native
  val cryptoBoxCurve25519xchacha20poly1305SECRETKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_SEEDBYTES")
  @js.native
  val cryptoBoxCurve25519xchacha20poly1305SEEDBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_seal")
  @js.native
  def cryptoBoxCurve25519xchacha20poly1305Seal(message: Uint8Array, publicKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_seal")
  @js.native
  def cryptoBoxCurve25519xchacha20poly1305Seal(message: Uint8Array, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_seal")
  @js.native
  def cryptoBoxCurve25519xchacha20poly1305Seal(message: Uint8Array, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_seal_open")
  @js.native
  def cryptoBoxCurve25519xchacha20poly1305SealOpen(ciphertext: Uint8Array, publicKey: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_seal_open")
  @js.native
  def cryptoBoxCurve25519xchacha20poly1305SealOpen(
    ciphertext: Uint8Array,
    publicKey: Uint8Array,
    secretKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_seal_open")
  @js.native
  def cryptoBoxCurve25519xchacha20poly1305SealOpen(
    ciphertext: Uint8Array,
    publicKey: Uint8Array,
    secretKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xsalsa20poly1305_BEFORENMBYTES")
  @js.native
  val cryptoBoxCurve25519xsalsa20poly1305BEFORENMBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xsalsa20poly1305_MACBYTES")
  @js.native
  val cryptoBoxCurve25519xsalsa20poly1305MACBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xsalsa20poly1305_MESSAGEBYTES_MAX")
  @js.native
  val cryptoBoxCurve25519xsalsa20poly1305MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xsalsa20poly1305_NONCEBYTES")
  @js.native
  val cryptoBoxCurve25519xsalsa20poly1305NONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xsalsa20poly1305_PUBLICKEYBYTES")
  @js.native
  val cryptoBoxCurve25519xsalsa20poly1305PUBLICKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xsalsa20poly1305_SECRETKEYBYTES")
  @js.native
  val cryptoBoxCurve25519xsalsa20poly1305SECRETKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xsalsa20poly1305_SEEDBYTES")
  @js.native
  val cryptoBoxCurve25519xsalsa20poly1305SEEDBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_detached")
  @js.native
  def cryptoBoxDetached(message: String, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): CryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_detached")
  @js.native
  def cryptoBoxDetached(
    message: String,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_detached")
  @js.native
  def cryptoBoxDetached(
    message: String,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_detached")
  @js.native
  def cryptoBoxDetached(message: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): CryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_detached")
  @js.native
  def cryptoBoxDetached(
    message: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_detached")
  @js.native
  def cryptoBoxDetached(
    message: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_easy")
  @js.native
  def cryptoBoxEasy(message: String, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_easy")
  @js.native
  def cryptoBoxEasy(
    message: String,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_easy")
  @js.native
  def cryptoBoxEasy(
    message: String,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_easy")
  @js.native
  def cryptoBoxEasy(message: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_easy")
  @js.native
  def cryptoBoxEasy(
    message: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_easy")
  @js.native
  def cryptoBoxEasy(
    message: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_easy_afternm")
  @js.native
  def cryptoBoxEasyAfternm(message: String, nonce: Uint8Array, sharedKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_easy_afternm")
  @js.native
  def cryptoBoxEasyAfternm(message: String, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_easy_afternm")
  @js.native
  def cryptoBoxEasyAfternm(message: String, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_easy_afternm")
  @js.native
  def cryptoBoxEasyAfternm(message: Uint8Array, nonce: Uint8Array, sharedKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_easy_afternm")
  @js.native
  def cryptoBoxEasyAfternm(message: Uint8Array, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_easy_afternm")
  @js.native
  def cryptoBoxEasyAfternm(
    message: Uint8Array,
    nonce: Uint8Array,
    sharedKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_keypair")
  @js.native
  def cryptoBoxKeypair(): KeyPair = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_keypair")
  @js.native
  def cryptoBoxKeypair(outputFormat: StringOutputFormat): StringKeyPair = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_keypair")
  @js.native
  def cryptoBoxKeypair(outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_MACBYTES")
  @js.native
  val cryptoBoxMACBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_MESSAGEBYTES_MAX")
  @js.native
  val cryptoBoxMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_NONCEBYTES")
  @js.native
  val cryptoBoxNONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_detached")
  @js.native
  def cryptoBoxOpenDetached(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_detached")
  @js.native
  def cryptoBoxOpenDetached(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_detached")
  @js.native
  def cryptoBoxOpenDetached(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_detached")
  @js.native
  def cryptoBoxOpenDetached(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_detached")
  @js.native
  def cryptoBoxOpenDetached(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_detached")
  @js.native
  def cryptoBoxOpenDetached(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_easy")
  @js.native
  def cryptoBoxOpenEasy(ciphertext: String, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_easy")
  @js.native
  def cryptoBoxOpenEasy(
    ciphertext: String,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_easy")
  @js.native
  def cryptoBoxOpenEasy(
    ciphertext: String,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_easy")
  @js.native
  def cryptoBoxOpenEasy(ciphertext: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_easy")
  @js.native
  def cryptoBoxOpenEasy(
    ciphertext: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_easy")
  @js.native
  def cryptoBoxOpenEasy(
    ciphertext: Uint8Array,
    nonce: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_easy_afternm")
  @js.native
  def cryptoBoxOpenEasyAfternm(ciphertext: String, nonce: Uint8Array, sharedKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_easy_afternm")
  @js.native
  def cryptoBoxOpenEasyAfternm(ciphertext: String, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_easy_afternm")
  @js.native
  def cryptoBoxOpenEasyAfternm(ciphertext: String, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_easy_afternm")
  @js.native
  def cryptoBoxOpenEasyAfternm(ciphertext: Uint8Array, nonce: Uint8Array, sharedKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_easy_afternm")
  @js.native
  def cryptoBoxOpenEasyAfternm(ciphertext: Uint8Array, nonce: Uint8Array, sharedKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_open_easy_afternm")
  @js.native
  def cryptoBoxOpenEasyAfternm(
    ciphertext: Uint8Array,
    nonce: Uint8Array,
    sharedKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_PUBLICKEYBYTES")
  @js.native
  val cryptoBoxPUBLICKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_SEALBYTES")
  @js.native
  val cryptoBoxSEALBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_SECRETKEYBYTES")
  @js.native
  val cryptoBoxSECRETKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_SEEDBYTES")
  @js.native
  val cryptoBoxSEEDBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seal")
  @js.native
  def cryptoBoxSeal(message: String, publicKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seal")
  @js.native
  def cryptoBoxSeal(message: String, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seal")
  @js.native
  def cryptoBoxSeal(message: String, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seal")
  @js.native
  def cryptoBoxSeal(message: Uint8Array, publicKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seal")
  @js.native
  def cryptoBoxSeal(message: Uint8Array, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seal")
  @js.native
  def cryptoBoxSeal(message: Uint8Array, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seal_open")
  @js.native
  def cryptoBoxSealOpen(ciphertext: String, publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seal_open")
  @js.native
  def cryptoBoxSealOpen(
    ciphertext: String,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seal_open")
  @js.native
  def cryptoBoxSealOpen(
    ciphertext: String,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seal_open")
  @js.native
  def cryptoBoxSealOpen(ciphertext: Uint8Array, publicKey: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seal_open")
  @js.native
  def cryptoBoxSealOpen(
    ciphertext: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seal_open")
  @js.native
  def cryptoBoxSealOpen(
    ciphertext: Uint8Array,
    publicKey: Uint8Array,
    privateKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seed_keypair")
  @js.native
  def cryptoBoxSeedKeypair(seed: Uint8Array): KeyPair = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seed_keypair")
  @js.native
  def cryptoBoxSeedKeypair(seed: Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_box_seed_keypair")
  @js.native
  def cryptoBoxSeedKeypair(seed: Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ed25519_BYTES")
  @js.native
  val cryptoCoreEd25519BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ed25519_HASHBYTES")
  @js.native
  val cryptoCoreEd25519HASHBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ed25519_NONREDUCEDSCALARBYTES")
  @js.native
  val cryptoCoreEd25519NONREDUCEDSCALARBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ed25519_SCALARBYTES")
  @js.native
  val cryptoCoreEd25519SCALARBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ed25519_UNIFORMBYTES")
  @js.native
  val cryptoCoreEd25519UNIFORMBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_hchacha20_CONSTBYTES")
  @js.native
  val cryptoCoreHchacha20CONSTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_hchacha20_INPUTBYTES")
  @js.native
  val cryptoCoreHchacha20INPUTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_hchacha20_KEYBYTES")
  @js.native
  val cryptoCoreHchacha20KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_hchacha20_OUTPUTBYTES")
  @js.native
  val cryptoCoreHchacha20OUTPUTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_hsalsa20_CONSTBYTES")
  @js.native
  val cryptoCoreHsalsa20CONSTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_hsalsa20_INPUTBYTES")
  @js.native
  val cryptoCoreHsalsa20INPUTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_hsalsa20_KEYBYTES")
  @js.native
  val cryptoCoreHsalsa20KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_hsalsa20_OUTPUTBYTES")
  @js.native
  val cryptoCoreHsalsa20OUTPUTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_add")
  @js.native
  def cryptoCoreRistretto255Add(p: Uint8Array, q: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_add")
  @js.native
  def cryptoCoreRistretto255Add(p: Uint8Array, q: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_add")
  @js.native
  def cryptoCoreRistretto255Add(p: Uint8Array, q: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_BYTES")
  @js.native
  val cryptoCoreRistretto255BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_from_hash")
  @js.native
  def cryptoCoreRistretto255FromHash(r: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_from_hash")
  @js.native
  def cryptoCoreRistretto255FromHash(r: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_from_hash")
  @js.native
  def cryptoCoreRistretto255FromHash(r: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_HASHBYTES")
  @js.native
  val cryptoCoreRistretto255HASHBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_is_valid_point")
  @js.native
  def cryptoCoreRistretto255IsValidPoint(point: String): Boolean = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_is_valid_point")
  @js.native
  def cryptoCoreRistretto255IsValidPoint(point: Uint8Array): Boolean = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_NONREDUCEDSCALARBYTES")
  @js.native
  val cryptoCoreRistretto255NONREDUCEDSCALARBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_random")
  @js.native
  def cryptoCoreRistretto255Random(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_random")
  @js.native
  def cryptoCoreRistretto255Random(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_random")
  @js.native
  def cryptoCoreRistretto255Random(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_SCALARBYTES")
  @js.native
  val cryptoCoreRistretto255SCALARBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_add")
  @js.native
  def cryptoCoreRistretto255ScalarAdd(x: Uint8Array, y: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_add")
  @js.native
  def cryptoCoreRistretto255ScalarAdd(x: Uint8Array, y: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_add")
  @js.native
  def cryptoCoreRistretto255ScalarAdd(x: Uint8Array, y: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_complement")
  @js.native
  def cryptoCoreRistretto255ScalarComplement(scalar: String): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_complement")
  @js.native
  def cryptoCoreRistretto255ScalarComplement(scalar: String, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_complement")
  @js.native
  def cryptoCoreRistretto255ScalarComplement(scalar: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_complement")
  @js.native
  def cryptoCoreRistretto255ScalarComplement(scalar: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_complement")
  @js.native
  def cryptoCoreRistretto255ScalarComplement(scalar: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_complement")
  @js.native
  def cryptoCoreRistretto255ScalarComplement(scalar: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_invert")
  @js.native
  def cryptoCoreRistretto255ScalarInvert(scalar: String): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_invert")
  @js.native
  def cryptoCoreRistretto255ScalarInvert(scalar: String, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_invert")
  @js.native
  def cryptoCoreRistretto255ScalarInvert(scalar: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_invert")
  @js.native
  def cryptoCoreRistretto255ScalarInvert(scalar: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_invert")
  @js.native
  def cryptoCoreRistretto255ScalarInvert(scalar: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_invert")
  @js.native
  def cryptoCoreRistretto255ScalarInvert(scalar: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_mul")
  @js.native
  def cryptoCoreRistretto255ScalarMul(x: Uint8Array, y: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_mul")
  @js.native
  def cryptoCoreRistretto255ScalarMul(x: Uint8Array, y: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_mul")
  @js.native
  def cryptoCoreRistretto255ScalarMul(x: Uint8Array, y: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_negate")
  @js.native
  def cryptoCoreRistretto255ScalarNegate(scalar: String): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_negate")
  @js.native
  def cryptoCoreRistretto255ScalarNegate(scalar: String, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_negate")
  @js.native
  def cryptoCoreRistretto255ScalarNegate(scalar: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_negate")
  @js.native
  def cryptoCoreRistretto255ScalarNegate(scalar: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_negate")
  @js.native
  def cryptoCoreRistretto255ScalarNegate(scalar: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_negate")
  @js.native
  def cryptoCoreRistretto255ScalarNegate(scalar: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_random")
  @js.native
  def cryptoCoreRistretto255ScalarRandom(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_random")
  @js.native
  def cryptoCoreRistretto255ScalarRandom(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_random")
  @js.native
  def cryptoCoreRistretto255ScalarRandom(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_reduce")
  @js.native
  def cryptoCoreRistretto255ScalarReduce(secret: String): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_reduce")
  @js.native
  def cryptoCoreRistretto255ScalarReduce(secret: String, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_reduce")
  @js.native
  def cryptoCoreRistretto255ScalarReduce(secret: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_reduce")
  @js.native
  def cryptoCoreRistretto255ScalarReduce(secret: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_reduce")
  @js.native
  def cryptoCoreRistretto255ScalarReduce(secret: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_reduce")
  @js.native
  def cryptoCoreRistretto255ScalarReduce(secret: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_sub")
  @js.native
  def cryptoCoreRistretto255ScalarSub(x: Uint8Array, y: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_sub")
  @js.native
  def cryptoCoreRistretto255ScalarSub(x: Uint8Array, y: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_scalar_sub")
  @js.native
  def cryptoCoreRistretto255ScalarSub(x: Uint8Array, y: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_sub")
  @js.native
  def cryptoCoreRistretto255Sub(p: Uint8Array, q: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_sub")
  @js.native
  def cryptoCoreRistretto255Sub(p: Uint8Array, q: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_sub")
  @js.native
  def cryptoCoreRistretto255Sub(p: Uint8Array, q: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_salsa2012_CONSTBYTES")
  @js.native
  val cryptoCoreSalsa2012CONSTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_salsa2012_INPUTBYTES")
  @js.native
  val cryptoCoreSalsa2012INPUTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_salsa2012_KEYBYTES")
  @js.native
  val cryptoCoreSalsa2012KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_salsa2012_OUTPUTBYTES")
  @js.native
  val cryptoCoreSalsa2012OUTPUTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_salsa20_CONSTBYTES")
  @js.native
  val cryptoCoreSalsa20CONSTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_salsa20_INPUTBYTES")
  @js.native
  val cryptoCoreSalsa20INPUTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_salsa20_KEYBYTES")
  @js.native
  val cryptoCoreSalsa20KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_salsa20_OUTPUTBYTES")
  @js.native
  val cryptoCoreSalsa20OUTPUTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: String): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(
    hash_length: Double,
    message: String,
    key: js.UndefOr[scala.Nothing],
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: String, key: String): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: String, key: String, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: String, key: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: String, key: Null, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: String, key: Null, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: String, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: String, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: String, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(
    hash_length: Double,
    message: Uint8Array,
    key: js.UndefOr[scala.Nothing],
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: Uint8Array, key: String): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: Uint8Array, key: String, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: Uint8Array, key: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: Uint8Array, key: Null, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: Uint8Array, key: Null, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash")
  @js.native
  def cryptoGenerichash(hash_length: Double, message: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_BYTES")
  @js.native
  val cryptoGenerichashBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_BYTES_MAX")
  @js.native
  val cryptoGenerichashBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_BYTES_MIN")
  @js.native
  val cryptoGenerichashBYTESMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_BYTES")
  @js.native
  val cryptoGenerichashBlake2bBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_BYTES_MAX")
  @js.native
  val cryptoGenerichashBlake2bBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_BYTES_MIN")
  @js.native
  val cryptoGenerichashBlake2bBYTESMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_KEYBYTES")
  @js.native
  val cryptoGenerichashBlake2bKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_KEYBYTES_MAX")
  @js.native
  val cryptoGenerichashBlake2bKEYBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_KEYBYTES_MIN")
  @js.native
  val cryptoGenerichashBlake2bKEYBYTESMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_PERSONALBYTES")
  @js.native
  val cryptoGenerichashBlake2bPERSONALBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_SALTBYTES")
  @js.native
  val cryptoGenerichashBlake2bSALTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_salt_personal")
  @js.native
  def cryptoGenerichashBlake2bSaltPersonal(subkey_len: Double, key: String, id: Uint8Array, ctx: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_salt_personal")
  @js.native
  def cryptoGenerichashBlake2bSaltPersonal(subkey_len: Double, key: String, id: Uint8Array, ctx: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_salt_personal")
  @js.native
  def cryptoGenerichashBlake2bSaltPersonal(
    subkey_len: Double,
    key: String,
    id: Uint8Array,
    ctx: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_salt_personal")
  @js.native
  def cryptoGenerichashBlake2bSaltPersonal(subkey_len: Double, key: Null, id: Uint8Array, ctx: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_salt_personal")
  @js.native
  def cryptoGenerichashBlake2bSaltPersonal(subkey_len: Double, key: Null, id: Uint8Array, ctx: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_salt_personal")
  @js.native
  def cryptoGenerichashBlake2bSaltPersonal(
    subkey_len: Double,
    key: Null,
    id: Uint8Array,
    ctx: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_salt_personal")
  @js.native
  def cryptoGenerichashBlake2bSaltPersonal(subkey_len: Double, key: Uint8Array, id: Uint8Array, ctx: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_salt_personal")
  @js.native
  def cryptoGenerichashBlake2bSaltPersonal(
    subkey_len: Double,
    key: Uint8Array,
    id: Uint8Array,
    ctx: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_salt_personal")
  @js.native
  def cryptoGenerichashBlake2bSaltPersonal(
    subkey_len: Double,
    key: Uint8Array,
    id: Uint8Array,
    ctx: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_final")
  @js.native
  def cryptoGenerichashFinal(state_address: StateAddress, hash_length: Double): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_final")
  @js.native
  def cryptoGenerichashFinal(state_address: StateAddress, hash_length: Double, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_final")
  @js.native
  def cryptoGenerichashFinal(state_address: StateAddress, hash_length: Double, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_init")
  @js.native
  def cryptoGenerichashInit(key: String, hash_length: Double): StateAddress = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_init")
  @js.native
  def cryptoGenerichashInit(key: Null, hash_length: Double): StateAddress = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_init")
  @js.native
  def cryptoGenerichashInit(key: Uint8Array, hash_length: Double): StateAddress = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_KEYBYTES")
  @js.native
  val cryptoGenerichashKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_KEYBYTES_MAX")
  @js.native
  val cryptoGenerichashKEYBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_KEYBYTES_MIN")
  @js.native
  val cryptoGenerichashKEYBYTESMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_keygen")
  @js.native
  def cryptoGenerichashKeygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_keygen")
  @js.native
  def cryptoGenerichashKeygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_keygen")
  @js.native
  def cryptoGenerichashKeygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_update")
  @js.native
  def cryptoGenerichashUpdate(state_address: StateAddress, message_chunk: String): Unit = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_update")
  @js.native
  def cryptoGenerichashUpdate(state_address: StateAddress, message_chunk: Uint8Array): Unit = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash")
  @js.native
  def cryptoHash(message: String): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash")
  @js.native
  def cryptoHash(message: String, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash")
  @js.native
  def cryptoHash(message: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash")
  @js.native
  def cryptoHash(message: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash")
  @js.native
  def cryptoHash(message: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash")
  @js.native
  def cryptoHash(message: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_BYTES")
  @js.native
  val cryptoHashBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha256")
  @js.native
  def cryptoHashSha256(message: String): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha256")
  @js.native
  def cryptoHashSha256(message: String, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha256")
  @js.native
  def cryptoHashSha256(message: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha256")
  @js.native
  def cryptoHashSha256(message: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha256")
  @js.native
  def cryptoHashSha256(message: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha256")
  @js.native
  def cryptoHashSha256(message: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha256_BYTES")
  @js.native
  val cryptoHashSha256BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha256_final")
  @js.native
  def cryptoHashSha256Final(stateAddress: StateAddress): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha256_final")
  @js.native
  def cryptoHashSha256Final(stateAddress: StateAddress, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha256_final")
  @js.native
  def cryptoHashSha256Final(stateAddress: StateAddress, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha256_final")
  @js.native
  def cryptoHashSha256Final_Uint8Array(stateAddress: StateAddress): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha256_init")
  @js.native
  def cryptoHashSha256Init(): Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha256_update")
  @js.native
  def cryptoHashSha256Update(stateAddress: StateAddress, message: Uint8Array): Unit = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512")
  @js.native
  def cryptoHashSha512(message: String): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512")
  @js.native
  def cryptoHashSha512(message: String, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512")
  @js.native
  def cryptoHashSha512(message: String, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512")
  @js.native
  def cryptoHashSha512(message: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512")
  @js.native
  def cryptoHashSha512(message: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512")
  @js.native
  def cryptoHashSha512(message: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512_BYTES")
  @js.native
  val cryptoHashSha512BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512_final")
  @js.native
  def cryptoHashSha512Final(stateAddress: StateAddress): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512_final")
  @js.native
  def cryptoHashSha512Final(stateAddress: StateAddress, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512_final")
  @js.native
  def cryptoHashSha512Final(stateAddress: StateAddress, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512_final")
  @js.native
  def cryptoHashSha512Final_Uint8Array(stateAddress: StateAddress): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512_init")
  @js.native
  def cryptoHashSha512Init(): Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512_update")
  @js.native
  def cryptoHashSha512Update(stateAddress: StateAddress, message: Uint8Array): Unit = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_BYTES_MAX")
  @js.native
  val cryptoKdfBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_BYTES_MIN")
  @js.native
  val cryptoKdfBYTESMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_blake2b_BYTES_MAX")
  @js.native
  val cryptoKdfBlake2bBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_blake2b_BYTES_MIN")
  @js.native
  val cryptoKdfBlake2bBYTESMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_blake2b_CONTEXTBYTES")
  @js.native
  val cryptoKdfBlake2bCONTEXTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_blake2b_KEYBYTES")
  @js.native
  val cryptoKdfBlake2bKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_CONTEXTBYTES")
  @js.native
  val cryptoKdfCONTEXTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_derive_from_key")
  @js.native
  def cryptoKdfDeriveFromKey(subkey_len: Double, subkey_id: Double, ctx: String, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_derive_from_key")
  @js.native
  def cryptoKdfDeriveFromKey(
    subkey_len: Double,
    subkey_id: Double,
    ctx: String,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_derive_from_key")
  @js.native
  def cryptoKdfDeriveFromKey(
    subkey_len: Double,
    subkey_id: Double,
    ctx: String,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_KEYBYTES")
  @js.native
  val cryptoKdfKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_keygen")
  @js.native
  def cryptoKdfKeygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_keygen")
  @js.native
  def cryptoKdfKeygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_keygen")
  @js.native
  def cryptoKdfKeygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_client_session_keys")
  @js.native
  def cryptoKxClientSessionKeys(clientPublicKey: Uint8Array, clientSecretKey: Uint8Array, serverPublicKey: Uint8Array): CryptoKX = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_client_session_keys")
  @js.native
  def cryptoKxClientSessionKeys(
    clientPublicKey: Uint8Array,
    clientSecretKey: Uint8Array,
    serverPublicKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_client_session_keys")
  @js.native
  def cryptoKxClientSessionKeys(
    clientPublicKey: Uint8Array,
    clientSecretKey: Uint8Array,
    serverPublicKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_keypair")
  @js.native
  def cryptoKxKeypair(): KeyPair = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_keypair")
  @js.native
  def cryptoKxKeypair(outputFormat: StringOutputFormat): StringKeyPair = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_keypair")
  @js.native
  def cryptoKxKeypair(outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_PUBLICKEYBYTES")
  @js.native
  val cryptoKxPUBLICKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_SECRETKEYBYTES")
  @js.native
  val cryptoKxSECRETKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_SEEDBYTES")
  @js.native
  val cryptoKxSEEDBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_SESSIONKEYBYTES")
  @js.native
  val cryptoKxSESSIONKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_seed_keypair")
  @js.native
  def cryptoKxSeedKeypair(seed: Uint8Array): KeyPair = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_seed_keypair")
  @js.native
  def cryptoKxSeedKeypair(seed: Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_seed_keypair")
  @js.native
  def cryptoKxSeedKeypair(seed: Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_server_session_keys")
  @js.native
  def cryptoKxServerSessionKeys(serverPublicKey: Uint8Array, serverSecretKey: Uint8Array, clientPublicKey: Uint8Array): CryptoKX = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_server_session_keys")
  @js.native
  def cryptoKxServerSessionKeys(
    serverPublicKey: Uint8Array,
    serverSecretKey: Uint8Array,
    clientPublicKey: Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_kx_server_session_keys")
  @js.native
  def cryptoKxServerSessionKeys(
    serverPublicKey: Uint8Array,
    serverSecretKey: Uint8Array,
    clientPublicKey: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth")
  @js.native
  def cryptoOnetimeauth(message: String, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth")
  @js.native
  def cryptoOnetimeauth(message: String, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth")
  @js.native
  def cryptoOnetimeauth(message: String, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth")
  @js.native
  def cryptoOnetimeauth(message: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth")
  @js.native
  def cryptoOnetimeauth(message: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth")
  @js.native
  def cryptoOnetimeauth(message: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_BYTES")
  @js.native
  val cryptoOnetimeauthBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_final")
  @js.native
  def cryptoOnetimeauthFinal(stateAddress: StateAddress): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_final")
  @js.native
  def cryptoOnetimeauthFinal(stateAddress: StateAddress, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_final")
  @js.native
  def cryptoOnetimeauthFinal(stateAddress: StateAddress, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_init")
  @js.native
  def cryptoOnetimeauthInit(): StateAddress = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_init")
  @js.native
  def cryptoOnetimeauthInit(key: String): StateAddress = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_init")
  @js.native
  def cryptoOnetimeauthInit(key: Uint8Array): StateAddress = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_KEYBYTES")
  @js.native
  val cryptoOnetimeauthKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_keygen")
  @js.native
  def cryptoOnetimeauthKeygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_keygen")
  @js.native
  def cryptoOnetimeauthKeygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_keygen")
  @js.native
  def cryptoOnetimeauthKeygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_poly1305_BYTES")
  @js.native
  val cryptoOnetimeauthPoly1305BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_poly1305_KEYBYTES")
  @js.native
  val cryptoOnetimeauthPoly1305KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_update")
  @js.native
  def cryptoOnetimeauthUpdate(stateAddress: StateAddress, message_chunk: String): Unit = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_update")
  @js.native
  def cryptoOnetimeauthUpdate(stateAddress: StateAddress, message_chunk: Uint8Array): Unit = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_verify")
  @js.native
  def cryptoOnetimeauthVerify(hash: Uint8Array, message: String, key: Uint8Array): Boolean = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_verify")
  @js.native
  def cryptoOnetimeauthVerify(hash: Uint8Array, message: Uint8Array, key: Uint8Array): Boolean = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash")
  @js.native
  def cryptoPwhash(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash")
  @js.native
  def cryptoPwhash(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash")
  @js.native
  def cryptoPwhash(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash")
  @js.native
  def cryptoPwhash(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash")
  @js.native
  def cryptoPwhash(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash")
  @js.native
  def cryptoPwhash(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_ALG_ARGON2I13")
  @js.native
  val cryptoPwhashALGARGON2I13: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_ALG_ARGON2ID13")
  @js.native
  val cryptoPwhashALGARGON2ID13: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_ALG_DEFAULT")
  @js.native
  val cryptoPwhashALGDEFAULT: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_argon2i_BYTES_MAX")
  @js.native
  val cryptoPwhashArgon2iBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_argon2i_BYTES_MIN")
  @js.native
  val cryptoPwhashArgon2iBYTESMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_argon2i_SALTBYTES")
  @js.native
  val cryptoPwhashArgon2iSALTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_argon2i_STRBYTES")
  @js.native
  val cryptoPwhashArgon2iSTRBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_argon2id_BYTES_MAX")
  @js.native
  val cryptoPwhashArgon2idBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_argon2id_BYTES_MIN")
  @js.native
  val cryptoPwhashArgon2idBYTESMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_argon2id_SALTBYTES")
  @js.native
  val cryptoPwhashArgon2idSALTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_argon2id_STRBYTES")
  @js.native
  val cryptoPwhashArgon2idSTRBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_BYTES_MAX")
  @js.native
  val cryptoPwhashBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_BYTES_MIN")
  @js.native
  val cryptoPwhashBYTESMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_MEMLIMIT_INTERACTIVE")
  @js.native
  val cryptoPwhashMEMLIMITINTERACTIVE: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_MEMLIMIT_MAX")
  @js.native
  val cryptoPwhashMEMLIMITMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_MEMLIMIT_MIN")
  @js.native
  val cryptoPwhashMEMLIMITMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_MEMLIMIT_MODERATE")
  @js.native
  val cryptoPwhashMEMLIMITMODERATE: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_MEMLIMIT_SENSITIVE")
  @js.native
  val cryptoPwhashMEMLIMITSENSITIVE: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_OPSLIMIT_INTERACTIVE")
  @js.native
  val cryptoPwhashOPSLIMITINTERACTIVE: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_OPSLIMIT_MAX")
  @js.native
  val cryptoPwhashOPSLIMITMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_OPSLIMIT_MIN")
  @js.native
  val cryptoPwhashOPSLIMITMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_OPSLIMIT_MODERATE")
  @js.native
  val cryptoPwhashOPSLIMITMODERATE: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_OPSLIMIT_SENSITIVE")
  @js.native
  val cryptoPwhashOPSLIMITSENSITIVE: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_PASSWD_MAX")
  @js.native
  val cryptoPwhashPASSWDMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_PASSWD_MIN")
  @js.native
  val cryptoPwhashPASSWDMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_SALTBYTES")
  @js.native
  val cryptoPwhashSALTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_STRBYTES")
  @js.native
  val cryptoPwhashSTRBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_STRPREFIX")
  @js.native
  val cryptoPwhashSTRPREFIX: String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256")
  @js.native
  def cryptoPwhashScryptsalsa208sha256(keyLength: Double, password: String, salt: Uint8Array, opsLimit: Double, memLimit: Double): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256")
  @js.native
  def cryptoPwhashScryptsalsa208sha256(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256")
  @js.native
  def cryptoPwhashScryptsalsa208sha256(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256")
  @js.native
  def cryptoPwhashScryptsalsa208sha256(keyLength: Double, password: Uint8Array, salt: Uint8Array, opsLimit: Double, memLimit: Double): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256")
  @js.native
  def cryptoPwhashScryptsalsa208sha256(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256")
  @js.native
  def cryptoPwhashScryptsalsa208sha256(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_BYTES_MAX")
  @js.native
  val cryptoPwhashScryptsalsa208sha256BYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_BYTES_MIN")
  @js.native
  val cryptoPwhashScryptsalsa208sha256BYTESMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_ll")
  @js.native
  def cryptoPwhashScryptsalsa208sha256Ll(password: String, salt: String, opsLimit: Double, r: Double, p: Double, keyLength: Double): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_ll")
  @js.native
  def cryptoPwhashScryptsalsa208sha256Ll(
    password: String,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_ll")
  @js.native
  def cryptoPwhashScryptsalsa208sha256Ll(
    password: String,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_ll")
  @js.native
  def cryptoPwhashScryptsalsa208sha256Ll(password: String, salt: Uint8Array, opsLimit: Double, r: Double, p: Double, keyLength: Double): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_ll")
  @js.native
  def cryptoPwhashScryptsalsa208sha256Ll(
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_ll")
  @js.native
  def cryptoPwhashScryptsalsa208sha256Ll(
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_ll")
  @js.native
  def cryptoPwhashScryptsalsa208sha256Ll(password: Uint8Array, salt: String, opsLimit: Double, r: Double, p: Double, keyLength: Double): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_ll")
  @js.native
  def cryptoPwhashScryptsalsa208sha256Ll(
    password: Uint8Array,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_ll")
  @js.native
  def cryptoPwhashScryptsalsa208sha256Ll(
    password: Uint8Array,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_ll")
  @js.native
  def cryptoPwhashScryptsalsa208sha256Ll(password: Uint8Array, salt: Uint8Array, opsLimit: Double, r: Double, p: Double, keyLength: Double): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_ll")
  @js.native
  def cryptoPwhashScryptsalsa208sha256Ll(
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_ll")
  @js.native
  def cryptoPwhashScryptsalsa208sha256Ll(
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_INTERACTIVE")
  @js.native
  val cryptoPwhashScryptsalsa208sha256MEMLIMITINTERACTIVE: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_MAX")
  @js.native
  val cryptoPwhashScryptsalsa208sha256MEMLIMITMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_MIN")
  @js.native
  val cryptoPwhashScryptsalsa208sha256MEMLIMITMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_SENSITIVE")
  @js.native
  val cryptoPwhashScryptsalsa208sha256MEMLIMITSENSITIVE: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_INTERACTIVE")
  @js.native
  val cryptoPwhashScryptsalsa208sha256OPSLIMITINTERACTIVE: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_MAX")
  @js.native
  val cryptoPwhashScryptsalsa208sha256OPSLIMITMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_MIN")
  @js.native
  val cryptoPwhashScryptsalsa208sha256OPSLIMITMIN: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_SENSITIVE")
  @js.native
  val cryptoPwhashScryptsalsa208sha256OPSLIMITSENSITIVE: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_SALTBYTES")
  @js.native
  val cryptoPwhashScryptsalsa208sha256SALTBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_STRBYTES")
  @js.native
  val cryptoPwhashScryptsalsa208sha256STRBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_STRPREFIX")
  @js.native
  val cryptoPwhashScryptsalsa208sha256STRPREFIX: String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_str")
  @js.native
  def cryptoPwhashScryptsalsa208sha256Str(password: String, opsLimit: Double, memLimit: Double): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_str")
  @js.native
  def cryptoPwhashScryptsalsa208sha256Str(password: Uint8Array, opsLimit: Double, memLimit: Double): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_str_verify")
  @js.native
  def cryptoPwhashScryptsalsa208sha256StrVerify(hashed_password: String, password: String): Boolean = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_str_verify")
  @js.native
  def cryptoPwhashScryptsalsa208sha256StrVerify(hashed_password: String, password: Uint8Array): Boolean = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_str")
  @js.native
  def cryptoPwhashStr(password: String, opsLimit: Double, memLimit: Double): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_str")
  @js.native
  def cryptoPwhashStr(password: Uint8Array, opsLimit: Double, memLimit: Double): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_str_verify")
  @js.native
  def cryptoPwhashStrVerify(hashed_password: String, password: String): Boolean = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_str_verify")
  @js.native
  def cryptoPwhashStrVerify(hashed_password: String, password: Uint8Array): Boolean = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult")
  @js.native
  def cryptoScalarmult(privateKey: Uint8Array, publicKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult")
  @js.native
  def cryptoScalarmult(privateKey: Uint8Array, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult")
  @js.native
  def cryptoScalarmult(privateKey: Uint8Array, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_BYTES")
  @js.native
  val cryptoScalarmultBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_base")
  @js.native
  def cryptoScalarmultBase(privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_base")
  @js.native
  def cryptoScalarmultBase(privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_base")
  @js.native
  def cryptoScalarmultBase(privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_curve25519_BYTES")
  @js.native
  val cryptoScalarmultCurve25519BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_curve25519_SCALARBYTES")
  @js.native
  val cryptoScalarmultCurve25519SCALARBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_ed25519_BYTES")
  @js.native
  val cryptoScalarmultEd25519BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_ed25519_SCALARBYTES")
  @js.native
  val cryptoScalarmultEd25519SCALARBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_ristretto255")
  @js.native
  def cryptoScalarmultRistretto255(scalar: Uint8Array, point: Uint8Array): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_ristretto255_BYTES")
  @js.native
  val cryptoScalarmultRistretto255BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_ristretto255_base")
  @js.native
  def cryptoScalarmultRistretto255Base(scalar: Uint8Array): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_ristretto255_SCALARBYTES")
  @js.native
  val cryptoScalarmultRistretto255SCALARBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_SCALARBYTES")
  @js.native
  val cryptoScalarmultSCALARBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_detached")
  @js.native
  def cryptoSecretboxDetached(message: String, nonce: Uint8Array, key: Uint8Array): SecretBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_detached")
  @js.native
  def cryptoSecretboxDetached(message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): StringSecretBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_detached")
  @js.native
  def cryptoSecretboxDetached(message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): SecretBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_detached")
  @js.native
  def cryptoSecretboxDetached(message: Uint8Array, nonce: Uint8Array, key: Uint8Array): SecretBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_detached")
  @js.native
  def cryptoSecretboxDetached(message: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): StringSecretBox = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_detached")
  @js.native
  def cryptoSecretboxDetached(message: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): SecretBox = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_easy")
  @js.native
  def cryptoSecretboxEasy(message: String, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_easy")
  @js.native
  def cryptoSecretboxEasy(message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_easy")
  @js.native
  def cryptoSecretboxEasy(message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_easy")
  @js.native
  def cryptoSecretboxEasy(message: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_easy")
  @js.native
  def cryptoSecretboxEasy(message: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_easy")
  @js.native
  def cryptoSecretboxEasy(message: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_KEYBYTES")
  @js.native
  val cryptoSecretboxKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_keygen")
  @js.native
  def cryptoSecretboxKeygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_keygen")
  @js.native
  def cryptoSecretboxKeygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_keygen")
  @js.native
  def cryptoSecretboxKeygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_MACBYTES")
  @js.native
  val cryptoSecretboxMACBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_MESSAGEBYTES_MAX")
  @js.native
  val cryptoSecretboxMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_NONCEBYTES")
  @js.native
  val cryptoSecretboxNONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_open_detached")
  @js.native
  def cryptoSecretboxOpenDetached(ciphertext: String, mac: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_open_detached")
  @js.native
  def cryptoSecretboxOpenDetached(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_open_detached")
  @js.native
  def cryptoSecretboxOpenDetached(
    ciphertext: String,
    mac: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_open_detached")
  @js.native
  def cryptoSecretboxOpenDetached(ciphertext: Uint8Array, mac: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_open_detached")
  @js.native
  def cryptoSecretboxOpenDetached(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_open_detached")
  @js.native
  def cryptoSecretboxOpenDetached(
    ciphertext: Uint8Array,
    mac: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_open_easy")
  @js.native
  def cryptoSecretboxOpenEasy(ciphertext: String, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_open_easy")
  @js.native
  def cryptoSecretboxOpenEasy(ciphertext: String, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_open_easy")
  @js.native
  def cryptoSecretboxOpenEasy(ciphertext: String, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_open_easy")
  @js.native
  def cryptoSecretboxOpenEasy(ciphertext: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_open_easy")
  @js.native
  def cryptoSecretboxOpenEasy(ciphertext: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_open_easy")
  @js.native
  def cryptoSecretboxOpenEasy(ciphertext: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_xchacha20poly1305_KEYBYTES")
  @js.native
  val cryptoSecretboxXchacha20poly1305KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_xchacha20poly1305_MACBYTES")
  @js.native
  val cryptoSecretboxXchacha20poly1305MACBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_xchacha20poly1305_MESSAGEBYTES_MAX")
  @js.native
  val cryptoSecretboxXchacha20poly1305MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_xchacha20poly1305_NONCEBYTES")
  @js.native
  val cryptoSecretboxXchacha20poly1305NONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_xsalsa20poly1305_KEYBYTES")
  @js.native
  val cryptoSecretboxXsalsa20poly1305KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_xsalsa20poly1305_MACBYTES")
  @js.native
  val cryptoSecretboxXsalsa20poly1305MACBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_xsalsa20poly1305_MESSAGEBYTES_MAX")
  @js.native
  val cryptoSecretboxXsalsa20poly1305MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_xsalsa20poly1305_NONCEBYTES")
  @js.native
  val cryptoSecretboxXsalsa20poly1305NONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_ABYTES")
  @js.native
  val cryptoSecretstreamXchacha20poly1305ABYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_HEADERBYTES")
  @js.native
  val cryptoSecretstreamXchacha20poly1305HEADERBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_init_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305InitPull(header: Uint8Array, key: Uint8Array): StateAddress = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_init_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305InitPush(key: Uint8Array): Header = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_init_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305InitPush(key: Uint8Array, outputFormat: StringOutputFormat): State = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_init_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305InitPush(key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Header = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_KEYBYTES")
  @js.native
  val cryptoSecretstreamXchacha20poly1305KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_keygen")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Keygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_keygen")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Keygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_keygen")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_MESSAGEBYTES_MAX")
  @js.native
  val cryptoSecretstreamXchacha20poly1305MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String): MessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: StateAddress,
    cipher: String,
    ad: js.UndefOr[scala.Nothing],
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: String): MessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: String, outputFormat: StringOutputFormat): StringMessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: String, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: Null, outputFormat: StringOutputFormat): StringMessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: Null, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: Uint8Array): MessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: Uint8Array, outputFormat: StringOutputFormat): StringMessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: Uint8Array, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: Uint8Array): MessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: StateAddress,
    cipher: Uint8Array,
    ad: js.UndefOr[scala.Nothing],
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: Uint8Array, ad: String): MessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: Uint8Array, ad: String, outputFormat: StringOutputFormat): StringMessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: Uint8Array, ad: String, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: Uint8Array, ad: Null, outputFormat: StringOutputFormat): StringMessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: Uint8Array, ad: Null, outputFormat: Uint8ArrayOutputFormat): MessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: Uint8Array, ad: Uint8Array): MessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: Uint8Array, ad: Uint8Array, outputFormat: StringOutputFormat): StringMessageTag = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: StateAddress,
    cipher: Uint8Array,
    ad: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(state_address: StateAddress, message_chunk: String, ad: String, tag: Double): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: String,
    ad: String,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: String,
    ad: String,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(state_address: StateAddress, message_chunk: String, ad: Null, tag: Double): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: String,
    ad: Null,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: String,
    ad: Null,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(state_address: StateAddress, message_chunk: String, ad: Uint8Array, tag: Double): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: String,
    ad: Uint8Array,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: String,
    ad: Uint8Array,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(state_address: StateAddress, message_chunk: Uint8Array, ad: String, tag: Double): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: Uint8Array,
    ad: String,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: Uint8Array,
    ad: String,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(state_address: StateAddress, message_chunk: Uint8Array, ad: Null, tag: Double): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: Uint8Array,
    ad: Null,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: Uint8Array,
    ad: Null,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(state_address: StateAddress, message_chunk: Uint8Array, ad: Uint8Array, tag: Double): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: Uint8Array,
    ad: Uint8Array,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: Uint8Array,
    ad: Uint8Array,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_rekey")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Rekey(state_address: StateAddress): `true` = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_TAG_FINAL")
  @js.native
  val cryptoSecretstreamXchacha20poly1305TAGFINAL: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_TAG_MESSAGE")
  @js.native
  val cryptoSecretstreamXchacha20poly1305TAGMESSAGE: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_TAG_PUSH")
  @js.native
  val cryptoSecretstreamXchacha20poly1305TAGPUSH: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_TAG_REKEY")
  @js.native
  val cryptoSecretstreamXchacha20poly1305TAGREKEY: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash")
  @js.native
  def cryptoShorthash(message: String, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash")
  @js.native
  def cryptoShorthash(message: String, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash")
  @js.native
  def cryptoShorthash(message: String, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash")
  @js.native
  def cryptoShorthash(message: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash")
  @js.native
  def cryptoShorthash(message: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash")
  @js.native
  def cryptoShorthash(message: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_BYTES")
  @js.native
  val cryptoShorthashBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_KEYBYTES")
  @js.native
  val cryptoShorthashKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_keygen")
  @js.native
  def cryptoShorthashKeygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_keygen")
  @js.native
  def cryptoShorthashKeygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_keygen")
  @js.native
  def cryptoShorthashKeygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_siphash24_BYTES")
  @js.native
  val cryptoShorthashSiphash24BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_siphash24_KEYBYTES")
  @js.native
  val cryptoShorthashSiphash24KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_siphashx24")
  @js.native
  def cryptoShorthashSiphashx24(message: String, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_siphashx24")
  @js.native
  def cryptoShorthashSiphashx24(message: String, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_siphashx24")
  @js.native
  def cryptoShorthashSiphashx24(message: String, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_siphashx24")
  @js.native
  def cryptoShorthashSiphashx24(message: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_siphashx24")
  @js.native
  def cryptoShorthashSiphashx24(message: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_siphashx24")
  @js.native
  def cryptoShorthashSiphashx24(message: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_siphashx24_BYTES")
  @js.native
  val cryptoShorthashSiphashx24BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_siphashx24_KEYBYTES")
  @js.native
  val cryptoShorthashSiphashx24KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign")
  @js.native
  def cryptoSign(message: String, privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign")
  @js.native
  def cryptoSign(message: String, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign")
  @js.native
  def cryptoSign(message: String, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign")
  @js.native
  def cryptoSign(message: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign")
  @js.native
  def cryptoSign(message: Uint8Array, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign")
  @js.native
  def cryptoSign(message: Uint8Array, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_BYTES")
  @js.native
  val cryptoSignBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_detached")
  @js.native
  def cryptoSignDetached(message: String, privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_detached")
  @js.native
  def cryptoSignDetached(message: String, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_detached")
  @js.native
  def cryptoSignDetached(message: String, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_detached")
  @js.native
  def cryptoSignDetached(message: Uint8Array, privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_detached")
  @js.native
  def cryptoSignDetached(message: Uint8Array, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_detached")
  @js.native
  def cryptoSignDetached(message: Uint8Array, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_BYTES")
  @js.native
  val cryptoSignEd25519BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_MESSAGEBYTES_MAX")
  @js.native
  val cryptoSignEd25519MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_PUBLICKEYBYTES")
  @js.native
  val cryptoSignEd25519PUBLICKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_pk_to_curve25519")
  @js.native
  def cryptoSignEd25519PkToCurve25519(edPk: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_pk_to_curve25519")
  @js.native
  def cryptoSignEd25519PkToCurve25519(edPk: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_pk_to_curve25519")
  @js.native
  def cryptoSignEd25519PkToCurve25519(edPk: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_SECRETKEYBYTES")
  @js.native
  val cryptoSignEd25519SECRETKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_SEEDBYTES")
  @js.native
  val cryptoSignEd25519SEEDBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_sk_to_curve25519")
  @js.native
  def cryptoSignEd25519SkToCurve25519(edSk: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_sk_to_curve25519")
  @js.native
  def cryptoSignEd25519SkToCurve25519(edSk: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_sk_to_curve25519")
  @js.native
  def cryptoSignEd25519SkToCurve25519(edSk: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_sk_to_pk")
  @js.native
  def cryptoSignEd25519SkToPk(privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_sk_to_pk")
  @js.native
  def cryptoSignEd25519SkToPk(privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_sk_to_pk")
  @js.native
  def cryptoSignEd25519SkToPk(privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_sk_to_seed")
  @js.native
  def cryptoSignEd25519SkToSeed(privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_sk_to_seed")
  @js.native
  def cryptoSignEd25519SkToSeed(privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_sk_to_seed")
  @js.native
  def cryptoSignEd25519SkToSeed(privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_final_create")
  @js.native
  def cryptoSignFinalCreate(state_address: StateAddress, privateKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_final_create")
  @js.native
  def cryptoSignFinalCreate(state_address: StateAddress, privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_final_create")
  @js.native
  def cryptoSignFinalCreate(state_address: StateAddress, privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_final_verify")
  @js.native
  def cryptoSignFinalVerify(state_address: StateAddress, signature: Uint8Array, publicKey: Uint8Array): Boolean = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_init")
  @js.native
  def cryptoSignInit(): StateAddress = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_keypair")
  @js.native
  def cryptoSignKeypair(): KeyPair = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_keypair")
  @js.native
  def cryptoSignKeypair(outputFormat: StringOutputFormat): StringKeyPair = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_keypair")
  @js.native
  def cryptoSignKeypair(outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_MESSAGEBYTES_MAX")
  @js.native
  val cryptoSignMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_open")
  @js.native
  def cryptoSignOpen(signedMessage: String, publicKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_open")
  @js.native
  def cryptoSignOpen(signedMessage: String, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_open")
  @js.native
  def cryptoSignOpen(signedMessage: String, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_open")
  @js.native
  def cryptoSignOpen(signedMessage: Uint8Array, publicKey: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_open")
  @js.native
  def cryptoSignOpen(signedMessage: Uint8Array, publicKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_open")
  @js.native
  def cryptoSignOpen(signedMessage: Uint8Array, publicKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_PUBLICKEYBYTES")
  @js.native
  val cryptoSignPUBLICKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_SECRETKEYBYTES")
  @js.native
  val cryptoSignSECRETKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_SEEDBYTES")
  @js.native
  val cryptoSignSEEDBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_seed_keypair")
  @js.native
  def cryptoSignSeedKeypair(seed: Uint8Array): KeyPair = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_seed_keypair")
  @js.native
  def cryptoSignSeedKeypair(seed: Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_seed_keypair")
  @js.native
  def cryptoSignSeedKeypair(seed: Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_update")
  @js.native
  def cryptoSignUpdate(state_address: StateAddress, message_chunk: String): Unit = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_update")
  @js.native
  def cryptoSignUpdate(state_address: StateAddress, message_chunk: Uint8Array): Unit = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_verify_detached")
  @js.native
  def cryptoSignVerifyDetached(signature: Uint8Array, message: String, publicKey: Uint8Array): Boolean = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_verify_detached")
  @js.native
  def cryptoSignVerifyDetached(signature: Uint8Array, message: Uint8Array, publicKey: Uint8Array): Boolean = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20")
  @js.native
  def cryptoStreamChacha20(outLength: Double, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20")
  @js.native
  def cryptoStreamChacha20(outLength: Double, key: Uint8Array, nonce: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20")
  @js.native
  def cryptoStreamChacha20(outLength: Double, key: Uint8Array, nonce: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_KEYBYTES")
  @js.native
  val cryptoStreamChacha20IetfKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_MESSAGEBYTES_MAX")
  @js.native
  val cryptoStreamChacha20IetfMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_NONCEBYTES")
  @js.native
  val cryptoStreamChacha20IetfNONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_xor")
  @js.native
  def cryptoStreamChacha20IetfXor(input_message: String, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_xor")
  @js.native
  def cryptoStreamChacha20IetfXor(input_message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_xor")
  @js.native
  def cryptoStreamChacha20IetfXor(input_message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_xor")
  @js.native
  def cryptoStreamChacha20IetfXor(input_message: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_xor")
  @js.native
  def cryptoStreamChacha20IetfXor(input_message: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_xor")
  @js.native
  def cryptoStreamChacha20IetfXor(
    input_message: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_xor_ic")
  @js.native
  def cryptoStreamChacha20IetfXorIc(input_message: String, nonce: Uint8Array, nonce_increment: Double, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_xor_ic")
  @js.native
  def cryptoStreamChacha20IetfXorIc(
    input_message: String,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_xor_ic")
  @js.native
  def cryptoStreamChacha20IetfXorIc(
    input_message: String,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_xor_ic")
  @js.native
  def cryptoStreamChacha20IetfXorIc(input_message: Uint8Array, nonce: Uint8Array, nonce_increment: Double, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_xor_ic")
  @js.native
  def cryptoStreamChacha20IetfXorIc(
    input_message: Uint8Array,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_xor_ic")
  @js.native
  def cryptoStreamChacha20IetfXorIc(
    input_message: Uint8Array,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_KEYBYTES")
  @js.native
  val cryptoStreamChacha20KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_keygen")
  @js.native
  def cryptoStreamChacha20Keygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_keygen")
  @js.native
  def cryptoStreamChacha20Keygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_keygen")
  @js.native
  def cryptoStreamChacha20Keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_MESSAGEBYTES_MAX")
  @js.native
  val cryptoStreamChacha20MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_NONCEBYTES")
  @js.native
  val cryptoStreamChacha20NONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_xor")
  @js.native
  def cryptoStreamChacha20Xor(input_message: String, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_xor")
  @js.native
  def cryptoStreamChacha20Xor(input_message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_xor")
  @js.native
  def cryptoStreamChacha20Xor(input_message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_xor")
  @js.native
  def cryptoStreamChacha20Xor(input_message: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_xor")
  @js.native
  def cryptoStreamChacha20Xor(input_message: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_xor")
  @js.native
  def cryptoStreamChacha20Xor(
    input_message: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_xor_ic")
  @js.native
  def cryptoStreamChacha20XorIc(input_message: String, nonce: Uint8Array, nonce_increment: Double, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_xor_ic")
  @js.native
  def cryptoStreamChacha20XorIc(
    input_message: String,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_xor_ic")
  @js.native
  def cryptoStreamChacha20XorIc(
    input_message: String,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_xor_ic")
  @js.native
  def cryptoStreamChacha20XorIc(input_message: Uint8Array, nonce: Uint8Array, nonce_increment: Double, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_xor_ic")
  @js.native
  def cryptoStreamChacha20XorIc(
    input_message: Uint8Array,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_xor_ic")
  @js.native
  def cryptoStreamChacha20XorIc(
    input_message: Uint8Array,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_KEYBYTES")
  @js.native
  val cryptoStreamKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_keygen")
  @js.native
  def cryptoStreamKeygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_keygen")
  @js.native
  def cryptoStreamKeygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_keygen")
  @js.native
  def cryptoStreamKeygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_MESSAGEBYTES_MAX")
  @js.native
  val cryptoStreamMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_NONCEBYTES")
  @js.native
  val cryptoStreamNONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_salsa2012_KEYBYTES")
  @js.native
  val cryptoStreamSalsa2012KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_salsa2012_MESSAGEBYTES_MAX")
  @js.native
  val cryptoStreamSalsa2012MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_salsa2012_NONCEBYTES")
  @js.native
  val cryptoStreamSalsa2012NONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_salsa208_KEYBYTES")
  @js.native
  val cryptoStreamSalsa208KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_salsa208_MESSAGEBYTES_MAX")
  @js.native
  val cryptoStreamSalsa208MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_salsa208_NONCEBYTES")
  @js.native
  val cryptoStreamSalsa208NONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_salsa20_KEYBYTES")
  @js.native
  val cryptoStreamSalsa20KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_salsa20_MESSAGEBYTES_MAX")
  @js.native
  val cryptoStreamSalsa20MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_salsa20_NONCEBYTES")
  @js.native
  val cryptoStreamSalsa20NONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_KEYBYTES")
  @js.native
  val cryptoStreamXchacha20KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_keygen")
  @js.native
  def cryptoStreamXchacha20Keygen(): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_keygen")
  @js.native
  def cryptoStreamXchacha20Keygen(outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_keygen")
  @js.native
  def cryptoStreamXchacha20Keygen(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_MESSAGEBYTES_MAX")
  @js.native
  val cryptoStreamXchacha20MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_NONCEBYTES")
  @js.native
  val cryptoStreamXchacha20NONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_xor")
  @js.native
  def cryptoStreamXchacha20Xor(input_message: String, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_xor")
  @js.native
  def cryptoStreamXchacha20Xor(input_message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_xor")
  @js.native
  def cryptoStreamXchacha20Xor(input_message: String, nonce: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_xor")
  @js.native
  def cryptoStreamXchacha20Xor(input_message: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_xor")
  @js.native
  def cryptoStreamXchacha20Xor(input_message: Uint8Array, nonce: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_xor")
  @js.native
  def cryptoStreamXchacha20Xor(
    input_message: Uint8Array,
    nonce: Uint8Array,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_xor_ic")
  @js.native
  def cryptoStreamXchacha20XorIc(input_message: String, nonce: Uint8Array, nonce_increment: Double, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_xor_ic")
  @js.native
  def cryptoStreamXchacha20XorIc(
    input_message: String,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_xor_ic")
  @js.native
  def cryptoStreamXchacha20XorIc(
    input_message: String,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_xor_ic")
  @js.native
  def cryptoStreamXchacha20XorIc(input_message: Uint8Array, nonce: Uint8Array, nonce_increment: Double, key: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_xor_ic")
  @js.native
  def cryptoStreamXchacha20XorIc(
    input_message: Uint8Array,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_xor_ic")
  @js.native
  def cryptoStreamXchacha20XorIc(
    input_message: Uint8Array,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xsalsa20_KEYBYTES")
  @js.native
  val cryptoStreamXsalsa20KEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xsalsa20_MESSAGEBYTES_MAX")
  @js.native
  val cryptoStreamXsalsa20MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xsalsa20_NONCEBYTES")
  @js.native
  val cryptoStreamXsalsa20NONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_verify_16_BYTES")
  @js.native
  val cryptoVerify16BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_verify_32_BYTES")
  @js.native
  val cryptoVerify32BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_verify_64_BYTES")
  @js.native
  val cryptoVerify64BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_IETF_ABYTES")
  @js.native
  val crypto_AeadChacha20poly1305IETFABYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_IETF_KEYBYTES")
  @js.native
  val crypto_AeadChacha20poly1305IETFKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_IETF_MESSAGEBYTES_MAX")
  @js.native
  val crypto_AeadChacha20poly1305IETFMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_IETF_NPUBBYTES")
  @js.native
  val crypto_AeadChacha20poly1305IETFNPUBBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_IETF_NSECBYTES")
  @js.native
  val crypto_AeadChacha20poly1305IETFNSECBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_IETF_ABYTES")
  @js.native
  val crypto_AeadXchacha20poly1305IETFABYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_IETF_KEYBYTES")
  @js.native
  val crypto_AeadXchacha20poly1305IETFKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_IETF_MESSAGEBYTES_MAX")
  @js.native
  val crypto_AeadXchacha20poly1305IETFMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_IETF_NPUBBYTES")
  @js.native
  val crypto_AeadXchacha20poly1305IETFNPUBBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_IETF_NSECBYTES")
  @js.native
  val crypto_AeadXchacha20poly1305IETFNSECBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_IETF_KEYBYTES")
  @js.native
  val crypto_StreamChacha20IETFKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_IETF_MESSAGEBYTES_MAX")
  @js.native
  val crypto_StreamChacha20IETFMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_IETF_NONCEBYTES")
  @js.native
  val crypto_StreamChacha20IETFNONCEBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "from_base64")
  @js.native
  def fromBase64(input: String): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "from_base64")
  @js.native
  def fromBase64(input: String, variant: base64Variants): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "from_hex")
  @js.native
  def fromHex(input: String): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "from_string")
  @js.native
  def fromString(str: String): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "increment")
  @js.native
  def increment(bytes: Uint8Array): Unit = js.native
  
  @JSImport("libsodium-wrappers-sumo", "is_zero")
  @js.native
  def isZero(bytes: Uint8Array): Boolean = js.native
  
  @JSImport("libsodium-wrappers-sumo", "memcmp")
  @js.native
  def memcmp(b1: Uint8Array, b2: Uint8Array): Boolean = js.native
  
  @JSImport("libsodium-wrappers-sumo", "memzero")
  @js.native
  def memzero(bytes: Uint8Array): Unit = js.native
  
  @JSImport("libsodium-wrappers-sumo", "output_formats")
  @js.native
  def outputFormats(): js.Array[Uint8ArrayOutputFormat | StringOutputFormat] = js.native
  
  @JSImport("libsodium-wrappers-sumo", "pad")
  @js.native
  def pad(buf: Uint8Array, blocksize: Double): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "randombytes_buf")
  @js.native
  def randombytesBuf(length: Double): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "randombytes_buf")
  @js.native
  def randombytesBuf(length: Double, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "randombytes_buf")
  @js.native
  def randombytesBuf(length: Double, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "randombytes_buf_deterministic")
  @js.native
  def randombytesBufDeterministic(length: Double, seed: Uint8Array): Uint8Array = js.native
  @JSImport("libsodium-wrappers-sumo", "randombytes_buf_deterministic")
  @js.native
  def randombytesBufDeterministic(length: Double, seed: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  @JSImport("libsodium-wrappers-sumo", "randombytes_buf_deterministic")
  @js.native
  def randombytesBufDeterministic(length: Double, seed: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  
  @JSImport("libsodium-wrappers-sumo", "randombytes_close")
  @js.native
  def randombytesClose(): Unit = js.native
  
  @JSImport("libsodium-wrappers-sumo", "randombytes_random")
  @js.native
  def randombytesRandom(): Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "randombytes_stir")
  @js.native
  def randombytesStir(): Unit = js.native
  
  @JSImport("libsodium-wrappers-sumo", "randombytes_uniform")
  @js.native
  def randombytesUniform(upper_bound: Double): Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "ready")
  @js.native
  val ready: js.Promise[Unit] = js.native
  
  @JSImport("libsodium-wrappers-sumo", "sodium_version_string")
  @js.native
  def sodiumVersionString(): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "symbols")
  @js.native
  def symbols(): js.Array[String] = js.native
  
  @JSImport("libsodium-wrappers-sumo", "to_base64")
  @js.native
  def toBase64(input: String): String = js.native
  @JSImport("libsodium-wrappers-sumo", "to_base64")
  @js.native
  def toBase64(input: String, variant: base64Variants): String = js.native
  @JSImport("libsodium-wrappers-sumo", "to_base64")
  @js.native
  def toBase64(input: Uint8Array): String = js.native
  @JSImport("libsodium-wrappers-sumo", "to_base64")
  @js.native
  def toBase64(input: Uint8Array, variant: base64Variants): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "to_hex")
  @js.native
  def toHex(input: String): String = js.native
  @JSImport("libsodium-wrappers-sumo", "to_hex")
  @js.native
  def toHex(input: Uint8Array): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "to_string")
  @js.native
  def toString(bytes: Uint8Array): String = js.native
  
  @JSImport("libsodium-wrappers-sumo", "unpad")
  @js.native
  def unpad(buf: Uint8Array, blocksize: Double): Uint8Array = js.native
}
