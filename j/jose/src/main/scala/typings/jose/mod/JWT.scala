package typings.jose.mod

import typings.jose.anon.DecodeOptionscompletetrue
import typings.jose.anon.VerifyOptionscompletetrueAlgorithms
import typings.jose.anon.VerifyOptionscompletetrueAudience
import typings.jose.anon.VerifyOptionscompletetrueClockTolerance
import typings.jose.anon.VerifyOptionscompletetrueComplete
import typings.jose.mod.JWK.Key
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWT {
  
  @JSImport("jose", "JWT")
  @js.native
  val ^ : js.Any = js.native
  
  object AccessToken {
    
    @JSImport("jose", "JWT.AccessToken")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def verify(jwt: String, key: ConsumeKeyInputWithNone, options: VerifyOptions & AccessTokenVerifyOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    @scala.inline
    def verify(jwt: String, key: ConsumeKeyInput, options: VerifyOptionscompletetrueComplete): completeResult[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeResult[Key]]
    @scala.inline
    def verify(jwt: String, key: EmbeddedVerifyKeys, options: VerifyOptions & AccessTokenVerifyOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    @scala.inline
    def verify(jwt: String, key: EmbeddedVerifyKeys, options: VerifyOptionscompletetrueComplete): completeResult[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeResult[Key]]
    @scala.inline
    def verify(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueComplete): completeResult[NoneKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeResult[NoneKey]]
  }
  
  object IdToken {
    
    @JSImport("jose", "JWT.IdToken")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def verify(jwt: String, key: ConsumeKeyInputWithNone, options: VerifyOptions & IdTokenVerifyOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    @scala.inline
    def verify(jwt: String, key: ConsumeKeyInput, options: VerifyOptionscompletetrueAudience): completeResult[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeResult[Key]]
    @scala.inline
    def verify(jwt: String, key: EmbeddedVerifyKeys, options: VerifyOptions & IdTokenVerifyOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    @scala.inline
    def verify(jwt: String, key: EmbeddedVerifyKeys, options: VerifyOptionscompletetrueAudience): completeResult[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeResult[Key]]
    @scala.inline
    def verify(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueAudience): completeResult[NoneKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeResult[NoneKey]]
  }
  
  object LogoutToken {
    
    @JSImport("jose", "JWT.LogoutToken")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def verify(jwt: String, key: ConsumeKeyInputWithNone, options: VerifyOptions & LogoutTokenVerifyOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    @scala.inline
    def verify(jwt: String, key: ConsumeKeyInput, options: VerifyOptionscompletetrueClockTolerance): completeResult[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeResult[Key]]
    @scala.inline
    def verify(jwt: String, key: EmbeddedVerifyKeys, options: VerifyOptions & LogoutTokenVerifyOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    @scala.inline
    def verify(jwt: String, key: EmbeddedVerifyKeys, options: VerifyOptionscompletetrueClockTolerance): completeResult[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeResult[Key]]
    @scala.inline
    def verify(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueClockTolerance): completeResult[NoneKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeResult[NoneKey]]
  }
  
  @scala.inline
  def decode(jwt: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jwt.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  /**
    * Decodes the JWT **without verifying the token**. For JWT verification/validation use
    * `jose.JWT.verify`.
    */
  @scala.inline
  def decode(jwt: String, options: DecodeOptionscompletetrue): completeResult[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jwt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeResult[Unit]]
  @scala.inline
  def decode(jwt: String, options: DecodeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jwt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def sign(payload: js.Object, key: ProduceKeyInputWithNone): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def sign(payload: js.Object, key: ProduceKeyInputWithNone, options: SignOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def verify(jwt: String, key: ConsumeKeyInputWithNone): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def verify(jwt: String, key: ConsumeKeyInputWithNone, options: VerifyOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def verify(jwt: String, key: ConsumeKeyInput, options: VerifyOptionscompletetrueAlgorithms): completeResult[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeResult[Key]]
  @scala.inline
  def verify(jwt: String, key: EmbeddedVerifyKeys): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def verify(jwt: String, key: EmbeddedVerifyKeys, options: VerifyOptionscompletetrueAlgorithms): completeResult[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeResult[Key]]
  @scala.inline
  def verify(jwt: String, key: EmbeddedVerifyKeys, options: VerifyOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def verify(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueAlgorithms): completeResult[NoneKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[completeResult[NoneKey]]
  
  trait AccessTokenVerifyOptions
    extends StObject
       with ProfiledVerifyOptions {
    
    var maxAuthAge: js.UndefOr[String] = js.undefined
  }
  object AccessTokenVerifyOptions {
    
    @scala.inline
    def apply(audience: String | js.Array[String], issuer: String | js.Array[String]): AccessTokenVerifyOptions = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessTokenVerifyOptions]
    }
    
    @scala.inline
    implicit class AccessTokenVerifyOptionsMutableBuilder[Self <: AccessTokenVerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAuthAge(value: String): Self = StObject.set(x, "maxAuthAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAuthAgeUndefined: Self = StObject.set(x, "maxAuthAge", js.undefined)
    }
  }
  
  trait DecodeOptions extends StObject {
    
    var complete: js.UndefOr[Boolean] = js.undefined
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
    }
  }
  
  trait IdTokenVerifyOptions
    extends StObject
       with ProfiledVerifyOptions {
    
    var maxAuthAge: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
  }
  object IdTokenVerifyOptions {
    
    @scala.inline
    def apply(audience: String | js.Array[String], issuer: String | js.Array[String]): IdTokenVerifyOptions = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdTokenVerifyOptions]
    }
    
    @scala.inline
    implicit class IdTokenVerifyOptionsMutableBuilder[Self <: IdTokenVerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAuthAge(value: String): Self = StObject.set(x, "maxAuthAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAuthAgeUndefined: Self = StObject.set(x, "maxAuthAge", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
  
  type LogoutTokenVerifyOptions = ProfiledVerifyOptions
  
  trait ProfiledVerifyOptions extends StObject {
    
    var audience: String | js.Array[String]
    
    var issuer: String | js.Array[String]
  }
  object ProfiledVerifyOptions {
    
    @scala.inline
    def apply(audience: String | js.Array[String], issuer: String | js.Array[String]): ProfiledVerifyOptions = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfiledVerifyOptions]
    }
    
    @scala.inline
    implicit class ProfiledVerifyOptionsMutableBuilder[Self <: ProfiledVerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      @scala.inline
      def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value :_*))
    }
  }
  
  trait SignOptions extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var audience: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var expiresIn: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[js.Object] = js.undefined
    
    var iat: js.UndefOr[Boolean] = js.undefined
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var jti: js.UndefOr[String] = js.undefined
    
    var kid: js.UndefOr[Boolean] = js.undefined
    
    var notBefore: js.UndefOr[String] = js.undefined
    
    var now: js.UndefOr[Date] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
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
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      @scala.inline
      def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setIat(value: Boolean): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      @scala.inline
      def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
      
      @scala.inline
      def setKid(value: Boolean): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
      
      @scala.inline
      def setNotBefore(value: String): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
      
      @scala.inline
      def setNow(value: Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  trait VerifyOptions extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var audience: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var clockTolerance: js.UndefOr[String] = js.undefined
    
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var crit: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreExp: js.UndefOr[Boolean] = js.undefined
    
    var ignoreIat: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNbf: js.UndefOr[Boolean] = js.undefined
    
    var issuer: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var jti: js.UndefOr[String] = js.undefined
    
    var maxTokenAge: js.UndefOr[String] = js.undefined
    
    var now: js.UndefOr[Date] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var typ: js.UndefOr[String] = js.undefined
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
      def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      @scala.inline
      def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      @scala.inline
      def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      @scala.inline
      def setClockTolerance(value: String): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      @scala.inline
      def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreExp(value: Boolean): Self = StObject.set(x, "ignoreExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreExpUndefined: Self = StObject.set(x, "ignoreExp", js.undefined)
      
      @scala.inline
      def setIgnoreIat(value: Boolean): Self = StObject.set(x, "ignoreIat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreIatUndefined: Self = StObject.set(x, "ignoreIat", js.undefined)
      
      @scala.inline
      def setIgnoreNbf(value: Boolean): Self = StObject.set(x, "ignoreNbf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreNbfUndefined: Self = StObject.set(x, "ignoreNbf", js.undefined)
      
      @scala.inline
      def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      @scala.inline
      def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value :_*))
      
      @scala.inline
      def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
      
      @scala.inline
      def setMaxTokenAge(value: String): Self = StObject.set(x, "maxTokenAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTokenAgeUndefined: Self = StObject.set(x, "maxTokenAge", js.undefined)
      
      @scala.inline
      def setNow(value: Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      @scala.inline
      def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
    }
  }
  
  trait completeResult[T] extends StObject {
    
    var header: js.Object
    
    var key: T
    
    var payload: js.Object
    
    var signature: String
  }
  object completeResult {
    
    @scala.inline
    def apply[T](header: js.Object, key: T, payload: js.Object, signature: String): completeResult[T] = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[completeResult[T]]
    }
    
    @scala.inline
    implicit class completeResultMutableBuilder[Self <: completeResult[?], T] (val x: Self & completeResult[T]) extends AnyVal {
      
      @scala.inline
      def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: T): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
