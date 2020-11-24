package typings.hapiHawk.browserMod

import typings.cryptoJs.anon.Hasher
import typings.cryptoJs.mod.CipherHelper
import typings.cryptoJs.mod.KDFOption
import typings.cryptoJs.mod.WordArray
import typings.hapiHawk.anon.Typeofalgo
import typings.hapiHawk.anon.Typeofenc
import typings.hapiHawk.anon.Typeofformat
import typings.hapiHawk.anon.Typeofkdf
import typings.hapiHawk.anon.Typeoflib
import typings.hapiHawk.anon.Typeofmode
import typings.hapiHawk.anon.Typeofpad
import typings.hapiHawk.anon.Typeofx64
import typings.hapiHawk.clientMod.Credentials
import typings.hapiHawk.cryptoMod.Artifacts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/hawk/lib/browser", "crypto")
@js.native
object crypto extends js.Object {
  
  val algorithms: js.Array[String] = js.native
  
  def calculateMac(`type`: String, credentials: Credentials, options: Artifacts): String = js.native
  
  def calculatePayloadHash(payload: String, algorithm: String, contentType: String): String = js.native
  
  def calculateTsMac(ts: String, credentials: Credentials): String = js.native
  
  def generateNormalizedString(`type`: String, options: Artifacts): String = js.native
  
  val headerVersion: String = js.native
  
  @js.native
  object utils extends js.Object {
    
    val AES: CipherHelper = js.native
    
    val DES: CipherHelper = js.native
    
    def EvpKDF(password: String, salt: String): WordArray = js.native
    def EvpKDF(password: String, salt: String, cfg: Hasher): WordArray = js.native
    def EvpKDF(password: String, salt: WordArray): WordArray = js.native
    def EvpKDF(password: String, salt: WordArray, cfg: Hasher): WordArray = js.native
    def EvpKDF(password: WordArray, salt: String): WordArray = js.native
    def EvpKDF(password: WordArray, salt: String, cfg: Hasher): WordArray = js.native
    def EvpKDF(password: WordArray, salt: WordArray): WordArray = js.native
    def EvpKDF(password: WordArray, salt: WordArray, cfg: Hasher): WordArray = js.native
    
    def HmacMD5(message: String, key: String): WordArray = js.native
    def HmacMD5(message: String, key: WordArray): WordArray = js.native
    def HmacMD5(message: WordArray, key: String): WordArray = js.native
    def HmacMD5(message: WordArray, key: WordArray): WordArray = js.native
    
    def HmacRIPEMD160(message: String, key: String): WordArray = js.native
    def HmacRIPEMD160(message: String, key: WordArray): WordArray = js.native
    def HmacRIPEMD160(message: WordArray, key: String): WordArray = js.native
    def HmacRIPEMD160(message: WordArray, key: WordArray): WordArray = js.native
    
    def HmacSHA1(message: String, key: String): WordArray = js.native
    def HmacSHA1(message: String, key: WordArray): WordArray = js.native
    def HmacSHA1(message: WordArray, key: String): WordArray = js.native
    def HmacSHA1(message: WordArray, key: WordArray): WordArray = js.native
    
    def HmacSHA224(message: String, key: String): WordArray = js.native
    def HmacSHA224(message: String, key: WordArray): WordArray = js.native
    def HmacSHA224(message: WordArray, key: String): WordArray = js.native
    def HmacSHA224(message: WordArray, key: WordArray): WordArray = js.native
    
    def HmacSHA256(message: String, key: String): WordArray = js.native
    def HmacSHA256(message: String, key: WordArray): WordArray = js.native
    def HmacSHA256(message: WordArray, key: String): WordArray = js.native
    def HmacSHA256(message: WordArray, key: WordArray): WordArray = js.native
    
    def HmacSHA3(message: String, key: String): WordArray = js.native
    def HmacSHA3(message: String, key: WordArray): WordArray = js.native
    def HmacSHA3(message: WordArray, key: String): WordArray = js.native
    def HmacSHA3(message: WordArray, key: WordArray): WordArray = js.native
    
