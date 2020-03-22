package typings.jsrsasign.jsrsasign.KJUR.jws.JWS

import typings.jsrsasign.Anon0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.jws.JWS.sign")
@js.native
object sign extends js.Object {
  /**
    * generate JWS signature by specified key
    * @param alg JWS algorithm name to sign and force set to sHead or null
    * @param spHead string or object of JWS Header
    * @param spPayload string or object of JWS Payload
    * @param key string of private key or mac key object to sign
    * @param pass (OPTION)passcode to use encrypted asymmetric private key
    * @return JWS signature string
    * @see [jsrsasign KJUR.crypto.Signature method](https://kjur.github.io/jsrsasign/api/symbols/KJUR.crypto.Signature.html)
    * @see [jsrsasign KJUR.crypto.Mac method](https://kjur.github.io/jsrsasign/api/symbols/KJUR.crypto.Mac.html)
    * @description
    * This method supports following algorithms.
    *
    * |alg value|spec requirement|jsjws support|
    * |:--------|:---------------|:------------|
    * |HS256|REQUIRED|SUPPORTED|
    * |HS384|OPTIONAL|SUPPORTED|
    * |HS512|OPTIONAL|SUPPORTED|
    * |RS256|RECOMMENDED|SUPPORTED|
    * |RS384|OPTIONAL|SUPPORTED|
    * |RS512|OPTIONAL|SUPPORTED|
    * |ES256|RECOMMENDED+|SUPPORTED|
    * |ES384|OPTIONAL|SUPPORTED|
    * |ES512|OPTIONAL|-|
    * |PS256|OPTIONAL|SUPPORTED|
    * |PS384|OPTIONAL|SUPPORTED|
    * |PS512|OPTIONAL|SUPPORTED|
    * |none|REQUIRED|SUPPORTED(signature generation only)|
    *
    * NOTE1:
    * salt length of RSAPSS signature is the same as the hash algorithm length
    * because of [IETF JOSE ML discussion](http://www.ietf.org/mail-archive/web/jose/current/msg02901.html).
    *
    * NOTE2:
    * To support HS384, patched version of CryptoJS is used.
    * [See here for detail](https://code.google.com/p/crypto-js/issues/detail?id=84).
    *
    * NOTE3:
    * From jsrsasign 4.10.0 jws 3.3.0, Way to provide password
    * for HS* algorithm is changed. The 'key' attribute value is
    * passed to `KJUR.crypto.Mac.setPassword` so please see
    * `KJUR.crypto.Mac.setPassword` for detail.
    * As for backword compatibility, if key is a string, has even length and
    * 0..9, A-F or a-f characters, key string is treated as a hexadecimal
    * otherwise it is treated as a raw string.
    *
    * @example
    * // sign HS256 signature with password "aaa" implicitly handled as string
    * sJWS = KJUR.jws.JWS.sign(null, {alg: "HS256", cty: "JWT"}, {age: 21}, "aaa");
    * // sign HS256 signature with password "6161" implicitly handled as hex
    * sJWS = KJUR.jws.JWS.sign(null, {alg: "HS256", cty: "JWT"}, {age: 21}, "6161");
    * // sign HS256 signature with base64 password
    * sJWS = KJUR.jws.JWS.sign(null, {alg: "HS256"}, {age: 21}, {b64: "Mi/8..a="});
    * // sign RS256 signature with PKCS#8 PEM RSA private key
    * sJWS = KJUR.jws.JWS.sign(null, {alg: "RS256"}, {age: 21}, "-----BEGIN PRIVATE KEY...");
    * // sign RS256 signature with PKCS#8 PEM ECC private key with passcode
    * sJWS = KJUR.jws.JWS.sign(null, {alg: "ES256"}, {age: 21},
    *                          "-----BEGIN PRIVATE KEY...", "keypass");
    * // header and payload can be passed by both string and object
    * sJWS = KJUR.jws.JWS.sign(null, '{alg:"HS256",cty:"JWT"}', '{age:21}', "aaa");
    */
  def apply(alg: String, spHead: Anon0, spPayload: String): String = js.native
  def apply(alg: String, spHead: Anon0, spPayload: String, pass: String): String = js.native
  def apply(alg: String, spHead: Anon0, spPayload: js.Object): String = js.native
  def apply(alg: String, spHead: Anon0, spPayload: js.Object, pass: String): String = js.native
  def apply(alg: Null, spHead: Anon0, spPayload: String): String = js.native
  def apply(alg: Null, spHead: Anon0, spPayload: String, pass: String): String = js.native
  def apply(alg: Null, spHead: Anon0, spPayload: js.Object): String = js.native
  def apply(alg: Null, spHead: Anon0, spPayload: js.Object, pass: String): String = js.native
}

