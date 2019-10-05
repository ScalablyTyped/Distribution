package typings.jsrsasign.jsrsasignMod.KJUR

import typings.jsrsasign.Anon_2a864886f70d010101
import typings.jsrsasign.Anon_AlgPass
import typings.jsrsasign.Anon_AlgProv
import typings.jsrsasign.Anon_AlgString
import typings.jsrsasign.Anon_Curve
import typings.jsrsasign.Anon_Hmacmd5
import typings.jsrsasign.Anon_Md2
import typings.jsrsasign.Anon_Md5
import typings.jsrsasign.Anon_Md5Ripemd160
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECParameter
import typings.jsrsasign.jsrsasignStrings.SIGN
import typings.jsrsasign.jsrsasignStrings.VERIFY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsrsasign", "KJUR.crypto")
@js.native
object crypto extends js.Object {
  /**
    * class for DSA signing and verification
    * @description
    *
    * CAUTION: Most of the case, you don't need to use this class.
    * Please use `KJUR.crypto.Signature` class instead.
    *
    *
    * NOTE: Until jsrsasign 6.2.3, DSA class have used codes from openpgpjs library 1.0.0
    * licenced under LGPL licence. To avoid license issue dsa-2.0.js was re-written with
    * my own codes in jsrsasign 7.0.0.
    * Some random number generators used in dsa-2.0.js was newly defined
    * in KJUR.crypto.Util class. Now all of LGPL codes are removed.
    */
  @js.native
  class DSA ()
    extends typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
  
  /**
    * class for EC key generation,  ECDSA signing and verifcation
    * @description
    * CAUTION: Most of the case, you don't need to use this class except
    * for generating an EC key pair. Please use `KJUR.crypto.Signature` class instead.
    *
    * This class was originally developped by Stefan Thomas for Bitcoin JavaScript library.
    * (See https://github.com/bitcoinjs/bitcoinjs-lib/blob/master/src/ecdsa.js)
    * Currently this class supports following named curves and their aliases.
    *
    * - secp256r1, NIST P-256, P-256, prime256v1 (*)
    * - secp256k1 (*)
    * - secp384r1, NIST P-384, P-384 (*)
    */
  @js.native
  class ECDSA ()
    extends typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA {
    def this(publicKey: Anon_Curve) = this()
  }
  
  /**
    * Mac(Message Authentication Code) class which is very similar to java.security.Mac class
    * @param params parameters for constructor
    * @description
    *
    * Currently this supports following algorithm and providers combination:
    * - hmacmd5 - cryptojs
    * - hmacsha1 - cryptojs
    * - hmacsha224 - cryptojs
    * - hmacsha256 - cryptojs
    * - hmacsha384 - cryptojs
    * - hmacsha512 - cryptojs
    * NOTE: HmacSHA224 and HmacSHA384 issue was fixed since jsrsasign 4.1.4.
    * Please use 'ext/cryptojs-312-core-fix*.js' instead of 'core.js' of original CryptoJS
    * to avoid those issue.
    *
    * NOTE2: Hmac signature bug was fixed in jsrsasign 4.9.0 by providing CryptoJS
    * bug workaround.
    *
    * Please see `KJUR.crypto.Mac.setPassword` how to provide password
    * in various ways in detail.
    * @example
    * var mac = new KJUR.crypto.Mac({alg: "HmacSHA1", "pass": "pass"});
    * mac.updateString('aaa')
    * var macHex = mac.doFinal()
    *
    * // other password representation
    * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"hex":  "6161"}});
    * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"utf8": "aa"}});
    * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"rstr": "\x61\x61"}});
    * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"b64":  "Mi02/+...a=="}});
    * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"b64u": "Mi02_-...a"}});
    */
  @js.native
  class Mac protected ()
    extends typings.jsrsasign.jsrsasign.KJUR.crypto.Mac {
    def this(params: Anon_AlgPass) = this()
  }
  
