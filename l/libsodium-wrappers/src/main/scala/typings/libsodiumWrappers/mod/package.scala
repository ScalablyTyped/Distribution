package typings.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def SODIUM_LIBRARY_VERSION_MAJOR: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SODIUM_LIBRARY_VERSION_MAJOR").asInstanceOf[scala.Double]

inline def SODIUM_LIBRARY_VERSION_MINOR: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SODIUM_LIBRARY_VERSION_MINOR").asInstanceOf[scala.Double]

inline def SODIUM_VERSION_STRING: java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SODIUM_VERSION_STRING").asInstanceOf[java.lang.String]

inline def add(a: typings.std.Uint8Array, b: typings.std.Uint8Array): scala.Unit = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def compare(b1: typings.std.Uint8Array, b2: typings.std.Uint8Array): scala.Double = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compare")(b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

inline def cryptoAeadChacha20poly1305ABYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ABYTES").asInstanceOf[scala.Double]

inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: java.lang.String | typings.std.Uint8Array | scala.Null,
  ciphertext: java.lang.String | typings.std.Uint8Array,
  additional_data: java.lang.String | typings.std.Uint8Array | scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: js.UndefOr[typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Decrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: java.lang.String | typings.std.Uint8Array | scala.Null,
  ciphertext: java.lang.String | typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String | typings.std.Uint8Array | scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: js.UndefOr[typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305DecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def cryptoAeadChacha20poly1305Encrypt(
  message: java.lang.String | typings.std.Uint8Array,
  additional_data: java.lang.String | typings.std.Uint8Array | scala.Null,
  secret_nonce: java.lang.String | typings.std.Uint8Array | scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: js.UndefOr[typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Encrypt(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: java.lang.String | typings.std.Uint8Array,
  additional_data: java.lang.String | typings.std.Uint8Array | scala.Null,
  secret_nonce: java.lang.String | typings.std.Uint8Array | scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: js.UndefOr[typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
): typings.libsodiumWrappers.mod.CryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.CryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305EncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]

inline def cryptoAeadChacha20poly1305IetfABYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_ABYTES").asInstanceOf[scala.Double]

inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: java.lang.String | typings.std.Uint8Array | scala.Null,
  ciphertext: java.lang.String | typings.std.Uint8Array,
  additional_data: java.lang.String | typings.std.Uint8Array | scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: js.UndefOr[typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: java.lang.String | typings.std.Uint8Array | scala.Null,
  ciphertext: java.lang.String | typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String | typings.std.Uint8Array | scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: js.UndefOr[typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfDecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: java.lang.String | typings.std.Uint8Array,
  additional_data: java.lang.String | typings.std.Uint8Array | scala.Null,
  secret_nonce: java.lang.String | typings.std.Uint8Array | scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: js.UndefOr[typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: java.lang.String | typings.std.Uint8Array,
  additional_data: java.lang.String | typings.std.Uint8Array | scala.Null,
  secret_nonce: java.lang.String | typings.std.Uint8Array | scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: js.UndefOr[typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
): typings.libsodiumWrappers.mod.CryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.CryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadChacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]

inline def cryptoAeadChacha20poly1305IetfKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_KEYBYTES").asInstanceOf[scala.Double]

inline def cryptoAeadChacha20poly1305IetfKeygen(): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_keygen")().asInstanceOf[typings.std.Uint8Array]
inline def cryptoAeadChacha20poly1305IetfKeygen(outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305IetfKeygen(outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]

inline def cryptoAeadChacha20poly1305IetfMESSAGEBYTESMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]

inline def cryptoAeadChacha20poly1305IetfNPUBBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_NPUBBYTES").asInstanceOf[scala.Double]

inline def cryptoAeadChacha20poly1305IetfNSECBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_NSECBYTES").asInstanceOf[scala.Double]

inline def cryptoAeadChacha20poly1305KEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_KEYBYTES").asInstanceOf[scala.Double]

inline def cryptoAeadChacha20poly1305Keygen(): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_keygen")().asInstanceOf[typings.std.Uint8Array]
inline def cryptoAeadChacha20poly1305Keygen(outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def cryptoAeadChacha20poly1305Keygen(outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]

inline def cryptoAeadChacha20poly1305MESSAGEBYTESMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]

inline def cryptoAeadChacha20poly1305NPUBBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_NPUBBYTES").asInstanceOf[scala.Double]

inline def cryptoAeadChacha20poly1305NSECBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_NSECBYTES").asInstanceOf[scala.Double]

inline def cryptoAeadXchacha20poly1305IetfABYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_ABYTES").asInstanceOf[scala.Double]

inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: java.lang.String | typings.std.Uint8Array | scala.Null,
  ciphertext: java.lang.String | typings.std.Uint8Array,
  additional_data: java.lang.String | typings.std.Uint8Array | scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: js.UndefOr[typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecrypt(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: java.lang.String | typings.std.Uint8Array | scala.Null,
  ciphertext: java.lang.String | typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String | typings.std.Uint8Array | scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: js.UndefOr[typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: java.lang.String,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: scala.Null,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
  secret_nonce: typings.std.Uint8Array,
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: java.lang.String | typings.std.Uint8Array,
  additional_data: java.lang.String | typings.std.Uint8Array | scala.Null,
  secret_nonce: java.lang.String | typings.std.Uint8Array | scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: js.UndefOr[typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfEncrypt(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: java.lang.String | typings.std.Uint8Array,
  additional_data: java.lang.String | typings.std.Uint8Array | scala.Null,
  secret_nonce: java.lang.String | typings.std.Uint8Array | scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: js.UndefOr[typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
): typings.libsodiumWrappers.mod.CryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.CryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: java.lang.String,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: scala.Null,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: java.lang.String,
  additional_data: typings.std.Uint8Array,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: java.lang.String,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: scala.Null,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: java.lang.String,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: scala.Null,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
  message: typings.std.Uint8Array,
  additional_data: typings.std.Uint8Array,
  secret_nonce: typings.std.Uint8Array,
  public_nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]

inline def cryptoAeadXchacha20poly1305IetfKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_KEYBYTES").asInstanceOf[scala.Double]

inline def cryptoAeadXchacha20poly1305IetfKeygen(): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_keygen")().asInstanceOf[typings.std.Uint8Array]
inline def cryptoAeadXchacha20poly1305IetfKeygen(outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def cryptoAeadXchacha20poly1305IetfKeygen(outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]

inline def cryptoAeadXchacha20poly1305IetfMESSAGEBYTESMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]

inline def cryptoAeadXchacha20poly1305IetfNPUBBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_NPUBBYTES").asInstanceOf[scala.Double]

inline def cryptoAeadXchacha20poly1305IetfNSECBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_NSECBYTES").asInstanceOf[scala.Double]

inline def cryptoAuth(message: java.lang.String, key: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoAuth(
  message: java.lang.String,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAuth(
  message: java.lang.String,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoAuth(message: typings.std.Uint8Array, key: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoAuth(
  message: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoAuth(
  message: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoAuthBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_auth_BYTES").asInstanceOf[scala.Double]

inline def cryptoAuthKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_auth_KEYBYTES").asInstanceOf[scala.Double]

inline def cryptoAuthKeygen(): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_keygen")().asInstanceOf[typings.std.Uint8Array]
inline def cryptoAuthKeygen(outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def cryptoAuthKeygen(outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]

inline def cryptoAuthVerify(tag: typings.std.Uint8Array, message: java.lang.String, key: typings.std.Uint8Array): scala.Boolean = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_verify")(tag.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def cryptoAuthVerify(tag: typings.std.Uint8Array, message: typings.std.Uint8Array, key: typings.std.Uint8Array): scala.Boolean = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_verify")(tag.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def cryptoBoxBEFORENMBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_BEFORENMBYTES").asInstanceOf[scala.Double]

inline def cryptoBoxBeforenm(publicKey: typings.std.Uint8Array, privateKey: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_beforenm")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxBeforenm(
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_beforenm")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxBeforenm(
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_beforenm")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoBoxDetached(
  message: java.lang.String,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array
): typings.libsodiumWrappers.mod.CryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.CryptoBox]
inline def cryptoBoxDetached(
  message: java.lang.String,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoBoxDetached(
  message: java.lang.String,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.libsodiumWrappers.mod.CryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.CryptoBox]
inline def cryptoBoxDetached(
  message: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array
): typings.libsodiumWrappers.mod.CryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.CryptoBox]
inline def cryptoBoxDetached(
  message: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoBox]
inline def cryptoBoxDetached(
  message: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.libsodiumWrappers.mod.CryptoBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.CryptoBox]

inline def cryptoBoxEasy(
  message: java.lang.String,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxEasy(
  message: java.lang.String,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxEasy(
  message: java.lang.String,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxEasy(
  message: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxEasy(
  message: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxEasy(
  message: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoBoxEasyAfternm(message: java.lang.String, nonce: typings.std.Uint8Array, sharedKey: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxEasyAfternm(
  message: java.lang.String,
  nonce: typings.std.Uint8Array,
  sharedKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxEasyAfternm(
  message: java.lang.String,
  nonce: typings.std.Uint8Array,
  sharedKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxEasyAfternm(message: typings.std.Uint8Array, nonce: typings.std.Uint8Array, sharedKey: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxEasyAfternm(
  message: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  sharedKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxEasyAfternm(
  message: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  sharedKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoBoxKeypair(): typings.libsodiumWrappers.mod.KeyPair = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_keypair")().asInstanceOf[typings.libsodiumWrappers.mod.KeyPair]
inline def cryptoBoxKeypair(outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): typings.libsodiumWrappers.mod.StringKeyPair = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.libsodiumWrappers.mod.StringKeyPair]
inline def cryptoBoxKeypair(outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.libsodiumWrappers.mod.KeyPair = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.libsodiumWrappers.mod.KeyPair]

inline def cryptoBoxMACBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_MACBYTES").asInstanceOf[scala.Double]

inline def cryptoBoxMESSAGEBYTESMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]

inline def cryptoBoxNONCEBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_NONCEBYTES").asInstanceOf[scala.Double]

inline def cryptoBoxOpenDetached(
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxOpenDetached(
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxOpenDetached(
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxOpenDetached(
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxOpenDetached(
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxOpenDetached(
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoBoxOpenEasy(
  ciphertext: java.lang.String,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxOpenEasy(
  ciphertext: java.lang.String,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxOpenEasy(
  ciphertext: java.lang.String,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxOpenEasy(
  ciphertext: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxOpenEasy(
  ciphertext: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxOpenEasy(
  ciphertext: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoBoxOpenEasyAfternm(ciphertext: java.lang.String, nonce: typings.std.Uint8Array, sharedKey: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxOpenEasyAfternm(
  ciphertext: java.lang.String,
  nonce: typings.std.Uint8Array,
  sharedKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxOpenEasyAfternm(
  ciphertext: java.lang.String,
  nonce: typings.std.Uint8Array,
  sharedKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxOpenEasyAfternm(
  ciphertext: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  sharedKey: typings.std.Uint8Array
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxOpenEasyAfternm(
  ciphertext: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  sharedKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxOpenEasyAfternm(
  ciphertext: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  sharedKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoBoxPUBLICKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_PUBLICKEYBYTES").asInstanceOf[scala.Double]

inline def cryptoBoxSEALBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_SEALBYTES").asInstanceOf[scala.Double]

inline def cryptoBoxSECRETKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_SECRETKEYBYTES").asInstanceOf[scala.Double]

inline def cryptoBoxSEEDBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_SEEDBYTES").asInstanceOf[scala.Double]

inline def cryptoBoxSeal(message: java.lang.String, publicKey: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxSeal(
  message: java.lang.String,
  publicKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxSeal(
  message: java.lang.String,
  publicKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxSeal(message: typings.std.Uint8Array, publicKey: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxSeal(
  message: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxSeal(
  message: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoBoxSealOpen(
  ciphertext: java.lang.String,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxSealOpen(
  ciphertext: java.lang.String,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxSealOpen(
  ciphertext: java.lang.String,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxSealOpen(
  ciphertext: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoBoxSealOpen(
  ciphertext: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoBoxSealOpen(
  ciphertext: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoBoxSeedKeypair(seed: typings.std.Uint8Array): typings.libsodiumWrappers.mod.KeyPair = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seed_keypair")(seed.asInstanceOf[js.Any]).asInstanceOf[typings.libsodiumWrappers.mod.KeyPair]
inline def cryptoBoxSeedKeypair(seed: typings.std.Uint8Array, outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): typings.libsodiumWrappers.mod.StringKeyPair = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringKeyPair]
inline def cryptoBoxSeedKeypair(seed: typings.std.Uint8Array, outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.libsodiumWrappers.mod.KeyPair = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.KeyPair]

inline def cryptoGenerichash(hash_length: scala.Double, message: java.lang.String): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichash(hash_length: scala.Double, message: java.lang.String, key: java.lang.String): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichash(
  hash_length: scala.Double,
  message: java.lang.String,
  key: java.lang.String,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoGenerichash(
  hash_length: scala.Double,
  message: java.lang.String,
  key: java.lang.String,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichash(
  hash_length: scala.Double,
  message: java.lang.String,
  key: scala.Null,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoGenerichash(
  hash_length: scala.Double,
  message: java.lang.String,
  key: scala.Null,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichash(
  hash_length: scala.Double,
  message: java.lang.String,
  key: scala.Unit,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichash(hash_length: scala.Double, message: java.lang.String, key: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichash(
  hash_length: scala.Double,
  message: java.lang.String,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoGenerichash(
  hash_length: scala.Double,
  message: java.lang.String,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichash(hash_length: scala.Double, message: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichash(hash_length: scala.Double, message: typings.std.Uint8Array, key: java.lang.String): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichash(
  hash_length: scala.Double,
  message: typings.std.Uint8Array,
  key: java.lang.String,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoGenerichash(
  hash_length: scala.Double,
  message: typings.std.Uint8Array,
  key: java.lang.String,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichash(
  hash_length: scala.Double,
  message: typings.std.Uint8Array,
  key: scala.Null,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoGenerichash(
  hash_length: scala.Double,
  message: typings.std.Uint8Array,
  key: scala.Null,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichash(
  hash_length: scala.Double,
  message: typings.std.Uint8Array,
  key: scala.Unit,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichash(hash_length: scala.Double, message: typings.std.Uint8Array, key: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichash(
  hash_length: scala.Double,
  message: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoGenerichash(
  hash_length: scala.Double,
  message: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoGenerichashBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_BYTES").asInstanceOf[scala.Double]

inline def cryptoGenerichashBYTESMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_BYTES_MAX").asInstanceOf[scala.Double]

inline def cryptoGenerichashBYTESMIN: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_BYTES_MIN").asInstanceOf[scala.Double]

inline def cryptoGenerichashFinal(state_address: typings.libsodiumWrappers.mod.StateAddress, hash_length: scala.Double): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_final")(state_address.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichashFinal(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  hash_length: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_final")(state_address.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoGenerichashFinal(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  hash_length: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_final")(state_address.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoGenerichashInit(key: java.lang.String, hash_length: scala.Double): typings.libsodiumWrappers.mod.StateAddress = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_init")(key.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StateAddress]
inline def cryptoGenerichashInit(key: scala.Null, hash_length: scala.Double): typings.libsodiumWrappers.mod.StateAddress = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_init")(key.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StateAddress]
inline def cryptoGenerichashInit(key: typings.std.Uint8Array, hash_length: scala.Double): typings.libsodiumWrappers.mod.StateAddress = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_init")(key.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StateAddress]

inline def cryptoGenerichashKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_KEYBYTES").asInstanceOf[scala.Double]

inline def cryptoGenerichashKEYBYTESMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_KEYBYTES_MAX").asInstanceOf[scala.Double]

inline def cryptoGenerichashKEYBYTESMIN: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_KEYBYTES_MIN").asInstanceOf[scala.Double]

inline def cryptoGenerichashKeygen(): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_keygen")().asInstanceOf[typings.std.Uint8Array]
inline def cryptoGenerichashKeygen(outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def cryptoGenerichashKeygen(outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]

inline def cryptoGenerichashUpdate(state_address: typings.libsodiumWrappers.mod.StateAddress, message_chunk: java.lang.String): scala.Unit = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_update")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def cryptoGenerichashUpdate(state_address: typings.libsodiumWrappers.mod.StateAddress, message_chunk: typings.std.Uint8Array): scala.Unit = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_update")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def cryptoHash(message: java.lang.String): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
inline def cryptoHash(message: java.lang.String, outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoHash(message: java.lang.String, outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoHash(message: typings.std.Uint8Array): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
inline def cryptoHash(message: typings.std.Uint8Array, outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoHash(
  message: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoHashBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_hash_BYTES").asInstanceOf[scala.Double]

inline def cryptoKdfBYTESMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kdf_BYTES_MAX").asInstanceOf[scala.Double]

inline def cryptoKdfBYTESMIN: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kdf_BYTES_MIN").asInstanceOf[scala.Double]

inline def cryptoKdfCONTEXTBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kdf_CONTEXTBYTES").asInstanceOf[scala.Double]

inline def cryptoKdfDeriveFromKey(
  subkey_len: scala.Double,
  subkey_id: scala.Double,
  ctx: java.lang.String,
  key: typings.std.Uint8Array
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_derive_from_key")(subkey_len.asInstanceOf[js.Any], subkey_id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoKdfDeriveFromKey(
  subkey_len: scala.Double,
  subkey_id: scala.Double,
  ctx: java.lang.String,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_derive_from_key")(subkey_len.asInstanceOf[js.Any], subkey_id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoKdfDeriveFromKey(
  subkey_len: scala.Double,
  subkey_id: scala.Double,
  ctx: java.lang.String,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_derive_from_key")(subkey_len.asInstanceOf[js.Any], subkey_id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoKdfKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kdf_KEYBYTES").asInstanceOf[scala.Double]

inline def cryptoKdfKeygen(): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_keygen")().asInstanceOf[typings.std.Uint8Array]
inline def cryptoKdfKeygen(outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def cryptoKdfKeygen(outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]

inline def cryptoKxClientSessionKeys(
  clientPublicKey: typings.std.Uint8Array,
  clientSecretKey: typings.std.Uint8Array,
  serverPublicKey: typings.std.Uint8Array
): typings.libsodiumWrappers.mod.CryptoKX = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_client_session_keys")(clientPublicKey.asInstanceOf[js.Any], clientSecretKey.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.CryptoKX]
inline def cryptoKxClientSessionKeys(
  clientPublicKey: typings.std.Uint8Array,
  clientSecretKey: typings.std.Uint8Array,
  serverPublicKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoKX = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_client_session_keys")(clientPublicKey.asInstanceOf[js.Any], clientSecretKey.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoKX]
inline def cryptoKxClientSessionKeys(
  clientPublicKey: typings.std.Uint8Array,
  clientSecretKey: typings.std.Uint8Array,
  serverPublicKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.libsodiumWrappers.mod.CryptoKX = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_client_session_keys")(clientPublicKey.asInstanceOf[js.Any], clientSecretKey.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.CryptoKX]

inline def cryptoKxKeypair(): typings.libsodiumWrappers.mod.KeyPair = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_keypair")().asInstanceOf[typings.libsodiumWrappers.mod.KeyPair]
inline def cryptoKxKeypair(outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): typings.libsodiumWrappers.mod.StringKeyPair = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.libsodiumWrappers.mod.StringKeyPair]
inline def cryptoKxKeypair(outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.libsodiumWrappers.mod.KeyPair = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.libsodiumWrappers.mod.KeyPair]

inline def cryptoKxPUBLICKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kx_PUBLICKEYBYTES").asInstanceOf[scala.Double]

inline def cryptoKxSECRETKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kx_SECRETKEYBYTES").asInstanceOf[scala.Double]

inline def cryptoKxSEEDBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kx_SEEDBYTES").asInstanceOf[scala.Double]

inline def cryptoKxSESSIONKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kx_SESSIONKEYBYTES").asInstanceOf[scala.Double]

inline def cryptoKxSeedKeypair(seed: typings.std.Uint8Array): typings.libsodiumWrappers.mod.KeyPair = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_seed_keypair")(seed.asInstanceOf[js.Any]).asInstanceOf[typings.libsodiumWrappers.mod.KeyPair]
inline def cryptoKxSeedKeypair(seed: typings.std.Uint8Array, outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): typings.libsodiumWrappers.mod.StringKeyPair = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringKeyPair]
inline def cryptoKxSeedKeypair(seed: typings.std.Uint8Array, outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.libsodiumWrappers.mod.KeyPair = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.KeyPair]

inline def cryptoKxServerSessionKeys(
  serverPublicKey: typings.std.Uint8Array,
  serverSecretKey: typings.std.Uint8Array,
  clientPublicKey: typings.std.Uint8Array
): typings.libsodiumWrappers.mod.CryptoKX = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_server_session_keys")(serverPublicKey.asInstanceOf[js.Any], serverSecretKey.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.CryptoKX]
inline def cryptoKxServerSessionKeys(
  serverPublicKey: typings.std.Uint8Array,
  serverSecretKey: typings.std.Uint8Array,
  clientPublicKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringCryptoKX = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_server_session_keys")(serverPublicKey.asInstanceOf[js.Any], serverSecretKey.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringCryptoKX]
inline def cryptoKxServerSessionKeys(
  serverPublicKey: typings.std.Uint8Array,
  serverSecretKey: typings.std.Uint8Array,
  clientPublicKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.libsodiumWrappers.mod.CryptoKX = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_server_session_keys")(serverPublicKey.asInstanceOf[js.Any], serverSecretKey.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.CryptoKX]

inline def cryptoPwhash(
  keyLength: scala.Double,
  password: java.lang.String,
  salt: typings.std.Uint8Array,
  opsLimit: scala.Double,
  memLimit: scala.Double,
  algorithm: scala.Double
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoPwhash(
  keyLength: scala.Double,
  password: java.lang.String,
  salt: typings.std.Uint8Array,
  opsLimit: scala.Double,
  memLimit: scala.Double,
  algorithm: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoPwhash(
  keyLength: scala.Double,
  password: java.lang.String,
  salt: typings.std.Uint8Array,
  opsLimit: scala.Double,
  memLimit: scala.Double,
  algorithm: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoPwhash(
  keyLength: scala.Double,
  password: typings.std.Uint8Array,
  salt: typings.std.Uint8Array,
  opsLimit: scala.Double,
  memLimit: scala.Double,
  algorithm: scala.Double
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoPwhash(
  keyLength: scala.Double,
  password: typings.std.Uint8Array,
  salt: typings.std.Uint8Array,
  opsLimit: scala.Double,
  memLimit: scala.Double,
  algorithm: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoPwhash(
  keyLength: scala.Double,
  password: typings.std.Uint8Array,
  salt: typings.std.Uint8Array,
  opsLimit: scala.Double,
  memLimit: scala.Double,
  algorithm: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoPwhashALGARGON2I13: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_ALG_ARGON2I13").asInstanceOf[scala.Double]

inline def cryptoPwhashALGARGON2ID13: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_ALG_ARGON2ID13").asInstanceOf[scala.Double]

inline def cryptoPwhashALGDEFAULT: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_ALG_DEFAULT").asInstanceOf[scala.Double]

inline def cryptoPwhashBYTESMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_BYTES_MAX").asInstanceOf[scala.Double]

inline def cryptoPwhashBYTESMIN: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_BYTES_MIN").asInstanceOf[scala.Double]

inline def cryptoPwhashMEMLIMITINTERACTIVE: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_INTERACTIVE").asInstanceOf[scala.Double]

inline def cryptoPwhashMEMLIMITMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_MAX").asInstanceOf[scala.Double]

inline def cryptoPwhashMEMLIMITMIN: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_MIN").asInstanceOf[scala.Double]

inline def cryptoPwhashMEMLIMITMODERATE: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_MODERATE").asInstanceOf[scala.Double]

inline def cryptoPwhashMEMLIMITSENSITIVE: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_SENSITIVE").asInstanceOf[scala.Double]

inline def cryptoPwhashOPSLIMITINTERACTIVE: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_INTERACTIVE").asInstanceOf[scala.Double]

inline def cryptoPwhashOPSLIMITMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_MAX").asInstanceOf[scala.Double]

inline def cryptoPwhashOPSLIMITMIN: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_MIN").asInstanceOf[scala.Double]

inline def cryptoPwhashOPSLIMITMODERATE: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_MODERATE").asInstanceOf[scala.Double]

inline def cryptoPwhashOPSLIMITSENSITIVE: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_SENSITIVE").asInstanceOf[scala.Double]

inline def cryptoPwhashPASSWDMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_PASSWD_MAX").asInstanceOf[scala.Double]

inline def cryptoPwhashPASSWDMIN: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_PASSWD_MIN").asInstanceOf[scala.Double]

inline def cryptoPwhashSALTBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_SALTBYTES").asInstanceOf[scala.Double]

inline def cryptoPwhashSTRBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_STRBYTES").asInstanceOf[scala.Double]

inline def cryptoPwhashSTRPREFIX: java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_STRPREFIX").asInstanceOf[java.lang.String]

inline def cryptoPwhashStr(password: java.lang.String, opsLimit: scala.Double, memLimit: scala.Double): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str")(password.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoPwhashStr(password: typings.std.Uint8Array, opsLimit: scala.Double, memLimit: scala.Double): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str")(password.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def cryptoPwhashStrVerify(hashed_password: java.lang.String, password: java.lang.String): scala.Boolean = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str_verify")(hashed_password.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def cryptoPwhashStrVerify(hashed_password: java.lang.String, password: typings.std.Uint8Array): scala.Boolean = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str_verify")(hashed_password.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def cryptoScalarmult(privateKey: typings.std.Uint8Array, publicKey: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult")(privateKey.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoScalarmult(
  privateKey: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult")(privateKey.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoScalarmult(
  privateKey: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult")(privateKey.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoScalarmultBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_scalarmult_BYTES").asInstanceOf[scala.Double]

inline def cryptoScalarmultBase(privateKey: typings.std.Uint8Array): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_base")(privateKey.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
inline def cryptoScalarmultBase(privateKey: typings.std.Uint8Array, outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_base")(privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoScalarmultBase(
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_base")(privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoScalarmultSCALARBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_scalarmult_SCALARBYTES").asInstanceOf[scala.Double]

inline def cryptoSecretboxDetached(message: java.lang.String, nonce: typings.std.Uint8Array, key: typings.std.Uint8Array): typings.libsodiumWrappers.mod.SecretBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.SecretBox]
inline def cryptoSecretboxDetached(
  message: java.lang.String,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringSecretBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringSecretBox]
inline def cryptoSecretboxDetached(
  message: java.lang.String,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.libsodiumWrappers.mod.SecretBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.SecretBox]
inline def cryptoSecretboxDetached(message: typings.std.Uint8Array, nonce: typings.std.Uint8Array, key: typings.std.Uint8Array): typings.libsodiumWrappers.mod.SecretBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.SecretBox]
inline def cryptoSecretboxDetached(
  message: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringSecretBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringSecretBox]
inline def cryptoSecretboxDetached(
  message: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.libsodiumWrappers.mod.SecretBox = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.SecretBox]

inline def cryptoSecretboxEasy(message: java.lang.String, nonce: typings.std.Uint8Array, key: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretboxEasy(
  message: java.lang.String,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSecretboxEasy(
  message: java.lang.String,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretboxEasy(message: typings.std.Uint8Array, nonce: typings.std.Uint8Array, key: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretboxEasy(
  message: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSecretboxEasy(
  message: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoSecretboxKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretbox_KEYBYTES").asInstanceOf[scala.Double]

inline def cryptoSecretboxKeygen(): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_keygen")().asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretboxKeygen(outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def cryptoSecretboxKeygen(outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]

inline def cryptoSecretboxMACBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretbox_MACBYTES").asInstanceOf[scala.Double]

inline def cryptoSecretboxMESSAGEBYTESMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretbox_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]

inline def cryptoSecretboxNONCEBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretbox_NONCEBYTES").asInstanceOf[scala.Double]

inline def cryptoSecretboxOpenDetached(
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretboxOpenDetached(
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSecretboxOpenDetached(
  ciphertext: java.lang.String,
  mac: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretboxOpenDetached(
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretboxOpenDetached(
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSecretboxOpenDetached(
  ciphertext: typings.std.Uint8Array,
  mac: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoSecretboxOpenEasy(ciphertext: java.lang.String, nonce: typings.std.Uint8Array, key: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretboxOpenEasy(
  ciphertext: java.lang.String,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSecretboxOpenEasy(
  ciphertext: java.lang.String,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretboxOpenEasy(ciphertext: typings.std.Uint8Array, nonce: typings.std.Uint8Array, key: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretboxOpenEasy(
  ciphertext: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSecretboxOpenEasy(
  ciphertext: typings.std.Uint8Array,
  nonce: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoSecretstreamXchacha20poly1305ABYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_ABYTES").asInstanceOf[scala.Double]

inline def cryptoSecretstreamXchacha20poly1305HEADERBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_HEADERBYTES").asInstanceOf[scala.Double]

inline def cryptoSecretstreamXchacha20poly1305InitPull(header: typings.std.Uint8Array, key: typings.std.Uint8Array): typings.libsodiumWrappers.mod.StateAddress = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_pull")(header.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StateAddress]

inline def cryptoSecretstreamXchacha20poly1305InitPush(key: typings.std.Uint8Array): typings.libsodiumWrappers.anon.Header = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_push")(key.asInstanceOf[js.Any]).asInstanceOf[typings.libsodiumWrappers.anon.Header]
inline def cryptoSecretstreamXchacha20poly1305InitPush(key: typings.std.Uint8Array, outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): typings.libsodiumWrappers.anon.State = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_push")(key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.anon.State]
inline def cryptoSecretstreamXchacha20poly1305InitPush(key: typings.std.Uint8Array, outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.libsodiumWrappers.anon.Header = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_push")(key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.anon.Header]

inline def cryptoSecretstreamXchacha20poly1305KEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_KEYBYTES").asInstanceOf[scala.Double]

inline def cryptoSecretstreamXchacha20poly1305Keygen(): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_keygen")().asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretstreamXchacha20poly1305Keygen(outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def cryptoSecretstreamXchacha20poly1305Keygen(outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]

inline def cryptoSecretstreamXchacha20poly1305MESSAGEBYTESMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]

inline def cryptoSecretstreamXchacha20poly1305Pull(state_address: typings.libsodiumWrappers.mod.StateAddress, cipher: java.lang.String): typings.libsodiumWrappers.mod.MessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.MessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: java.lang.String,
  ad: java.lang.String
): typings.libsodiumWrappers.mod.MessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.MessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: java.lang.String,
  ad: java.lang.String,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringMessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringMessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: java.lang.String,
  ad: java.lang.String,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.libsodiumWrappers.mod.MessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.MessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: java.lang.String,
  ad: scala.Null,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringMessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringMessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: java.lang.String,
  ad: scala.Null,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.libsodiumWrappers.mod.MessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.MessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: java.lang.String,
  ad: scala.Unit,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.libsodiumWrappers.mod.MessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.MessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: java.lang.String,
  ad: typings.std.Uint8Array
): typings.libsodiumWrappers.mod.MessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.MessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: java.lang.String,
  ad: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringMessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringMessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: java.lang.String,
  ad: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.libsodiumWrappers.mod.MessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.MessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(state_address: typings.libsodiumWrappers.mod.StateAddress, cipher: typings.std.Uint8Array): typings.libsodiumWrappers.mod.MessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.MessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: typings.std.Uint8Array,
  ad: java.lang.String
): typings.libsodiumWrappers.mod.MessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.MessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: typings.std.Uint8Array,
  ad: java.lang.String,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringMessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringMessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: typings.std.Uint8Array,
  ad: java.lang.String,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.libsodiumWrappers.mod.MessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.MessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: typings.std.Uint8Array,
  ad: scala.Null,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringMessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringMessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: typings.std.Uint8Array,
  ad: scala.Null,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.libsodiumWrappers.mod.MessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.MessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: typings.std.Uint8Array,
  ad: scala.Unit,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.libsodiumWrappers.mod.MessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.MessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: typings.std.Uint8Array,
  ad: typings.std.Uint8Array
): typings.libsodiumWrappers.mod.MessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.MessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: typings.std.Uint8Array,
  ad: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): typings.libsodiumWrappers.mod.StringMessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringMessageTag]
inline def cryptoSecretstreamXchacha20poly1305Pull(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  cipher: typings.std.Uint8Array,
  ad: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.libsodiumWrappers.mod.MessageTag = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.MessageTag]

inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: java.lang.String,
  ad: java.lang.String,
  tag: scala.Double
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: java.lang.String,
  ad: java.lang.String,
  tag: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: java.lang.String,
  ad: java.lang.String,
  tag: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: java.lang.String,
  ad: scala.Null,
  tag: scala.Double
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: java.lang.String,
  ad: scala.Null,
  tag: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: java.lang.String,
  ad: scala.Null,
  tag: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: java.lang.String,
  ad: typings.std.Uint8Array,
  tag: scala.Double
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: java.lang.String,
  ad: typings.std.Uint8Array,
  tag: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: java.lang.String,
  ad: typings.std.Uint8Array,
  tag: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: typings.std.Uint8Array,
  ad: java.lang.String,
  tag: scala.Double
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: typings.std.Uint8Array,
  ad: java.lang.String,
  tag: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: typings.std.Uint8Array,
  ad: java.lang.String,
  tag: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: typings.std.Uint8Array,
  ad: scala.Null,
  tag: scala.Double
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: typings.std.Uint8Array,
  ad: scala.Null,
  tag: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: typings.std.Uint8Array,
  ad: scala.Null,
  tag: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: typings.std.Uint8Array,
  ad: typings.std.Uint8Array,
  tag: scala.Double
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: typings.std.Uint8Array,
  ad: typings.std.Uint8Array,
  tag: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSecretstreamXchacha20poly1305Push(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  message_chunk: typings.std.Uint8Array,
  ad: typings.std.Uint8Array,
  tag: scala.Double,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoSecretstreamXchacha20poly1305Rekey(state_address: typings.libsodiumWrappers.mod.StateAddress): typings.libsodiumWrappers.libsodiumWrappersBooleans.`true` = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_rekey")(state_address.asInstanceOf[js.Any]).asInstanceOf[typings.libsodiumWrappers.libsodiumWrappersBooleans.`true`]

inline def cryptoSecretstreamXchacha20poly1305TAGFINAL: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_TAG_FINAL").asInstanceOf[scala.Double]

inline def cryptoSecretstreamXchacha20poly1305TAGMESSAGE: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_TAG_MESSAGE").asInstanceOf[scala.Double]

inline def cryptoSecretstreamXchacha20poly1305TAGPUSH: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_TAG_PUSH").asInstanceOf[scala.Double]

inline def cryptoSecretstreamXchacha20poly1305TAGREKEY: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_TAG_REKEY").asInstanceOf[scala.Double]

inline def cryptoShorthash(message: java.lang.String, key: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoShorthash(
  message: java.lang.String,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoShorthash(
  message: java.lang.String,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoShorthash(message: typings.std.Uint8Array, key: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoShorthash(
  message: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoShorthash(
  message: typings.std.Uint8Array,
  key: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoShorthashBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_shorthash_BYTES").asInstanceOf[scala.Double]

inline def cryptoShorthashKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_shorthash_KEYBYTES").asInstanceOf[scala.Double]

inline def cryptoShorthashKeygen(): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_keygen")().asInstanceOf[typings.std.Uint8Array]
inline def cryptoShorthashKeygen(outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def cryptoShorthashKeygen(outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]

inline def cryptoSign(message: java.lang.String, privateKey: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSign(
  message: java.lang.String,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSign(
  message: java.lang.String,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSign(message: typings.std.Uint8Array, privateKey: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSign(
  message: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSign(
  message: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoSignBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_BYTES").asInstanceOf[scala.Double]

inline def cryptoSignDetached(message: java.lang.String, privateKey: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSignDetached(
  message: java.lang.String,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSignDetached(
  message: java.lang.String,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSignDetached(message: typings.std.Uint8Array, privateKey: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSignDetached(
  message: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSignDetached(
  message: typings.std.Uint8Array,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoSignEd25519PkToCurve25519(edPk: typings.std.Uint8Array): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_pk_to_curve25519")(edPk.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSignEd25519PkToCurve25519(edPk: typings.std.Uint8Array, outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_pk_to_curve25519")(edPk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSignEd25519PkToCurve25519(edPk: typings.std.Uint8Array, outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_pk_to_curve25519")(edPk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoSignEd25519SkToCurve25519(edSk: typings.std.Uint8Array): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_curve25519")(edSk.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSignEd25519SkToCurve25519(edSk: typings.std.Uint8Array, outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_curve25519")(edSk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSignEd25519SkToCurve25519(edSk: typings.std.Uint8Array, outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_curve25519")(edSk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoSignFinalCreate(state_address: typings.libsodiumWrappers.mod.StateAddress, privateKey: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_final_create")(state_address.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSignFinalCreate(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_final_create")(state_address.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSignFinalCreate(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  privateKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_final_create")(state_address.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoSignFinalVerify(
  state_address: typings.libsodiumWrappers.mod.StateAddress,
  signature: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array
): scala.Boolean = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_final_verify")(state_address.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def cryptoSignInit(): typings.libsodiumWrappers.mod.StateAddress = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_init")().asInstanceOf[typings.libsodiumWrappers.mod.StateAddress]

inline def cryptoSignKeypair(): typings.libsodiumWrappers.mod.KeyPair = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_keypair")().asInstanceOf[typings.libsodiumWrappers.mod.KeyPair]
inline def cryptoSignKeypair(outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): typings.libsodiumWrappers.mod.StringKeyPair = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.libsodiumWrappers.mod.StringKeyPair]
inline def cryptoSignKeypair(outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.libsodiumWrappers.mod.KeyPair = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typings.libsodiumWrappers.mod.KeyPair]

inline def cryptoSignMESSAGEBYTESMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]

inline def cryptoSignOpen(signedMessage: java.lang.String, publicKey: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSignOpen(
  signedMessage: java.lang.String,
  publicKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSignOpen(
  signedMessage: java.lang.String,
  publicKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSignOpen(signedMessage: typings.std.Uint8Array, publicKey: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def cryptoSignOpen(
  signedMessage: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def cryptoSignOpen(
  signedMessage: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def cryptoSignPUBLICKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_PUBLICKEYBYTES").asInstanceOf[scala.Double]

inline def cryptoSignSECRETKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_SECRETKEYBYTES").asInstanceOf[scala.Double]

inline def cryptoSignSEEDBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_SEEDBYTES").asInstanceOf[scala.Double]

inline def cryptoSignSeedKeypair(seed: typings.std.Uint8Array): typings.libsodiumWrappers.mod.KeyPair = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_seed_keypair")(seed.asInstanceOf[js.Any]).asInstanceOf[typings.libsodiumWrappers.mod.KeyPair]
inline def cryptoSignSeedKeypair(seed: typings.std.Uint8Array, outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): typings.libsodiumWrappers.mod.StringKeyPair = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.StringKeyPair]
inline def cryptoSignSeedKeypair(seed: typings.std.Uint8Array, outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.libsodiumWrappers.mod.KeyPair = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.libsodiumWrappers.mod.KeyPair]

inline def cryptoSignUpdate(state_address: typings.libsodiumWrappers.mod.StateAddress, message_chunk: java.lang.String): scala.Unit = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_update")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def cryptoSignUpdate(state_address: typings.libsodiumWrappers.mod.StateAddress, message_chunk: typings.std.Uint8Array): scala.Unit = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_update")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def cryptoSignVerifyDetached(signature: typings.std.Uint8Array, message: java.lang.String, publicKey: typings.std.Uint8Array): scala.Boolean = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_verify_detached")(signature.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def cryptoSignVerifyDetached(
  signature: typings.std.Uint8Array,
  message: typings.std.Uint8Array,
  publicKey: typings.std.Uint8Array
): scala.Boolean = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_verify_detached")(signature.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def crypto_AeadChacha20poly1305IETFABYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_ABYTES").asInstanceOf[scala.Double]

inline def crypto_AeadChacha20poly1305IETFKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_KEYBYTES").asInstanceOf[scala.Double]

inline def crypto_AeadChacha20poly1305IETFMESSAGEBYTESMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]

inline def crypto_AeadChacha20poly1305IETFNPUBBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_NPUBBYTES").asInstanceOf[scala.Double]

inline def crypto_AeadChacha20poly1305IETFNSECBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_NSECBYTES").asInstanceOf[scala.Double]

inline def crypto_AeadXchacha20poly1305IETFABYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_ABYTES").asInstanceOf[scala.Double]

inline def crypto_AeadXchacha20poly1305IETFKEYBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_KEYBYTES").asInstanceOf[scala.Double]

inline def crypto_AeadXchacha20poly1305IETFMESSAGEBYTESMAX: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]

inline def crypto_AeadXchacha20poly1305IETFNPUBBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_NPUBBYTES").asInstanceOf[scala.Double]

inline def crypto_AeadXchacha20poly1305IETFNSECBYTES: scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_NSECBYTES").asInstanceOf[scala.Double]

inline def fromBase64(input: java.lang.String): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("from_base64")(input.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
inline def fromBase64(input: java.lang.String, variant: typings.libsodiumWrappers.mod.base64Variants): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("from_base64")(input.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def fromHex(input: java.lang.String): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("from_hex")(input.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]

inline def fromString(str: java.lang.String): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("from_string")(str.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]

inline def increment(bytes: typings.std.Uint8Array): scala.Unit = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("increment")(bytes.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def isZero(bytes: typings.std.Uint8Array): scala.Boolean = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("is_zero")(bytes.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def memcmp(b1: typings.std.Uint8Array, b2: typings.std.Uint8Array): scala.Boolean = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memcmp")(b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def memzero(bytes: typings.std.Uint8Array): scala.Unit = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memzero")(bytes.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def outputFormats(): js.Array[
typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat | typings.libsodiumWrappers.mod.StringOutputFormat] = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("output_formats")().asInstanceOf[js.Array[
typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat | typings.libsodiumWrappers.mod.StringOutputFormat]]

inline def pad(buf: typings.std.Uint8Array, blocksize: scala.Double): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pad")(buf.asInstanceOf[js.Any], blocksize.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def randombytesBuf(length: scala.Double): typings.std.Uint8Array = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf")(length.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
inline def randombytesBuf(length: scala.Double, outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf")(length.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def randombytesBuf(length: scala.Double, outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf")(length.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def randombytesBufDeterministic(length: scala.Double, seed: typings.std.Uint8Array): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf_deterministic")(length.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
inline def randombytesBufDeterministic(
  length: scala.Double,
  seed: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.StringOutputFormat
): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf_deterministic")(length.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def randombytesBufDeterministic(
  length: scala.Double,
  seed: typings.std.Uint8Array,
  outputFormat: typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf_deterministic")(length.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def randombytesClose(): scala.Unit = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_close")().asInstanceOf[scala.Unit]

inline def randombytesRandom(): scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_random")().asInstanceOf[scala.Double]

inline def randombytesStir(): scala.Unit = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_stir")().asInstanceOf[scala.Unit]

inline def randombytesUniform(upper_bound: scala.Double): scala.Double = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_uniform")(upper_bound.asInstanceOf[js.Any]).asInstanceOf[scala.Double]

inline def ready: js.Promise[scala.Unit] = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ready").asInstanceOf[js.Promise[scala.Unit]]

inline def sodiumVersionString(): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sodium_version_string")().asInstanceOf[java.lang.String]

inline def symbols(): js.Array[java.lang.String] = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symbols")().asInstanceOf[js.Array[java.lang.String]]

inline def toBase64(input: java.lang.String): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("to_base64")(input.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def toBase64(input: java.lang.String, variant: typings.libsodiumWrappers.mod.base64Variants): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("to_base64")(input.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def toBase64(input: typings.std.Uint8Array): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("to_base64")(input.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def toBase64(input: typings.std.Uint8Array, variant: typings.libsodiumWrappers.mod.base64Variants): java.lang.String = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("to_base64")(input.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def toHex(input: java.lang.String): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("to_hex")(input.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def toHex(input: typings.std.Uint8Array): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("to_hex")(input.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def toString(bytes: typings.std.Uint8Array): java.lang.String = typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("to_string")(bytes.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def unpad(buf: typings.std.Uint8Array, blocksize: scala.Double): typings.std.Uint8Array = (typings.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unpad")(buf.asInstanceOf[js.Any], blocksize.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

type Uint8ArrayOutputFormat = typings.libsodiumWrappers.libsodiumWrappersStrings.uint8array
