package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsCompaniesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the company to be deleted. The format is "projects/{project_id\}/companies/{company_id\}", for example, "projects/api-test-project/companies/foo".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsCompaniesDelete {
  
  inline def apply(): ParamsResourceProjectsCompaniesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsCompaniesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsCompaniesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
