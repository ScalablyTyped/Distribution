package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOauth2JwtBearer extends StObject {
  
  /**
    * Secret version reference containing a PKCS#8 PEM-encoded private key associated with the Client Certificate. This private key will be used to sign JWTs used for the jwt-bearer authorization grant. Specified in the form as: `projects/x/secrets/x/versions/x`.
    */
  var clientKey: js.UndefOr[SchemaSecret] = js.undefined
  
  /**
    * JwtClaims providers fields to generate the token.
    */
  var jwtClaims: js.UndefOr[SchemaJwtClaims] = js.undefined
}
object SchemaOauth2JwtBearer {
  
  inline def apply(): SchemaOauth2JwtBearer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOauth2JwtBearer]
  }
  
  extension [Self <: SchemaOauth2JwtBearer](x: Self) {
    
    inline def setClientKey(value: SchemaSecret): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
    
    inline def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
    
    inline def setJwtClaims(value: SchemaJwtClaims): Self = StObject.set(x, "jwtClaims", value.asInstanceOf[js.Any])
    
    inline def setJwtClaimsUndefined: Self = StObject.set(x, "jwtClaims", js.undefined)
  }
}