    def HmacSHA384(message: String, key: String): WordArray = js.native
    def HmacSHA384(message: String, key: WordArray): WordArray = js.native
    def HmacSHA384(message: WordArray, key: String): WordArray = js.native
    def HmacSHA384(message: WordArray, key: WordArray): WordArray = js.native
    
    def HmacSHA512(message: String, key: String): WordArray = js.native
    def HmacSHA512(message: String, key: WordArray): WordArray = js.native
    def HmacSHA512(message: WordArray, key: String): WordArray = js.native
    def HmacSHA512(message: WordArray, key: WordArray): WordArray = js.native
    
    def MD5(message: String): WordArray = js.native
    def MD5(message: String, cfg: js.Object): WordArray = js.native
    def MD5(message: WordArray): WordArray = js.native
    def MD5(message: WordArray, cfg: js.Object): WordArray = js.native
    
    def PBKDF2(password: String, salt: String): WordArray = js.native
    def PBKDF2(password: String, salt: String, cfg: KDFOption): WordArray = js.native
    def PBKDF2(password: String, salt: WordArray): WordArray = js.native
    def PBKDF2(password: String, salt: WordArray, cfg: KDFOption): WordArray = js.native
    def PBKDF2(password: WordArray, salt: String): WordArray = js.native
    def PBKDF2(password: WordArray, salt: String, cfg: KDFOption): WordArray = js.native
    def PBKDF2(password: WordArray, salt: WordArray): WordArray = js.native
    def PBKDF2(password: WordArray, salt: WordArray, cfg: KDFOption): WordArray = js.native
    
    val RC4: CipherHelper = js.native
    
    val RC4Drop: CipherHelper = js.native
    
    def RIPEMD160(message: String): WordArray = js.native
    def RIPEMD160(message: String, cfg: js.Object): WordArray = js.native
    def RIPEMD160(message: WordArray): WordArray = js.native
    def RIPEMD160(message: WordArray, cfg: js.Object): WordArray = js.native
    
    val Rabbit: CipherHelper = js.native
    
    val RabbitLegacy: CipherHelper = js.native
    
    def SHA1(message: String): WordArray = js.native
    def SHA1(message: String, cfg: js.Object): WordArray = js.native
    def SHA1(message: WordArray): WordArray = js.native
    def SHA1(message: WordArray, cfg: js.Object): WordArray = js.native
    
    def SHA224(message: String): WordArray = js.native
    def SHA224(message: String, cfg: js.Object): WordArray = js.native
    def SHA224(message: WordArray): WordArray = js.native
    def SHA224(message: WordArray, cfg: js.Object): WordArray = js.native
    
    def SHA256(message: String): WordArray = js.native
    def SHA256(message: String, cfg: js.Object): WordArray = js.native
    def SHA256(message: WordArray): WordArray = js.native
    def SHA256(message: WordArray, cfg: js.Object): WordArray = js.native
    
    def SHA3(message: String): WordArray = js.native
    def SHA3(message: String, cfg: js.Object): WordArray = js.native
    def SHA3(message: WordArray): WordArray = js.native
    def SHA3(message: WordArray, cfg: js.Object): WordArray = js.native
    
    def SHA384(message: String): WordArray = js.native
    def SHA384(message: String, cfg: js.Object): WordArray = js.native
    def SHA384(message: WordArray): WordArray = js.native
    def SHA384(message: WordArray, cfg: js.Object): WordArray = js.native
    
    def SHA512(message: String): WordArray = js.native
    def SHA512(message: String, cfg: js.Object): WordArray = js.native
    def SHA512(message: WordArray): WordArray = js.native
    def SHA512(message: WordArray, cfg: js.Object): WordArray = js.native
    
    val TripleDES: CipherHelper = js.native
    
    val algo: Typeofalgo = js.native
    
    val enc: Typeofenc = js.native
    
    val format: Typeofformat = js.native
    
    val kdf: Typeofkdf = js.native
    
    val lib: Typeoflib = js.native
    
    val mode: Typeofmode = js.native
    
    val pad: Typeofpad = js.native
    
    val x64: Typeofx64 = js.native
  }
}
