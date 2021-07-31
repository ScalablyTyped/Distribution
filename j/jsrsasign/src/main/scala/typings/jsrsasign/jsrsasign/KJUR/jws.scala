package typings.jsrsasign.jsrsasign.KJUR

import typings.jsrsasign.anon.Typ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * kjur's JSON Web Signature/Token(JWS/JWT) library name space
  *
  * This namespace provides the following JWS/JWS related classes.
  *
  * - `KJUR.jws.JWS` - JSON Web Signature/Token(JWS/JWT) class
  * - `KJUR.jws.JWSJS` - JWS JSON Serialization(JWSJS) class
  * - `KJUR.jws.IntDate` - UNIX origin time utility class
  */
object jws {
  
  /**
    * IntDate class for time representation for JSON Web Token(JWT)
    * @description
    * Utility class for IntDate which is integer representation of UNIX origin time
    * used in JSON Web Token(JWT).
    */
  object IntDate
  
  /**
    * JSON Web Signature(JWS) class.
    * @see ['jwjws'(JWS JavaScript Library) home page](https://kjur.github.io/jsjws/)
    * @see ['jwrsasign'(RSA Sign JavaScript Library) home page](https://kjur.github.io/jsrsasigns/)
    * @see [IETF I-D JSON Web Algorithms (JWA)](http://tools.ietf.org/html/draft-ietf-jose-json-web-algorithms-14)
    * @description
    * This class provides JSON Web Signature(JWS)/JSON Web Token(JWT) signing and validation.
    *
    * __METHOD SUMMARY__
    *
    * Here are the major methods of the `KJUR.jws.JWS` class.
    *
    * - __SIGN__
    *
    * - `KJUR.jws.JWS.sign` - sign JWS
    *
    * - __VERIFY__
    *
    * - `KJUR.jws.JWS.verify` - verify JWS signature
    * - `KJUR.jws.JWS.verifyJWT` - verify properties of JWT token at specified time
    *
    * - __UTILITY__
    *
    * - `KJUR.jws.JWS.getJWKthumbprint` - get RFC 7638 JWK thumbprint
    * - `KJUR.jws.JWS.isSafeJSONString` - check whether safe JSON string or not
    * - `KJUR.jws.JWS.readSafeJSONString` - read safe JSON string only
    *
    * __SUPPORTED SIGNATURE ALGORITHMS__
    *
    * Here is supported algorithm names for `KJUR.jws.JWS.sign` and
    * `KJUR.jws.JWS.verify` methods.
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
    * __NOTE1__
    *
    * HS384 is supported since jsjws 3.0.2 with jsrsasign 4.1.4.
    *
    * __NOTE2__
    *
    * Some deprecated methods have been removed since jws 3.3 of jsrsasign 4.10.0.
    * Removed methods are following:
    *
    * - `JWS.verifyJWSByNE`
    * - `JWS.verifyJWSByKey`
    * - `JWS.generateJWSByNED`
    * - `JWS.generateJWSByKey`
    * - `JWS.generateJWSByP1PrvKey`
    *
    * @example
    * // JWS signing
    * sJWS = KJUR.jws.JWS.sign(null, '{"alg":"HS256", "cty":"JWT"}', '{"age": 21}', {"utf8": "password"});
    * // JWS validation
    * isValid = KJUR.jws.JWS.verify('eyJjdHkiOiJKV1QiLCJhbGc...', {"utf8": "password"});
    * // JWT validation
    * isValid = KJUR.jws.JWS.verifyJWT('eyJh...', {"utf8": "password"}, {
    *   alg: ['HS256', 'HS384'],
    *   iss: ['http://foo.com']
    * });
    */
  object JWS {
    
    trait JWSResult extends StObject {
      
      /** JSON object of header */
      var headerObj: Typ
      
      /** pretty printed JSON header by stringify */
      var headerPP: String
      
      /** JSON object of payload if payload is JSON string otherwise undefined */
      var payloadObj: js.UndefOr[js.Object] = js.undefined
      
      /** pretty printed JSON payload by stringify if payload is JSON otherwise Base64URL decoded raw string of payload */
      var payloadPP: String
      
      /** hexadecimal string of signature */
      var sigHex: String
    }
    object JWSResult {
      
      @scala.inline
      def apply(headerObj: Typ, headerPP: String, payloadPP: String, sigHex: String): JWSResult = {
        val __obj = js.Dynamic.literal(headerObj = headerObj.asInstanceOf[js.Any], headerPP = headerPP.asInstanceOf[js.Any], payloadPP = payloadPP.asInstanceOf[js.Any], sigHex = sigHex.asInstanceOf[js.Any])
        __obj.asInstanceOf[JWSResult]
      }
      
      @scala.inline
      implicit class JWSResultMutableBuilder[Self <: JWSResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeaderObj(value: Typ): Self = StObject.set(x, "headerObj", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaderPP(value: String): Self = StObject.set(x, "headerPP", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayloadObj(value: js.Object): Self = StObject.set(x, "payloadObj", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayloadObjUndefined: Self = StObject.set(x, "payloadObj", js.undefined)
        
        @scala.inline
        def setPayloadPP(value: String): Self = StObject.set(x, "payloadPP", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSigHex(value: String): Self = StObject.set(x, "sigHex", value.asInstanceOf[js.Any])
      }
    }
    
    trait JsonWebKey extends StObject {
      
      var crv: String
      
      var e: String
      
      var k: String
      
      var kty: String
      
      var n: String
      
      var v: String
      
      var x: String
      
      var y: String
    }
    object JsonWebKey {
      
      @scala.inline
      def apply(crv: String, e: String, k: String, kty: String, n: String, v: String, x: String, y: String): JsonWebKey = {
        val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.asInstanceOf[JsonWebKey]
      }
      
      @scala.inline
      implicit class JsonWebKeyMutableBuilder[Self <: JsonWebKey] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setK(value: String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
  }
}