  /**
    * MessageDigest class which is very similar to java.security.MessageDigest class
    * @description
    * Currently this supports following algorithm and providers combination:
    * - md5 - cryptojs
    * - sha1 - cryptojs
    * - sha224 - cryptojs
    * - sha256 - cryptojs
    * - sha384 - cryptojs
    * - sha512 - cryptojs
    * - ripemd160 - cryptojs
    * - sha256 - sjcl (NEW from crypto.js 1.0.4)
    *
    * @example
    * // CryptoJS provider sample
    * var md = new KJUR.crypto.MessageDigest({alg: "sha1", prov: "cryptojs"});
    * md.updateString('aaa')
    * var mdHex = md.digest()
    *
    * // SJCL(Stanford JavaScript Crypto Library) provider sample
    * var md = new KJUR.crypto.MessageDigest({alg: "sha256", prov: "sjcl"}); // sjcl supports sha256 only
    * md.updateString('aaa')
    * var mdHex = md.digest()
    *
    * // HASHLENGTH property
    * KJUR.crypto.MessageDigest.HASHLENGTH['sha1'] → 20
    * KJUR.crypto.MessageDigest.HASHLENGTH['sha512'] → 64
    */
  @js.native
  class MessageDigest protected ()
    extends typings.jsrsasign.jsrsasign.KJUR.crypto.MessageDigest {
    def this(params: Anon_AlgProv) = this()
  }
  
  /**
    * Signature class which is very similar to java.security.Signature class
    * @param params parameters for constructor
    * @description
    * As for params of constructor's argument, it can be specify following attributes:
    * - alg - signature algorithm name (ex. {MD5,SHA1,SHA224,SHA256,SHA384,SHA512,RIPEMD160}with{RSA,ECDSA,DSA})
    * - provider - currently 'cryptojs/jsrsa' only
    * <h4>SUPPORTED ALGORITHMS AND PROVIDERS</h4>
    * This Signature class supports following signature algorithm and provider names:
    * - MD5withRSA - cryptojs/jsrsa
    * - SHA1withRSA - cryptojs/jsrsa
    * - SHA224withRSA - cryptojs/jsrsa
    * - SHA256withRSA - cryptojs/jsrsa
    * - SHA384withRSA - cryptojs/jsrsa
    * - SHA512withRSA - cryptojs/jsrsa
    * - RIPEMD160withRSA - cryptojs/jsrsa
    * - MD5withECDSA - cryptojs/jsrsa
    * - SHA1withECDSA - cryptojs/jsrsa
    * - SHA224withECDSA - cryptojs/jsrsa
    * - SHA256withECDSA - cryptojs/jsrsa
    * - SHA384withECDSA - cryptojs/jsrsa
    * - SHA512withECDSA - cryptojs/jsrsa
    * - RIPEMD160withECDSA - cryptojs/jsrsa
    * - MD5withRSAandMGF1 - cryptojs/jsrsa
    * - SHA1withRSAandMGF1 - cryptojs/jsrsa
    * - SHA224withRSAandMGF1 - cryptojs/jsrsa
    * - SHA256withRSAandMGF1 - cryptojs/jsrsa
    * - SHA384withRSAandMGF1 - cryptojs/jsrsa
    * - SHA512withRSAandMGF1 - cryptojs/jsrsa
    * - RIPEMD160withRSAandMGF1 - cryptojs/jsrsa
    * - SHA1withDSA - cryptojs/jsrsa
    * - SHA224withDSA - cryptojs/jsrsa
    * - SHA256withDSA - cryptojs/jsrsa
    * Here are supported elliptic cryptographic curve names and their aliases for ECDSA:
    * - secp256k1
    * - secp256r1, NIST P-256, P-256, prime256v1
    * - secp384r1, NIST P-384, P-384
    * NOTE1: DSA signing algorithm is also supported since crypto 1.1.5.
    * <h4>EXAMPLES</h4>
    * @example
    * // RSA signature generation
    * var sig = new KJUR.crypto.Signature({"alg": "SHA1withRSA"});
    * sig.init(prvKeyPEM);
    * sig.updateString('aaa');
    * var hSigVal = sig.sign();
    *
    * // DSA signature validation
    * var sig2 = new KJUR.crypto.Signature({"alg": "SHA1withDSA"});
    * sig2.init(certPEM);
    * sig.updateString('aaa');
    * var isValid = sig2.verify(hSigVal);
    *
    * // ECDSA signing
    * var sig = new KJUR.crypto.Signature({'alg':'SHA1withECDSA'});
    * sig.init(prvKeyPEM);
    * sig.updateString('aaa');
    * var sigValueHex = sig.sign();
    *
    * // ECDSA verifying
    * var sig2 = new KJUR.crypto.Signature({'alg':'SHA1withECDSA'});
    * sig.init(certPEM);
    * sig.updateString('aaa');
    * var isValid = sig.verify(sigValueHex);
    */
  @js.native
  class Signature ()
    extends typings.jsrsasign.jsrsasign.KJUR.crypto.Signature {
    def this(params: Anon_AlgString) = this()
  }
  
