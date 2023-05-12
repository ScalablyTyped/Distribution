package typings.jsonwebtoken

import typings.jsonwebtoken.mod.Algorithm
import typings.jsonwebtoken.mod.JwtHeader
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined jsonwebtoken.jsonwebtoken.DecodeOptions & {  complete :true} */
  trait DecodeOptionscompletetrue extends StObject {
    
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
  }
  object DecodeOptionscompletetrue {
    
    inline def apply(): DecodeOptionscompletetrue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptionscompletetrue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecodeOptionscompletetrue] (val x: Self) extends AnyVal {
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  /* Inlined jsonwebtoken.jsonwebtoken.DecodeOptions & {  json :true} */
  trait DecodeOptionsjsontrue extends StObject {
    
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
  }
  object DecodeOptionsjsontrue {
    
    inline def apply(): DecodeOptionsjsontrue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptionsjsontrue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecodeOptionsjsontrue] (val x: Self) extends AnyVal {
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    var key: String | Buffer
    
    var passphrase: String
  }
  object Key {
    
    inline def apply(key: String | Buffer, passphrase: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined jsonwebtoken.jsonwebtoken.SignOptions & {  algorithm :'none'} */
  trait SignOptionsalgorithmnone extends StObject {
    
    /**
      * Signature algorithm. Could be one of these values :
      * - HS256:    HMAC using SHA-256 hash algorithm (default)
      * - HS384:    HMAC using SHA-384 hash algorithm
      * - HS512:    HMAC using SHA-512 hash algorithm
      * - RS256:    RSASSA using SHA-256 hash algorithm
      * - RS384:    RSASSA using SHA-384 hash algorithm
      * - RS512:    RSASSA using SHA-512 hash algorithm
      * - ES256:    ECDSA using P-256 curve and SHA-256 hash algorithm
      * - ES384:    ECDSA using P-384 curve and SHA-384 hash algorithm
      * - ES512:    ECDSA using P-521 curve and SHA-512 hash algorithm
      * - none:     No digital signature or MAC value included
      */
    var algorithm: js.UndefOr[Algorithm] = js.undefined
    
    var allowInsecureKeySizes: js.UndefOr[Boolean] = js.undefined
    
    var allowInvalidAsymmetricKeyTypes: js.UndefOr[Boolean] = js.undefined
    
    var audience: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    /** expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
    var expiresIn: js.UndefOr[String | Double] = js.undefined
    
    var header: js.UndefOr[JwtHeader] = js.undefined
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var jwtid: js.UndefOr[String] = js.undefined
    
    var keyid: js.UndefOr[String] = js.undefined
    
    var mutatePayload: js.UndefOr[Boolean] = js.undefined
    
    var noTimestamp: js.UndefOr[Boolean] = js.undefined
    
    /** expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
    var notBefore: js.UndefOr[String | Double] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object SignOptionsalgorithmnone {
    
    inline def apply(): SignOptionsalgorithmnone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignOptionsalgorithmnone]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignOptionsalgorithmnone] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setAllowInsecureKeySizes(value: Boolean): Self = StObject.set(x, "allowInsecureKeySizes", value.asInstanceOf[js.Any])
      
      inline def setAllowInsecureKeySizesUndefined: Self = StObject.set(x, "allowInsecureKeySizes", js.undefined)
      
      inline def setAllowInvalidAsymmetricKeyTypes(value: Boolean): Self = StObject.set(x, "allowInvalidAsymmetricKeyTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowInvalidAsymmetricKeyTypesUndefined: Self = StObject.set(x, "allowInvalidAsymmetricKeyTypes", js.undefined)
      
      inline def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value*))
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExpiresIn(value: String | Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setHeader(value: JwtHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      inline def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      inline def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
      
      inline def setKeyidUndefined: Self = StObject.set(x, "keyid", js.undefined)
      
      inline def setMutatePayload(value: Boolean): Self = StObject.set(x, "mutatePayload", value.asInstanceOf[js.Any])
      
      inline def setMutatePayloadUndefined: Self = StObject.set(x, "mutatePayload", js.undefined)
      
      inline def setNoTimestamp(value: Boolean): Self = StObject.set(x, "noTimestamp", value.asInstanceOf[js.Any])
      
      inline def setNoTimestampUndefined: Self = StObject.set(x, "noTimestamp", js.undefined)
      
      inline def setNotBefore(value: String | Double): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  /* Inlined jsonwebtoken.jsonwebtoken.VerifyOptions & {  complete :false | undefined} */
  trait VerifyOptionscompletefals extends StObject {
    
    var algorithms: js.UndefOr[js.Array[Algorithm]] = js.undefined
    
    var allowInvalidAsymmetricKeyTypes: js.UndefOr[Boolean] = js.undefined
    
    var audience: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var clockTimestamp: js.UndefOr[Double] = js.undefined
    
    var clockTolerance: js.UndefOr[Double] = js.undefined
    
    /** return an object with the decoded `{ payload, header, signature }` instead of only the usual content of the payload. */
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var ignoreExpiration: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNotBefore: js.UndefOr[Boolean] = js.undefined
    
    var issuer: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var jwtid: js.UndefOr[String] = js.undefined
    
    var maxAge: js.UndefOr[String | Double] = js.undefined
    
    /**
      * If you want to check `nonce` claim, provide a string value here.
      * It is used on Open ID for the ID Tokens. ([Open ID implementation notes](https://openid.net/specs/openid-connect-core-1_0.html#NonceNotes))
      */
    var nonce: js.UndefOr[String] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object VerifyOptionscompletefals {
    
    inline def apply(): VerifyOptionscompletefals = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyOptionscompletefals]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerifyOptionscompletefals] (val x: Self) extends AnyVal {
      
      inline def setAlgorithms(value: js.Array[Algorithm]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: Algorithm*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setAllowInvalidAsymmetricKeyTypes(value: Boolean): Self = StObject.set(x, "allowInvalidAsymmetricKeyTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowInvalidAsymmetricKeyTypesUndefined: Self = StObject.set(x, "allowInvalidAsymmetricKeyTypes", js.undefined)
      
      inline def setAudience(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAudienceVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "audience", js.Array(value*))
      
      inline def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      inline def setClockTimestampUndefined: Self = StObject.set(x, "clockTimestamp", js.undefined)
      
      inline def setClockTolerance(value: Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpirationUndefined: Self = StObject.set(x, "ignoreExpiration", js.undefined)
      
      inline def setIgnoreNotBefore(value: Boolean): Self = StObject.set(x, "ignoreNotBefore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNotBeforeUndefined: Self = StObject.set(x, "ignoreNotBefore", js.undefined)
      
      inline def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value*))
      
      inline def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      inline def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      inline def setMaxAge(value: String | Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  /* Inlined jsonwebtoken.jsonwebtoken.VerifyOptions & {  complete :true} */
  trait VerifyOptionscompletetrue extends StObject {
    
    var algorithms: js.UndefOr[js.Array[Algorithm]] = js.undefined
    
    var allowInvalidAsymmetricKeyTypes: js.UndefOr[Boolean] = js.undefined
    
    var audience: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var clockTimestamp: js.UndefOr[Double] = js.undefined
    
    var clockTolerance: js.UndefOr[Double] = js.undefined
    
    /** return an object with the decoded `{ payload, header, signature }` instead of only the usual content of the payload. */
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var ignoreExpiration: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNotBefore: js.UndefOr[Boolean] = js.undefined
    
    var issuer: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var jwtid: js.UndefOr[String] = js.undefined
    
    var maxAge: js.UndefOr[String | Double] = js.undefined
    
    /**
      * If you want to check `nonce` claim, provide a string value here.
      * It is used on Open ID for the ID Tokens. ([Open ID implementation notes](https://openid.net/specs/openid-connect-core-1_0.html#NonceNotes))
      */
    var nonce: js.UndefOr[String] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object VerifyOptionscompletetrue {
    
    inline def apply(): VerifyOptionscompletetrue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyOptionscompletetrue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerifyOptionscompletetrue] (val x: Self) extends AnyVal {
      
      inline def setAlgorithms(value: js.Array[Algorithm]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: Algorithm*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setAllowInvalidAsymmetricKeyTypes(value: Boolean): Self = StObject.set(x, "allowInvalidAsymmetricKeyTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowInvalidAsymmetricKeyTypesUndefined: Self = StObject.set(x, "allowInvalidAsymmetricKeyTypes", js.undefined)
      
      inline def setAudience(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAudienceVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "audience", js.Array(value*))
      
      inline def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      inline def setClockTimestampUndefined: Self = StObject.set(x, "clockTimestamp", js.undefined)
      
      inline def setClockTolerance(value: Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpirationUndefined: Self = StObject.set(x, "ignoreExpiration", js.undefined)
      
      inline def setIgnoreNotBefore(value: Boolean): Self = StObject.set(x, "ignoreNotBefore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNotBeforeUndefined: Self = StObject.set(x, "ignoreNotBefore", js.undefined)
      
      inline def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value*))
      
      inline def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      inline def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      inline def setMaxAge(value: String | Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
}
