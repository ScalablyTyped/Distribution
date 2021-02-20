package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssuredworkloadsV1WorkloadResourceInfo extends StObject {
  
  /** Resource identifier. For a project this represents project_number. */
  var resourceId: js.UndefOr[String] = js.native
  
  /** Indicates the type of resource. */
  var resourceType: js.UndefOr[String] = js.native
}
object GoogleCloudAssuredworkloadsV1WorkloadResourceInfo {
  
  @scala.inline
  def apply(): GoogleCloudAssuredworkloadsV1WorkloadResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1WorkloadResourceInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudAssuredworkloadsV1WorkloadResourceInfoMutableBuilder[Self <: GoogleCloudAssuredworkloadsV1WorkloadResourceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
