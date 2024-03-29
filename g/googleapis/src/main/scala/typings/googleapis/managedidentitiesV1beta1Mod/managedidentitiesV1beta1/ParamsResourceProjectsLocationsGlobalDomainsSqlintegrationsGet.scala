package typings.googleapis.managedidentitiesV1beta1Mod.managedidentitiesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. SqlIntegration resource name using the form: `projects/{project_id\}/locations/global/domains/x/sqlIntegrations/{name\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalDomainsSqlintegrationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
