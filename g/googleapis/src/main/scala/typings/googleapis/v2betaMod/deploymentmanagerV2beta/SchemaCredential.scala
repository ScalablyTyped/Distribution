package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The credential used by Deployment Manager and TypeProvider. Only one of the
  * options is permitted.
  */
@js.native
trait SchemaCredential extends StObject {
  
  /**
    * Basic Auth Credential, only used by TypeProvider.
    */
  var basicAuth: js.UndefOr[SchemaBasicAuth] = js.native
  
  /**
    * Service Account Credential, only used by Deployment.
    */
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.native
  
  /**
    * Specify to use the project default credential, only supported by
    * Deployment.
    */
  var useProjectDefault: js.UndefOr[Boolean] = js.native
}
object SchemaCredential {
  
  @scala.inline
  def apply(): SchemaCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCredential]
  }
  
  @scala.inline
  implicit class SchemaCredentialMutableBuilder[Self <: SchemaCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicAuth(value: SchemaBasicAuth): Self = StObject.set(x, "basicAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicAuthUndefined: Self = StObject.set(x, "basicAuth", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: SchemaServiceAccount): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    @scala.inline
    def setUseProjectDefault(value: Boolean): Self = StObject.set(x, "useProjectDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseProjectDefaultUndefined: Self = StObject.set(x, "useProjectDefault", js.undefined)
  }
}
