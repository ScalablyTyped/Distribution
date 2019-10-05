package typings.jsrsasign.jsrsasign.KJUR.jws.JWS

import typings.jsrsasign.Anon_B64
import typings.jsrsasign.Anon_Hex
import typings.jsrsasign.Anon_Utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.jws.JWS.verify")
@js.native
object verify extends js.Object {
  /**
    * verify JWS signature by specified key or certificate
    * @param sJWS string of JWS signature to verify
    * @param key string of public key, certificate or key object to verify
    * @param acceptAlgs array of algorithm name strings (OPTION)
    * @return true if the signature is valid otherwise false
    * @see [jsrsasign KJUR.crypto.Signature method](https://kjur.github.io/jsrsasign/api/symbols/KJUR.crypto.Signature.html)
    * @see [jsrsasign KJUR.crypto.Mac method](https://kjur.github.io/jsrsasign/api/symbols/KJUR.crypto.Mac.html)
    * @description
    * This method verifies a JSON Web Signature Compact Serialization string by the validation
    * algorithm as described in
    * [the section 5 of Internet Draft draft-jones-json-web-signature-04.](http://self-issued.info/docs/draft-jones-json-web-signature-04.html#anchor5)
    *
    * Since 3.2.0 strict key checking has been provided against a JWS algorithm
    * in a JWS header.
    *
    * - In case 'alg' is 'HS*' in the JWS header,
    * 'key' shall be hexadecimal string for Hmac{256,384,512} shared secret key.
    * Otherwise it raise an error.
    * - In case 'alg' is 'RS*' or 'PS*' in the JWS header,
    * 'key' shall be a RSAKey object or a PEM string of
    * X.509 RSA public key certificate or PKCS#8 RSA public key.
    * Otherwise it raise an error.
    * - In case 'alg' is 'ES*' in the JWS header,
    * 'key' shall be a KJUR.crypto.ECDSA object or a PEM string of
    * X.509 ECC public key certificate or PKCS#8 ECC public key.
    * Otherwise it raise an error.
    * - In case 'alg' is 'none' in the JWS header,
    * validation not supported after jsjws 3.1.0.
    *
    *
    *
    * NOTE1: The argument 'acceptAlgs' is supported since 3.2.0.
    * Strongly recommended to provide acceptAlgs to mitigate
    * signature replacement attacks.
    *
    *
    * NOTE2: From jsrsasign 4.9.0 jws 3.2.5, Way to provide password
    * for HS* algorithm is changed. The 'key' attribute value is
    * passed to `KJUR.crypto.Mac.setPassword` so please see
    * `KJUR.crypto.Mac.setPassword` for detail.
    * As for backword compatibility, if key is a string, has even length and
    * 0..9, A-F or a-f characters, key string is treated as a hexadecimal
    * otherwise it is treated as a raw string.
    *
    * @example
    * // 1) verify a RS256 JWS signature by a certificate string.
    * isValid = KJUR.jws.JWS.verify('eyJh...', '-----BEGIN...', ['RS256']);
    *
    * // 2) verify a HS256 JWS signature by a certificate string.
    * isValid = KJUR.jws.JWS.verify('eyJh...', {hex: '6f62ad...'}, ['HS256']);
    * isValid = KJUR.jws.JWS.verify('eyJh...', {b64: 'Mi/ab8...a=='}, ['HS256']);
    * isValid = KJUR.jws.JWS.verify('eyJh...', {utf8: 'Secret秘密'}, ['HS256']);
    * isValid = KJUR.jws.JWS.verify('eyJh...', '6f62ad', ['HS256']); // implicit hex
    * isValid = KJUR.jws.JWS.verify('eyJh...', '6f62ada', ['HS256']); // implicit raw string
    *
    * // 3) verify a ES256 JWS signature by a KJUR.crypto.ECDSA key object.
    * var pubkey = KEYUTIL.getKey('-----BEGIN CERT...');
    * var isValid = KJUR.jws.JWS.verify('eyJh...', pubkey);
    */
  def apply(sJWS: String, key: String): Boolean = js.native
  def apply(sJWS: String, key: String, acceptAlgs: js.Array[String]): Boolean = js.native
  def apply(sJWS: String, key: String, acceptAlgs: Anon_B64): Boolean = js.native
  def apply(sJWS: String, key: String, acceptAlgs: Anon_Hex): Boolean = js.native
  def apply(sJWS: String, key: String, acceptAlgs: Anon_Utf8): Boolean = js.native
}

