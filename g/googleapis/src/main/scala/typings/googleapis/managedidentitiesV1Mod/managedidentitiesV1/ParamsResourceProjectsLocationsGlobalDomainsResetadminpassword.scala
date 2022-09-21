package typings.googleapis.managedidentitiesV1Mod.managedidentitiesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalDomainsResetadminpassword
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The domain resource name using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaResetAdminPasswordRequest] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalDomainsResetadminpassword {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalDomainsResetadminpassword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalDomainsResetadminpassword]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalDomainsResetadminpassword](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaResetAdminPasswordRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
