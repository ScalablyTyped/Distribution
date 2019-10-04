package typings.jose.joseMod

import typings.jose.joseMod.JWENs.DecryptOptions
import typings.jose.joseMod.JWENs.FlattenedJWE
import typings.jose.joseMod.JWENs.GeneralJWE
import typings.jose.joseMod.JWENs.JWEJSON
import typings.jose.joseMod.JWENs.JWERecipient
import typings.jose.joseMod.JWENs.completeDecrypt
import typings.jose.joseMod.JWKNs.Key
import typings.jose.joseMod.JWKSNs.KeyStore
import typings.jose.joseNumbers.`false`
import typings.jose.joseNumbers.`true`
import typings.jose.joseStrings.compact
import typings.jose.joseStrings.flattened
import typings.jose.joseStrings.general
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWE")
@js.native
object JWENs extends js.Object {
  trait DecryptOptions[komplet] extends js.Object {
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    var complete: js.UndefOr[komplet] = js.undefined
    var crit: js.UndefOr[js.Array[String]] = js.undefined
  }
  
  @js.native
  class Encrypt protected () extends js.Object {
    def this(cleartext: String) = this()
    def this(cleartext: Buffer) = this()
    def this(cleartext: String, `protected`: js.Object) = this()
    def this(cleartext: Buffer, `protected`: js.Object) = this()
    def this(cleartext: String, `protected`: js.Object, unprotected: js.Object) = this()
    def this(cleartext: Buffer, `protected`: js.Object, unprotected: js.Object) = this()
    def this(cleartext: String, `protected`: js.Object, unprotected: js.Object, aad: String) = this()
    def this(cleartext: Buffer, `protected`: js.Object, unprotected: js.Object, aad: String) = this()
    @JSName("encrypt")
    def encrypt_compact(serialization: compact): String = js.native
    @JSName("encrypt")
    def encrypt_flattened(serialization: flattened): FlattenedJWE = js.native
    @JSName("encrypt")
    def encrypt_general(serialization: general): GeneralJWE = js.native
    def recipient(key: Key): Unit = js.native
    def recipient(key: Key, header: js.Object): Unit = js.native
  }
  
  trait FlattenedJWE
    extends JWERecipient
       with JWEJSON
  
  trait GeneralJWE extends JWEJSON {
    var recipients: js.Array[JWERecipient]
  }
  
  trait JWEJSON extends js.Object {
    var aad: js.UndefOr[String] = js.undefined
    var ciphertext: String
    var iv: String
    var `protected`: js.UndefOr[String] = js.undefined
    var tag: String
    var unprotected: js.UndefOr[js.Object] = js.undefined
  }
  
  trait JWERecipient extends js.Object {
    var encrypted_key: String
    var header: js.UndefOr[js.Object] = js.undefined
  }
  
  trait completeDecrypt extends js.Object {
    var aad: js.UndefOr[String] = js.undefined
    var cleartext: Buffer
    var header: js.UndefOr[js.Object] = js.undefined
    var key: Key
    var `protected`: js.UndefOr[js.Object] = js.undefined
    var unprotected: js.UndefOr[js.Object] = js.undefined
  }
  
