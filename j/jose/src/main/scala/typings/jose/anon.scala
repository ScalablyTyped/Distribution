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
    
    inline def apply(complete: js.UndefOr[Boolean] & `true`): DecodeOptionscompletetrue = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodeOptionscompletetrue]
    }
    
    extension [Self <: DecodeOptionscompletetrue](x: Self) {
      
      inline def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
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
    
    inline def apply(complete: js.UndefOr[Boolean] & `true`): DecryptOptionscompletetru = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptOptionscompletetru]
    }
    
    extension [Self <: DecryptOptionscompletetru](x: Self) {
      
      inline def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setContentEncryptionAlgorithms(value: js.Array[String]): Self = StObject.set(x, "contentEncryptionAlgorithms", value.asInstanceOf[js.Any])
      
      inline def setContentEncryptionAlgorithmsUndefined: Self = StObject.set(x, "contentEncryptionAlgorithms", js.undefined)
      
      inline def setContentEncryptionAlgorithmsVarargs(value: String*): Self = StObject.set(x, "contentEncryptionAlgorithms", js.Array(value :_*))
      
      inline def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      inline def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value :_*))
      
      inline def setKeyManagementAlgorithms(value: js.Array[String]): Self = StObject.set(x, "keyManagementAlgorithms", value.asInstanceOf[js.Any])
      
      inline def setKeyManagementAlgorithmsUndefined: Self = StObject.set(x, "keyManagementAlgorithms", js.undefined)
      
      inline def setKeyManagementAlgorithmsVarargs(value: String*): Self = StObject.set(x, "keyManagementAlgorithms", js.Array(value :_*))
    }
  }
  
  /* Inlined jose.jose.JWS.VerifyOptions & {  complete :true} */
  trait VerifyOptionscompletetrue extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var complete: js.UndefOr[Boolean] & `true`
    
    var crit: js.UndefOr[js.Array[String]] = js.undefined
  }
  object VerifyOptionscompletetrue {
    
    inline def apply(complete: js.UndefOr[Boolean] & `true`): VerifyOptionscompletetrue = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptionscompletetrue]
    }
    
    extension [Self <: VerifyOptionscompletetrue](x: Self) {
      
      inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      inline def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      inline def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value :_*))
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
    
    inline def apply(complete: js.UndefOr[Boolean] & `true`): VerifyOptionscompletetrueAlgorithms = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptionscompletetrueAlgorithms]
    }
    
    extension [Self <: VerifyOptionscompletetrueAlgorithms](x: Self) {
      
      inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      inline def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      inline def setClockTolerance(value: String): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      inline def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      inline def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value :_*))
      
      inline def setIgnoreExp(value: Boolean): Self = StObject.set(x, "ignoreExp", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpUndefined: Self = StObject.set(x, "ignoreExp", js.undefined)
      
      inline def setIgnoreIat(value: Boolean): Self = StObject.set(x, "ignoreIat", value.asInstanceOf[js.Any])
      
      inline def setIgnoreIatUndefined: Self = StObject.set(x, "ignoreIat", js.undefined)
      
      inline def setIgnoreNbf(value: Boolean): Self = StObject.set(x, "ignoreNbf", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNbfUndefined: Self = StObject.set(x, "ignoreNbf", js.undefined)
      
      inline def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value :_*))
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
      
      inline def setMaxTokenAge(value: String): Self = StObject.set(x, "maxTokenAge", value.asInstanceOf[js.Any])
      
      inline def setMaxTokenAgeUndefined: Self = StObject.set(x, "maxTokenAge", js.undefined)
      
      inline def setNow(value: Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      inline def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
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
    
    inline def apply(
      audience: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String]),
      complete: js.UndefOr[Boolean] & `true`,
      issuer: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])
    ): VerifyOptionscompletetrueAudience = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptionscompletetrueAudience]
    }
    
    extension [Self <: VerifyOptionscompletetrueAudience](x: Self) {
      
      inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      inline def setAudience(value: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setClockTolerance(value: String): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      inline def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      inline def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value :_*))
      
      inline def setIgnoreExp(value: Boolean): Self = StObject.set(x, "ignoreExp", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpUndefined: Self = StObject.set(x, "ignoreExp", js.undefined)
      
      inline def setIgnoreIat(value: Boolean): Self = StObject.set(x, "ignoreIat", value.asInstanceOf[js.Any])
      
      inline def setIgnoreIatUndefined: Self = StObject.set(x, "ignoreIat", js.undefined)
      
      inline def setIgnoreNbf(value: Boolean): Self = StObject.set(x, "ignoreNbf", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNbfUndefined: Self = StObject.set(x, "ignoreNbf", js.undefined)
      
      inline def setIssuer(value: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
      
      inline def setMaxAuthAge(value: String): Self = StObject.set(x, "maxAuthAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAuthAgeUndefined: Self = StObject.set(x, "maxAuthAge", js.undefined)
      
      inline def setMaxTokenAge(value: String): Self = StObject.set(x, "maxTokenAge", value.asInstanceOf[js.Any])
      
      inline def setMaxTokenAgeUndefined: Self = StObject.set(x, "maxTokenAge", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setNow(value: Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      inline def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
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
    
    inline def apply(
      audience: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String]),
      complete: js.UndefOr[Boolean] & `true`,
      issuer: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])
    ): VerifyOptionscompletetrueClockTolerance = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptionscompletetrueClockTolerance]
    }
    
    extension [Self <: VerifyOptionscompletetrueClockTolerance](x: Self) {
      
      inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      inline def setAudience(value: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setClockTolerance(value: String): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      inline def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      inline def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value :_*))
      
      inline def setIgnoreExp(value: Boolean): Self = StObject.set(x, "ignoreExp", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpUndefined: Self = StObject.set(x, "ignoreExp", js.undefined)
      
      inline def setIgnoreIat(value: Boolean): Self = StObject.set(x, "ignoreIat", value.asInstanceOf[js.Any])
      
      inline def setIgnoreIatUndefined: Self = StObject.set(x, "ignoreIat", js.undefined)
      
      inline def setIgnoreNbf(value: Boolean): Self = StObject.set(x, "ignoreNbf", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNbfUndefined: Self = StObject.set(x, "ignoreNbf", js.undefined)
      
      inline def setIssuer(value: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
      
      inline def setMaxTokenAge(value: String): Self = StObject.set(x, "maxTokenAge", value.asInstanceOf[js.Any])
      
      inline def setMaxTokenAgeUndefined: Self = StObject.set(x, "maxTokenAge", js.undefined)
      
      inline def setNow(value: Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      inline def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
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
    
    inline def apply(
      audience: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String]),
      complete: js.UndefOr[Boolean] & `true`,
      issuer: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])
    ): VerifyOptionscompletetrueComplete = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptionscompletetrueComplete]
    }
    
    extension [Self <: VerifyOptionscompletetrueComplete](x: Self) {
      
      inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      inline def setAudience(value: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setClockTolerance(value: String): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      inline def setComplete(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      inline def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value :_*))
      
      inline def setIgnoreExp(value: Boolean): Self = StObject.set(x, "ignoreExp", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpUndefined: Self = StObject.set(x, "ignoreExp", js.undefined)
      
      inline def setIgnoreIat(value: Boolean): Self = StObject.set(x, "ignoreIat", value.asInstanceOf[js.Any])
      
      inline def setIgnoreIatUndefined: Self = StObject.set(x, "ignoreIat", js.undefined)
      
      inline def setIgnoreNbf(value: Boolean): Self = StObject.set(x, "ignoreNbf", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNbfUndefined: Self = StObject.set(x, "ignoreNbf", js.undefined)
      
      inline def setIssuer(value: (js.UndefOr[String | js.Array[String]]) & (String | js.Array[String])): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
      
      inline def setMaxAuthAge(value: String): Self = StObject.set(x, "maxAuthAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAuthAgeUndefined: Self = StObject.set(x, "maxAuthAge", js.undefined)
      
      inline def setMaxTokenAge(value: String): Self = StObject.set(x, "maxTokenAge", value.asInstanceOf[js.Any])
      
      inline def setMaxTokenAgeUndefined: Self = StObject.set(x, "maxTokenAge", js.undefined)
      
      inline def setNow(value: Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      inline def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
    }
  }
}
