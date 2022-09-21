package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsCustomconstraintsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable. Name of the constraint. This is unique within the organization. Format of the name should be * `organizations/{organization_id\}/customConstraints/{custom_constraint_id\}` Example : "organizations/123/customConstraints/custom.createOnlyE2TypeVms"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudOrgpolicyV2CustomConstraint] = js.undefined
}
object ParamsResourceOrganizationsCustomconstraintsPatch {
  
  inline def apply(): ParamsResourceOrganizationsCustomconstraintsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsCustomconstraintsPatch]
  }
  
  extension [Self <: ParamsResourceOrganizationsCustomconstraintsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudOrgpolicyV2CustomConstraint): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
