package typings.googleapis.managedidentitiesV1alpha1Mod.managedidentitiesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalDomainsExtendschema
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The domain resource name using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaExtendSchemaRequest] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalDomainsExtendschema {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalDomainsExtendschema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalDomainsExtendschema]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalDomainsExtendschema](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setRequestBody(value: SchemaExtendSchemaRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