  /**
    * Cipher class to encrypt and decrypt data
    * @param params parameters for constructor
    * @description
    * Here is supported canonicalized cipher algorithm names and its standard names:
    * - RSA - RSA/ECB/PKCS1Padding (default for RSAKey)
    * - RSAOAEP - RSA/ECB/OAEPWithSHA-1AndMGF1Padding
    * - RSAOAEP224 - RSA/ECB/OAEPWithSHA-224AndMGF1Padding(*)
    * - RSAOAEP256 - RSA/ECB/OAEPWithSHA-256AndMGF1Padding
    * - RSAOAEP384 - RSA/ECB/OAEPWithSHA-384AndMGF1Padding(*)
    * - RSAOAEP512 - RSA/ECB/OAEPWithSHA-512AndMGF1Padding(*)
    * NOTE: (*) is not supported in Java JCE.
    * Currently this class supports only RSA encryption and decryption.
    * However it is planning to implement also symmetric ciphers near in the future.
    * @example
    */
  @js.native
  object Cipher extends js.Object {
    def decrypt(hex: String, keyObj: String, algName: String): String = js.native
    /**
      * decrypt encrypted hexadecimal string with specified key and algorithm
      * @param hex hexadecial string of encrypted message
      * @param keyObj RSAKey object or hexadecimal string of symmetric cipher key
      * @param algName short/long algorithm name for encryption/decryption
      * @return hexadecimal encrypted string
      * @description
      * This static method decrypts encrypted hexadecimal string with specified key and algorithm.
      * @example
      * KJUR.crypto.Cipher.decrypt("aaa", prvRSAKeyObj) → "1abc2d..."
      * KJUR.crypto.Cipher.decrypt("aaa", prvRSAKeyObj, "RSAOAEP) → "23ab02..."
      */
    def decrypt(hex: String, keyObj: typings.jsrsasign.jsrsasign.RSAKey, algName: String): String = js.native
    def encrypt(s: String, keyObj: String, algName: String): String = js.native
    /**
      * encrypt raw string by specified key and algorithm
      * @param s input string to encrypt
      * @param keyObj RSAKey object or hexadecimal string of symmetric cipher key
      * @param algName short/long algorithm name for encryption/decryption
      * @return hexadecimal encrypted string
      * @description
      * This static method encrypts raw string with specified key and algorithm.
      * @example
      * KJUR.crypto.Cipher.encrypt("aaa", pubRSAKeyObj) → "1abc2d..."
      * KJUR.crypto.Cipher.encrypt("aaa", pubRSAKeyObj, "RSAOAEP") → "23ab02..."
      */
    def encrypt(s: String, keyObj: typings.jsrsasign.jsrsasign.RSAKey, algName: String): String = js.native
    def getAlgByKeyAndName(keyObj: String, algName: String): String = js.native
    /**
      * get canonicalized encrypt/decrypt algorithm name by key and short/long algorithm name
      * @param keyObj RSAKey object or hexadecimal string of symmetric cipher key
      * @param algName short/long algorithm name for encryption/decryption
      * @return canonicalized algorithm name for encryption/decryption
      * @description
      * Here is supported canonicalized cipher algorithm names and its standard names:
      * - RSA - RSA/ECB/PKCS1Padding (default for RSAKey)
      * - RSAOAEP - RSA/ECB/OAEPWithSHA-1AndMGF1Padding
      * - RSAOAEP224 - RSA/ECB/OAEPWithSHA-224AndMGF1Padding(*)
      * - RSAOAEP256 - RSA/ECB/OAEPWithSHA-256AndMGF1Padding
      * - RSAOAEP384 - RSA/ECB/OAEPWithSHA-384AndMGF1Padding(*)
      * - RSAOAEP512 - RSA/ECB/OAEPWithSHA-512AndMGF1Padding(*)
      * NOTE: (*) is not supported in Java JCE.
      * @example
      * KJUR.crypto.Cipher.getAlgByKeyAndName(objRSAKey) → "RSA"
      * KJUR.crypto.Cipher.getAlgByKeyAndName(objRSAKey, "RSAOAEP") → "RSAOAEP"
      */
    def getAlgByKeyAndName(keyObj: typings.jsrsasign.jsrsasign.RSAKey, algName: String): String = js.native
  }
  
