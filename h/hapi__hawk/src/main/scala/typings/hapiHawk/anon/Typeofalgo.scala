package typings.hapiHawk.anon

import typings.cryptoJs.mod.CipherStatic
import typings.cryptoJs.mod.HasherStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofalgo extends js.Object {
  
  /**
    * AES block cipher algorithm.
    */
  val AES: CipherStatic = js.native
  
  /**
    * DES block cipher algorithm.
    */
  val DES: CipherStatic = js.native
  
  /**
    * This key derivation function is meant to conform with EVP_BytesToKey.
    * www.openssl.org/docs/crypto/EVP_BytesToKey.html
    */
  var EvpKDF: TypeofEvpKDF = js.native
  
  /**
    * HMAC algorithm.
    */
  var HMAC: TypeofHMAC = js.native
  
  /**
    * MD5 hash algorithm.
    */
  val MD5: HasherStatic = js.native
  
  /**
    * Password-Based Key Derivation Function 2 algorithm.
    */
  var PBKDF2: TypeofPBKDF2 = js.native
  
  /**
    * RC4 stream cipher algorithm.
    */
  val RC4: CipherStatic = js.native
  
  /**
    * Modified RC4 stream cipher algorithm.
    */
  val RC4Drop: CipherStatic = js.native
  
  /**
    * RIPEMD160 hash algorithm.
    */
  val RIPEMD160: HasherStatic = js.native
  
  /**
    * Rabbit stream cipher algorithm
    */
  val Rabbit: CipherStatic = js.native
  
  /**
    * Rabbit stream cipher algorithm.
    *
    * This is a legacy version that neglected to convert the key to little-endian.
    * This error doesn't affect the cipher's security,
    * but it does affect its compatibility with other implementations.
    */
  val RabbitLegacy: CipherStatic = js.native
  
  /**
    * SHA-1 hash algorithm.
    */
  val SHA1: HasherStatic = js.native
  
  /**
    * SHA-224 hash algorithm.
    */
  val SHA224: HasherStatic = js.native
  
  /**
    * SHA-256 hash algorithm.
    */
  val SHA256: HasherStatic = js.native
  
  /**
    * SHA-3 hash algorithm.
    */
  val SHA3: HasherStatic = js.native
  
  /**
    * SHA-384 hash algorithm.
    */
  val SHA384: HasherStatic = js.native
  
  /**
    * SHA-512 hash algorithm.
    */
  val SHA512: HasherStatic = js.native
  
  /**
    * Triple-DES block cipher algorithm.
    */
  val TripleDES: CipherStatic = js.native
}
object Typeofalgo {
  
  @scala.inline
  def apply(
    AES: CipherStatic,
    DES: CipherStatic,
    EvpKDF: TypeofEvpKDF,
    HMAC: TypeofHMAC,
    MD5: HasherStatic,
    PBKDF2: TypeofPBKDF2,
    RC4: CipherStatic,
    RC4Drop: CipherStatic,
    RIPEMD160: HasherStatic,
    Rabbit: CipherStatic,
    RabbitLegacy: CipherStatic,
    SHA1: HasherStatic,
    SHA224: HasherStatic,
    SHA256: HasherStatic,
    SHA3: HasherStatic,
    SHA384: HasherStatic,
    SHA512: HasherStatic,
    TripleDES: CipherStatic
  ): Typeofalgo = {
    val __obj = js.Dynamic.literal(AES = AES.asInstanceOf[js.Any], DES = DES.asInstanceOf[js.Any], EvpKDF = EvpKDF.asInstanceOf[js.Any], HMAC = HMAC.asInstanceOf[js.Any], MD5 = MD5.asInstanceOf[js.Any], PBKDF2 = PBKDF2.asInstanceOf[js.Any], RC4 = RC4.asInstanceOf[js.Any], RC4Drop = RC4Drop.asInstanceOf[js.Any], RIPEMD160 = RIPEMD160.asInstanceOf[js.Any], Rabbit = Rabbit.asInstanceOf[js.Any], RabbitLegacy = RabbitLegacy.asInstanceOf[js.Any], SHA1 = SHA1.asInstanceOf[js.Any], SHA224 = SHA224.asInstanceOf[js.Any], SHA256 = SHA256.asInstanceOf[js.Any], SHA3 = SHA3.asInstanceOf[js.Any], SHA384 = SHA384.asInstanceOf[js.Any], SHA512 = SHA512.asInstanceOf[js.Any], TripleDES = TripleDES.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofalgo]
  }
  
  @scala.inline
  implicit class TypeofalgoOps[Self <: Typeofalgo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAES(value: CipherStatic): Self = this.set("AES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDES(value: CipherStatic): Self = this.set("DES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvpKDF(value: TypeofEvpKDF): Self = this.set("EvpKDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHMAC(value: TypeofHMAC): Self = this.set("HMAC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMD5(value: HasherStatic): Self = this.set("MD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPBKDF2(value: TypeofPBKDF2): Self = this.set("PBKDF2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRC4(value: CipherStatic): Self = this.set("RC4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRC4Drop(value: CipherStatic): Self = this.set("RC4Drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIPEMD160(value: HasherStatic): Self = this.set("RIPEMD160", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRabbit(value: CipherStatic): Self = this.set("Rabbit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRabbitLegacy(value: CipherStatic): Self = this.set("RabbitLegacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA1(value: HasherStatic): Self = this.set("SHA1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA224(value: HasherStatic): Self = this.set("SHA224", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA256(value: HasherStatic): Self = this.set("SHA256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA3(value: HasherStatic): Self = this.set("SHA3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA384(value: HasherStatic): Self = this.set("SHA384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA512(value: HasherStatic): Self = this.set("SHA512", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTripleDES(value: CipherStatic): Self = this.set("TripleDES", value.asInstanceOf[js.Any])
  }
}
