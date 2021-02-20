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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWT {
  
  object AccessToken {
    
    @JSImport("jose", "JWT.AccessToken.verify")
    @js.native
    def verify(
      jwt: String,
      key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
      options: VerifyOptions with AccessTokenVerifyOptions
    ): js.Object = js.native
    @JSImport("jose", "JWT.AccessToken.verify")
    @js.native
    def verify(jwt: String, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrueComplete): completeResult[Key] = js.native
    @JSImport("jose", "JWT.AccessToken.verify")
    @js.native
    def verify(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueComplete): completeResult[NoneKey] = js.native
  }
  
  object IdToken {
    
    @JSImport("jose", "JWT.IdToken.verify")
    @js.native
    def verify(
      jwt: String,
      key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
      options: VerifyOptions with IdTokenVerifyOptions
    ): js.Object = js.native
    @JSImport("jose", "JWT.IdToken.verify")
    @js.native
    def verify(jwt: String, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrueAudience): completeResult[Key] = js.native
    @JSImport("jose", "JWT.IdToken.verify")
    @js.native
    def verify(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueAudience): completeResult[NoneKey] = js.native
  }
  
  object LogoutToken {
    
    @JSImport("jose", "JWT.LogoutToken.verify")
    @js.native
    def verify(
      jwt: String,
      key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
      options: VerifyOptions with LogoutTokenVerifyOptions
    ): js.Object = js.native
    @JSImport("jose", "JWT.LogoutToken.verify")
    @js.native
    def verify(
      jwt: String,
      key: ConsumeKeyInput | EmbeddedVerifyKeys,
      options: VerifyOptionscompletetrueClockTolerance
    ): completeResult[Key] = js.native
    @JSImport("jose", "JWT.LogoutToken.verify")
    @js.native
    def verify(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueClockTolerance): completeResult[NoneKey] = js.native
  }
  
  @JSImport("jose", "JWT.decode")
  @js.native
  def decode(jwt: String): js.Object = js.native
  /**
    * Decodes the JWT **without verifying the token**. For JWT verification/validation use
    * `jose.JWT.verify`.
    */
  @JSImport("jose", "JWT.decode")
  @js.native
  def decode(jwt: String, options: DecodeOptionscompletetrue): completeResult[js.UndefOr[scala.Nothing]] = js.native
  @JSImport("jose", "JWT.decode")
  @js.native
  def decode(jwt: String, options: DecodeOptions): js.Object = js.native
  
  @JSImport("jose", "JWT.sign")
  @js.native
  def sign(payload: js.Object, key: ProduceKeyInputWithNone): String = js.native
  @JSImport("jose", "JWT.sign")
  @js.native
  def sign(payload: js.Object, key: ProduceKeyInputWithNone, options: SignOptions): String = js.native
  
  @JSImport("jose", "JWT.verify")
  @js.native
  def verify(jwt: String, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): js.Object = js.native
  @JSImport("jose", "JWT.verify")
  @js.native
  def verify(
    jwt: String,
    key: ConsumeKeyInput | EmbeddedVerifyKeys,
    options: VerifyOptionscompletetrueAlgorithms
  ): completeResult[Key] = js.native
  @JSImport("jose", "JWT.verify")
  @js.native
  def verify(jwt: String, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys, options: VerifyOptions): js.Object = js.native
  @JSImport("jose", "JWT.verify")
  @js.native
  def verify(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueAlgorithms): completeResult[NoneKey] = js.native
  
  @js.native
  trait AccessTokenVerifyOptions extends ProfiledVerifyOptions {
    
    var maxAuthAge: js.UndefOr[String] = js.native
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
  
  @js.native
  trait DecodeOptions extends StObject {
    
    var complete: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait IdTokenVerifyOptions extends ProfiledVerifyOptions {
    
    var maxAuthAge: js.UndefOr[String] = js.native
    
    var nonce: js.UndefOr[String] = js.native
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
  
  @js.native
  trait ProfiledVerifyOptions extends StObject {
    
    var audience: String | js.Array[String] = js.native
    
    var issuer: String | js.Array[String] = js.native
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
  
  @js.native
  trait SignOptions extends StObject {
    
    var algorithm: js.UndefOr[String] = js.native
    
    var audience: js.UndefOr[String | js.Array[String]] = js.native
    
    var expiresIn: js.UndefOr[String] = js.native
    
    var header: js.UndefOr[js.Object] = js.native
    
    var iat: js.UndefOr[Boolean] = js.native
    
    var issuer: js.UndefOr[String] = js.native
    
    var jti: js.UndefOr[String] = js.native
    
    var kid: js.UndefOr[Boolean] = js.native
    
    var notBefore: js.UndefOr[String] = js.native
    
    var now: js.UndefOr[Date] = js.native
    
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
  
  @js.native
  trait VerifyOptions extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.native
    
    var audience: js.UndefOr[String | js.Array[String]] = js.native
    
    var clockTolerance: js.UndefOr[String] = js.native
    
    var complete: js.UndefOr[Boolean] = js.native
    
    var crit: js.UndefOr[js.Array[String]] = js.native
    
    var ignoreExp: js.UndefOr[Boolean] = js.native
    
    var ignoreIat: js.UndefOr[Boolean] = js.native
    
    var ignoreNbf: js.UndefOr[Boolean] = js.native
    
    var issuer: js.UndefOr[String | js.Array[String]] = js.native
    
    var jti: js.UndefOr[String] = js.native
    
    var maxTokenAge: js.UndefOr[String] = js.native
    
    var now: js.UndefOr[Date] = js.native
    
    var subject: js.UndefOr[String] = js.native
    
    var typ: js.UndefOr[String] = js.native
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
  
  @js.native
  trait completeResult[T] extends StObject {
    
    var header: js.Object = js.native
    
    var key: T = js.native
    
    var payload: js.Object = js.native
    
    var signature: String = js.native
  }
  object completeResult {
    
    @scala.inline
    def apply[T](header: js.Object, key: T, payload: js.Object, signature: String): completeResult[T] = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[completeResult[T]]
    }
    
    @scala.inline
    implicit class completeResultMutableBuilder[Self <: completeResult[_], T] (val x: Self with completeResult[T]) extends AnyVal {
      
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
