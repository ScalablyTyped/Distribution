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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("libsodium-wrappers-sumo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libsodium-wrappers-sumo", "SODIUM_LIBRARY_VERSION_MAJOR")
  @js.native
  val SODIUM_LIBRARY_VERSION_MAJOR: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "SODIUM_LIBRARY_VERSION_MINOR")
  @js.native
  val SODIUM_LIBRARY_VERSION_MINOR: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "SODIUM_VERSION_STRING")
  @js.native
  val SODIUM_VERSION_STRING: String = js.native
  
  inline def add(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("libsodium-wrappers-sumo", "base64_variants")
  @js.native
  object base64Variants extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.libsodiumWrappers.mod.base64Variants & Double] = js.native
    
    /* 0 */ val ORIGINAL: typings.libsodiumWrappers.mod.base64Variants.ORIGINAL & Double = js.native
    
    /* 1 */ val ORIGINAL_NO_PADDING: typings.libsodiumWrappers.mod.base64Variants.ORIGINAL_NO_PADDING & Double = js.native
    
    /* 2 */ val URLSAFE: typings.libsodiumWrappers.mod.base64Variants.URLSAFE & Double = js.native
    
    /* 3 */ val URLSAFE_NO_PADDING: typings.libsodiumWrappers.mod.base64Variants.URLSAFE_NO_PADDING & Double = js.native
  }
  
  inline def compare(b1: js.typedarray.Uint8Array, b2: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ABYTES")
  @js.native
  val cryptoAeadChacha20poly1305ABYTES: Double = js.native
  
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: String | js.typedarray.Uint8Array | Null,
    ciphertext: String | js.typedarray.Uint8Array,
    additional_data: String | js.typedarray.Uint8Array | Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: String | js.typedarray.Uint8Array | Null,
    ciphertext: String | js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: String | js.typedarray.Uint8Array | Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: String | js.typedarray.Uint8Array,
    additional_data: String | js.typedarray.Uint8Array | Null,
    secret_nonce: String | js.typedarray.Uint8Array | Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: String | js.typedarray.Uint8Array,
    additional_data: String | js.typedarray.Uint8Array | Null,
    secret_nonce: String | js.typedarray.Uint8Array | Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): CryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[CryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_ABYTES")
  @js.native
  val cryptoAeadChacha20poly1305IetfABYTES: Double = js.native
  
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: String | js.typedarray.Uint8Array | Null,
    ciphertext: String | js.typedarray.Uint8Array,
    additional_data: String | js.typedarray.Uint8Array | Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: String | js.typedarray.Uint8Array | Null,
    ciphertext: String | js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: String | js.typedarray.Uint8Array | Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String | js.typedarray.Uint8Array,
    additional_data: String | js.typedarray.Uint8Array | Null,
    secret_nonce: String | js.typedarray.Uint8Array | Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String | js.typedarray.Uint8Array,
    additional_data: String | js.typedarray.Uint8Array | Null,
    secret_nonce: String | js.typedarray.Uint8Array | Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): CryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[CryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_ietf_KEYBYTES")
  @js.native
  val cryptoAeadChacha20poly1305IetfKEYBYTES: Double = js.native
  
  inline def cryptoAeadChacha20poly1305IetfKeygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAeadChacha20poly1305IetfKeygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305IetfKeygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
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
  
  inline def cryptoAeadChacha20poly1305Keygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAeadChacha20poly1305Keygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoAeadChacha20poly1305Keygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
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
  
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: String | js.typedarray.Uint8Array | Null,
    ciphertext: String | js.typedarray.Uint8Array,
    additional_data: String | js.typedarray.Uint8Array | Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: String,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: String,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: String | js.typedarray.Uint8Array | Null,
    ciphertext: String | js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: String | js.typedarray.Uint8Array | Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String | js.typedarray.Uint8Array,
    additional_data: String | js.typedarray.Uint8Array | Null,
    secret_nonce: String | js.typedarray.Uint8Array | Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String | js.typedarray.Uint8Array,
    additional_data: String | js.typedarray.Uint8Array | Null,
    secret_nonce: String | js.typedarray.Uint8Array | Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): CryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[CryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_KEYBYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfKEYBYTES: Double = js.native
  
  inline def cryptoAeadXchacha20poly1305IetfKeygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAeadXchacha20poly1305IetfKeygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoAeadXchacha20poly1305IetfKeygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_MESSAGEBYTES_MAX")
  @js.native
  val cryptoAeadXchacha20poly1305IetfMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_NPUBBYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfNPUBBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_aead_xchacha20poly1305_ietf_NSECBYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfNSECBYTES: Double = js.native
  
  inline def cryptoAuth(message: String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAuth(message: String, key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAuth(message: String, key: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAuth(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAuth(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAuth(
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_BYTES")
  @js.native
  val cryptoAuthBYTES: Double = js.native
  
  inline def cryptoAuthHmacsha256(message: String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha256")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAuthHmacsha256(message: String, key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha256")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAuthHmacsha256(message: String, key: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha256")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAuthHmacsha256(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha256")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAuthHmacsha256(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha256")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAuthHmacsha256(
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha256")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256_BYTES")
  @js.native
  val cryptoAuthHmacsha256BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256_KEYBYTES")
  @js.native
  val cryptoAuthHmacsha256KEYBYTES: Double = js.native
  
  inline def cryptoAuthHmacsha256Keygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha256_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAuthHmacsha256Keygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha256_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoAuthHmacsha256Keygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha256_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoAuthHmacsha256Verify(tag: js.typedarray.Uint8Array, message: String, key: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha256_verify")(tag.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cryptoAuthHmacsha256Verify(tag: js.typedarray.Uint8Array, message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha256_verify")(tag.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoAuthHmacsha512(message: String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha512")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAuthHmacsha512(message: String, key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha512")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAuthHmacsha512(message: String, key: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha512")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAuthHmacsha512(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha512")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAuthHmacsha512(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha512")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoAuthHmacsha512(
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha512")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
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
  
  inline def cryptoAuthHmacsha512Keygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha512_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAuthHmacsha512Keygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha512_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoAuthHmacsha512Keygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha512_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoAuthHmacsha512Verify(tag: js.typedarray.Uint8Array, message: String, key: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha512_verify")(tag.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cryptoAuthHmacsha512Verify(tag: js.typedarray.Uint8Array, message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_hmacsha512_verify")(tag.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_auth_KEYBYTES")
  @js.native
  val cryptoAuthKEYBYTES: Double = js.native
  
  inline def cryptoAuthKeygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoAuthKeygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoAuthKeygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoAuthVerify(tag: js.typedarray.Uint8Array, message: String, key: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_verify")(tag.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cryptoAuthVerify(tag: js.typedarray.Uint8Array, message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_verify")(tag.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_BEFORENMBYTES")
  @js.native
  val cryptoBoxBEFORENMBYTES: Double = js.native
  
  inline def cryptoBoxBeforenm(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_beforenm")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxBeforenm(
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_beforenm")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxBeforenm(
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_beforenm")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_BEFORENMBYTES")
  @js.native
  val cryptoBoxCurve25519xchacha20poly1305BEFORENMBYTES: Double = js.native
  
  inline def cryptoBoxCurve25519xchacha20poly1305Keypair(publicKey: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_curve25519xchacha20poly1305_keypair")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
  inline def cryptoBoxCurve25519xchacha20poly1305Keypair(
    publicKey: js.typedarray.Uint8Array,
    secretKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringKeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_curve25519xchacha20poly1305_keypair")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringKeyPair]
  inline def cryptoBoxCurve25519xchacha20poly1305Keypair(
    publicKey: js.typedarray.Uint8Array,
    secretKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_curve25519xchacha20poly1305_keypair")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
  
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
  
  inline def cryptoBoxCurve25519xchacha20poly1305Seal(message: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_curve25519xchacha20poly1305_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxCurve25519xchacha20poly1305Seal(
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_curve25519xchacha20poly1305_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxCurve25519xchacha20poly1305Seal(
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_curve25519xchacha20poly1305_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoBoxCurve25519xchacha20poly1305SealOpen(
    ciphertext: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    secretKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_curve25519xchacha20poly1305_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxCurve25519xchacha20poly1305SealOpen(
    ciphertext: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    secretKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_curve25519xchacha20poly1305_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxCurve25519xchacha20poly1305SealOpen(
    ciphertext: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    secretKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_curve25519xchacha20poly1305_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
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
  
  inline def cryptoBoxDetached(
    message: String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): CryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[CryptoBox]
  inline def cryptoBoxDetached(
    message: String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoBoxDetached(
    message: String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[CryptoBox]
  inline def cryptoBoxDetached(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): CryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[CryptoBox]
  inline def cryptoBoxDetached(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoBox]
  inline def cryptoBoxDetached(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[CryptoBox]
  
  inline def cryptoBoxEasy(
    message: String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxEasy(
    message: String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxEasy(
    message: String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxEasy(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxEasy(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxEasy(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoBoxEasyAfternm(message: String, nonce: js.typedarray.Uint8Array, sharedKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxEasyAfternm(
    message: String,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxEasyAfternm(
    message: String,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxEasyAfternm(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxEasyAfternm(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxEasyAfternm(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoBoxKeypair(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_keypair")().asInstanceOf[KeyPair]
  inline def cryptoBoxKeypair(outputFormat: StringOutputFormat): StringKeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[StringKeyPair]
  inline def cryptoBoxKeypair(outputFormat: Uint8ArrayOutputFormat): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_MACBYTES")
  @js.native
  val cryptoBoxMACBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_MESSAGEBYTES_MAX")
  @js.native
  val cryptoBoxMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_box_NONCEBYTES")
  @js.native
  val cryptoBoxNONCEBYTES: Double = js.native
  
  inline def cryptoBoxOpenDetached(
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxOpenDetached(
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxOpenDetached(
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxOpenDetached(
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxOpenDetached(
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxOpenDetached(
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoBoxOpenEasy(
    ciphertext: String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxOpenEasy(
    ciphertext: String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxOpenEasy(
    ciphertext: String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxOpenEasy(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxOpenEasy(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxOpenEasy(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoBoxOpenEasyAfternm(ciphertext: String, nonce: js.typedarray.Uint8Array, sharedKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxOpenEasyAfternm(
    ciphertext: String,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxOpenEasyAfternm(
    ciphertext: String,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxOpenEasyAfternm(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxOpenEasyAfternm(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxOpenEasyAfternm(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
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
  
  inline def cryptoBoxSeal(message: String, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxSeal(message: String, publicKey: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxSeal(message: String, publicKey: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxSeal(message: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxSeal(
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxSeal(
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoBoxSealOpen(ciphertext: String, publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxSealOpen(
    ciphertext: String,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxSealOpen(
    ciphertext: String,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxSealOpen(
    ciphertext: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoBoxSealOpen(
    ciphertext: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoBoxSealOpen(
    ciphertext: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoBoxSeedKeypair(seed: js.typedarray.Uint8Array): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seed_keypair")(seed.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  inline def cryptoBoxSeedKeypair(seed: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringKeyPair]
  inline def cryptoBoxSeedKeypair(seed: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
  
  inline def cryptoCoreEd25519Add(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_add")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519Add(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_add")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreEd25519Add(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_add")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ed25519_BYTES")
  @js.native
  val cryptoCoreEd25519BYTES: Double = js.native
  
  inline def cryptoCoreEd25519FromHash(r: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_from_hash")(r.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519FromHash(r: String, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_from_hash")(r.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreEd25519FromHash(r: String, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_from_hash")(r.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519FromHash(r: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_from_hash")(r.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519FromHash(r: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_from_hash")(r.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreEd25519FromHash(r: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_from_hash")(r.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreEd25519FromUniform(r: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_from_uniform")(r.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519FromUniform(r: String, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_from_uniform")(r.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreEd25519FromUniform(r: String, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_from_uniform")(r.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519FromUniform(r: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_from_uniform")(r.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519FromUniform(r: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_from_uniform")(r.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreEd25519FromUniform(r: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_from_uniform")(r.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ed25519_HASHBYTES")
  @js.native
  val cryptoCoreEd25519HASHBYTES: Double = js.native
  
  inline def cryptoCoreEd25519IsValidPoint(repr: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_is_valid_point")(repr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ed25519_NONREDUCEDSCALARBYTES")
  @js.native
  val cryptoCoreEd25519NONREDUCEDSCALARBYTES: Double = js.native
  
  inline def cryptoCoreEd25519Random(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_random")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519Random(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_random")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoCoreEd25519Random(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_random")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ed25519_SCALARBYTES")
  @js.native
  val cryptoCoreEd25519SCALARBYTES: Double = js.native
  
  inline def cryptoCoreEd25519ScalarAdd(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519ScalarAdd(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreEd25519ScalarAdd(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreEd25519ScalarComplement(s: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_complement")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519ScalarComplement(s: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_complement")(s.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreEd25519ScalarComplement(s: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_complement")(s.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreEd25519ScalarInvert(s: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_invert")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519ScalarInvert(s: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_invert")(s.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreEd25519ScalarInvert(s: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_invert")(s.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreEd25519ScalarMul(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_mul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519ScalarMul(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_mul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreEd25519ScalarMul(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_mul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreEd25519ScalarNegate(s: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_negate")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519ScalarNegate(s: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_negate")(s.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreEd25519ScalarNegate(s: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_negate")(s.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreEd25519ScalarRandom(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_random")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519ScalarRandom(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_random")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoCoreEd25519ScalarRandom(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_random")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreEd25519ScalarReduce(sample: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_reduce")(sample.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519ScalarReduce(sample: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_reduce")(sample.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreEd25519ScalarReduce(sample: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_reduce")(sample.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreEd25519ScalarSub(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_sub")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519ScalarSub(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_sub")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreEd25519ScalarSub(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_sub")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreEd25519Sub(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_sub")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreEd25519Sub(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_sub")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreEd25519Sub(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_sub")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
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
  
  inline def cryptoCoreRistretto255Add(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_add")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255Add(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_add")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreRistretto255Add(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_add")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_BYTES")
  @js.native
  val cryptoCoreRistretto255BYTES: Double = js.native
  
  inline def cryptoCoreRistretto255FromHash(r: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_from_hash")(r.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255FromHash(r: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_from_hash")(r.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreRistretto255FromHash(r: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_from_hash")(r.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_HASHBYTES")
  @js.native
  val cryptoCoreRistretto255HASHBYTES: Double = js.native
  
  inline def cryptoCoreRistretto255IsValidPoint(point: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_is_valid_point")(point.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def cryptoCoreRistretto255IsValidPoint(point: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_is_valid_point")(point.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_NONREDUCEDSCALARBYTES")
  @js.native
  val cryptoCoreRistretto255NONREDUCEDSCALARBYTES: Double = js.native
  
  inline def cryptoCoreRistretto255Random(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_random")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255Random(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_random")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoCoreRistretto255Random(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_random")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_SCALARBYTES")
  @js.native
  val cryptoCoreRistretto255SCALARBYTES: Double = js.native
  
  inline def cryptoCoreRistretto255ScalarAdd(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarAdd(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreRistretto255ScalarAdd(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreRistretto255ScalarComplement(scalar: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_complement")(scalar.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarComplement(scalar: String, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_complement")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreRistretto255ScalarComplement(scalar: String, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_complement")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarComplement(scalar: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_complement")(scalar.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarComplement(scalar: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_complement")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreRistretto255ScalarComplement(scalar: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_complement")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreRistretto255ScalarInvert(scalar: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_invert")(scalar.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarInvert(scalar: String, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_invert")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreRistretto255ScalarInvert(scalar: String, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_invert")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarInvert(scalar: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_invert")(scalar.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarInvert(scalar: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_invert")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreRistretto255ScalarInvert(scalar: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_invert")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreRistretto255ScalarMul(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_mul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarMul(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_mul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreRistretto255ScalarMul(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_mul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreRistretto255ScalarNegate(scalar: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_negate")(scalar.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarNegate(scalar: String, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_negate")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreRistretto255ScalarNegate(scalar: String, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_negate")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarNegate(scalar: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_negate")(scalar.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarNegate(scalar: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_negate")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreRistretto255ScalarNegate(scalar: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_negate")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreRistretto255ScalarRandom(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_random")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarRandom(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_random")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoCoreRistretto255ScalarRandom(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_random")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreRistretto255ScalarReduce(secret: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_reduce")(secret.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarReduce(secret: String, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_reduce")(secret.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreRistretto255ScalarReduce(secret: String, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_reduce")(secret.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarReduce(secret: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_reduce")(secret.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarReduce(secret: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_reduce")(secret.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreRistretto255ScalarReduce(secret: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_reduce")(secret.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreRistretto255ScalarSub(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_sub")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255ScalarSub(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_sub")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreRistretto255ScalarSub(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_scalar_sub")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoCoreRistretto255Sub(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_sub")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoCoreRistretto255Sub(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_sub")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoCoreRistretto255Sub(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ristretto255_sub")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
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
  
  inline def cryptoGenerichash(hash_length: Double, message: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichash(hash_length: Double, message: String, key: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichash(hash_length: Double, message: String, key: String, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoGenerichash(hash_length: Double, message: String, key: String, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichash(hash_length: Double, message: String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichash(
    hash_length: Double,
    message: String,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoGenerichash(
    hash_length: Double,
    message: String,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichash(hash_length: Double, message: String, key: Null, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoGenerichash(hash_length: Double, message: String, key: Null, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichash(hash_length: Double, message: String, key: Unit, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichash(hash_length: Double, message: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichash(hash_length: Double, message: js.typedarray.Uint8Array, key: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichash(
    hash_length: Double,
    message: js.typedarray.Uint8Array,
    key: String,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoGenerichash(
    hash_length: Double,
    message: js.typedarray.Uint8Array,
    key: String,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichash(hash_length: Double, message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichash(
    hash_length: Double,
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoGenerichash(
    hash_length: Double,
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichash(
    hash_length: Double,
    message: js.typedarray.Uint8Array,
    key: Null,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoGenerichash(
    hash_length: Double,
    message: js.typedarray.Uint8Array,
    key: Null,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichash(
    hash_length: Double,
    message: js.typedarray.Uint8Array,
    key: Unit,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
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
  
  inline def cryptoGenerichashBlake2bSaltPersonal(subkey_len: Double, key: String, id: js.typedarray.Uint8Array, ctx: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_blake2b_salt_personal")(subkey_len.asInstanceOf[js.Any], key.asInstanceOf[js.Any], id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichashBlake2bSaltPersonal(
    subkey_len: Double,
    key: String,
    id: js.typedarray.Uint8Array,
    ctx: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_blake2b_salt_personal")(subkey_len.asInstanceOf[js.Any], key.asInstanceOf[js.Any], id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoGenerichashBlake2bSaltPersonal(
    subkey_len: Double,
    key: String,
    id: js.typedarray.Uint8Array,
    ctx: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_blake2b_salt_personal")(subkey_len.asInstanceOf[js.Any], key.asInstanceOf[js.Any], id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichashBlake2bSaltPersonal(
    subkey_len: Double,
    key: js.typedarray.Uint8Array,
    id: js.typedarray.Uint8Array,
    ctx: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_blake2b_salt_personal")(subkey_len.asInstanceOf[js.Any], key.asInstanceOf[js.Any], id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichashBlake2bSaltPersonal(
    subkey_len: Double,
    key: js.typedarray.Uint8Array,
    id: js.typedarray.Uint8Array,
    ctx: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_blake2b_salt_personal")(subkey_len.asInstanceOf[js.Any], key.asInstanceOf[js.Any], id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoGenerichashBlake2bSaltPersonal(
    subkey_len: Double,
    key: js.typedarray.Uint8Array,
    id: js.typedarray.Uint8Array,
    ctx: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_blake2b_salt_personal")(subkey_len.asInstanceOf[js.Any], key.asInstanceOf[js.Any], id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichashBlake2bSaltPersonal(subkey_len: Double, key: Null, id: js.typedarray.Uint8Array, ctx: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_blake2b_salt_personal")(subkey_len.asInstanceOf[js.Any], key.asInstanceOf[js.Any], id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichashBlake2bSaltPersonal(
    subkey_len: Double,
    key: Null,
    id: js.typedarray.Uint8Array,
    ctx: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_blake2b_salt_personal")(subkey_len.asInstanceOf[js.Any], key.asInstanceOf[js.Any], id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoGenerichashBlake2bSaltPersonal(
    subkey_len: Double,
    key: Null,
    id: js.typedarray.Uint8Array,
    ctx: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_blake2b_salt_personal")(subkey_len.asInstanceOf[js.Any], key.asInstanceOf[js.Any], id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoGenerichashFinal(state_address: StateAddress, hash_length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_final")(state_address.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichashFinal(state_address: StateAddress, hash_length: Double, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_final")(state_address.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoGenerichashFinal(state_address: StateAddress, hash_length: Double, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_final")(state_address.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoGenerichashInit(key: String, hash_length: Double): StateAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_init")(key.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[StateAddress]
  inline def cryptoGenerichashInit(key: js.typedarray.Uint8Array, hash_length: Double): StateAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_init")(key.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[StateAddress]
  inline def cryptoGenerichashInit(key: Null, hash_length: Double): StateAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_init")(key.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[StateAddress]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_KEYBYTES")
  @js.native
  val cryptoGenerichashKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_KEYBYTES_MAX")
  @js.native
  val cryptoGenerichashKEYBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_generichash_KEYBYTES_MIN")
  @js.native
  val cryptoGenerichashKEYBYTESMIN: Double = js.native
  
  inline def cryptoGenerichashKeygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoGenerichashKeygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoGenerichashKeygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoGenerichashUpdate(state_address: StateAddress, message_chunk: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_update")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoGenerichashUpdate(state_address: StateAddress, message_chunk: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_update")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoHash(message: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoHash(message: String, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoHash(message: String, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoHash(message: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoHash(message: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoHash(message: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_BYTES")
  @js.native
  val cryptoHashBYTES: Double = js.native
  
  inline def cryptoHashSha256(message: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256")(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoHashSha256(message: String, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoHashSha256(message: String, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoHashSha256(message: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256")(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoHashSha256(message: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoHashSha256(message: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha256_BYTES")
  @js.native
  val cryptoHashSha256BYTES: Double = js.native
  
  inline def cryptoHashSha256Final(stateAddress: StateAddress): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256_final")(stateAddress.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoHashSha256Final(stateAddress: StateAddress, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256_final")(stateAddress.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoHashSha256Final(stateAddress: StateAddress, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256_final")(stateAddress.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoHashSha256Final_String(stateAddress: StateAddress): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256_final")(stateAddress.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cryptoHashSha256Init(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256_init")().asInstanceOf[Double]
  
  inline def cryptoHashSha256Update(stateAddress: StateAddress, message: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256_update")(stateAddress.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoHashSha512(message: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha512")(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoHashSha512(message: String, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha512")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoHashSha512(message: String, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha512")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoHashSha512(message: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha512")(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoHashSha512(message: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha512")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoHashSha512(message: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha512")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512_BYTES")
  @js.native
  val cryptoHashSha512BYTES: Double = js.native
  
  inline def cryptoHashSha512Final(stateAddress: StateAddress): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha512_final")(stateAddress.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoHashSha512Final(stateAddress: StateAddress, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha512_final")(stateAddress.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoHashSha512Final(stateAddress: StateAddress, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha512_final")(stateAddress.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoHashSha512Final_String(stateAddress: StateAddress): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha512_final")(stateAddress.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cryptoHashSha512Init(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha512_init")().asInstanceOf[Double]
  
  inline def cryptoHashSha512Update(stateAddress: StateAddress, message: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha512_update")(stateAddress.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  
  inline def cryptoKdfDeriveFromKey(subkey_len: Double, subkey_id: Double, ctx: String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_derive_from_key")(subkey_len.asInstanceOf[js.Any], subkey_id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoKdfDeriveFromKey(
    subkey_len: Double,
    subkey_id: Double,
    ctx: String,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_derive_from_key")(subkey_len.asInstanceOf[js.Any], subkey_id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoKdfDeriveFromKey(
    subkey_len: Double,
    subkey_id: Double,
    ctx: String,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_derive_from_key")(subkey_len.asInstanceOf[js.Any], subkey_id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_kdf_KEYBYTES")
  @js.native
  val cryptoKdfKEYBYTES: Double = js.native
  
  inline def cryptoKdfKeygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoKdfKeygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoKdfKeygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoKxClientSessionKeys(
    clientPublicKey: js.typedarray.Uint8Array,
    clientSecretKey: js.typedarray.Uint8Array,
    serverPublicKey: js.typedarray.Uint8Array
  ): CryptoKX = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_client_session_keys")(clientPublicKey.asInstanceOf[js.Any], clientSecretKey.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any])).asInstanceOf[CryptoKX]
  inline def cryptoKxClientSessionKeys(
    clientPublicKey: js.typedarray.Uint8Array,
    clientSecretKey: js.typedarray.Uint8Array,
    serverPublicKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_client_session_keys")(clientPublicKey.asInstanceOf[js.Any], clientSecretKey.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoKX]
  inline def cryptoKxClientSessionKeys(
    clientPublicKey: js.typedarray.Uint8Array,
    clientSecretKey: js.typedarray.Uint8Array,
    serverPublicKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_client_session_keys")(clientPublicKey.asInstanceOf[js.Any], clientSecretKey.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[CryptoKX]
  
  inline def cryptoKxKeypair(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_keypair")().asInstanceOf[KeyPair]
  inline def cryptoKxKeypair(outputFormat: StringOutputFormat): StringKeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[StringKeyPair]
  inline def cryptoKxKeypair(outputFormat: Uint8ArrayOutputFormat): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
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
  
  inline def cryptoKxSeedKeypair(seed: js.typedarray.Uint8Array): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_seed_keypair")(seed.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  inline def cryptoKxSeedKeypair(seed: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringKeyPair]
  inline def cryptoKxSeedKeypair(seed: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
  
  inline def cryptoKxServerSessionKeys(
    serverPublicKey: js.typedarray.Uint8Array,
    serverSecretKey: js.typedarray.Uint8Array,
    clientPublicKey: js.typedarray.Uint8Array
  ): CryptoKX = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_server_session_keys")(serverPublicKey.asInstanceOf[js.Any], serverSecretKey.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any])).asInstanceOf[CryptoKX]
  inline def cryptoKxServerSessionKeys(
    serverPublicKey: js.typedarray.Uint8Array,
    serverSecretKey: js.typedarray.Uint8Array,
    clientPublicKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_server_session_keys")(serverPublicKey.asInstanceOf[js.Any], serverSecretKey.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringCryptoKX]
  inline def cryptoKxServerSessionKeys(
    serverPublicKey: js.typedarray.Uint8Array,
    serverSecretKey: js.typedarray.Uint8Array,
    clientPublicKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_server_session_keys")(serverPublicKey.asInstanceOf[js.Any], serverSecretKey.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[CryptoKX]
  
  inline def cryptoOnetimeauth(message: String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoOnetimeauth(message: String, key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoOnetimeauth(message: String, key: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoOnetimeauth(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoOnetimeauth(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoOnetimeauth(
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_BYTES")
  @js.native
  val cryptoOnetimeauthBYTES: Double = js.native
  
  inline def cryptoOnetimeauthFinal(stateAddress: StateAddress): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_final")(stateAddress.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoOnetimeauthFinal(stateAddress: StateAddress, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_final")(stateAddress.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoOnetimeauthFinal(stateAddress: StateAddress, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_final")(stateAddress.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoOnetimeauthInit(): StateAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_init")().asInstanceOf[StateAddress]
  inline def cryptoOnetimeauthInit(key: String): StateAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_init")(key.asInstanceOf[js.Any]).asInstanceOf[StateAddress]
  inline def cryptoOnetimeauthInit(key: js.typedarray.Uint8Array): StateAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_init")(key.asInstanceOf[js.Any]).asInstanceOf[StateAddress]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_KEYBYTES")
  @js.native
  val cryptoOnetimeauthKEYBYTES: Double = js.native
  
  inline def cryptoOnetimeauthKeygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoOnetimeauthKeygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoOnetimeauthKeygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_poly1305_BYTES")
  @js.native
  val cryptoOnetimeauthPoly1305BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_poly1305_KEYBYTES")
  @js.native
  val cryptoOnetimeauthPoly1305KEYBYTES: Double = js.native
  
  inline def cryptoOnetimeauthUpdate(stateAddress: StateAddress, message_chunk: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_update")(stateAddress.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoOnetimeauthUpdate(stateAddress: StateAddress, message_chunk: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_update")(stateAddress.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoOnetimeauthVerify(hash: js.typedarray.Uint8Array, message: String, key: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_verify")(hash.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cryptoOnetimeauthVerify(hash: js.typedarray.Uint8Array, message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_verify")(hash.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoPwhash(
    keyLength: Double,
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoPwhash(
    keyLength: Double,
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoPwhash(
    keyLength: Double,
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoPwhash(
    keyLength: Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoPwhash(
    keyLength: Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoPwhash(
    keyLength: Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
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
  
  inline def cryptoPwhashScryptsalsa208sha256(
    keyLength: Double,
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoPwhashScryptsalsa208sha256(
    keyLength: Double,
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoPwhashScryptsalsa208sha256(
    keyLength: Double,
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoPwhashScryptsalsa208sha256(
    keyLength: Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoPwhashScryptsalsa208sha256(
    keyLength: Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoPwhashScryptsalsa208sha256(
    keyLength: Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_BYTES_MAX")
  @js.native
  val cryptoPwhashScryptsalsa208sha256BYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256_BYTES_MIN")
  @js.native
  val cryptoPwhashScryptsalsa208sha256BYTESMIN: Double = js.native
  
  inline def cryptoPwhashScryptsalsa208sha256Ll(password: String, salt: String, opsLimit: Double, r: Double, p: Double, keyLength: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_ll")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoPwhashScryptsalsa208sha256Ll(
    password: String,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_ll")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoPwhashScryptsalsa208sha256Ll(
    password: String,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_ll")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoPwhashScryptsalsa208sha256Ll(
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_ll")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoPwhashScryptsalsa208sha256Ll(
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_ll")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoPwhashScryptsalsa208sha256Ll(
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_ll")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoPwhashScryptsalsa208sha256Ll(
    password: js.typedarray.Uint8Array,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_ll")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoPwhashScryptsalsa208sha256Ll(
    password: js.typedarray.Uint8Array,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_ll")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoPwhashScryptsalsa208sha256Ll(
    password: js.typedarray.Uint8Array,
    salt: String,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_ll")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoPwhashScryptsalsa208sha256Ll(
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_ll")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoPwhashScryptsalsa208sha256Ll(
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_ll")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoPwhashScryptsalsa208sha256Ll(
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    r: Double,
    p: Double,
    keyLength: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_ll")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
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
  
  inline def cryptoPwhashScryptsalsa208sha256Str(password: String, opsLimit: Double, memLimit: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_str")(password.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoPwhashScryptsalsa208sha256Str(password: js.typedarray.Uint8Array, opsLimit: Double, memLimit: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_str")(password.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cryptoPwhashScryptsalsa208sha256StrVerify(hashed_password: String, password: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_str_verify")(hashed_password.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cryptoPwhashScryptsalsa208sha256StrVerify(hashed_password: String, password: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_scryptsalsa208sha256_str_verify")(hashed_password.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoPwhashStr(password: String, opsLimit: Double, memLimit: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str")(password.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoPwhashStr(password: js.typedarray.Uint8Array, opsLimit: Double, memLimit: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str")(password.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cryptoPwhashStrNeedsRehash(hashedPassword: String, opsLimit: Double, memLimit: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str_needs_rehash")(hashedPassword.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoPwhashStrVerify(hashed_password: String, password: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str_verify")(hashed_password.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cryptoPwhashStrVerify(hashed_password: String, password: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str_verify")(hashed_password.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoScalarmult(privateKey: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult")(privateKey.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoScalarmult(
    privateKey: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult")(privateKey.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoScalarmult(
    privateKey: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult")(privateKey.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_BYTES")
  @js.native
  val cryptoScalarmultBYTES: Double = js.native
  
  inline def cryptoScalarmultBase(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_base")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoScalarmultBase(privateKey: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_base")(privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoScalarmultBase(privateKey: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_base")(privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_curve25519_BYTES")
  @js.native
  val cryptoScalarmultCurve25519BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_curve25519_SCALARBYTES")
  @js.native
  val cryptoScalarmultCurve25519SCALARBYTES: Double = js.native
  
  inline def cryptoScalarmultEd25519(n: js.typedarray.Uint8Array, p: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoScalarmultEd25519(n: js.typedarray.Uint8Array, p: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoScalarmultEd25519(n: js.typedarray.Uint8Array, p: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_ed25519_BYTES")
  @js.native
  val cryptoScalarmultEd25519BYTES: Double = js.native
  
  inline def cryptoScalarmultEd25519Base(scalar: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519_base")(scalar.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoScalarmultEd25519Base(scalar: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519_base")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoScalarmultEd25519Base(scalar: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519_base")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoScalarmultEd25519BaseNoclamp(scalar: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519_base_noclamp")(scalar.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoScalarmultEd25519BaseNoclamp(scalar: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519_base_noclamp")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoScalarmultEd25519BaseNoclamp(scalar: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519_base_noclamp")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoScalarmultEd25519Noclamp(n: js.typedarray.Uint8Array, p: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519_noclamp")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoScalarmultEd25519Noclamp(n: js.typedarray.Uint8Array, p: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519_noclamp")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoScalarmultEd25519Noclamp(n: js.typedarray.Uint8Array, p: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519_noclamp")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_ed25519_SCALARBYTES")
  @js.native
  val cryptoScalarmultEd25519SCALARBYTES: Double = js.native
  
  inline def cryptoScalarmultRistretto255(scalar: js.typedarray.Uint8Array, element: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ristretto255")(scalar.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoScalarmultRistretto255(
    scalar: js.typedarray.Uint8Array,
    element: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ristretto255")(scalar.asInstanceOf[js.Any], element.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoScalarmultRistretto255(
    scalar: js.typedarray.Uint8Array,
    element: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ristretto255")(scalar.asInstanceOf[js.Any], element.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_ristretto255_BYTES")
  @js.native
  val cryptoScalarmultRistretto255BYTES: Double = js.native
  
  inline def cryptoScalarmultRistretto255Base(scalar: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ristretto255_base")(scalar.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoScalarmultRistretto255Base(scalar: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ristretto255_base")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoScalarmultRistretto255Base(scalar: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ristretto255_base")(scalar.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_ristretto255_SCALARBYTES")
  @js.native
  val cryptoScalarmultRistretto255SCALARBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_scalarmult_SCALARBYTES")
  @js.native
  val cryptoScalarmultSCALARBYTES: Double = js.native
  
  inline def cryptoSecretboxDetached(message: String, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): SecretBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[SecretBox]
  inline def cryptoSecretboxDetached(
    message: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringSecretBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringSecretBox]
  inline def cryptoSecretboxDetached(
    message: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): SecretBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[SecretBox]
  inline def cryptoSecretboxDetached(message: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): SecretBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[SecretBox]
  inline def cryptoSecretboxDetached(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringSecretBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringSecretBox]
  inline def cryptoSecretboxDetached(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): SecretBox = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[SecretBox]
  
  inline def cryptoSecretboxEasy(message: String, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretboxEasy(
    message: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSecretboxEasy(
    message: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretboxEasy(message: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretboxEasy(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSecretboxEasy(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_KEYBYTES")
  @js.native
  val cryptoSecretboxKEYBYTES: Double = js.native
  
  inline def cryptoSecretboxKeygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretboxKeygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoSecretboxKeygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_MACBYTES")
  @js.native
  val cryptoSecretboxMACBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_MESSAGEBYTES_MAX")
  @js.native
  val cryptoSecretboxMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretbox_NONCEBYTES")
  @js.native
  val cryptoSecretboxNONCEBYTES: Double = js.native
  
  inline def cryptoSecretboxOpenDetached(
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretboxOpenDetached(
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSecretboxOpenDetached(
    ciphertext: String,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretboxOpenDetached(
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretboxOpenDetached(
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSecretboxOpenDetached(
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoSecretboxOpenEasy(ciphertext: String, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretboxOpenEasy(
    ciphertext: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSecretboxOpenEasy(
    ciphertext: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretboxOpenEasy(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretboxOpenEasy(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSecretboxOpenEasy(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
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
  
  inline def cryptoSecretstreamXchacha20poly1305InitPull(header: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): StateAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_pull")(header.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[StateAddress]
  
  inline def cryptoSecretstreamXchacha20poly1305InitPush(key: js.typedarray.Uint8Array): Header = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_push")(key.asInstanceOf[js.Any]).asInstanceOf[Header]
  inline def cryptoSecretstreamXchacha20poly1305InitPush(key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): State = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_push")(key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def cryptoSecretstreamXchacha20poly1305InitPush(key: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_push")(key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_KEYBYTES")
  @js.native
  val cryptoSecretstreamXchacha20poly1305KEYBYTES: Double = js.native
  
  inline def cryptoSecretstreamXchacha20poly1305Keygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretstreamXchacha20poly1305Keygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoSecretstreamXchacha20poly1305Keygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_MESSAGEBYTES_MAX")
  @js.native
  val cryptoSecretstreamXchacha20poly1305MESSAGEBYTESMAX: Double = js.native
  
  inline def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String): MessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any])).asInstanceOf[MessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: String): MessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any])).asInstanceOf[MessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: String, outputFormat: StringOutputFormat): StringMessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringMessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: String, outputFormat: Uint8ArrayOutputFormat): MessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[MessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: js.typedarray.Uint8Array): MessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any])).asInstanceOf[MessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: StateAddress,
    cipher: String,
    ad: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringMessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringMessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: StateAddress,
    cipher: String,
    ad: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[MessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: Null, outputFormat: StringOutputFormat): StringMessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringMessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: Null, outputFormat: Uint8ArrayOutputFormat): MessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[MessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: String, ad: Unit, outputFormat: Uint8ArrayOutputFormat): MessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[MessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: js.typedarray.Uint8Array): MessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any])).asInstanceOf[MessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: js.typedarray.Uint8Array, ad: String): MessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any])).asInstanceOf[MessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: String,
    outputFormat: StringOutputFormat
  ): StringMessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringMessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: String,
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[MessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(state_address: StateAddress, cipher: js.typedarray.Uint8Array, ad: js.typedarray.Uint8Array): MessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any])).asInstanceOf[MessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringMessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringMessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[MessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: Null,
    outputFormat: StringOutputFormat
  ): StringMessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringMessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: Null,
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[MessageTag]
  inline def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: Unit,
    outputFormat: Uint8ArrayOutputFormat
  ): MessageTag = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[MessageTag]
  
  inline def cryptoSecretstreamXchacha20poly1305Push(state_address: StateAddress, message_chunk: String, ad: String, tag: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: String,
    ad: String,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: String,
    ad: String,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretstreamXchacha20poly1305Push(state_address: StateAddress, message_chunk: String, ad: js.typedarray.Uint8Array, tag: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: String,
    ad: js.typedarray.Uint8Array,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: String,
    ad: js.typedarray.Uint8Array,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretstreamXchacha20poly1305Push(state_address: StateAddress, message_chunk: String, ad: Null, tag: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: String,
    ad: Null,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: String,
    ad: Null,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretstreamXchacha20poly1305Push(state_address: StateAddress, message_chunk: js.typedarray.Uint8Array, ad: String, tag: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: String,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: String,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: js.typedarray.Uint8Array,
    tag: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: js.typedarray.Uint8Array,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: js.typedarray.Uint8Array,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretstreamXchacha20poly1305Push(state_address: StateAddress, message_chunk: js.typedarray.Uint8Array, ad: Null, tag: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: Null,
    tag: Double,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSecretstreamXchacha20poly1305Push(
    state_address: StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: Null,
    tag: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoSecretstreamXchacha20poly1305Rekey(state_address: StateAddress): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_rekey")(state_address.asInstanceOf[js.Any]).asInstanceOf[`true`]
  
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
  
  inline def cryptoShorthash(message: String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoShorthash(message: String, key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoShorthash(message: String, key: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoShorthash(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoShorthash(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoShorthash(
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_BYTES")
  @js.native
  val cryptoShorthashBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_KEYBYTES")
  @js.native
  val cryptoShorthashKEYBYTES: Double = js.native
  
  inline def cryptoShorthashKeygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoShorthashKeygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoShorthashKeygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_siphash24_BYTES")
  @js.native
  val cryptoShorthashSiphash24BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_siphash24_KEYBYTES")
  @js.native
  val cryptoShorthashSiphash24KEYBYTES: Double = js.native
  
  inline def cryptoShorthashSiphashx24(message: String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_siphashx24")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoShorthashSiphashx24(message: String, key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_siphashx24")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoShorthashSiphashx24(message: String, key: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_siphashx24")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoShorthashSiphashx24(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_siphashx24")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoShorthashSiphashx24(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_siphashx24")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoShorthashSiphashx24(
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_siphashx24")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_siphashx24_BYTES")
  @js.native
  val cryptoShorthashSiphashx24BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_shorthash_siphashx24_KEYBYTES")
  @js.native
  val cryptoShorthashSiphashx24KEYBYTES: Double = js.native
  
  inline def cryptoSign(message: String, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSign(message: String, privateKey: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSign(message: String, privateKey: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSign(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSign(
    message: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSign(
    message: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_BYTES")
  @js.native
  val cryptoSignBYTES: Double = js.native
  
  inline def cryptoSignDetached(message: String, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSignDetached(message: String, privateKey: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSignDetached(message: String, privateKey: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSignDetached(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSignDetached(
    message: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSignDetached(
    message: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_BYTES")
  @js.native
  val cryptoSignEd25519BYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_MESSAGEBYTES_MAX")
  @js.native
  val cryptoSignEd25519MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_PUBLICKEYBYTES")
  @js.native
  val cryptoSignEd25519PUBLICKEYBYTES: Double = js.native
  
  inline def cryptoSignEd25519PkToCurve25519(edPk: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_pk_to_curve25519")(edPk.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSignEd25519PkToCurve25519(edPk: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_pk_to_curve25519")(edPk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSignEd25519PkToCurve25519(edPk: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_pk_to_curve25519")(edPk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_SECRETKEYBYTES")
  @js.native
  val cryptoSignEd25519SECRETKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_SEEDBYTES")
  @js.native
  val cryptoSignEd25519SEEDBYTES: Double = js.native
  
  inline def cryptoSignEd25519SkToCurve25519(edSk: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_curve25519")(edSk.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSignEd25519SkToCurve25519(edSk: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_curve25519")(edSk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSignEd25519SkToCurve25519(edSk: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_curve25519")(edSk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoSignEd25519SkToPk(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_pk")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSignEd25519SkToPk(privateKey: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_pk")(privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSignEd25519SkToPk(privateKey: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_pk")(privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoSignEd25519SkToSeed(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_seed")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSignEd25519SkToSeed(privateKey: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_seed")(privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSignEd25519SkToSeed(privateKey: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_seed")(privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoSignFinalCreate(state_address: StateAddress, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_final_create")(state_address.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSignFinalCreate(
    state_address: StateAddress,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_final_create")(state_address.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSignFinalCreate(
    state_address: StateAddress,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_final_create")(state_address.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoSignFinalVerify(
    state_address: StateAddress,
    signature: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_final_verify")(state_address.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoSignInit(): StateAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_init")().asInstanceOf[StateAddress]
  
  inline def cryptoSignKeypair(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_keypair")().asInstanceOf[KeyPair]
  inline def cryptoSignKeypair(outputFormat: StringOutputFormat): StringKeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[StringKeyPair]
  inline def cryptoSignKeypair(outputFormat: Uint8ArrayOutputFormat): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_MESSAGEBYTES_MAX")
  @js.native
  val cryptoSignMESSAGEBYTESMAX: Double = js.native
  
  inline def cryptoSignOpen(signedMessage: String, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSignOpen(signedMessage: String, publicKey: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSignOpen(signedMessage: String, publicKey: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSignOpen(signedMessage: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoSignOpen(
    signedMessage: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoSignOpen(
    signedMessage: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_PUBLICKEYBYTES")
  @js.native
  val cryptoSignPUBLICKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_SECRETKEYBYTES")
  @js.native
  val cryptoSignSECRETKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_sign_SEEDBYTES")
  @js.native
  val cryptoSignSEEDBYTES: Double = js.native
  
  inline def cryptoSignSeedKeypair(seed: js.typedarray.Uint8Array): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_seed_keypair")(seed.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  inline def cryptoSignSeedKeypair(seed: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[StringKeyPair]
  inline def cryptoSignSeedKeypair(seed: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
  
  inline def cryptoSignUpdate(state_address: StateAddress, message_chunk: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_update")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoSignUpdate(state_address: StateAddress, message_chunk: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_update")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoSignVerifyDetached(signature: js.typedarray.Uint8Array, message: String, publicKey: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_verify_detached")(signature.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cryptoSignVerifyDetached(
    signature: js.typedarray.Uint8Array,
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_verify_detached")(signature.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoStreamChacha20(outLength: Double, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20")(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamChacha20(
    outLength: Double,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20")(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoStreamChacha20(
    outLength: Double,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20")(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_KEYBYTES")
  @js.native
  val cryptoStreamChacha20IetfKEYBYTES: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_MESSAGEBYTES_MAX")
  @js.native
  val cryptoStreamChacha20IetfMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_ietf_NONCEBYTES")
  @js.native
  val cryptoStreamChacha20IetfNONCEBYTES: Double = js.native
  
  inline def cryptoStreamChacha20IetfXor(input_message: String, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_ietf_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamChacha20IetfXor(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_ietf_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoStreamChacha20IetfXor(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_ietf_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamChacha20IetfXor(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_ietf_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamChacha20IetfXor(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_ietf_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoStreamChacha20IetfXor(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_ietf_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoStreamChacha20IetfXorIc(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_ietf_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamChacha20IetfXorIc(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_ietf_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoStreamChacha20IetfXorIc(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_ietf_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamChacha20IetfXorIc(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_ietf_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamChacha20IetfXorIc(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_ietf_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoStreamChacha20IetfXorIc(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_ietf_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_KEYBYTES")
  @js.native
  val cryptoStreamChacha20KEYBYTES: Double = js.native
  
  inline def cryptoStreamChacha20Keygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamChacha20Keygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoStreamChacha20Keygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_MESSAGEBYTES_MAX")
  @js.native
  val cryptoStreamChacha20MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_NONCEBYTES")
  @js.native
  val cryptoStreamChacha20NONCEBYTES: Double = js.native
  
  inline def cryptoStreamChacha20Xor(input_message: String, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamChacha20Xor(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoStreamChacha20Xor(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamChacha20Xor(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamChacha20Xor(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoStreamChacha20Xor(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoStreamChacha20XorIc(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamChacha20XorIc(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoStreamChacha20XorIc(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamChacha20XorIc(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamChacha20XorIc(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoStreamChacha20XorIc(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_KEYBYTES")
  @js.native
  val cryptoStreamKEYBYTES: Double = js.native
  
  inline def cryptoStreamKeygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamKeygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoStreamKeygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
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
  
  inline def cryptoStreamXchacha20Keygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamXchacha20Keygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cryptoStreamXchacha20Keygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_MESSAGEBYTES_MAX")
  @js.native
  val cryptoStreamXchacha20MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("libsodium-wrappers-sumo", "crypto_stream_xchacha20_NONCEBYTES")
  @js.native
  val cryptoStreamXchacha20NONCEBYTES: Double = js.native
  
  inline def cryptoStreamXchacha20Xor(input_message: String, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamXchacha20Xor(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoStreamXchacha20Xor(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamXchacha20Xor(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamXchacha20Xor(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoStreamXchacha20Xor(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_xor")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def cryptoStreamXchacha20XorIc(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamXchacha20XorIc(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoStreamXchacha20XorIc(
    input_message: String,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamXchacha20XorIc(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def cryptoStreamXchacha20XorIc(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cryptoStreamXchacha20XorIc(
    input_message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    nonce_increment: Double,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xchacha20_xor_ic")(input_message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], nonce_increment.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
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
  
  inline def fromBase64(input: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("from_base64")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def fromBase64(input: String, variant: base64Variants): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("from_base64")(input.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromHex(input: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("from_hex")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromString(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("from_string")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def increment(bytes: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(bytes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isZero(bytes: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_zero")(bytes.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def memcmp(b1: js.typedarray.Uint8Array, b2: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("memcmp")(b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def memzero(bytes: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("memzero")(bytes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def outputFormats(): js.Array[Uint8ArrayOutputFormat | StringOutputFormat] = ^.asInstanceOf[js.Dynamic].applyDynamic("output_formats")().asInstanceOf[js.Array[Uint8ArrayOutputFormat | StringOutputFormat]]
  
  inline def pad(buf: js.typedarray.Uint8Array, blocksize: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(buf.asInstanceOf[js.Any], blocksize.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def randombytesBuf(length: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf")(length.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def randombytesBuf(length: Double, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf")(length.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def randombytesBuf(length: Double, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf")(length.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def randombytesBufDeterministic(length: Double, seed: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf_deterministic")(length.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def randombytesBufDeterministic(length: Double, seed: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf_deterministic")(length.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def randombytesBufDeterministic(length: Double, seed: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf_deterministic")(length.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def randombytesClose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_close")().asInstanceOf[Unit]
  
  inline def randombytesRandom(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_random")().asInstanceOf[Double]
  
  inline def randombytesStir(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_stir")().asInstanceOf[Unit]
  
  inline def randombytesUniform(upper_bound: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_uniform")(upper_bound.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("libsodium-wrappers-sumo", "ready")
  @js.native
  val ready: js.Promise[Unit] = js.native
  
  inline def sodiumVersionString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sodium_version_string")().asInstanceOf[String]
  
  inline def symbols(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbols")().asInstanceOf[js.Array[String]]
  
  inline def toBase64(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("to_base64")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toBase64(input: String, variant: base64Variants): String = (^.asInstanceOf[js.Dynamic].applyDynamic("to_base64")(input.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toBase64(input: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("to_base64")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toBase64(input: js.typedarray.Uint8Array, variant: base64Variants): String = (^.asInstanceOf[js.Dynamic].applyDynamic("to_base64")(input.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toHex(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("to_hex")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHex(input: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("to_hex")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toString(bytes: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("to_string")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unpad(buf: js.typedarray.Uint8Array, blocksize: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("unpad")(buf.asInstanceOf[js.Any], blocksize.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
