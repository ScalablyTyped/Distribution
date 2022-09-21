package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTenantsCompaniesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the company to be retrieved. The format is "projects/{project_id\}/tenants/{tenant_id\}/companies/{company_id\}", for example, "projects/api-test-project/tenants/foo/companies/bar".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsTenantsCompaniesGet {
  
  inline def apply(): ParamsResourceProjectsTenantsCompaniesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTenantsCompaniesGet]
  }
  
  extension [Self <: ParamsResourceProjectsTenantsCompaniesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
