package typings.libsodiumWrappers.mod

import typings.libsodiumWrappers.anon.Header
import typings.libsodiumWrappers.anon.State
import typings.libsodiumWrappers.libsodiumWrappersBooleans.`true`
import typings.libsodiumWrappers.libsodiumWrappersStrings.uint8array
import typings.libsodiumWrappers.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def SODIUM_LIBRARY_VERSION_MAJOR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SODIUM_LIBRARY_VERSION_MAJOR").asInstanceOf[Double]

inline def SODIUM_LIBRARY_VERSION_MINOR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SODIUM_LIBRARY_VERSION_MINOR").asInstanceOf[Double]

inline def SODIUM_VERSION_STRING: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SODIUM_VERSION_STRING").asInstanceOf[String]

inline def add(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def compare(b1: js.typedarray.Uint8Array, b2: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def cryptoAeadChacha20poly1305ABYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ABYTES").asInstanceOf[Double]

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

inline def cryptoAeadChacha20poly1305IetfABYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_ABYTES").asInstanceOf[Double]

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

inline def cryptoAeadChacha20poly1305IetfKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_KEYBYTES").asInstanceOf[Double]

inline def cryptoAeadChacha20poly1305IetfKeygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_keygen")().asInstanceOf[js.typedarray.Uint8Array]
inline def cryptoAeadChacha20poly1305IetfKeygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
inline def cryptoAeadChacha20poly1305IetfKeygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def cryptoAeadChacha20poly1305IetfMESSAGEBYTESMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_MESSAGEBYTES_MAX").asInstanceOf[Double]

inline def cryptoAeadChacha20poly1305IetfNPUBBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_NPUBBYTES").asInstanceOf[Double]

inline def cryptoAeadChacha20poly1305IetfNSECBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_NSECBYTES").asInstanceOf[Double]

inline def cryptoAeadChacha20poly1305KEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_KEYBYTES").asInstanceOf[Double]

inline def cryptoAeadChacha20poly1305Keygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_keygen")().asInstanceOf[js.typedarray.Uint8Array]
inline def cryptoAeadChacha20poly1305Keygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
inline def cryptoAeadChacha20poly1305Keygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def cryptoAeadChacha20poly1305MESSAGEBYTESMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_MESSAGEBYTES_MAX").asInstanceOf[Double]

inline def cryptoAeadChacha20poly1305NPUBBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_NPUBBYTES").asInstanceOf[Double]

inline def cryptoAeadChacha20poly1305NSECBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_NSECBYTES").asInstanceOf[Double]

inline def cryptoAeadXchacha20poly1305IetfABYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_ABYTES").asInstanceOf[Double]

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

inline def cryptoAeadXchacha20poly1305IetfKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_KEYBYTES").asInstanceOf[Double]

inline def cryptoAeadXchacha20poly1305IetfKeygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_keygen")().asInstanceOf[js.typedarray.Uint8Array]
inline def cryptoAeadXchacha20poly1305IetfKeygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
inline def cryptoAeadXchacha20poly1305IetfKeygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def cryptoAeadXchacha20poly1305IetfMESSAGEBYTESMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_MESSAGEBYTES_MAX").asInstanceOf[Double]

inline def cryptoAeadXchacha20poly1305IetfNPUBBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_NPUBBYTES").asInstanceOf[Double]

inline def cryptoAeadXchacha20poly1305IetfNSECBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_NSECBYTES").asInstanceOf[Double]

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

inline def cryptoAuthBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_auth_BYTES").asInstanceOf[Double]

inline def cryptoAuthKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_auth_KEYBYTES").asInstanceOf[Double]

inline def cryptoAuthKeygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_keygen")().asInstanceOf[js.typedarray.Uint8Array]
inline def cryptoAuthKeygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
inline def cryptoAuthKeygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def cryptoAuthVerify(tag: js.typedarray.Uint8Array, message: String, key: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_verify")(tag.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def cryptoAuthVerify(tag: js.typedarray.Uint8Array, message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_verify")(tag.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def cryptoBoxBEFORENMBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_BEFORENMBYTES").asInstanceOf[Double]

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

inline def cryptoBoxMACBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_MACBYTES").asInstanceOf[Double]

inline def cryptoBoxMESSAGEBYTESMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_MESSAGEBYTES_MAX").asInstanceOf[Double]

inline def cryptoBoxNONCEBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_NONCEBYTES").asInstanceOf[Double]

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

inline def cryptoBoxPUBLICKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_PUBLICKEYBYTES").asInstanceOf[Double]

inline def cryptoBoxSEALBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_SEALBYTES").asInstanceOf[Double]

inline def cryptoBoxSECRETKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_SECRETKEYBYTES").asInstanceOf[Double]

inline def cryptoBoxSEEDBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_SEEDBYTES").asInstanceOf[Double]

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

inline def cryptoGenerichashBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_BYTES").asInstanceOf[Double]

inline def cryptoGenerichashBYTESMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_BYTES_MAX").asInstanceOf[Double]

inline def cryptoGenerichashBYTESMIN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_BYTES_MIN").asInstanceOf[Double]

inline def cryptoGenerichashFinal(state_address: StateAddress, hash_length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_final")(state_address.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
inline def cryptoGenerichashFinal(state_address: StateAddress, hash_length: Double, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_final")(state_address.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
inline def cryptoGenerichashFinal(state_address: StateAddress, hash_length: Double, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_final")(state_address.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def cryptoGenerichashInit(key: String, hash_length: Double): StateAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_init")(key.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[StateAddress]
inline def cryptoGenerichashInit(key: js.typedarray.Uint8Array, hash_length: Double): StateAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_init")(key.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[StateAddress]
inline def cryptoGenerichashInit(key: Null, hash_length: Double): StateAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_init")(key.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[StateAddress]

inline def cryptoGenerichashKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_KEYBYTES").asInstanceOf[Double]

inline def cryptoGenerichashKEYBYTESMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_KEYBYTES_MAX").asInstanceOf[Double]

inline def cryptoGenerichashKEYBYTESMIN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_KEYBYTES_MIN").asInstanceOf[Double]

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

inline def cryptoHashBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_hash_BYTES").asInstanceOf[Double]

inline def cryptoKdfBYTESMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kdf_BYTES_MAX").asInstanceOf[Double]

inline def cryptoKdfBYTESMIN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kdf_BYTES_MIN").asInstanceOf[Double]

inline def cryptoKdfCONTEXTBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kdf_CONTEXTBYTES").asInstanceOf[Double]

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

inline def cryptoKdfKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kdf_KEYBYTES").asInstanceOf[Double]

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

inline def cryptoKxPUBLICKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kx_PUBLICKEYBYTES").asInstanceOf[Double]

inline def cryptoKxSECRETKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kx_SECRETKEYBYTES").asInstanceOf[Double]

inline def cryptoKxSEEDBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kx_SEEDBYTES").asInstanceOf[Double]

inline def cryptoKxSESSIONKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kx_SESSIONKEYBYTES").asInstanceOf[Double]

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

inline def cryptoPwhashALGARGON2I13: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_ALG_ARGON2I13").asInstanceOf[Double]

inline def cryptoPwhashALGARGON2ID13: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_ALG_ARGON2ID13").asInstanceOf[Double]

inline def cryptoPwhashALGDEFAULT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_ALG_DEFAULT").asInstanceOf[Double]

inline def cryptoPwhashBYTESMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_BYTES_MAX").asInstanceOf[Double]

inline def cryptoPwhashBYTESMIN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_BYTES_MIN").asInstanceOf[Double]

inline def cryptoPwhashMEMLIMITINTERACTIVE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_INTERACTIVE").asInstanceOf[Double]

inline def cryptoPwhashMEMLIMITMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_MAX").asInstanceOf[Double]

inline def cryptoPwhashMEMLIMITMIN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_MIN").asInstanceOf[Double]

inline def cryptoPwhashMEMLIMITMODERATE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_MODERATE").asInstanceOf[Double]

inline def cryptoPwhashMEMLIMITSENSITIVE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_SENSITIVE").asInstanceOf[Double]

inline def cryptoPwhashOPSLIMITINTERACTIVE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_INTERACTIVE").asInstanceOf[Double]

inline def cryptoPwhashOPSLIMITMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_MAX").asInstanceOf[Double]

inline def cryptoPwhashOPSLIMITMIN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_MIN").asInstanceOf[Double]

inline def cryptoPwhashOPSLIMITMODERATE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_MODERATE").asInstanceOf[Double]

inline def cryptoPwhashOPSLIMITSENSITIVE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_SENSITIVE").asInstanceOf[Double]

inline def cryptoPwhashPASSWDMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_PASSWD_MAX").asInstanceOf[Double]

inline def cryptoPwhashPASSWDMIN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_PASSWD_MIN").asInstanceOf[Double]

inline def cryptoPwhashSALTBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_SALTBYTES").asInstanceOf[Double]

inline def cryptoPwhashSTRBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_STRBYTES").asInstanceOf[Double]

inline def cryptoPwhashSTRPREFIX: String = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_STRPREFIX").asInstanceOf[String]

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

inline def cryptoScalarmultBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_scalarmult_BYTES").asInstanceOf[Double]

inline def cryptoScalarmultBase(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_base")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def cryptoScalarmultBase(privateKey: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_base")(privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
inline def cryptoScalarmultBase(privateKey: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_base")(privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def cryptoScalarmultSCALARBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_scalarmult_SCALARBYTES").asInstanceOf[Double]

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

inline def cryptoSecretboxKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretbox_KEYBYTES").asInstanceOf[Double]

inline def cryptoSecretboxKeygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_keygen")().asInstanceOf[js.typedarray.Uint8Array]
inline def cryptoSecretboxKeygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
inline def cryptoSecretboxKeygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def cryptoSecretboxMACBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretbox_MACBYTES").asInstanceOf[Double]

inline def cryptoSecretboxMESSAGEBYTESMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretbox_MESSAGEBYTES_MAX").asInstanceOf[Double]

inline def cryptoSecretboxNONCEBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretbox_NONCEBYTES").asInstanceOf[Double]

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

inline def cryptoSecretstreamXchacha20poly1305ABYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_ABYTES").asInstanceOf[Double]

inline def cryptoSecretstreamXchacha20poly1305HEADERBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_HEADERBYTES").asInstanceOf[Double]

inline def cryptoSecretstreamXchacha20poly1305InitPull(header: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): StateAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_pull")(header.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[StateAddress]

inline def cryptoSecretstreamXchacha20poly1305InitPush(key: js.typedarray.Uint8Array): Header = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_push")(key.asInstanceOf[js.Any]).asInstanceOf[Header]
inline def cryptoSecretstreamXchacha20poly1305InitPush(key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): State = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_push")(key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[State]
inline def cryptoSecretstreamXchacha20poly1305InitPush(key: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_push")(key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[Header]

inline def cryptoSecretstreamXchacha20poly1305KEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_KEYBYTES").asInstanceOf[Double]

inline def cryptoSecretstreamXchacha20poly1305Keygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_keygen")().asInstanceOf[js.typedarray.Uint8Array]
inline def cryptoSecretstreamXchacha20poly1305Keygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
inline def cryptoSecretstreamXchacha20poly1305Keygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def cryptoSecretstreamXchacha20poly1305MESSAGEBYTESMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_MESSAGEBYTES_MAX").asInstanceOf[Double]

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

inline def cryptoSecretstreamXchacha20poly1305TAGFINAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_TAG_FINAL").asInstanceOf[Double]

inline def cryptoSecretstreamXchacha20poly1305TAGMESSAGE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_TAG_MESSAGE").asInstanceOf[Double]

inline def cryptoSecretstreamXchacha20poly1305TAGPUSH: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_TAG_PUSH").asInstanceOf[Double]

inline def cryptoSecretstreamXchacha20poly1305TAGREKEY: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_TAG_REKEY").asInstanceOf[Double]

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

inline def cryptoShorthashBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_shorthash_BYTES").asInstanceOf[Double]

inline def cryptoShorthashKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_shorthash_KEYBYTES").asInstanceOf[Double]

inline def cryptoShorthashKeygen(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_keygen")().asInstanceOf[js.typedarray.Uint8Array]
inline def cryptoShorthashKeygen(outputFormat: StringOutputFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[String]
inline def cryptoShorthashKeygen(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

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

inline def cryptoSignBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_BYTES").asInstanceOf[Double]

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

inline def cryptoSignEd25519PkToCurve25519(edPk: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_pk_to_curve25519")(edPk.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def cryptoSignEd25519PkToCurve25519(edPk: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_pk_to_curve25519")(edPk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
inline def cryptoSignEd25519PkToCurve25519(edPk: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_pk_to_curve25519")(edPk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def cryptoSignEd25519SkToCurve25519(edSk: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_curve25519")(edSk.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def cryptoSignEd25519SkToCurve25519(edSk: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_curve25519")(edSk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[String]
inline def cryptoSignEd25519SkToCurve25519(edSk: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_curve25519")(edSk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

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

inline def cryptoSignMESSAGEBYTESMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_MESSAGEBYTES_MAX").asInstanceOf[Double]

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

inline def cryptoSignPUBLICKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_PUBLICKEYBYTES").asInstanceOf[Double]

inline def cryptoSignSECRETKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_SECRETKEYBYTES").asInstanceOf[Double]

inline def cryptoSignSEEDBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_SEEDBYTES").asInstanceOf[Double]

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

inline def crypto_AeadChacha20poly1305IETFABYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_ABYTES").asInstanceOf[Double]

inline def crypto_AeadChacha20poly1305IETFKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_KEYBYTES").asInstanceOf[Double]

inline def crypto_AeadChacha20poly1305IETFMESSAGEBYTESMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_MESSAGEBYTES_MAX").asInstanceOf[Double]

inline def crypto_AeadChacha20poly1305IETFNPUBBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_NPUBBYTES").asInstanceOf[Double]

inline def crypto_AeadChacha20poly1305IETFNSECBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_NSECBYTES").asInstanceOf[Double]

inline def crypto_AeadXchacha20poly1305IETFABYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_ABYTES").asInstanceOf[Double]

inline def crypto_AeadXchacha20poly1305IETFKEYBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_KEYBYTES").asInstanceOf[Double]

inline def crypto_AeadXchacha20poly1305IETFMESSAGEBYTESMAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_MESSAGEBYTES_MAX").asInstanceOf[Double]

inline def crypto_AeadXchacha20poly1305IETFNPUBBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_NPUBBYTES").asInstanceOf[Double]

inline def crypto_AeadXchacha20poly1305IETFNSECBYTES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_NSECBYTES").asInstanceOf[Double]

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

inline def ready: js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("ready").asInstanceOf[js.Promise[Unit]]

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

type Uint8ArrayOutputFormat = uint8array