  /* static members */
  @js.native
  object ECDSA extends js.Object {
    /**
      * convert hexadecimal ASN.1 encoded signature to concatinated signature
      * @param asn1Hex hexadecimal string of ASN.1 encoded ECDSA signature value
      * @return r-s concatinated format of ECDSA signature value
      */
    def asn1SigToConcatSig(asn1Sig: String): String = js.native
    /**
      * convert R and S BigInteger object of signature to ASN.1 encoded signature
      * @param biR BigInteger object of R field of ECDSA signature value
      * @param biS BIgInteger object of S field of ECDSA signature value
      * @return hexadecimal string of ASN.1 encoded ECDSA signature value
      */
    def biRSSigToASN1Sig(biR: typings.jsrsasign.jsrsasign.BigInteger, biS: typings.jsrsasign.jsrsasign.BigInteger): String = js.native
    /**
      * convert hexadecimal concatinated signature to ASN.1 encoded signature
      * @param concatSig r-s concatinated format of ECDSA signature value
      * @return hexadecimal string of ASN.1 encoded ECDSA signature value
      */
    def concatSigToASN1Sig(concatSig: String): String = js.native
    /**
      * static method to get normalized EC curve name from curve name or hexadecimal OID value
      * @param s curve name (ex. P-256) or hexadecimal OID value (ex. 2a86...)
      * @return normalized EC curve name (ex. secp256r1)
      * @description
      * This static method returns normalized EC curve name
      * which is supported in jsrsasign
      * from curve name or hexadecimal OID value.
      * When curve is not supported in jsrsasign, this method returns null.
      * Normalized name will be "secp*" in jsrsasign.
      * @example
      * KJUR.crypto.ECDSA.getName("2b8104000a") → "secp256k1"
      * KJUR.crypto.ECDSA.getName("NIST P-256") → "secp256r1"
      * KJUR.crypto.ECDSA.getName("P-521") → undefined // not supported
      */
    def getName(s: String): String = js.native
    /**
      * convert hexadecimal R and S value of signature to ASN.1 encoded signature
      * @param hR hexadecimal string of R field of ECDSA signature value
      * @param hS hexadecimal string of S field of ECDSA signature value
      * @return hexadecimal string of ASN.1 encoded ECDSA signature value
      */
    def hexRSSigToASN1Sig(hR: String, hS: String): String = js.native
  }
  