  def decrypt(jwe: String, key: Key): Buffer = js.native
  def decrypt(jwe: String, key: KeyStore): Buffer = js.native
  def decrypt(jwe: FlattenedJWE, key: Key): Buffer = js.native
  def decrypt(jwe: FlattenedJWE, key: KeyStore): Buffer = js.native
  def decrypt(jwe: GeneralJWE, key: Key): Buffer = js.native
  def decrypt(jwe: GeneralJWE, key: KeyStore): Buffer = js.native
  @JSName("decrypt")
  def decrypt_completeDecrypt(jwe: String, key: Key): completeDecrypt = js.native
  @JSName("decrypt")
  def decrypt_completeDecrypt(jwe: String, key: KeyStore): completeDecrypt = js.native
  @JSName("decrypt")
  def decrypt_completeDecrypt(jwe: FlattenedJWE, key: Key): completeDecrypt = js.native
  @JSName("decrypt")
  def decrypt_completeDecrypt(jwe: FlattenedJWE, key: KeyStore): completeDecrypt = js.native
  @JSName("decrypt")
  def decrypt_completeDecrypt(jwe: GeneralJWE, key: Key): completeDecrypt = js.native
  @JSName("decrypt")
  def decrypt_completeDecrypt(jwe: GeneralJWE, key: KeyStore): completeDecrypt = js.native
  @JSName("decrypt")
  def decrypt_false(jwe: String, key: Key, options: DecryptOptions[`false`]): Buffer = js.native
  @JSName("decrypt")
  def decrypt_false(jwe: String, key: KeyStore, options: DecryptOptions[`false`]): Buffer = js.native
  @JSName("decrypt")
  def decrypt_false(jwe: FlattenedJWE, key: Key, options: DecryptOptions[`false`]): Buffer = js.native
  @JSName("decrypt")
  def decrypt_false(jwe: FlattenedJWE, key: KeyStore, options: DecryptOptions[`false`]): Buffer = js.native
  @JSName("decrypt")
  def decrypt_false(jwe: GeneralJWE, key: Key, options: DecryptOptions[`false`]): Buffer = js.native
  @JSName("decrypt")
  def decrypt_false(jwe: GeneralJWE, key: KeyStore, options: DecryptOptions[`false`]): Buffer = js.native
  @JSName("decrypt")
  def decrypt_true(jwe: String, key: Key, options: DecryptOptions[`true`]): completeDecrypt = js.native
  @JSName("decrypt")
  def decrypt_true(jwe: String, key: KeyStore, options: DecryptOptions[`true`]): completeDecrypt = js.native
  @JSName("decrypt")
  def decrypt_true(jwe: FlattenedJWE, key: Key, options: DecryptOptions[`true`]): completeDecrypt = js.native
  @JSName("decrypt")
  def decrypt_true(jwe: FlattenedJWE, key: KeyStore, options: DecryptOptions[`true`]): completeDecrypt = js.native
  @JSName("decrypt")
  def decrypt_true(jwe: GeneralJWE, key: Key, options: DecryptOptions[`true`]): completeDecrypt = js.native
  @JSName("decrypt")
  def decrypt_true(jwe: GeneralJWE, key: KeyStore, options: DecryptOptions[`true`]): completeDecrypt = js.native
  def encrypt(payload: String, key: Key): String = js.native
  def encrypt(payload: String, key: Key, `protected`: js.Object): String = js.native
  def encrypt(payload: Buffer, key: Key): String = js.native
  def encrypt(payload: Buffer, key: Key, `protected`: js.Object): String = js.native
  @JSName("encrypt")
  @js.native
  object encryptNs extends js.Object {
    def flattened(payload: String, key: Key): FlattenedJWE = js.native
    def flattened(payload: String, key: Key, `protected`: js.Object): FlattenedJWE = js.native
    def flattened(payload: String, key: Key, `protected`: js.Object, header: js.Object): FlattenedJWE = js.native
    def flattened(payload: String, key: Key, `protected`: js.Object, header: js.Object, aad: String): FlattenedJWE = js.native
    def flattened(payload: Buffer, key: Key): FlattenedJWE = js.native
    def flattened(payload: Buffer, key: Key, `protected`: js.Object): FlattenedJWE = js.native
    def flattened(payload: Buffer, key: Key, `protected`: js.Object, header: js.Object): FlattenedJWE = js.native
    def flattened(payload: Buffer, key: Key, `protected`: js.Object, header: js.Object, aad: String): FlattenedJWE = js.native
    def general(payload: String, key: Key): GeneralJWE = js.native
    def general(payload: String, key: Key, `protected`: js.Object): GeneralJWE = js.native
    def general(payload: String, key: Key, `protected`: js.Object, header: js.Object): GeneralJWE = js.native
    def general(payload: String, key: Key, `protected`: js.Object, header: js.Object, aad: String): GeneralJWE = js.native
    def general(payload: Buffer, key: Key): GeneralJWE = js.native
    def general(payload: Buffer, key: Key, `protected`: js.Object): GeneralJWE = js.native
    def general(payload: Buffer, key: Key, `protected`: js.Object, header: js.Object): GeneralJWE = js.native
    def general(payload: Buffer, key: Key, `protected`: js.Object, header: js.Object, aad: String): GeneralJWE = js.native
  }
  
}

