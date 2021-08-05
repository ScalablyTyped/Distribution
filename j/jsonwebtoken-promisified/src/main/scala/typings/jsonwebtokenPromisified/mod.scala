package typings.jsonwebtokenPromisified

import org.scalablytyped.runtime.StringDictionary
import typings.jsonwebtokenPromisified.anon.Key
import typings.node.Buffer
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonwebtoken-promisified", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jsonwebtoken-promisified", "JsonWebTokenError")
  @js.native
  class JsonWebTokenError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, error: Error) = this()
    
    var inner: Error = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("jsonwebtoken-promisified", "NotBeforeError")
  @js.native
  class NotBeforeError protected () extends JsonWebTokenError {
    def this(message: String, date: Date) = this()
    
    var date: Date = js.native
  }
  
  @JSImport("jsonwebtoken-promisified", "TokenExpiredError")
  @js.native
  class TokenExpiredError protected () extends JsonWebTokenError {
    def this(message: String, expiredAt: Double) = this()
    
    var expiredAt: Double = js.native
  }
  
  inline def decode(token: String): Null | StringDictionary[js.Any] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any]).asInstanceOf[Null | StringDictionary[js.Any] | String]
  inline def decode(token: String, options: DecodeOptions): Null | StringDictionary[js.Any] | String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Null | StringDictionary[js.Any] | String]
  
  inline def sign(payload: String, secretOrPrivateKey: Secret): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: String, secretOrPrivateKey: Secret, callback: SignCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sign(payload: js.Object, secretOrPrivateKey: Secret): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: js.Object, secretOrPrivateKey: Secret, callback: SignCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sign(payload: Buffer, secretOrPrivateKey: Secret): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: Buffer, secretOrPrivateKey: Secret, callback: SignCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def signAsync(payload: String, secretOrPrivateKey: Secret): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("signAsync")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def signAsync(payload: String, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("signAsync")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def signAsync(payload: js.Object, secretOrPrivateKey: Secret): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("signAsync")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def signAsync(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("signAsync")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def signAsync(payload: Buffer, secretOrPrivateKey: Secret): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("signAsync")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def signAsync(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("signAsync")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def verify(token: String, secretOrPublicKey: String): js.Object | String = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any])).asInstanceOf[js.Object | String]
  inline def verify(token: String, secretOrPublicKey: String, callback: VerifyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(token: String, secretOrPublicKey: String, options: VerifyOptions): js.Object | String = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object | String]
  inline def verify(token: String, secretOrPublicKey: String, options: VerifyOptions, callback: VerifyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(token: String, secretOrPublicKey: Buffer): js.Object | String = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any])).asInstanceOf[js.Object | String]
  inline def verify(token: String, secretOrPublicKey: Buffer, callback: VerifyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(token: String, secretOrPublicKey: Buffer, options: VerifyOptions): js.Object | String = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object | String]
  inline def verify(token: String, secretOrPublicKey: Buffer, options: VerifyOptions, callback: VerifyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def verifyAsync(token: String, secretOrPublicKey: String): js.Promise[js.Object | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyAsync")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object | String]]
  inline def verifyAsync(token: String, secretOrPublicKey: String, options: VerifyOptions): js.Promise[js.Object | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyAsync")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object | String]]
  inline def verifyAsync(token: String, secretOrPublicKey: Buffer): js.Promise[js.Object | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyAsync")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object | String]]
  inline def verifyAsync(token: String, secretOrPublicKey: Buffer, options: VerifyOptions): js.Promise[js.Object | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyAsync")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object | String]]
  
  inline def verify_Unit(token: String, secretOrPublicKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify_Unit(token: String, secretOrPublicKey: String, options: VerifyOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify_Unit(token: String, secretOrPublicKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify_Unit(token: String, secretOrPublicKey: Buffer, options: VerifyOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait DecodeOptions extends StObject {
    
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
  }
  object DecodeOptions {
    
    inline def apply(): DecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptions]
    }
    
    extension [Self <: DecodeOptions](x: Self) {
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  type Secret = String | Buffer | Key
  
  type SignCallback = js.Function2[/* err */ Error, /* encoded */ String, Unit]
  
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
    var algorithm: js.UndefOr[String] = js.undefined
    
    var audience: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    /** {string} - expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
    var expiresIn: js.UndefOr[String | Double] = js.undefined
    
    var header: js.UndefOr[js.Object] = js.undefined
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var jwtid: js.UndefOr[String] = js.undefined
    
    var keyid: js.UndefOr[String] = js.undefined
    
    var noTimestamp: js.UndefOr[Boolean] = js.undefined
    
    /** {string} - expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
    var notBefore: js.UndefOr[String | Double] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object SignOptions {
    
    inline def apply(): SignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignOptions]
    }
    
    extension [Self <: SignOptions](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExpiresIn(value: String | Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      inline def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      inline def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
      
      inline def setKeyidUndefined: Self = StObject.set(x, "keyid", js.undefined)
      
      inline def setNoTimestamp(value: Boolean): Self = StObject.set(x, "noTimestamp", value.asInstanceOf[js.Any])
      
      inline def setNoTimestampUndefined: Self = StObject.set(x, "noTimestamp", js.undefined)
      
      inline def setNotBefore(value: String | Double): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  type VerifyCallback = js.Function2[
    /* err */ JsonWebTokenError | NotBeforeError | TokenExpiredError, 
    /* decoded */ js.Object | String, 
    Unit
  ]
  
  trait VerifyOptions extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var audience: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var clockTimestamp: js.UndefOr[Double] = js.undefined
    
    var clockTolerance: js.UndefOr[Double] = js.undefined
    
    var ignoreExpiration: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNotBefore: js.UndefOr[Boolean] = js.undefined
    
    var issuer: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var jwtid: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated
      * {string} - Max age of token
      */
    var maxAge: js.UndefOr[String] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object VerifyOptions {
    
    inline def apply(): VerifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyOptions]
    }
    
    extension [Self <: VerifyOptions](x: Self) {
      
      inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      inline def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      inline def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      inline def setClockTimestampUndefined: Self = StObject.set(x, "clockTimestamp", js.undefined)
      
      inline def setClockTolerance(value: Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      inline def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpirationUndefined: Self = StObject.set(x, "ignoreExpiration", js.undefined)
      
      inline def setIgnoreNotBefore(value: Boolean): Self = StObject.set(x, "ignoreNotBefore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNotBeforeUndefined: Self = StObject.set(x, "ignoreNotBefore", js.undefined)
      
      inline def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value :_*))
      
      inline def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      inline def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      inline def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
}
