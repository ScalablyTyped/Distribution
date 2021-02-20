package typings.jsonwebtoken

import org.scalablytyped.runtime.StringDictionary
import typings.jsonwebtoken.anon.DecodeOptionsjsontrue
import typings.jsonwebtoken.anon.Key
import typings.node.Buffer
import typings.std.Date
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonwebtoken", "JsonWebTokenError")
  @js.native
  class JsonWebTokenError protected ()
    extends Error
       with VerifyErrors {
    def this(message: String) = this()
    def this(message: String, error: Error) = this()
    
    var inner: Error = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.jsonwebtoken.mod.VerifyErrors because Already inherited */ @JSImport("jsonwebtoken", "NotBeforeError")
  @js.native
  class NotBeforeError protected () extends JsonWebTokenError {
    def this(message: String, date: Date) = this()
    
    var date: Date = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.jsonwebtoken.mod.VerifyErrors because Already inherited */ @JSImport("jsonwebtoken", "TokenExpiredError")
  @js.native
  class TokenExpiredError protected () extends JsonWebTokenError {
    def this(message: String, expiredAt: Date) = this()
    
    var expiredAt: Date = js.native
  }
  
  @JSImport("jsonwebtoken", "decode")
  @js.native
  def decode(token: String): Null | StringDictionary[js.Any] | String = js.native
  @JSImport("jsonwebtoken", "decode")
  @js.native
  def decode(token: String, options: DecodeOptionsjsontrue): Null | StringDictionary[js.Any] = js.native
  @JSImport("jsonwebtoken", "decode")
  @js.native
  def decode(token: String, options: DecodeOptions): Null | StringDictionary[js.Any] | String = js.native
  
  @JSImport("jsonwebtoken", "sign")
  @js.native
  def sign(payload: String, secretOrPrivateKey: Secret): String = js.native
  @JSImport("jsonwebtoken", "sign")
  @js.native
  def sign(payload: String, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
  @JSImport("jsonwebtoken", "sign")
  @js.native
  def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
  @JSImport("jsonwebtoken", "sign")
  @js.native
  def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
  @JSImport("jsonwebtoken", "sign")
  @js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret): String = js.native
  @JSImport("jsonwebtoken", "sign")
  @js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
  @JSImport("jsonwebtoken", "sign")
  @js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
  @JSImport("jsonwebtoken", "sign")
  @js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
  @JSImport("jsonwebtoken", "sign")
  @js.native
  def sign(payload: Buffer, secretOrPrivateKey: Secret): String = js.native
  @JSImport("jsonwebtoken", "sign")
  @js.native
  def sign(payload: Buffer, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
  @JSImport("jsonwebtoken", "sign")
  @js.native
  def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
  @JSImport("jsonwebtoken", "sign")
  @js.native
  def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
  
  @JSImport("jsonwebtoken", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret): Unit = js.native
  @JSImport("jsonwebtoken", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret, callback: VerifyCallback): Unit = js.native
  @JSImport("jsonwebtoken", "verify")
  @js.native
  def verify(
    token: String,
    secretOrPublicKey: GetPublicKeyOrSecret,
    options: js.UndefOr[scala.Nothing],
    callback: VerifyCallback
  ): Unit = js.native
  @JSImport("jsonwebtoken", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret, options: VerifyOptions): Unit = js.native
  @JSImport("jsonwebtoken", "verify")
  @js.native
  def verify(
    token: String,
    secretOrPublicKey: GetPublicKeyOrSecret,
    options: VerifyOptions,
    callback: VerifyCallback
  ): Unit = js.native
  @JSImport("jsonwebtoken", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: Secret): js.Object | String = js.native
  @JSImport("jsonwebtoken", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: Secret, callback: VerifyCallback): Unit = js.native
  @JSImport("jsonwebtoken", "verify")
  @js.native
  def verify(
    token: String,
    secretOrPublicKey: Secret,
    options: js.UndefOr[scala.Nothing],
    callback: VerifyCallback
  ): Unit = js.native
  @JSImport("jsonwebtoken", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: Secret, options: VerifyOptions): js.Object | String = js.native
  @JSImport("jsonwebtoken", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: Secret, options: VerifyOptions, callback: VerifyCallback): Unit = js.native
  @JSImport("jsonwebtoken", "verify")
  @js.native
  def verify_Unit(token: String, secretOrPublicKey: Secret): Unit = js.native
  @JSImport("jsonwebtoken", "verify")
  @js.native
  def verify_Unit(token: String, secretOrPublicKey: Secret, options: VerifyOptions): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonwebtoken.jsonwebtokenStrings.HS256
    - typings.jsonwebtoken.jsonwebtokenStrings.HS384
    - typings.jsonwebtoken.jsonwebtokenStrings.HS512
    - typings.jsonwebtoken.jsonwebtokenStrings.RS256
    - typings.jsonwebtoken.jsonwebtokenStrings.RS384
    - typings.jsonwebtoken.jsonwebtokenStrings.RS512
    - typings.jsonwebtoken.jsonwebtokenStrings.ES256
    - typings.jsonwebtoken.jsonwebtokenStrings.ES384
    - typings.jsonwebtoken.jsonwebtokenStrings.ES512
    - typings.jsonwebtoken.jsonwebtokenStrings.PS256
    - typings.jsonwebtoken.jsonwebtokenStrings.PS384
    - typings.jsonwebtoken.jsonwebtokenStrings.PS512
    - typings.jsonwebtoken.jsonwebtokenStrings.none
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    @scala.inline
    def ES256: typings.jsonwebtoken.jsonwebtokenStrings.ES256 = "ES256".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.ES256]
    
    @scala.inline
    def ES384: typings.jsonwebtoken.jsonwebtokenStrings.ES384 = "ES384".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.ES384]
    
    @scala.inline
    def ES512: typings.jsonwebtoken.jsonwebtokenStrings.ES512 = "ES512".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.ES512]
    
    @scala.inline
    def HS256: typings.jsonwebtoken.jsonwebtokenStrings.HS256 = "HS256".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.HS256]
    
    @scala.inline
    def HS384: typings.jsonwebtoken.jsonwebtokenStrings.HS384 = "HS384".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.HS384]
    
    @scala.inline
    def HS512: typings.jsonwebtoken.jsonwebtokenStrings.HS512 = "HS512".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.HS512]
    
    @scala.inline
    def PS256: typings.jsonwebtoken.jsonwebtokenStrings.PS256 = "PS256".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.PS256]
    
    @scala.inline
    def PS384: typings.jsonwebtoken.jsonwebtokenStrings.PS384 = "PS384".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.PS384]
    
    @scala.inline
    def PS512: typings.jsonwebtoken.jsonwebtokenStrings.PS512 = "PS512".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.PS512]
    
    @scala.inline
    def RS256: typings.jsonwebtoken.jsonwebtokenStrings.RS256 = "RS256".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.RS256]
    
    @scala.inline
    def RS384: typings.jsonwebtoken.jsonwebtokenStrings.RS384 = "RS384".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.RS384]
    
    @scala.inline
    def RS512: typings.jsonwebtoken.jsonwebtokenStrings.RS512 = "RS512".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.RS512]
    
    @scala.inline
    def none: typings.jsonwebtoken.jsonwebtokenStrings.none = "none".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.none]
  }
  
  @js.native
  trait DecodeOptions extends StObject {
    
    var complete: js.UndefOr[Boolean] = js.native
    
    var json: js.UndefOr[Boolean] = js.native
  }
  object DecodeOptions {
    
    @scala.inline
    def apply(): DecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptions]
    }
    
    @scala.inline
    implicit class DecodeOptionsMutableBuilder[Self <: DecodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  type GetPublicKeyOrSecret = js.Function2[/* header */ JwtHeader, /* callback */ SigningKeyCallback, Unit]
  
  @js.native
  trait JwtHeader extends StObject {
    
    var alg: String = js.native
    
    var jku: js.UndefOr[String] = js.native
    
    var kid: js.UndefOr[String] = js.native
    
    var typ: js.UndefOr[String] = js.native
    
    var x5t: js.UndefOr[String] = js.native
    
    var x5u: js.UndefOr[String] = js.native
  }
  object JwtHeader {
    
    @scala.inline
    def apply(alg: String): JwtHeader = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtHeader]
    }
    
    @scala.inline
    implicit class JwtHeaderMutableBuilder[Self <: JwtHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJku(value: String): Self = StObject.set(x, "jku", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJkuUndefined: Self = StObject.set(x, "jku", js.undefined)
      
      @scala.inline
      def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
      
      @scala.inline
      def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
      
      @scala.inline
      def setX5t(value: String): Self = StObject.set(x, "x5t", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX5tUndefined: Self = StObject.set(x, "x5t", js.undefined)
      
      @scala.inline
      def setX5u(value: String): Self = StObject.set(x, "x5u", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX5uUndefined: Self = StObject.set(x, "x5u", js.undefined)
    }
  }
  
  type Secret = String | Buffer | Key
  
  type SignCallback = js.Function2[/* err */ Error | Null, /* encoded */ js.UndefOr[String], Unit]
  
  @js.native
  trait SignOptions extends StObject {
    
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
    var algorithm: js.UndefOr[Algorithm] = js.native
    
    var audience: js.UndefOr[String | js.Array[String]] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    /** expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
    var expiresIn: js.UndefOr[String | Double] = js.native
    
    var header: js.UndefOr[js.Object] = js.native
    
    var issuer: js.UndefOr[String] = js.native
    
    var jwtid: js.UndefOr[String] = js.native
    
    var keyid: js.UndefOr[String] = js.native
    
    var mutatePayload: js.UndefOr[Boolean] = js.native
    
    var noTimestamp: js.UndefOr[Boolean] = js.native
    
    /** expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
    var notBefore: js.UndefOr[String | Double] = js.native
    
    var subject: js.UndefOr[String] = js.native
  }
  object SignOptions {
    
    @scala.inline
    def apply(): SignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignOptions]
    }
    
    @scala.inline
    implicit class SignOptionsMutableBuilder[Self <: SignOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setExpiresIn(value: String | Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      @scala.inline
      def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      @scala.inline
      def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyidUndefined: Self = StObject.set(x, "keyid", js.undefined)
      
      @scala.inline
      def setMutatePayload(value: Boolean): Self = StObject.set(x, "mutatePayload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutatePayloadUndefined: Self = StObject.set(x, "mutatePayload", js.undefined)
      
      @scala.inline
      def setNoTimestamp(value: Boolean): Self = StObject.set(x, "noTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoTimestampUndefined: Self = StObject.set(x, "noTimestamp", js.undefined)
      
      @scala.inline
      def setNotBefore(value: String | Double): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  type SigningKeyCallback = js.Function2[/* err */ js.Any, /* signingKey */ js.UndefOr[Secret], Unit]
  
  type VerifyCallback = js.Function2[/* err */ VerifyErrors | Null, /* decoded */ js.UndefOr[js.Object], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonwebtoken.mod.JsonWebTokenError
    - typings.jsonwebtoken.mod.NotBeforeError
    - typings.jsonwebtoken.mod.TokenExpiredError
  */
  trait VerifyErrors extends StObject
  
  @js.native
  trait VerifyOptions extends StObject {
    
    var algorithms: js.UndefOr[js.Array[Algorithm]] = js.native
    
    var audience: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
    
    var clockTimestamp: js.UndefOr[Double] = js.native
    
    var clockTolerance: js.UndefOr[Double] = js.native
    
    /** return an object with the decoded `{ payload, header, signature }` instead of only the usual content of the payload. */
    var complete: js.UndefOr[Boolean] = js.native
    
    var ignoreExpiration: js.UndefOr[Boolean] = js.native
    
    var ignoreNotBefore: js.UndefOr[Boolean] = js.native
    
    var issuer: js.UndefOr[String | js.Array[String]] = js.native
    
    var jwtid: js.UndefOr[String] = js.native
    
    /**
      * @deprecated
      * Max age of token
      */
    var maxAge: js.UndefOr[String] = js.native
    
    /**
      * If you want to check `nonce` claim, provide a string value here.
      * It is used on Open ID for the ID Tokens. ([Open ID implementation notes](https://openid.net/specs/openid-connect-core-1_0.html#NonceNotes))
      */
    var nonce: js.UndefOr[String] = js.native
    
    var subject: js.UndefOr[String] = js.native
  }
  object VerifyOptions {
    
    @scala.inline
    def apply(): VerifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyOptions]
    }
    
    @scala.inline
    implicit class VerifyOptionsMutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithms(value: js.Array[Algorithm]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      @scala.inline
      def setAlgorithmsVarargs(value: Algorithm*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      @scala.inline
      def setAudience(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setAudienceVarargs(value: (String | RegExp)*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      @scala.inline
      def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockTimestampUndefined: Self = StObject.set(x, "clockTimestamp", js.undefined)
      
      @scala.inline
      def setClockTolerance(value: Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreExpirationUndefined: Self = StObject.set(x, "ignoreExpiration", js.undefined)
      
      @scala.inline
      def setIgnoreNotBefore(value: Boolean): Self = StObject.set(x, "ignoreNotBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreNotBeforeUndefined: Self = StObject.set(x, "ignoreNotBefore", js.undefined)
      
      @scala.inline
      def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      @scala.inline
      def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value :_*))
      
      @scala.inline
      def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      @scala.inline
      def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
}
