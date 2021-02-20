package typings.hapiHawk

import typings.cryptoJs.anon.Hasher
import typings.cryptoJs.anon.PartialCipherParams
import typings.cryptoJs.mod.BlockCipherMode
import typings.cryptoJs.mod.CipherHelper
import typings.cryptoJs.mod.CipherOption
import typings.cryptoJs.mod.CipherParams
import typings.cryptoJs.mod.CipherStatic
import typings.cryptoJs.mod.Encoder
import typings.cryptoJs.mod.Format_
import typings.cryptoJs.mod.HasherHelper
import typings.cryptoJs.mod.HasherStatic
import typings.cryptoJs.mod.HmacHasherHelper
import typings.cryptoJs.mod.KDFOption
import typings.cryptoJs.mod.Padding
import typings.cryptoJs.mod.WordArray
import typings.cryptoJs.mod.X64Word
import typings.cryptoJs.mod.X64WordArray
import typings.hapiHawk.browserMod.utils.ParsedUri
import typings.hapiHawk.clientMod.AuthenticateOptions
import typings.hapiHawk.clientMod.BewitOptions
import typings.hapiHawk.clientMod.Credentials
import typings.hapiHawk.clientMod.HeaderOptions
import typings.hapiHawk.clientMod.Header_
import typings.hapiHawk.clientMod.MessageOptions
import typings.hapiHawk.clientMod.Message_
import typings.hapiHawk.cryptoMod.Artifacts
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.std.Record
import typings.std.RegExp
import typings.std.Response
import typings.std.Storage
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  object client {
    
    @JSImport("@hapi/hawk/lib/browser", "client.authenticate")
    @js.native
    def authenticate(request: Response, credentials: Credentials, artifacts: Artifacts): Boolean = js.native
    @JSImport("@hapi/hawk/lib/browser", "client.authenticate")
    @js.native
    def authenticate(request: Response, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Boolean = js.native
    @JSImport("@hapi/hawk/lib/browser", "client.authenticate")
    @js.native
    def authenticate(request: XMLHttpRequest, credentials: Credentials, artifacts: Artifacts): Boolean = js.native
    @JSImport("@hapi/hawk/lib/browser", "client.authenticate")
    @js.native
    def authenticate(
      request: XMLHttpRequest,
      credentials: Credentials,
      artifacts: Artifacts,
      options: AuthenticateOptions
    ): Boolean = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "client.authenticateTimestamp")
    @js.native
    def authenticateTimestamp(message: String, credentials: Credentials): Boolean = js.native
    @JSImport("@hapi/hawk/lib/browser", "client.authenticateTimestamp")
    @js.native
    def authenticateTimestamp(message: String, credentials: Credentials, updateClock: Boolean): Boolean = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "client.bewit")
    @js.native
    def bewit(uri: String): String = js.native
    @JSImport("@hapi/hawk/lib/browser", "client.bewit")
    @js.native
    def bewit(uri: String, options: BewitOptions): String = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "client.header")
    @js.native
    def header(uri: String, method: String): Header_ = js.native
    @JSImport("@hapi/hawk/lib/browser", "client.header")
    @js.native
    def header(uri: String, method: String, options: HeaderOptions): Header_ = js.native
    @JSImport("@hapi/hawk/lib/browser", "client.header")
    @js.native
    def header(uri: ParsedUri, method: String): Header_ = js.native
    @JSImport("@hapi/hawk/lib/browser", "client.header")
    @js.native
    def header(uri: ParsedUri, method: String, options: HeaderOptions): Header_ = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "client.message")
    @js.native
    def message(host: String, port: Double, message: String, options: MessageOptions): Message_ = js.native
  }
  
  object crypto {
    
    @JSImport("@hapi/hawk/lib/browser", "crypto.algorithms")
    @js.native
    val algorithms: js.Array[String] = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "crypto.calculateMac")
    @js.native
    def calculateMac(`type`: String, credentials: Credentials, options: Artifacts): String = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "crypto.calculatePayloadHash")
    @js.native
    def calculatePayloadHash(payload: String, algorithm: String, contentType: String): String = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "crypto.calculateTsMac")
    @js.native
    def calculateTsMac(ts: String, credentials: Credentials): String = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "crypto.generateNormalizedString")
    @js.native
    def generateNormalizedString(`type`: String, options: Artifacts): String = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "crypto.headerVersion")
    @js.native
    val headerVersion: String = js.native
    
    /* was `typeof CryptoJS` */
    object utils {
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.AES")
      @js.native
      val AES: CipherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.DES")
      @js.native
      val DES: CipherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.EvpKDF")
      @js.native
      def EvpKDF(password: String, salt: String): WordArray = js.native
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.EvpKDF")
      @js.native
      def EvpKDF(password: String, salt: String, cfg: Hasher): WordArray = js.native
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.EvpKDF")
      @js.native
      def EvpKDF(password: String, salt: WordArray): WordArray = js.native
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.EvpKDF")
      @js.native
      def EvpKDF(password: String, salt: WordArray, cfg: Hasher): WordArray = js.native
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.EvpKDF")
      @js.native
      def EvpKDF(password: WordArray, salt: String): WordArray = js.native
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.EvpKDF")
      @js.native
      def EvpKDF(password: WordArray, salt: String, cfg: Hasher): WordArray = js.native
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.EvpKDF")
      @js.native
      def EvpKDF(password: WordArray, salt: WordArray): WordArray = js.native
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.EvpKDF")
      @js.native
      def EvpKDF(password: WordArray, salt: WordArray, cfg: Hasher): WordArray = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.HmacMD5")
      @js.native
      val HmacMD5: HmacHasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.HmacRIPEMD160")
      @js.native
      val HmacRIPEMD160: HmacHasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.HmacSHA1")
      @js.native
      val HmacSHA1: HmacHasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.HmacSHA224")
      @js.native
      val HmacSHA224: HmacHasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.HmacSHA256")
      @js.native
      val HmacSHA256: HmacHasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.HmacSHA3")
      @js.native
      val HmacSHA3: HmacHasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.HmacSHA384")
      @js.native
      val HmacSHA384: HmacHasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.HmacSHA512")
      @js.native
      val HmacSHA512: HmacHasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.MD5")
      @js.native
      val MD5: HasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.PBKDF2")
      @js.native
      def PBKDF2(password: String, salt: String): WordArray = js.native
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.PBKDF2")
      @js.native
      def PBKDF2(password: String, salt: String, cfg: KDFOption): WordArray = js.native
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.PBKDF2")
      @js.native
      def PBKDF2(password: String, salt: WordArray): WordArray = js.native
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.PBKDF2")
      @js.native
      def PBKDF2(password: String, salt: WordArray, cfg: KDFOption): WordArray = js.native
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.PBKDF2")
      @js.native
      def PBKDF2(password: WordArray, salt: String): WordArray = js.native
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.PBKDF2")
      @js.native
      def PBKDF2(password: WordArray, salt: String, cfg: KDFOption): WordArray = js.native
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.PBKDF2")
      @js.native
      def PBKDF2(password: WordArray, salt: WordArray): WordArray = js.native
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.PBKDF2")
      @js.native
      def PBKDF2(password: WordArray, salt: WordArray, cfg: KDFOption): WordArray = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.RC4")
      @js.native
      val RC4: CipherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.RC4Drop")
      @js.native
      val RC4Drop: CipherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.RIPEMD160")
      @js.native
      val RIPEMD160: HasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.Rabbit")
      @js.native
      val Rabbit: CipherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.RabbitLegacy")
      @js.native
      val RabbitLegacy: CipherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.SHA1")
      @js.native
      val SHA1: HasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.SHA224")
      @js.native
      val SHA224: HasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.SHA256")
      @js.native
      val SHA256: HasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.SHA3")
      @js.native
      val SHA3: HasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.SHA384")
      @js.native
      val SHA384: HasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.SHA512")
      @js.native
      val SHA512: HasherHelper = js.native
      
      @JSImport("@hapi/hawk/lib/browser", "crypto.utils.TripleDES")
      @js.native
      val TripleDES: CipherHelper = js.native
      
      object algo {
        
        /**
          * AES block cipher algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.AES")
        @js.native
        val AES: CipherStatic = js.native
        
        /**
          * DES block cipher algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.DES")
        @js.native
        val DES: CipherStatic = js.native
        
        /**
          * This key derivation function is meant to conform with EVP_BytesToKey.
          * www.openssl.org/docs/crypto/EVP_BytesToKey.html
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.EvpKDF")
        @js.native
        abstract class EvpKDF ()
          extends typings.cryptoJs.mod.algo.EvpKDF
        object EvpKDF {
          
          /**
            * Initializes a newly created key derivation function.
            *
            * @param cfg (Optional) The configuration options to use for the derivation.
            *
            * @example
            *
            *     var kdf = CryptoJS.algo.EvpKDF.create();
            *     var kdf = CryptoJS.algo.EvpKDF.create({ keySize: 8 });
            *     var kdf = CryptoJS.algo.EvpKDF.create({ keySize: 8, iterations: 1000 });
            */
          /* static member */
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.EvpKDF.create")
          @js.native
          def create(): typings.cryptoJs.mod.global.CryptoJS.algo.EvpKDF = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.EvpKDF.create")
          @js.native
          def create(cfg: Hasher): typings.cryptoJs.mod.global.CryptoJS.algo.EvpKDF = js.native
        }
        
        /**
          * HMAC algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.HMAC")
        @js.native
        abstract class HMAC ()
          extends typings.cryptoJs.mod.algo.HMAC
        object HMAC {
          
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.HMAC.create")
          @js.native
          def create(hasher: HasherStatic, key: String): typings.cryptoJs.mod.global.CryptoJS.algo.HMAC = js.native
          /**
            * Initializes a newly created HMAC.
            *
            * @param hasher The hash algorithm to use.
            * @param key The secret key.
            *
            * @example
            *
            *     var hmacHasher = CryptoJS.algo.HMAC.create(CryptoJS.algo.SHA256, key);
            */
          /* static member */
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.HMAC.create")
          @js.native
          def create(hasher: HasherStatic, key: WordArray): typings.cryptoJs.mod.global.CryptoJS.algo.HMAC = js.native
        }
        
        /**
          * MD5 hash algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.MD5")
        @js.native
        val MD5: HasherStatic = js.native
        
        /**
          * Password-Based Key Derivation Function 2 algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.PBKDF2")
        @js.native
        abstract class PBKDF2 ()
          extends typings.cryptoJs.mod.algo.PBKDF2
        object PBKDF2 {
          
          /**
            * Initializes a newly created key derivation function.
            *
            * @param cfg (Optional) The configuration options to use for the derivation.
            *
            * @example
            *
            *     var kdf = CryptoJS.algo.PBKDF2.create();
            *     var kdf = CryptoJS.algo.PBKDF2.create({ keySize: 8 });
            *     var kdf = CryptoJS.algo.PBKDF2.create({ keySize: 8, iterations: 1000 });
            */
          /* static member */
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.PBKDF2.create")
          @js.native
          def create(): typings.cryptoJs.mod.global.CryptoJS.algo.PBKDF2 = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.PBKDF2.create")
          @js.native
          def create(cfg: KDFOption): typings.cryptoJs.mod.global.CryptoJS.algo.PBKDF2 = js.native
        }
        
        /**
          * RC4 stream cipher algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.RC4")
        @js.native
        val RC4: CipherStatic = js.native
        
        /**
          * Modified RC4 stream cipher algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.RC4Drop")
        @js.native
        val RC4Drop: CipherStatic = js.native
        
        /**
          * RIPEMD160 hash algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.RIPEMD160")
        @js.native
        val RIPEMD160: HasherStatic = js.native
        
        /**
          * Rabbit stream cipher algorithm
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.Rabbit")
        @js.native
        val Rabbit: CipherStatic = js.native
        
        /**
          * Rabbit stream cipher algorithm.
          *
          * This is a legacy version that neglected to convert the key to little-endian.
          * This error doesn't affect the cipher's security,
          * but it does affect its compatibility with other implementations.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.RabbitLegacy")
        @js.native
        val RabbitLegacy: CipherStatic = js.native
        
        /**
          * SHA-1 hash algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.SHA1")
        @js.native
        val SHA1: HasherStatic = js.native
        
        /**
          * SHA-224 hash algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.SHA224")
        @js.native
        val SHA224: HasherStatic = js.native
        
        /**
          * SHA-256 hash algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.SHA256")
        @js.native
        val SHA256: HasherStatic = js.native
        
        /**
          * SHA-3 hash algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.SHA3")
        @js.native
        val SHA3: HasherStatic = js.native
        
        /**
          * SHA-384 hash algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.SHA384")
        @js.native
        val SHA384: HasherStatic = js.native
        
        /**
          * SHA-512 hash algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.SHA512")
        @js.native
        val SHA512: HasherStatic = js.native
        
        /**
          * Triple-DES block cipher algorithm.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.algo.TripleDES")
        @js.native
        val TripleDES: CipherStatic = js.native
      }
      
      object enc {
        
        /**
          * Base64 encoding strategy.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.enc.Base64")
        @js.native
        val Base64: Encoder = js.native
        
        /**
          * Hex encoding strategy.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.enc.Hex")
        @js.native
        val Hex: Encoder = js.native
        
        /**
          * Latin1 encoding strategy.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.enc.Latin1")
        @js.native
        val Latin1: Encoder = js.native
        
        /**
          * UTF-16 BE encoding strategy.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.enc.Utf16")
        @js.native
        val Utf16: Encoder = js.native
        
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.enc.Utf16BE")
        @js.native
        val Utf16BE: Encoder = js.native
        
        /**
          * UTF-16 LE encoding strategy.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.enc.Utf16LE")
        @js.native
        val Utf16LE: Encoder = js.native
        
        /**
          * UTF-8 encoding strategy.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.enc.Utf8")
        @js.native
        val Utf8: Encoder = js.native
      }
      
      object format {
        
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.format.Hex")
        @js.native
        val Hex: Format_ = js.native
        
        /**
          * OpenSSL formatting strategy.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.format.OpenSSL")
        @js.native
        val OpenSSL: Format_ = js.native
      }
      
      object kdf {
        
        /**
          * OpenSSL key derivation function.
          */
        object OpenSSL {
          
          /**
            * Derives a key and IV from a password.
            *
            * @param password The password to derive from.
            * @param keySize The size in words of the key to generate.
            * @param ivSize The size in words of the IV to generate.
            * @param salt (Optional) A 64-bit salt to use. If omitted, a salt will be generated randomly.
            *
            * @return A cipher params object with the key, IV, and salt.
            *
            * @example
            *
            *     var derivedParams = CryptoJS.kdf.OpenSSL.execute('Password', 256/32, 128/32);
            *     var derivedParams = CryptoJS.kdf.OpenSSL.execute('Password', 256/32, 128/32, 'saltsalt');
            */
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.kdf.OpenSSL.execute")
          @js.native
          def execute(password: String, keySize: Double, ivSize: Double): CipherParams = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.kdf.OpenSSL.execute")
          @js.native
          def execute(password: String, keySize: Double, ivSize: Double, salt: String): CipherParams = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.kdf.OpenSSL.execute")
          @js.native
          def execute(password: String, keySize: Double, ivSize: Double, salt: WordArray): CipherParams = js.native
        }
      }
      
      object lib {
        
        /**
          * Base object for prototypal inheritance.
          */
        object Base {
          
          /**
            * Extends this object and runs the init method.
            * Arguments to create() will be passed to init().
            *
            * @return The new object.
            *
            * @example
            *
            *     var instance = MyType.create();
            */
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.Base.create")
          @js.native
          def create(args: js.Any*): js.Any = js.native
          
          /**
            * Creates a new object that inherits from this object.
            *
            * @param overrides Properties to copy into the new object.
            *
            * @return The new object.
            *
            * @example
            *
            *     var MyType = CryptoJS.lib.Base.extend({
            *         field: 'value',
            *
            *         method: function () {
            *         }
            *     });
            */
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.Base.extend")
          @js.native
          def extend(overrides: js.Object): js.Any = js.native
          
          /**
            * Copies properties into this object.
            *
            * @param properties The properties to mix in.
            *
            * @example
            *
            *     MyType.mixIn({
            *         field: 'value'
            *     });
            */
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.Base.mixIn")
          @js.native
          def mixIn(properties: js.Object): js.Any = js.native
        }
        
        /**
          * Abstract base block cipher mode template.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.BlockCipherMode")
        @js.native
        val BlockCipherMode: js.Any = js.native
        
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.BufferedBlockAlgorithm")
        @js.native
        val BufferedBlockAlgorithm: js.Any = js.native
        
        object Cipher {
          
          /**
            * Creates shortcut functions to a cipher's object interface.
            *
            * @param cipher The cipher to create a helper for.
            *
            * @return An object with encrypt and decrypt shortcut functions.
            *
            * @example
            *
            *     var AES = CryptoJS.lib.Cipher._createHelper(CryptoJS.algo.AES);
            */
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.Cipher._createHelper")
          @js.native
          def createHelper(cipher: typings.cryptoJs.mod.Cipher): CipherHelper = js.native
        }
        
        object CipherParams {
          
          /**
            * Initializes a newly created cipher params object.
            *
            * @param cipherParams An object with any of the possible cipher parameters.
            *
            * @example
            *
            *     var cipherParams = CryptoJS.lib.CipherParams.create({
            *         ciphertext: ciphertextWordArray,
            *         key: keyWordArray,
            *         iv: ivWordArray,
            *         salt: saltWordArray,
            *         algorithm: CryptoJS.algo.AES,
            *         mode: CryptoJS.mode.CBC,
            *         padding: CryptoJS.pad.PKCS7,
            *         blockSize: 4,
            *         formatter: CryptoJS.format.OpenSSL
            *     });
            */
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.CipherParams.create")
          @js.native
          def create(cipherParams: PartialCipherParams): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
        }
        
        object Hasher {
          
          /**
            * Creates a shortcut function to a hasher's object interface.
            *
            * @param hasher The hasher to create a helper for.
            *
            * @return The shortcut function.
            *
            * @example
            *
            *     var SHA256 = CryptoJS.lib.Hasher._createHelper(CryptoJS.algo.SHA256);
            */
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.Hasher._createHelper")
          @js.native
          def createHelper(hasher: HasherStatic): HasherHelper = js.native
          
          /**
            * Creates a shortcut function to the HMAC's object interface.
            *
            * @param hasher The hasher to use in this HMAC helper.
            *
            * @return The shortcut function.
            *
            * @example
            *
            *     var HmacSHA256 = CryptoJS.lib.Hasher._createHmacHelper(CryptoJS.algo.SHA256);
            */
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.Hasher._createHmacHelper")
          @js.native
          def createHmacHelper(hasher: HasherStatic): HmacHasherHelper = js.native
        }
        
        /**
          * A serializable cipher wrapper that derives the key from a password,
          * and returns ciphertext as a serializable cipher params object.
          */
        object PasswordBasedCipher {
          
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.PasswordBasedCipher.decrypt")
          @js.native
          def decrypt(cipher: CipherStatic, ciphertext: String, password: String): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.PasswordBasedCipher.decrypt")
          @js.native
          def decrypt(cipher: CipherStatic, ciphertext: String, password: String, cfg: CipherOption): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
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
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.PasswordBasedCipher.decrypt")
          @js.native
          def decrypt(
            cipher: CipherStatic,
            ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams,
            password: String
          ): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.PasswordBasedCipher.decrypt")
          @js.native
          def decrypt(
            cipher: CipherStatic,
            ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams,
            password: String,
            cfg: CipherOption
          ): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
          
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.PasswordBasedCipher.encrypt")
          @js.native
          def encrypt(cipher: CipherStatic, message: String, password: String): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.PasswordBasedCipher.encrypt")
          @js.native
          def encrypt(cipher: CipherStatic, message: String, password: String, cfg: CipherOption): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
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
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.PasswordBasedCipher.encrypt")
          @js.native
          def encrypt(
            cipher: CipherStatic,
            message: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
            password: String
          ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.PasswordBasedCipher.encrypt")
          @js.native
          def encrypt(
            cipher: CipherStatic,
            message: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
            password: String,
            cfg: CipherOption
          ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
        }
        
        /**
          * A cipher wrapper that returns ciphertext as a serializable cipher params object.
          */
        object SerializableCipher {
          
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.SerializableCipher.decrypt")
          @js.native
          def decrypt(cipher: CipherStatic, ciphertext: String, key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.SerializableCipher.decrypt")
          @js.native
          def decrypt(
            cipher: CipherStatic,
            ciphertext: String,
            key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
            cfg: CipherOption
          ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
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
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.SerializableCipher.decrypt")
          @js.native
          def decrypt(
            cipher: CipherStatic,
            ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
            key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
          ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.SerializableCipher.decrypt")
          @js.native
          def decrypt(
            cipher: CipherStatic,
            ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
            key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
            cfg: CipherOption
          ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
          
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.SerializableCipher.encrypt")
          @js.native
          def encrypt(cipher: CipherStatic, message: String, key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.SerializableCipher.encrypt")
          @js.native
          def encrypt(
            cipher: CipherStatic,
            message: String,
            key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
            cfg: CipherOption
          ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
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
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.SerializableCipher.encrypt")
          @js.native
          def encrypt(
            cipher: CipherStatic,
            message: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
            key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
          ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.SerializableCipher.encrypt")
          @js.native
          def encrypt(
            cipher: CipherStatic,
            message: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
            key: typings.cryptoJs.mod.global.CryptoJS.lib.WordArray,
            cfg: CipherOption
          ): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
          
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.SerializableCipher._parse")
          @js.native
          def parse(ciphertext: String, format: Format_): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
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
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.SerializableCipher._parse")
          @js.native
          def parse(ciphertext: typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams, format: Format_): typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
        }
        
        object WordArray {
          
          /**
            * Initializes a newly created word array.
            *
            * @param words (Optional) An array of 32-bit words.
            * @param sigBytes (Optional) The number of significant bytes in the words.
            *
            * @example
            *
            *     var wordArray = CryptoJS.lib.WordArray.create();
            *     var wordArray = CryptoJS.lib.WordArray.create([0x00010203, 0x04050607]);
            *     var wordArray = CryptoJS.lib.WordArray.create([0x00010203, 0x04050607], 6);
            */
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.WordArray.create")
          @js.native
          def create(): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.WordArray.create")
          @js.native
          def create(words: js.UndefOr[scala.Nothing], sigBytes: Double): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.WordArray.create")
          @js.native
          def create(words: js.Array[Double]): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.WordArray.create")
          @js.native
          def create(words: js.Array[Double], sigBytes: Double): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
          
          /**
            * Creates a word array filled with random bytes.
            *
            * @param nBytes The number of random bytes to generate.
            *
            * @return The random word array.
            *
            * @example
            *
            *     var wordArray = CryptoJS.lib.WordArray.random(16);
            */
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.lib.WordArray.random")
          @js.native
          def random(nBytes: Double): typings.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
        }
      }
      
      object mode {
        
        /**
          * Cipher Block Chaining mode.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.mode.CBC")
        @js.native
        val CBC: BlockCipherMode = js.native
        
        /**
          * Cipher Feedback block mode.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.mode.CFB")
        @js.native
        val CFB: BlockCipherMode = js.native
        
        /**
          * Counter block mode.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.mode.CTR")
        @js.native
        val CTR: BlockCipherMode = js.native
        
        /**
          * @preserve
          * Counter block mode compatible with  Dr Brian Gladman fileenc.c
          * derived from CryptoJS.mode.CTR
          * Jan Hruby jhruby.web@gmail.com
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.mode.CTRGladman")
        @js.native
        val CTRGladman: BlockCipherMode = js.native
        
        /**
          * Electronic Codebook block mode.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.mode.ECB")
        @js.native
        val ECB: BlockCipherMode = js.native
        
        /**
          * Output Feedback block mode.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.mode.OFB")
        @js.native
        val OFB: BlockCipherMode = js.native
      }
      
      object pad {
        
        /**
          * ANSI X.923 padding strategy.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.pad.AnsiX923")
        @js.native
        val AnsiX923: Padding = js.native
        
        /**
          * ISO 10126 padding strategy.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.pad.Iso10126")
        @js.native
        val Iso10126: Padding = js.native
        
        /**
          * ISO/IEC 9797-1 Padding Method 2.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.pad.Iso97971")
        @js.native
        val Iso97971: Padding = js.native
        
        /**
          * A noop padding strategy.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.pad.NoPadding")
        @js.native
        val NoPadding: Padding = js.native
        
        /**
          * PKCS #5/7 padding strategy.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.pad.Pkcs7")
        @js.native
        val Pkcs7: Padding = js.native
        
        /**
          * Zero padding strategy.
          */
        @JSImport("@hapi/hawk/lib/browser", "crypto.utils.pad.ZeroPadding")
        @js.native
        val ZeroPadding: Padding = js.native
      }
      
      object x64 {
        
        object Word {
          
          /**
            * Initializes a newly created 64-bit word.
            *
            * @param high The high 32 bits.
            * @param low The low 32 bits.
            *
            * @example
            *
            *     var x64Word = CryptoJS.x64.Word.create(0x00010203, 0x04050607);
            */
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.x64.Word.create")
          @js.native
          def create(high: Double, low: Double): X64Word = js.native
        }
        
        /**
          * Initializes a newly created word array.
          *
          * @param words (Optional) An array of CryptoJS.x64.Word objects.
          * @param sigBytes (Optional) The number of significant bytes in the words.
          *
          * @example
          *
          *     var wordArray = CryptoJS.x64.WordArray.create();
          *
          *     var wordArray = CryptoJS.x64.WordArray.create([
          *         CryptoJS.x64.Word.create(0x00010203, 0x04050607),
          *         CryptoJS.x64.Word.create(0x18191a1b, 0x1c1d1e1f)
          *     ]);
          *
          *     var wordArray = CryptoJS.x64.WordArray.create([
          *         CryptoJS.x64.Word.create(0x00010203, 0x04050607),
          *         CryptoJS.x64.Word.create(0x18191a1b, 0x1c1d1e1f)
          *     ], 10);
          */
        object WordArray {
          
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.x64.WordArray.create")
          @js.native
          def create(): X64WordArray = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.x64.WordArray.create")
          @js.native
          def create(words: js.UndefOr[scala.Nothing], sigBytes: Double): X64WordArray = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.x64.WordArray.create")
          @js.native
          def create(words: js.Array[X64WordArray]): X64WordArray = js.native
          @JSImport("@hapi/hawk/lib/browser", "crypto.utils.x64.WordArray.create")
          @js.native
          def create(words: js.Array[X64WordArray], sigBytes: Double): X64WordArray = js.native
        }
      }
    }
  }
  
  object utils {
    
    @JSImport("@hapi/hawk/lib/browser", "utils.base64urlEncode")
    @js.native
    def base64urlEncode(value: String): String = js.native
    @JSImport("@hapi/hawk/lib/browser", "utils.base64urlEncode")
    @js.native
    def base64urlEncode(value: String, encoding: BufferEncoding): String = js.native
    @JSImport("@hapi/hawk/lib/browser", "utils.base64urlEncode")
    @js.native
    def base64urlEncode(value: Buffer): String = js.native
    @JSImport("@hapi/hawk/lib/browser", "utils.base64urlEncode")
    @js.native
    def base64urlEncode(value: Buffer, encoding: BufferEncoding): String = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "utils.escapeHeaderAttribute")
    @js.native
    def escapeHeaderAttribute(attribute: String): String = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "utils.getNtpSecOffset")
    @js.native
    def getNtpSecOffset(): Double = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "utils.now")
    @js.native
    def now(): Double = js.native
    @JSImport("@hapi/hawk/lib/browser", "utils.now")
    @js.native
    def now(localtimeOffsetMsec: Double): Double = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "utils.nowSec")
    @js.native
    def nowSec(): Double = js.native
    @JSImport("@hapi/hawk/lib/browser", "utils.nowSec")
    @js.native
    def nowSec(localtimeOffsetMsec: Double): Double = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "utils.parseAuthorizationHeader")
    @js.native
    def parseAuthorizationHeader(header: String): Record[String, String] = js.native
    @JSImport("@hapi/hawk/lib/browser", "utils.parseAuthorizationHeader")
    @js.native
    def parseAuthorizationHeader(header: String, keys: js.Array[String]): Record[String, String] = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "utils.parseContentType")
    @js.native
    def parseContentType(): String = js.native
    @JSImport("@hapi/hawk/lib/browser", "utils.parseContentType")
    @js.native
    def parseContentType(header: String): String = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "utils.parseUri")
    @js.native
    def parseUri(input: String): ParsedUri = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "utils.randomString")
    @js.native
    def randomString(size: Double): String = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "utils.setNtpSecOffset")
    @js.native
    def setNtpSecOffset(offset: Double): Unit = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "utils.setStorage")
    @js.native
    def setStorage(storage: Storage): Unit = js.native
    
    @JSImport("@hapi/hawk/lib/browser", "utils.storage")
    @js.native
    val storage: Storage = js.native
    
    /** `scheme://credentials@host:port/resource#fragment` */
    @JSImport("@hapi/hawk/lib/browser", "utils.uriRegex")
    @js.native
    val uriRegex: RegExp = js.native
    
    @js.native
    trait ParsedUri extends StObject {
      
      var host: String = js.native
      
      var port: String = js.native
      
      var resource: String = js.native
    }
    object ParsedUri {
      
      @scala.inline
      def apply(host: String, port: String, resource: String): ParsedUri = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
        __obj.asInstanceOf[ParsedUri]
      }
      
      @scala.inline
      implicit class ParsedUriMutableBuilder[Self <: ParsedUri] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      }
    }
  }
}
