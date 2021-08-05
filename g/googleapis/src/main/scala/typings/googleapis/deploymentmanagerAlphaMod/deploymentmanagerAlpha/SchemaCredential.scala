package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The credential used by Deployment Manager and TypeProvider. Only one of the
  * options is permitted.
  */
trait SchemaCredential extends StObject {
  
  /**
    * Basic Auth Credential, only used by TypeProvider.
    */
  var basicAuth: js.UndefOr[SchemaBasicAuth] = js.undefined
  
  /**
    * Service Account Credential, only used by Deployment.
    */
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.undefined
  
  /**
    * Specify to use the project default credential, only supported by
    * Deployment.
    */
  var useProjectDefault: js.UndefOr[Boolean] = js.undefined
}
object SchemaCredential {
  
  inline def apply(): SchemaCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCredential]
  }
  
  extension [Self <: SchemaCredential](x: Self) {
    
    inline def setBasicAuth(value: SchemaBasicAuth): Self = StObject.set(x, "basicAuth", value.asInstanceOf[js.Any])
    
    inline def setBasicAuthUndefined: Self = StObject.set(x, "basicAuth", js.undefined)
    
    inline def setServiceAccount(value: SchemaServiceAccount): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setUseProjectDefault(value: Boolean): Self = StObject.set(x, "useProjectDefault", value.asInstanceOf[js.Any])
    
    inline def setUseProjectDefaultUndefined: Self = StObject.set(x, "useProjectDefault", js.undefined)
  }
}
