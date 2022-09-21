package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettings extends StObject {
  
  /** User-assigned resource display name. If not empty it will be used to create a resource with the specified name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Resource identifier. For a project this represents project_id. If the project is already taken, the workload creation will fail. For KeyRing, this represents the keyring_id. For a
    * folder, don't set this value as folder_id is assigned by Google.
    */
  var resourceId: js.UndefOr[String] = js.undefined
  
  /** Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT) */
  var resourceType: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettings {
  
  inline def apply(): GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettings]
  }
  
  extension [Self <: GoogleCloudAssuredworkloadsV1beta1WorkloadResourceSettings](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
