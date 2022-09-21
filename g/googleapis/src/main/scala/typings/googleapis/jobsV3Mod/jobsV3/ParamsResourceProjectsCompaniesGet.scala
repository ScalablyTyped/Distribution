package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsCompaniesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the company to be retrieved. The format is "projects/{project_id\}/companies/{company_id\}", for example, "projects/api-test-project/companies/foo".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsCompaniesGet {
  
  inline def apply(): ParamsResourceProjectsCompaniesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsCompaniesGet]
  }
  
  extension [Self <: ParamsResourceProjectsCompaniesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
