package typings.googleapis.managedidentitiesV1beta1Mod.managedidentitiesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalDomainsAttachtrust
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource domain name, project name and location using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAttachTrustRequest] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalDomainsAttachtrust {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalDomainsAttachtrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalDomainsAttachtrust]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalDomainsAttachtrust](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaAttachTrustRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
