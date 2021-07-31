package typings.jose

import typings.jose.joseBooleans.`true`
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined jose.jose.JWT.DecodeOptions & {  complete :true} */
  trait DecodeOptionscompletetrue extends StObject {
    
    var complete: js.UndefOr[Boolean] & `true`
  }
  object DecodeOptionscompletetrue {
    
    @scala.inline
    def apply(complete: js.UndefOr[Boolean] & `true`): DecodeOptionscompletetrue = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodeOptionscompletetrue]
    }
    
    @scala.inline
    implicit class DecodeOptionscompletetrueMutableBuilder[Self <: DecodeOptionscompletetrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined jose.jose.JWE.DecryptOptions & {  complete :true} */
  trait DecryptOptionscompletetru extends StObject {
    
    var complete: js.UndefOr[Boolean] & `true`
    
    var contentEncryptionAlgorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var crit: js.UndefOr[js.Array[String]] = js.undefined
    
    var keyManagementAlgorithms: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DecryptOptionscompletetru {
    
    @scala.inline
    def apply(complete: js.UndefOr[Boolean] & `true`): DecryptOptionscompletetru = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptOptionscompletetru]
    }
    
    @scala.inline
    implicit class DecryptOptionscompletetruMutableBuilder[Self <: DecryptOptionscompletetru] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEncryptionAlgorithms(value: js.Array[String]): Self = StObject.set(x, "contentEncryptionAlgorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEncryptionAlgorithmsUndefined: Self = StObject.set(x, "contentEncryptionAlgorithms", js.undefined)
      
      @scala.inline
      def setContentEncryptionAlgorithmsVarargs(value: String*): Self = StObject.set(x, "contentEncryptionAlgorithms", js.Array(value :_*))
      
      @scala.inline
      def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      @scala.inline
      def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value :_*))
      
      @scala.inline
      def setKeyManagementAlgorithms(value: js.Array[String]): Self = StObject.set(x, "keyManagementAlgorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyManagementAlgorithmsUndefined: Self = StObject.set(x, "keyManagementAlgorithms", js.undefined)
      
      @scala.inline
      def setKeyManagementAlgorithmsVarargs(value: String*): Self = StObject.set(x, "keyManagementAlgorithms", js.Array(value :_*))
    }
  }
  
  /* Inlined jose.jose.JWS.VerifyOptions & {  complete :true} */
  trait VerifyOptionscompletetrue extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var complete: js.UndefOr[Boolean] & `true`
    
    var crit: js.UndefOr[js.Array[String]] = js.undefined
  }
  object VerifyOptionscompletetrue {
    
    @scala.inline
    def apply(complete: js.UndefOr[Boolean] & `true`): VerifyOptionscompletetrue = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptionscompletetrue]
    }
    
    @scala.inline
    implicit class VerifyOptionscompletetrueMutableBuilder[Self <: VerifyOptionscompletetrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      @scala.inline
      def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      @scala.inline
      def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      @scala.inline
      def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value :_*))
    }
  }
  
  /* Inlined jose.jose.JWT.VerifyOptions & {  complete :true} */
  trait VerifyOptionscompletetrueAlgorithms extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var audience: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var clockTolerance: js.UndefOr[String] = js.undefined
    
    var complete: js.UndefOr[Boolean] & `true`
    
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
  object VerifyOptionscompletetrueAlgorithms {
    
    @scala.inline
    def apply(complete: js.UndefOr[Boolean] & `true`): VerifyOptionscompletetrueAlgorithms = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptionscompletetrueAlgorithms]
    }
    
    @scala.inline
    implicit class VerifyOptionscompletetrueAlgorithmsMutableBuilder[Self <: VerifyOptionscompletetrueAlgorithms] (val x: Self) extends AnyVal {
      
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
      def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined jose.jose.JWT.VerifyOptions & {  complete :true} & jose.jose.JWT.IdTokenVerifyOptions */
  trait VerifyOptionscompletetrueAudience extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var audience: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])
    
    var clockTolerance: js.UndefOr[String] = js.undefined
    
    var complete: js.UndefOr[Boolean] & `true`
    
    var crit: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreExp: js.UndefOr[Boolean] = js.undefined
    
    var ignoreIat: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNbf: js.UndefOr[Boolean] = js.undefined
    
    var issuer: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])
    
    var jti: js.UndefOr[String] = js.undefined
    
    var maxAuthAge: js.UndefOr[String] = js.undefined
    
    var maxTokenAge: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var now: js.UndefOr[Date] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var typ: js.UndefOr[String] = js.undefined
  }
  object VerifyOptionscompletetrueAudience {
    
    @scala.inline
    def apply(
      audience: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String]),
      complete: js.UndefOr[Boolean] & `true`,
      issuer: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])
    ): VerifyOptionscompletetrueAudience = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptionscompletetrueAudience]
    }
    
    @scala.inline
    implicit class VerifyOptionscompletetrueAudienceMutableBuilder[Self <: VerifyOptionscompletetrueAudience] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      @scala.inline
      def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      @scala.inline
      def setAudience(value: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockTolerance(value: String): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      @scala.inline
      def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
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
      def setIssuer(value: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
      
      @scala.inline
      def setMaxAuthAge(value: String): Self = StObject.set(x, "maxAuthAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAuthAgeUndefined: Self = StObject.set(x, "maxAuthAge", js.undefined)
      
      @scala.inline
      def setMaxTokenAge(value: String): Self = StObject.set(x, "maxTokenAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTokenAgeUndefined: Self = StObject.set(x, "maxTokenAge", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
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
  
  /* Inlined jose.jose.JWT.VerifyOptions & {  complete :true} & jose.jose.JWT.LogoutTokenVerifyOptions */
  trait VerifyOptionscompletetrueClockTolerance extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var audience: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])
    
    var clockTolerance: js.UndefOr[String] = js.undefined
    
    var complete: js.UndefOr[Boolean] & `true`
    
    var crit: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreExp: js.UndefOr[Boolean] = js.undefined
    
    var ignoreIat: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNbf: js.UndefOr[Boolean] = js.undefined
    
    var issuer: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])
    
    var jti: js.UndefOr[String] = js.undefined
    
    var maxTokenAge: js.UndefOr[String] = js.undefined
    
    var now: js.UndefOr[Date] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var typ: js.UndefOr[String] = js.undefined
  }
  object VerifyOptionscompletetrueClockTolerance {
    
    @scala.inline
    def apply(
      audience: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String]),
      complete: js.UndefOr[Boolean] & `true`,
      issuer: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])
    ): VerifyOptionscompletetrueClockTolerance = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptionscompletetrueClockTolerance]
    }
    
    @scala.inline
    implicit class VerifyOptionscompletetrueClockToleranceMutableBuilder[Self <: VerifyOptionscompletetrueClockTolerance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      @scala.inline
      def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      @scala.inline
      def setAudience(value: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockTolerance(value: String): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      @scala.inline
      def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
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
      def setIssuer(value: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined jose.jose.JWT.VerifyOptions & {  complete :true} & jose.jose.JWT.AccessTokenVerifyOptions */
  trait VerifyOptionscompletetrueComplete extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var audience: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])
    
    var clockTolerance: js.UndefOr[String] = js.undefined
    
    var complete: js.UndefOr[Boolean] & `true`
    
    var crit: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreExp: js.UndefOr[Boolean] = js.undefined
    
    var ignoreIat: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNbf: js.UndefOr[Boolean] = js.undefined
    
    var issuer: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])
    
    var jti: js.UndefOr[String] = js.undefined
    
    var maxAuthAge: js.UndefOr[String] = js.undefined
    
    var maxTokenAge: js.UndefOr[String] = js.undefined
    
    var now: js.UndefOr[Date] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var typ: js.UndefOr[String] = js.undefined
  }
  object VerifyOptionscompletetrueComplete {
    
    @scala.inline
    def apply(
      audience: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String]),
      complete: js.UndefOr[Boolean] & `true`,
      issuer: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])
    ): VerifyOptionscompletetrueComplete = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptionscompletetrueComplete]
    }
    
    @scala.inline
    implicit class VerifyOptionscompletetrueCompleteMutableBuilder[Self <: VerifyOptionscompletetrueComplete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      @scala.inline
      def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      @scala.inline
      def setAudience(value: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockTolerance(value: String): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      @scala.inline
      def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
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
      def setIssuer(value: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
      
      @scala.inline
      def setMaxAuthAge(value: String): Self = StObject.set(x, "maxAuthAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAuthAgeUndefined: Self = StObject.set(x, "maxAuthAge", js.undefined)
      
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
}
