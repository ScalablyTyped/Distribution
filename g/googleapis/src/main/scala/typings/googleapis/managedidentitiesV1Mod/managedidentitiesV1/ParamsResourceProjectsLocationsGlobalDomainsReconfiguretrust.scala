package typings.googleapis.managedidentitiesV1Mod.managedidentitiesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalDomainsReconfiguretrust
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource domain name, project name and location using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReconfigureTrustRequest] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalDomainsReconfiguretrust {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalDomainsReconfiguretrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalDomainsReconfiguretrust]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalDomainsReconfiguretrust](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaReconfigureTrustRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
