package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNamespacesJobsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the job to retrieve. For Cloud Run (fully managed), replace {namespace_id\} with the project ID or number.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceNamespacesJobsGet {
  
  inline def apply(): ParamsResourceNamespacesJobsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNamespacesJobsGet]
  }
  
  extension [Self <: ParamsResourceNamespacesJobsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
