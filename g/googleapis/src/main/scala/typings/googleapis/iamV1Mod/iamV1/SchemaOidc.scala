package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOidc extends StObject {
  
  /**
    * Acceptable values for the `aud` field (audience) in the OIDC token. Token exchange requests are rejected if the token audience does not match one of the configured values. Each audience may be at most 256 characters. A maximum of 10 audiences may be configured. If this list is empty, the OIDC token audience must be equal to the full canonical resource name of the WorkloadIdentityPoolProvider, with or without the HTTPS prefix. For example: ``` //iam.googleapis.com/projects//locations//workloadIdentityPools//providers/ https://iam.googleapis.com/projects//locations//workloadIdentityPools//providers/ ```
    */
  var allowedAudiences: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The OIDC issuer URL. Must be an HTTPS endpoint.
    */
  var issuerUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaOidc {
  
  inline def apply(): SchemaOidc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOidc]
  }
  
  extension [Self <: SchemaOidc](x: Self) {
    
    inline def setAllowedAudiences(value: js.Array[String]): Self = StObject.set(x, "allowedAudiences", value.asInstanceOf[js.Any])
    
    inline def setAllowedAudiencesNull: Self = StObject.set(x, "allowedAudiences", null)
    
    inline def setAllowedAudiencesUndefined: Self = StObject.set(x, "allowedAudiences", js.undefined)
    
    inline def setAllowedAudiencesVarargs(value: String*): Self = StObject.set(x, "allowedAudiences", js.Array(value*))
    
    inline def setIssuerUri(value: String): Self = StObject.set(x, "issuerUri", value.asInstanceOf[js.Any])
    
    inline def setIssuerUriNull: Self = StObject.set(x, "issuerUri", null)
    
    inline def setIssuerUriUndefined: Self = StObject.set(x, "issuerUri", js.undefined)
  }
}
