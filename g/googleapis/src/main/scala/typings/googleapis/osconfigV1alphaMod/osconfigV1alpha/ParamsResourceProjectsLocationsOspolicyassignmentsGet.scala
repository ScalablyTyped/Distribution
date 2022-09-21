package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsOspolicyassignmentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of OS policy assignment. Format: `projects/{project\}/locations/{location\}/osPolicyAssignments/{os_policy_assignment\}@{revisionId\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsOspolicyassignmentsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsOspolicyassignmentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsOspolicyassignmentsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsOspolicyassignmentsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
