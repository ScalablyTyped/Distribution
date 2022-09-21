package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsSourcesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Relative resource name of the source. Its format is "organizations/[organization_id]/source/[source_id]".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsSourcesGet {
  
  inline def apply(): ParamsResourceOrganizationsSourcesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsSourcesGet]
  }
  
  extension [Self <: ParamsResourceOrganizationsSourcesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
