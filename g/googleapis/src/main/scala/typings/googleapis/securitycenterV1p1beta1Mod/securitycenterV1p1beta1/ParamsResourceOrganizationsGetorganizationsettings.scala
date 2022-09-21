package typings.googleapis.securitycenterV1p1beta1Mod.securitycenterV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsGetorganizationsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the organization to get organization settings for. Its format is "organizations/[organization_id]/organizationSettings".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsGetorganizationsettings {
  
  inline def apply(): ParamsResourceOrganizationsGetorganizationsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsGetorganizationsettings]
  }
  
  extension [Self <: ParamsResourceOrganizationsGetorganizationsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
