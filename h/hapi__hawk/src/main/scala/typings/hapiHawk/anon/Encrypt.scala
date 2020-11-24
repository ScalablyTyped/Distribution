package typings.hapiHawk.anon

import typings.cryptoJs.mod.CipherOption
import typings.cryptoJs.mod.CipherStatic
import typings.cryptoJs.mod.Format_
import typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams
import typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encrypt extends js.Object {
  
  def _parse(ciphertext: String, format: Format_): CipherParams = js.native
  /**
    * Converts serialized ciphertext to CipherParams,
    * else assumed CipherParams already and returns ciphertext unchanged.
    *
    * @param ciphertext The ciphertext.
    * @param format The formatting strategy to use to parse serialized ciphertext.
    *
    * @return The unserialized ciphertext.
    *
    * @example
    *
    *     var ciphertextParams = CryptoJS.lib.SerializableCipher._parse(ciphertextStringOrParams, format);
    */
  def _parse(ciphertext: CipherParams, format: Format_): CipherParams = js.native
  
  def decrypt(cipher: CipherStatic, ciphertext: String, key: WordArray): CipherParams = js.native
  def decrypt(cipher: CipherStatic, ciphertext: String, key: WordArray, cfg: CipherOption): CipherParams = js.native
  /**
    * Decrypts serialized ciphertext.
    *
    * @param cipher The cipher algorithm to use.
    * @param ciphertext The ciphertext to decrypt.
    * @param key The key.
    * @param cfg (Optional) The configuration options to use for this operation.
    *
    * @return The plaintext.
    *
    * @example
    *
    *     var plaintext = CryptoJS.lib.SerializableCipher.decrypt(CryptoJS.algo.AES, formattedCiphertext, key, { iv: iv, format: CryptoJS.format.OpenSSL });
    *     var plaintext = CryptoJS.lib.SerializableCipher.decrypt(CryptoJS.algo.AES, ciphertextParams, key, { iv: iv, format: CryptoJS.format.OpenSSL });
    */
  def decrypt(cipher: CipherStatic, ciphertext: WordArray, key: WordArray): CipherParams = js.native
  def decrypt(cipher: CipherStatic, ciphertext: WordArray, key: WordArray, cfg: CipherOption): CipherParams = js.native
  
  def encrypt(cipher: CipherStatic, message: String, key: WordArray): CipherParams = js.native
  def encrypt(cipher: CipherStatic, message: String, key: WordArray, cfg: CipherOption): CipherParams = js.native
  /**
    * Encrypts a message.
    *
    * @param cipher The cipher algorithm to use.
    * @param message The message to encrypt.
    * @param key The key.
    * @param cfg (Optional) The configuration options to use for this operation.
    *
    * @return A cipher params object.
    *
    * @example
    *
    *     var ciphertextParams = CryptoJS.lib.SerializableCipher.encrypt(CryptoJS.algo.AES, message, key);
    *     var ciphertextParams = CryptoJS.lib.SerializableCipher.encrypt(CryptoJS.algo.AES, message, key, { iv: iv });
    *     var ciphertextParams = CryptoJS.lib.SerializableCipher.encrypt(CryptoJS.algo.AES, message, key, { iv: iv, format: CryptoJS.format.OpenSSL });
    */
  def encrypt(cipher: CipherStatic, message: WordArray, key: WordArray): CipherParams = js.native
  def encrypt(cipher: CipherStatic, message: WordArray, key: WordArray, cfg: CipherOption): CipherParams = js.native
}
