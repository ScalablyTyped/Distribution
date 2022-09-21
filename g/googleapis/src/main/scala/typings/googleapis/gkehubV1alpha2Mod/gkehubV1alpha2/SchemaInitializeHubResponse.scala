package typings.googleapis.gkehubV1alpha2Mod.gkehubV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInitializeHubResponse extends StObject {
  
  /**
    * Name of the Hub default service identity, in the format: service-@gcp-sa-gkehub.iam.gserviceaccount.com The service account has `roles/gkehub.serviceAgent` in the Hub project.
    */
  var serviceIdentity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Workload Identity Pool used for Workload Identity-enabled clusters registered with this Hub. Format: `.hub.id.goog`
    */
  var workloadIdentityPool: js.UndefOr[String | Null] = js.undefined
}
object SchemaInitializeHubResponse {
  
  inline def apply(): SchemaInitializeHubResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInitializeHubResponse]
  }
  
  extension [Self <: SchemaInitializeHubResponse](x: Self) {
    
    inline def setServiceIdentity(value: String): Self = StObject.set(x, "serviceIdentity", value.asInstanceOf[js.Any])
    
    inline def setServiceIdentityNull: Self = StObject.set(x, "serviceIdentity", null)
    
    inline def setServiceIdentityUndefined: Self = StObject.set(x, "serviceIdentity", js.undefined)
    
    inline def setWorkloadIdentityPool(value: String): Self = StObject.set(x, "workloadIdentityPool", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdentityPoolNull: Self = StObject.set(x, "workloadIdentityPool", null)
    
    inline def setWorkloadIdentityPoolUndefined: Self = StObject.set(x, "workloadIdentityPool", js.undefined)
  }
}
