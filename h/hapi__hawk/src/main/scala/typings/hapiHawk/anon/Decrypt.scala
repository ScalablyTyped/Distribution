package typings.hapiHawk.anon

import typings.cryptoJs.mod.CipherOption
import typings.cryptoJs.mod.CipherStatic
import typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams
import typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Decrypt extends js.Object {
  
  def decrypt(cipher: CipherStatic, ciphertext: String, password: String): WordArray = js.native
  def decrypt(cipher: CipherStatic, ciphertext: String, password: String, cfg: CipherOption): WordArray = js.native
  /**
    * Decrypts serialized ciphertext using a password.
    *
    * @param cipher The cipher algorithm to use.
    * @param ciphertext The ciphertext to decrypt.
    * @param password The password.
    * @param cfg (Optional) The configuration options to use for this operation.
    *
    * @return The plaintext.
    *
    * @example
    *
    *     var plaintext = CryptoJS.lib.PasswordBasedCipher.decrypt(CryptoJS.algo.AES, formattedCiphertext, 'password', { format: CryptoJS.format.OpenSSL });
    *     var plaintext = CryptoJS.lib.PasswordBasedCipher.decrypt(CryptoJS.algo.AES, ciphertextParams, 'password', { format: CryptoJS.format.OpenSSL });
    */
  def decrypt(cipher: CipherStatic, ciphertext: CipherParams, password: String): WordArray = js.native
  def decrypt(cipher: CipherStatic, ciphertext: CipherParams, password: String, cfg: CipherOption): WordArray = js.native
  
  def encrypt(cipher: CipherStatic, message: String, password: String): CipherParams = js.native
  def encrypt(cipher: CipherStatic, message: String, password: String, cfg: CipherOption): CipherParams = js.native
  /**
    * Encrypts a message using a password.
    *
    * @param cipher The cipher algorithm to use.
    * @param message The message to encrypt.
    * @param password The password.
    * @param cfg (Optional) The configuration options to use for this operation.
    *
    * @return A cipher params object.
    *
    * @example
    *
    *     var ciphertextParams = CryptoJS.lib.PasswordBasedCipher.encrypt(CryptoJS.algo.AES, message, 'password');
    *     var ciphertextParams = CryptoJS.lib.PasswordBasedCipher.encrypt(CryptoJS.algo.AES, message, 'password', { format: CryptoJS.format.OpenSSL });
    */
  def encrypt(cipher: CipherStatic, message: WordArray, password: String): CipherParams = js.native
  def encrypt(cipher: CipherStatic, message: WordArray, password: String, cfg: CipherOption): CipherParams = js.native
}
