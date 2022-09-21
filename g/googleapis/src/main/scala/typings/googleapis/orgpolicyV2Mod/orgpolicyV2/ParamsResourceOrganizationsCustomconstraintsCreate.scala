package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsCustomconstraintsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Must be in the following form: * `organizations/{organization_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudOrgpolicyV2CustomConstraint] = js.undefined
}
object ParamsResourceOrganizationsCustomconstraintsCreate {
  
  inline def apply(): ParamsResourceOrganizationsCustomconstraintsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsCustomconstraintsCreate]
  }
  
  extension [Self <: ParamsResourceOrganizationsCustomconstraintsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudOrgpolicyV2CustomConstraint): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