  /**
    * static object for elliptic curve names and parameters
    * @description
    * This class provides parameters for named elliptic curves.
    * Currently it supoprts following curve names and aliases however
    * the name marked (*) are available for `KJUR.crypto.ECDSA` and
    * `KJUR.crypto.Signature` classes.
    *
    * - secp128r1
    * - secp160r1
    * - secp160k1
    * - secp192r1
    * - secp192k1
    * - secp224r1
    * - secp256r1, NIST P-256, P-256, prime256v1 (*)
    * - secp256k1 (*)
    * - secp384r1, NIST P-384, P-384 (*)
    * - secp521r1, NIST P-521, P-521
    *
    * You can register new curves by using the 'regist' method.
    */
  @js.native
  object ECParameterDB extends js.Object {
    /**
      * get curve inforamtion associative array for curve name or alias
      * @param nameOrAlias curve name or alias name
      * @return associative array of curve parameters
      * @example
      * var param = KJUR.crypto.ECParameterDB.getByName('prime256v1');
      * var keylen = param['keylen'];
      * var n = param['n'];
      */
    def getByName(nameOrAlias: String): ECParameter = js.native
    /**
      * register new curve
      * @param name name of curve
      * @param keylen key length
      * @param pHex hexadecimal value of p
      * @param aHex hexadecimal value of a
      * @param bHex hexadecimal value of b
      * @param nHex hexadecimal value of n
      * @param hHex hexadecimal value of h
      * @param gxHex hexadecimal value of Gx
      * @param gyHex hexadecimal value of Gy
      * @param aliasList array of string for curve names aliases
      * @param oid Object Identifier for the curve
      * @param info information string for the curve
      */
    def regist(
      name: String,
      keylen: Double,
      pHex: String,
      aHex: String,
      bHex: String,
      nHex: String,
      hHex: String,
      gxHex: String,
      gyHex: String,
      aliasList: js.Array[String],
      oid: String,
      info: String
    ): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MessageDigest extends js.Object {
    /** static Array of resulted byte length of hash (ex. HASHLENGTH["sha1"] == 20) */
    val HASHLENGTH: Anon_Md5 = js.native
    /**
      * get canonical hash algorithm name
      * @param alg hash algorithm name (ex. MD5, SHA-1, SHA1, SHA512 et.al.)
      * @return canonical hash algorithm name
      * @description
      * This static method normalizes from any hash algorithm name such as
      * "SHA-1", "SHA1", "MD5", "sha512" to lower case name without hyphens
      * such as "sha1".
      * @example
      * KJUR.crypto.MessageDigest.getCanonicalAlgName("SHA-1") → "sha1"
      * KJUR.crypto.MessageDigest.getCanonicalAlgName("MD5")   → "md5"
      */
    def getCanonicalAlgName(alg: String): String = js.native
    /**
      * get resulted hash byte length for specified algorithm name
      * @param alg non-canonicalized hash algorithm name (ex. MD5, SHA-1, SHA1, SHA512 et.al.)
      * @return resulted hash byte length
      * @description
      * This static method returns resulted byte length for specified algorithm name such as "SHA-1".
      * @example
      * KJUR.crypto.MessageDigest.getHashLength("SHA-1") → 20
      * KJUR.crypto.MessageDigest.getHashLength("sha1") → 20
      */
    def getHashLength(alg: String): Double = js.native
  }
  
  /** static object for cryptographic function utilities */
  @js.native
  object OID extends js.Object {
    /** key value of hexadecimal OID and its name (ex. '2a8648ce3d030107' and 'secp256r1') */
    val oidhex2name: Anon_2a864886f70d010101 = js.native
  }
  
  /* static members */
  @js.native
  object Signature extends js.Object {
    /** Current state of this signature object whether 'SIGN', 'VERIFY' or null */
    val state: SIGN | VERIFY | Null = js.native
  }
  
