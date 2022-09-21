package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsSourcesFindingsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Unique identifier provided by the client within the parent scope. It must be alphanumeric and less than or equal to 32 characters and greater than 0 characters in length.
    */
  var findingId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name of the new finding's parent. Its format should be "organizations/[organization_id]/sources/[source_id]".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudSecuritycenterV1beta1Finding] = js.undefined
}
object ParamsResourceOrganizationsSourcesFindingsCreate {
  
  inline def apply(): ParamsResourceOrganizationsSourcesFindingsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsSourcesFindingsCreate]
  }
  
  extension [Self <: ParamsResourceOrganizationsSourcesFindingsCreate](x: Self) {
    
    inline def setFindingId(value: String): Self = StObject.set(x, "findingId", value.asInstanceOf[js.Any])
    
    inline def setFindingIdUndefined: Self = StObject.set(x, "findingId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudSecuritycenterV1beta1Finding): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
