package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest extends StObject {
  
  /** Required. The type of restriction for using gcp products in the Workload environment. */
  var restrictionType: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest {
  
  inline def apply(): GoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest]
  }
  
  extension [Self <: GoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest](x: Self) {
    
    inline def setRestrictionType(value: String): Self = StObject.set(x, "restrictionType", value.asInstanceOf[js.Any])
    
    inline def setRestrictionTypeUndefined: Self = StObject.set(x, "restrictionType", js.undefined)
  }
}
