package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssuredworkloadsV1WorkloadResourceInfo extends StObject {
  
  /** Resource identifier. For a project this represents project_number. */
  var resourceId: js.UndefOr[String] = js.undefined
  
  /** Indicates the type of resource. */
  var resourceType: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssuredworkloadsV1WorkloadResourceInfo {
  
  inline def apply(): GoogleCloudAssuredworkloadsV1WorkloadResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1WorkloadResourceInfo]
  }
  
  extension [Self <: GoogleCloudAssuredworkloadsV1WorkloadResourceInfo](x: Self) {
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