  /** static object for cryptographic function utilities */
  @js.native
  object Util extends js.Object {
    var CRYPTOJSMESSAGEDIGESTNAME: Anon_Md5Ripemd160 = js.native
    /** associative array of default provider name for each hash and signature algorithms */
    var DEFAULTPROVIDER: Anon_Hmacmd5 = js.native
    /** PKCS#1 DigestInfo heading hexadecimal bytes for each hash algorithms */
    var DIGESTINFOHEAD: Anon_Md2 = js.native
    /**
      * get hexadecimal DigestInfo
      * @param hHash hexadecimal hash value
      * @param alg hash algorithm name (ex. 'sha1')
      * @return hexadecimal string DigestInfo ASN.1 structure
      */
    def getDigestInfoHex(hHash: String, alg: String): String = js.native
    /**
      * get PKCS#1 padded hexadecimal DigestInfo
      * @param hHash hexadecimal hash value of message to be signed
      * @param alg hash algorithm name (ex. 'sha1')
      * @param keySize key bit length (ex. 1024)
      * @return hexadecimal string of PKCS#1 padded DigestInfo
      */
    def getPaddedDigestInfoHex(hHash: String, alg: String, keySize: Double): String = js.native
    /**
      * get BigInteger object of random value from min value to max value
      * @param biMin min value of BigInteger object for random value
      * @param biMax max value of BigInteger object for random value
      * @return BigInteger object of specified random value
      * @description
      * This static method generates a BigInteger object with random value
      * greater than or equal to biMin and smaller than or equal to biMax
      * (i.e. biMin ≤ result ≤ biMax).
      * @example
      * biMin = new BigInteger("2fa411...", 16);
      * biMax = new BigInteger("3fa411...", 16);
      * KJUR.crypto.Util.getRandomBigIntegerMinToMax(biMin, biMax) → 32f1... of BigInteger
      */
    def getRandomBigIntegerMinToMax(biMin: Double, biMax: Double): typings.jsrsasign.jsrsasign.BigInteger = js.native
    /**
      * get BigInteger object of random value from with specified bit length
      * @param n length of bits of random
      * @return BigInteger object of specified random value
      * @example
      * KJUR.crypto.Util.getRandomBigIntegerOfNbits(24) → 6314af of BigInteger
      * KJUR.crypto.Util.getRandomBigIntegerOfNbits(1024) → 8fbc... of BigInteger
      */
    def getRandomBigIntegerOfNbits(n: Double): typings.jsrsasign.jsrsasign.BigInteger = js.native
    /**
      * get BigInteger object of random value from with specified byte length
      * @param n length of bytes of random
      * @return BigInteger object of specified random value
      * @example
      * KJUR.crypto.Util.getRandomBigIntegerOfNbytes(3) → 6314af of BigInteger
      * KJUR.crypto.Util.getRandomBigIntegerOfNbytes(128) → 8fbc... of BigInteger
      */
    def getRandomBigIntegerOfNbytes(n: Double): typings.jsrsasign.jsrsasign.BigInteger = js.native
    /**
      * get BigInteger object of random value from zero to max value
      * @param biMax max value of BigInteger object for random value
      * @return BigInteger object of specified random value
      * @description
      * This static method generates a BigInteger object with random value
      * greater than or equal to zero and smaller than or equal to biMax
      * (i.e. 0 ≤ result ≤ biMax).
      * @example
      * biMax = new BigInteger("3fa411...", 16);
      * KJUR.crypto.Util.getRandomBigIntegerZeroToMax(biMax) → 8fbc... of BigInteger
      */
    def getRandomBigIntegerZeroToMax(biMax: Double): typings.jsrsasign.jsrsasign.BigInteger = js.native
    /**
      * get hexadecimal string of random value from with specified bit length
      * @param n length of bits of random
      * @return hexadecimal string of random
      * @example
      * KJUR.crypto.Util.getRandomHexOfNbits(24) → "6314af", "000000" or "001fb4"
      * KJUR.crypto.Util.getRandomHexOfNbits(1024) → "8fbc..." in 1024bits
      */
    def getRandomHexOfNbits(n: Double): String = js.native
    /**
      * get hexadecimal string of random value from with specified byte length
      * @param n length of bytes of random
      * @return hexadecimal string of random
      * @example
      * KJUR.crypto.Util.getRandomHexOfNbytes(3) → "6314af", "000000" or "001fb4"
      * KJUR.crypto.Util.getRandomHexOfNbytes(128) → "8fbc..." in 1024bits
      */
    def getRandomHexOfNbytes(n: Double): String = js.native
    /**
      * get hexadecimal hash of hexadecimal string with specified algorithm
      * @param sHex input hexadecimal string to be hashed
      * @param alg hash algorithm name
      * @return hexadecimal string of hash value
      */
    def hashHex(sHex: String, alg: String): String = js.native
    /**
      * get hexadecimal hash of string with specified algorithm
      * @param s input string to be hashed
      * @param alg hash algorithm name
      * @return hexadecimal string of hash value
      */
    def hashString(s: String, alg: String): String = js.native
    /**
      * get hexadecimal MD5 hash of string
      * @param s input string to be hashed
      * @return hexadecimal string of hash value
      * @example
      * Util.md5('aaa') → 47bce5c74f589f4867dbd57e9ca9f808
      */
    def md5(s: String): String = js.native
    /**
      * get hexadecimal RIPEMD160 hash of string
      * @param s input string to be hashed
      * @return hexadecimal string of hash value
      * @example
      * KJUR.crypto.Util.ripemd160("aaa") → 08889bd7b151aa174c21f33f59147fa65381edea
      */
    def ripemd160(s: String): String = js.native
    /**
      * get hexadecimal SHA1 hash of string
      * @param s input string to be hashed
      * @return hexadecimal string of hash value
      */
    def sha1(s: String): String = js.native
    /**
      * get hexadecimal SHA256 hash of string
      * @param s input string to be hashed
      * @return hexadecimal string of hash value
      */
    def sha256(s: String): String = js.native
    def sha256Hex(s: String): String = js.native
    /**
      * get hexadecimal SHA512 hash of string
      * @param s input string to be hashed
      * @return hexadecimal string of hash value
      */
    def sha512(s: String): String = js.native
  }
  
}

