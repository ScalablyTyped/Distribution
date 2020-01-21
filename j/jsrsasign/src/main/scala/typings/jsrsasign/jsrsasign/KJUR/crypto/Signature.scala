package typings.jsrsasign.jsrsasign.KJUR.crypto

import typings.jsrsasign.AnonAlgString
import typings.jsrsasign.jsrsasign.ECCPrivateKey
import typings.jsrsasign.jsrsasign.RSAKey
import typings.jsrsasign.jsrsasignStrings.SIGN
import typings.jsrsasign.jsrsasignStrings.VERIFY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("jsrsasign.KJUR.crypto.Signature")
@js.native
class Signature () extends js.Object {
  def this(params: AnonAlgString) = this()
  /**
    * Initialize this object for signing or verifying depends on key
    * @param key specifying public or private key as plain/encrypted PKCS#5/8 PEM file, certificate PEM or `RSAKey`, `KJUR.crypto.DSA` or `KJUR.crypto.ECDSA` object
    * @param pass (OPTION) passcode for encrypted private key
    * @description
    * This method is very useful initialize method for Signature class since
    * you just specify key then this method will automatically initialize it
    * using `KEYUTIL.getKey` method.
    * As for 'key',  following argument type are supported:
    * __signing__
    * - PEM formatted PKCS#8 encrypted RSA/ECDSA private key concluding "BEGIN ENCRYPTED PRIVATE KEY"
    * - PEM formatted PKCS#5 encrypted RSA/DSA private key concluding "BEGIN RSA/DSA PRIVATE KEY" and ",ENCRYPTED"
    * - PEM formatted PKCS#8 plain RSA/ECDSA private key concluding "BEGIN PRIVATE KEY"
    * - PEM formatted PKCS#5 plain RSA/DSA private key concluding "BEGIN RSA/DSA PRIVATE KEY" without ",ENCRYPTED"
    * - RSAKey object of private key
    * - KJUR.crypto.ECDSA object of private key
    * - KJUR.crypto.DSA object of private key
    *
    * __verification__
    * - PEM formatted PKCS#8 RSA/EC/DSA public key concluding "BEGIN PUBLIC KEY"
    * - PEM formatted X.509 certificate with RSA/EC/DSA public key concluding
    *   "BEGIN CERTIFICATE", "BEGIN X509 CERTIFICATE" or "BEGIN TRUSTED CERTIFICATE".
    * - RSAKey object of public key
    * - KJUR.crypto.ECDSA object of public key
    * - KJUR.crypto.DSA object of public key
    * @example
    * sig.init(sCertPEM)
    */
  def init(key: String): Unit = js.native
  def init(key: String, pass: String): Unit = js.native
  def init(key: ECCPrivateKey): Unit = js.native
  def init(key: ECCPrivateKey, pass: String): Unit = js.native
  def init(key: DSA): Unit = js.native
  def init(key: DSA, pass: String): Unit = js.native
  def init(key: ECDSA): Unit = js.native
  def init(key: ECDSA, pass: String): Unit = js.native
  def init(key: RSAKey): Unit = js.native
  def init(key: RSAKey, pass: String): Unit = js.native
  /**
    * set signature algorithm and provider
    * @param alg signature algorithm name
    * @param prov provider name
    * @example
    * md.setAlgAndProvider('SHA1withRSA', 'cryptojs/jsrsa');
    */
  def setAlgAndProvider(alg: String, prov: String): Unit = js.native
  /**
    * Returns the signature bytes of all data updates as a hexadecimal string
    * @return the signature bytes as a hexadecimal string
    * @example
    * var hSigValue = sig.sign()
    */
  def sign(): String = js.native
  /**
    * performs final update on the sign using hexadecimal string, then returns the signature bytes of all data updates as a hexadecimal string
    * @param hex hexadecimal string to final update
    * @return the signature bytes of a hexadecimal string
    * @example
    * var hSigValue = sig.signHex('1fdc33')
    */
  def signHex(hex: String): String = js.native
  /**
    * performs final update on the sign using string, then returns the signature bytes of all data updates as a hexadecimal string
    * @param str string to final update
    * @return the signature bytes of a hexadecimal string
    * @example
    * var hSigValue = sig.signString('aaa')
    */
  def signString(str: String): String = js.native
  /**
    * Updates the data to be signed or verified by a hexadecimal string
    * @param hex hexadecimal string to use for the update
    * @example
    * sig.updateHex('1f2f3f')
    */
  def updateHex(hex: String): Unit = js.native
  /**
    * Updates the data to be signed or verified by a string
    * @param str string to use for the update
    * @example
    * sig.updateString('aaa')
    */
  def updateString(str: String): Unit = js.native
  /**
    * verifies the passed-in signature.
    * @param hSigVal string to final update
    * @return true if the signature was verified, otherwise false
    * @example
    * var isValid = sig.verify('1fbcefdca4823a7(snip)')
    */
  def verify(hSigVal: String): Boolean = js.native
}

/* static members */
@JSGlobal("jsrsasign.KJUR.crypto.Signature")
@js.native
object Signature extends js.Object {
  /** Current state of this signature object whether 'SIGN', 'VERIFY' or null */
  val state: SIGN | VERIFY | Null = js.native
}

