package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJwtClaims extends StObject {
  
  /**
    * Value for the "aud" claim.
    */
  var audience: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value for the "iss" claim.
    */
  var issuer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value for the "sub" claim.
    */
  var subject: js.UndefOr[String | Null] = js.undefined
}
object SchemaJwtClaims {
  
  inline def apply(): SchemaJwtClaims = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJwtClaims]
  }
  
  extension [Self <: SchemaJwtClaims](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceNull: Self = StObject.set(x, "audience", null)
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerNull: Self = StObject.set(x, "issuer", null)
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
