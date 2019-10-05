package typings.jsrsasign.jsrsasign.KJUR.jws.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.jws.JWS.getJWKthumbprint")
@js.native
object getJWKthumbprint extends js.Object {
  /**
    * get RFC 7638 JWK thumbprint from JWK object
    * @param o JWK object to be calculated thumbprint
    * @return Base64 URL encoded JWK thumbprint value
    * @description
    * This method calculates JWK thmubprint for specified JWK object
    * as described in
    * [RFC 7638](https://tools.ietf.org/html/rfc7638).
    * It supports all type of "kty". (i.e. "RSA", "EC" and "oct"
    * (for symmetric key))
    * Working sample is
    * [here](https://kjur.github.io/jsrsasign/sample/tool_jwktp.html).
    * @example
    * jwk = {"kty":"RSA", "n":"0vx...", "e":"AQAB", ...};
    * thumbprint = KJUR.jws.JWS.getJWKthumbprint(jwk);
    */
  def apply(o: JsonWebKey): String = js.native
}

