package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTenantsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the tenant to be deleted. The format is "projects/{project_id\}/tenants/{tenant_id\}", for example, "projects/foo/tenants/bar".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsTenantsDelete {
  
  inline def apply(): ParamsResourceProjectsTenantsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTenantsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsTenantsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
