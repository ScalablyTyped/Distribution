package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkloadIdentityConfig extends StObject {
  
  /**
    * IAM Identity Namespace to attach all Kubernetes Service Accounts to.
    */
  var identityNamespace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * identity provider is the third party identity provider.
    */
  var identityProvider: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The workload pool to attach all Kubernetes service accounts to.
    */
  var workloadPool: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkloadIdentityConfig {
  
  inline def apply(): SchemaWorkloadIdentityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkloadIdentityConfig]
  }
  
  extension [Self <: SchemaWorkloadIdentityConfig](x: Self) {
    
    inline def setIdentityNamespace(value: String): Self = StObject.set(x, "identityNamespace", value.asInstanceOf[js.Any])
    
    inline def setIdentityNamespaceNull: Self = StObject.set(x, "identityNamespace", null)
    
    inline def setIdentityNamespaceUndefined: Self = StObject.set(x, "identityNamespace", js.undefined)
    
    inline def setIdentityProvider(value: String): Self = StObject.set(x, "identityProvider", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderNull: Self = StObject.set(x, "identityProvider", null)
    
    inline def setIdentityProviderUndefined: Self = StObject.set(x, "identityProvider", js.undefined)
    
    inline def setWorkloadPool(value: String): Self = StObject.set(x, "workloadPool", value.asInstanceOf[js.Any])
    
    inline def setWorkloadPoolNull: Self = StObject.set(x, "workloadPool", null)
    
    inline def setWorkloadPoolUndefined: Self = StObject.set(x, "workloadPool", js.undefined)
  }
}
