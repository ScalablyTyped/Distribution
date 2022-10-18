package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWTClaimVerificationOptions extends StObject {
  
  /** Expected JWT "aud" (Audience) Claim value(s). */
  var audience: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Expected clock tolerance
    *
    * - In seconds when number (e.g. 5)
    * - Parsed as seconds when a string (e.g. "5 seconds", "10 minutes", "2 hours").
    */
  var clockTolerance: js.UndefOr[String | Double] = js.undefined
  
  /** Date to use when comparing NumericDate claims, defaults to `new Date()`. */
  var currentDate: js.UndefOr[js.Date] = js.undefined
  
  /** Expected JWT "iss" (Issuer) Claim value(s). */
  var issuer: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Maximum time elapsed (in seconds) from the JWT "iat" (Issued At) Claim value.
    *
    * - In seconds when number (e.g. 5)
    * - Parsed as seconds when a string (e.g. "5 seconds", "10 minutes", "2 hours").
    */
  var maxTokenAge: js.UndefOr[String | Double] = js.undefined
  
  /** Expected JWT "sub" (Subject) Claim value. */
  var subject: js.UndefOr[String] = js.undefined
  
  /** Expected JWT "typ" (Type) Header Parameter value. */
  var typ: js.UndefOr[String] = js.undefined
}
object JWTClaimVerificationOptions {
  
  inline def apply(): JWTClaimVerificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWTClaimVerificationOptions]
  }
  
  extension [Self <: JWTClaimVerificationOptions](x: Self) {
    
    inline def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value*))
    
    inline def setClockTolerance(value: String | Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
    
    inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
    
    inline def setCurrentDate(value: js.Date): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
    
    inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
    
    inline def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value*))
    
    inline def setMaxTokenAge(value: String | Double): Self = StObject.set(x, "maxTokenAge", value.asInstanceOf[js.Any])
    
    inline def setMaxTokenAgeUndefined: Self = StObject.set(x, "maxTokenAge", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
    
    inline def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
  }
}
