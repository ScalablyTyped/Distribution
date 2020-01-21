package typings.jsrsasign.jsrsasign.KJUR.jws.JWS

import typings.jsrsasign.AnonAlgAud
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.jws.JWS.verifyJWT")
@js.native
object verifyJWT extends js.Object {
  /**
    * @param sJWT string of JSON Web Token(JWT) to verify
    * @param key string of public key, certificate or key object to verify
    * @param acceptField associative array of acceptable fields (OPTION)
    * @return true if the JWT token is valid otherwise false
    *
    * @description
    * This method verifies a
    * [RFC 7519](https://tools.ietf.org/html/rfc7519)
    * JSON Web Token(JWT).
    * It will verify following:
    *
    * - Header.alg
    *
    * - alg is specified in JWT header.
    * - alg is included in acceptField.alg array. (MANDATORY)
    * - alg is proper for key.
    *
    *
    * - Payload.iss (issuer) - Payload.iss is included in acceptField.iss array if specified. (OPTION)
    * - Payload.sub (subject) - Payload.sub is included in acceptField.sub array if specified. (OPTION)
    * - Payload.aud (audience) - Payload.aud is included in acceptField.aud array or
    *     the same as value if specified. (OPTION)
    * - Time validity
    *
    * -
    * If acceptField.verifyAt as number of UNIX origin time is specifed for validation time,
    * this method will verify at the time for it, otherwise current time will be used to verify.
    *
    * -
    * Clock of JWT generator or verifier can be fast or slow. If these clocks are
    * very different, JWT validation may fail. To avoid such case, 'jsrsasign' supports
    * 'acceptField.gracePeriod' parameter which specifies acceptable time difference
    * of those clocks in seconds. So if you want to accept slow or fast in 2 hours,
    * you can specify <code>acceptField.gracePeriod = 2 * 60 * 60;</code>.
    * "gracePeriod" is zero by default.
    * "gracePeriod" is supported since jsrsasign 5.0.12.
    *
    * - Payload.exp (expire) - Validation time is smaller than Payload.exp + gracePeriod.
    * - Payload.nbf (not before) - Validation time is greater than Payload.nbf - gracePeriod.
    * - Payload.iat (issued at) - Validation time is greater than Payload.iat - gracePeriod.
    *
    *
    * - Payload.jti (JWT id) - Payload.jti is included in acceptField.jti if specified. (OPTION)
    * - JWS signature of JWS is valid for specified key.
    *
    *
    * __acceptField parameters__
    * Here is available acceptField argument parameters:
    *
    * - alg - array of acceptable signature algorithm names (ex. ["HS256", "HS384"])
    * - iss - array of acceptable issuer names (ex. ['http://foo.com'])
    * - sub - array of acceptable subject names (ex. ['mailto:john@foo.com'])
    * - aud - array of acceptable audience name (ex. ['http://foo.com'])
    * - jti - string of acceptable JWT ID (OPTION) (ex. 'id1234')
    * -
    * verifyAt - time to verify 'nbf', 'iat' and 'exp' in UNIX seconds (OPTION) (ex. 1377663900).
    * If this is not specified, current time of verifier will be used.
    * `KJUR.jws.IntDate` may be useful to specify it.
    *
    * - gracePeriod - acceptable time difference between signer and verifier
    * in seconds (ex. 3600). If this is not specified, zero will be used.
    *
    *
    * @example
    * // simple validation for HS256
    * isValid = KJUR.jws.JWS.verifyJWT("eyJhbG...", "616161", {alg: ["HS256"]}),
    *
    * // full validation for RS or PS
    * pubkey = KEYUTIL.getKey('-----BEGIN CERT...');
    * isValid = KJUR.jws.JWS.verifyJWT('eyJh...', pubkey, {
    *   alg: ['RS256', 'RS512', 'PS256', 'PS512'],
    *   iss: ['http://foo.com'],
    *   sub: ['mailto:john@foo.com', 'mailto:alice@foo.com'],
    *   verifyAt: KJUR.jws.IntDate.get('20150520235959Z'),
    *   aud: ['http://foo.com'], // aud: 'http://foo.com' is fine too.
    *   jti: 'id123456',
    *   gracePeriod: 1 * 60 * 60 // accept 1 hour slow or fast
    * });
    */
  def apply(sJWT: String, key: String): Boolean = js.native
  def apply(sJWT: String, key: String, acceptField: AnonAlgAud): Boolean = js.native
}

